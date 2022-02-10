package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import proto.Propertie;

public class ManagerDatabase {

	private Map<Integer, Propertie> database ;
	private int identifier ;
	
	public ManagerDatabase() {
		database = new HashMap<Integer, Propertie>();
		identifier = 1;
	}
	
	public Propertie insertPropertie(Propertie propertie) {
		
		int id = identifier;
		String title = propertie.getTitle();
		String address = propertie.getAddress();
		int numberBedroom = propertie.getNumberBedroom();
		int numberGarage = propertie.getNumberBedroom();
		int buildingArea =propertie.getBuildingArea();
		int landArea = propertie.getLandArea();
		double value = propertie.getValue();
		
		propertie  = propertie.toBuilder()
					.setId(id)
					.setTitle(title)
					.setAddress(address)
					.setType(propertie.getType())
					.setNumberBedroom(numberBedroom)
					.setNumberGarage(numberGarage)
					.setLandArea(landArea)
					.setValue(value)
					.build();
		
		database.put(identifier, propertie);
		identifier++;
		
		return propertie;
	}
	
	public Propertie updatePropertie(Propertie propertie) {
			
		int id = propertie.getId();
		String title = propertie.getTitle();
		String address = propertie.getAddress();
		int numberBedroom = propertie.getNumberBedroom();
		int numberGarage = propertie.getNumberBedroom();
		int buildingArea =propertie.getBuildingArea();
		int landArea = propertie.getLandArea();
		double value = propertie.getValue();
		
		propertie  = propertie.toBuilder()
					.setId(id)
					.setTitle(title)
					.setType(propertie.getType())
					.setAddress(address)
					.setNumberBedroom(numberBedroom)
					.setNumberGarage(numberGarage)
					.setLandArea(landArea)
					.setValue(value)
					.build();
		
		database.put(id , propertie);
		
			
		return propertie;
			
	}
	
	public Collection<Propertie> getAllPropertie(){
		return database.values();
	}
	
	public Propertie getPropertie(int id) {
		return database.get(id);
	}
	
	public boolean containPropertie(int id) {
		return database.containsKey(id);
	}
	
	public void deletePropertie(int id) {
		 database.remove(id);
	}
	
	
}
