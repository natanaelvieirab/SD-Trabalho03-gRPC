package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.CreatePropertieRequest;
import proto.CreatePropertieResponse;
import proto.DeletePropertieRequest;
import proto.DeletePropertieResponse;
import proto.GetPropertieRequest;
import proto.GetPropertieResponse;
import proto.ListAllPropertieRequest;
import proto.ListAllPropertieResponse;
import proto.Propertie;
import proto.PropertieServiceGrpc;
import proto.UpdatePropertieRequest;
import proto.UpdatePropertieResponse;
import util.CONNECTION;

import java.util.List;

public class PropertieClientImpl {

	private PropertieServiceGrpc.PropertieServiceBlockingStub propertieClient ;
	
	public PropertieClientImpl() {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(CONNECTION.getADDRESS(), CONNECTION.getPORT()).usePlaintext().build();
		propertieClient = PropertieServiceGrpc.newBlockingStub(channel);
	}
	
	public void createPropertie(Propertie propertie) {
		
		CreatePropertieResponse response = propertieClient
				.createPropertie(CreatePropertieRequest.newBuilder().setPropertie(propertie).build());
		
		System.out.println("Created: ");
		System.out.println(response.toString());
	}
	
	public void updatePropertie(Propertie propertie) {
		
		UpdatePropertieResponse response = propertieClient
				.updatePropertie(UpdatePropertieRequest.newBuilder().setPropertie(propertie).build());
		
		System.out.println("Updated: ");
		System.out.println(response.toString());
	}
	
	public void getPropertie(int id) {
		
		GetPropertieResponse propertie = propertieClient
				.getPropertie(GetPropertieRequest.newBuilder().setPropertieId(id).build());
		
		System.out.println("Get Propertie the id '"+id+"': ");
		System.out.println(propertie.toString());
	}
	
	public void deletePropertie(int id) {
		
		DeletePropertieResponse response = propertieClient
				.deletePropertie(DeletePropertieRequest.newBuilder().setPropertieId(id).build());
		
		System.out.println("Deleted Propertie the id '"+id+"'! ");
	}
	
	public List<Propertie> listAllPropertie() {
		
		ListAllPropertieResponse propertieList = propertieClient
				.listAllPropertie(ListAllPropertieRequest.newBuilder().build());
		
		System.out.println("List of Propertie: ");
		System.out.println(propertieList.getPropertieList());
		return propertieList.getPropertieList();
	}

}
