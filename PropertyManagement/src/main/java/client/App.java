package client;

import proto.Propertie;

public class App {
	
	public static void main(String[] args) {
		PropertieClientImpl client = new PropertieClientImpl();
		
		Propertie propertie  = Propertie.newBuilder()				
				.setTitle("Casa do Chico")
				.setAddress("Rua das flores")
				.setNumberBedroom(2)
				.setNumberGarage(1)
				.setLandArea(150)
				.setValue(15000)
				.build();
		
		Propertie propertie2  = Propertie.newBuilder()				
				.setTitle("joão perdido")
				.setAddress("Rua das marianas")
				.setNumberBedroom(4)
				.setNumberGarage(0)
				.setLandArea(100)
				.setValue(10000)
				.build();
		
		client.createPropertie(propertie);
		
		client.createPropertie(propertie2);
		
		client.listAllPropertie();
		
		client.getPropertie(1);
		
		client.deletePropertie(1);
		
		propertie2  = Propertie.newBuilder()
				.setId(2)
				.setTitle("joao perdido de novo")
				.setAddress("Rua das marianas2222")
				.setNumberBedroom(2)
				.setNumberGarage(1)
				.setLandArea(200)
				.setValue(20000)
				.build();
		
		client.updatePropertie(propertie2);
		
		client.listAllPropertie();
		
	}

}
