package server;

import proto.PropertieServiceGrpc;
import proto.UpdatePropertieRequest;
import proto.UpdatePropertieResponse;
import proto.Propertie;

import dao.ManagerDatabase;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import proto.CreatePropertieRequest;
import proto.CreatePropertieResponse;
import proto.DeletePropertieRequest;
import proto.DeletePropertieResponse;
import proto.GetPropertieRequest;
import proto.GetPropertieResponse;
import proto.ListAllPropertieRequest;
import proto.ListAllPropertieResponse;

public class ProperteServiceImpl extends PropertieServiceGrpc.PropertieServiceImplBase {
	
	private ManagerDatabase database = new ManagerDatabase();
	
	
	public void createPropertie(CreatePropertieRequest request, StreamObserver<CreatePropertieResponse> responseObserver) {
		
		System.out.println("Creating Properties !");
	
		Propertie propertie = database.insertPropertie( request.getPropertie());		
		
		CreatePropertieResponse response = CreatePropertieResponse.newBuilder().setPropertie(propertie).build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();					
		
	}
	
	public void updatePropertie(UpdatePropertieRequest request, StreamObserver<UpdatePropertieResponse> responseObserver) {
				
		System.out.println("Update Propertie!");
		
		Propertie propertie = request.getPropertie();
		int id = propertie.getId();
				
		if (!database.containPropertie(id)) {
			
			System.out.println("Propertie not found");
			responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
		}
		
		propertie = database.updatePropertie( request.getPropertie());		
		
		UpdatePropertieResponse response = UpdatePropertieResponse.newBuilder().setPropertie(propertie).build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();		
		
		
	}

	public void deletePropertie(DeletePropertieRequest request, StreamObserver<DeletePropertieResponse> responseObserver) {
		
		if (database.containPropertie(request.getPropertieId())) {
			database.deletePropertie(request.getPropertieId());
			
			System.out.println("Propertie was deleted!");
			
			responseObserver.onNext(DeletePropertieResponse.newBuilder().setPropertieId(request.getPropertieId()).build());
			responseObserver.onCompleted();
		} else {
			
			System.out.println("Propertie not found");
			responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
		}
	}
	
	

	@Override
	public void getPropertie(GetPropertieRequest request, StreamObserver<GetPropertieResponse> responseObserver) {
		
		System.out.println("Get Propertie!");
		
		if (database.containPropertie(request.getPropertieId())) {
			Propertie Propertie = database.getPropertie(request.getPropertieId());
			
			GetPropertieResponse response = GetPropertieResponse.newBuilder().setPropertie(Propertie).build();
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} else {
			
			System.out.println("Propertie not found!");
			responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
		}

	}

	@Override
	public void listAllPropertie(ListAllPropertieRequest request, StreamObserver<ListAllPropertieResponse> responseObserver) {
		System.out.println("List Properties!");
		
		ListAllPropertieResponse response = ListAllPropertieResponse.newBuilder().addAllPropertie(database.getAllPropertie()).build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
}
