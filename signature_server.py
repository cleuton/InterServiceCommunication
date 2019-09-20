# Copyright 2019 Cleuton Sampaio.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
import logging
from concurrent import futures
import grpc
import signature_pb2
import signature_pb2_grpc
import time

from base64 import (
    b64encode,
    b64decode,
)

from Crypto.Hash import SHA256
from Crypto.Signature import PKCS1_v1_5
from Crypto.PublicKey import RSA

_ONE_DAY_IN_SECONDS = 60 * 60 * 24

class SignatureServicer(signature_pb2_grpc.SignVerifyServicer):
    def Sign(self, request, context):
        digest = SHA256.new()
        b = request.text.encode("UTF-8")
        e = b64encode(b)
        digest.update(e)

        # Read shared key from file
        private_key = False
        with open ("./private_key.pem", "r") as myfile:
            private_key = RSA.importKey(myfile.read())

        # Load private key and sign message
        signer = PKCS1_v1_5.new(private_key)
        sig = signer.sign(digest)
        decoded = b64encode(sig)
        saida = decoded.decode("UTF-8")
        return signature_pb2.SignResponse(signature=saida)

def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    signature_pb2_grpc.add_SignVerifyServicer_to_server(
        SignatureServicer(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    try:
        while True:
            time.sleep(_ONE_DAY_IN_SECONDS)
    except KeyboardInterrupt:
        server.stop(0)

if __name__ == '__main__':
    logging.basicConfig()
    serve()