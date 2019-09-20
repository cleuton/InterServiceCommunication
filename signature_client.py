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
import grpc
import signature_pb2
import signature_pb2_grpc

def getsignature(stub):
    texto = "Minha terra tem palmeiras, onde canta o sabiá."
    assinatura = stub.Sign(signature_pb2.SignRequest(text=texto))
    if not assinatura.signature:
        print("Server returned incomplete feature")
        return
    return assinatura

def run():
    with grpc.insecure_channel('localhost:50051') as channel:
        stub = signature_pb2_grpc.SignVerifyStub(channel)
        assinatura = getsignature(stub)
        print("Assinatura: ", assinatura.signature)

if __name__ == '__main__':
    logging.basicConfig()
    run()
