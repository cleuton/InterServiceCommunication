//# Copyright 2019 Cleuton Sampaio.
//#
//# Licensed under the Apache License, Version 2.0 (the "License");
//# you may not use this file except in compliance with the License.
//# You may obtain a copy of the License at
//#
//#     http://www.apache.org/licenses/LICENSE-2.0
//#
//# Unless required by applicable law or agreed to in writing, software
//# distributed under the License is distributed on an "AS IS" BASIS,
//# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//# See the License for the specific language governing permissions and
//# limitations under the License.
package com.obomprogramador.grpc.SignClient;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import com.obomprogramador.grpc.SignRequest;
import com.obomprogramador.grpc.SignResponse;
import com.obomprogramador.grpc.SignVerifyGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class App {
	
	private static final Logger logger = Logger.getLogger(App.class.getName());

	private final ManagedChannel channel;
	private final SignVerifyGrpc.SignVerifyBlockingStub blockingStub;
	
	public App (String host, int port) {
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
	}
	
	public App (ManagedChannelBuilder<?> channelBuilder) {
		channel = channelBuilder.build();
		blockingStub = SignVerifyGrpc.newBlockingStub(channel);
	}
	
	private String sign(String string) {
		SignRequest request = SignRequest.newBuilder().setText(string).build();
		SignResponse response;
		String resposta = "";
		try {
			response = blockingStub.sign(request);
			resposta = response.getSignature();
		}
		catch (Exception ex) {
			logger.severe("Erro ao acessar Servidor: " + ex.getLocalizedMessage());
		}

		return resposta;
	}
	
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
    public static void main( String[] args ) throws InterruptedException {
    	App client = new App("localhost", 50051);
    	try {
    		String signature = client.sign("Minha terra tem palmeiras, onde canta o sabiá.");
    		logger.info("Assinatura: " + signature);
    	}
    	finally {
    		client.shutdown();
    	}
    }

}
