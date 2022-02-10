package server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import util.CONNECTION;

public class PropertieServer {

	  public static void main(String[] args) throws IOException, InterruptedException {
	        
		  	System.out.println("Server start in port "+CONNECTION.getPORT());
	        	        
	        Server server = ServerBuilder.forPort(CONNECTION.getPORT())
	                .addService(new ProperteServiceImpl())
	                .build();
	        
	        server.start();
	        
	        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	            server.shutdown();
	        }));
	        
	        server.awaitTermination();
	    }
}
