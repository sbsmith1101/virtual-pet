import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> virtualPetsMap = new HashMap<>();

	public void addOrganicPetToShelter(OrganicPet organicPet) {
		virtualPetsMap.put(organicPet.getName(), organicPet);
	}
	public void addRoboticPetToShelter(RoboticPet roboticPet) {
		virtualPetsMap.put(roboticPet.getName(), roboticPet);
	}
	
	public String getPetName(String name) {
		return virtualPetsMap.get(name).getName();
	}
	public boolean getPetOwnership(String name) {
		return virtualPetsMap.get(name).getOwnership();
	}
	public String getPetSpecies(String name) {
		return virtualPetsMap.get(name).getSpecies();
	}
	public int getPetAge(String name) {
		return virtualPetsMap.get(name).getAge();
	}
	public int getPetHunger(String name) {
		VirtualPet singlePet = virtualPetsMap.get(name);
		if(singlePet instanceof OrganicPet) {
			return ((OrganicPet) singlePet).getHunger();
		} else {
			return -1;
		}
	}
	public void feedPetMeal(String name) {
		VirtualPet singlePet = virtualPetsMap.get(name);

		if(singlePet instanceof OrganicPet) {
			((OrganicPet)singlePet).feedMeal();
		}
	}
	public void feedAllSnackMethod() {
		for (VirtualPet virtualPet : virtualPetsMap.values()) {
			
			if(virtualPet instanceof OrganicPet && virtualPet.getOwnership() == true) {
				((OrganicPet)virtualPet).feedSnack();				
			}
			
		}
	}
	public int getPetThirst(String name) {
		VirtualPet singlePet = virtualPetsMap.get(name);
		if(singlePet instanceof OrganicPet) {
			return ((OrganicPet) singlePet).getThirst();
		} else {
			return -1;
		}
	}
	public boolean getPetBoredom(String name) {
		VirtualPet singlePet = virtualPetsMap.get(name);
		if(singlePet instanceof OrganicPet) {
			return ((OrganicPet) singlePet).getBoredom();
		} else {
			return false;
		}
	}
	public int getPetBoredomCounter(String name) {
		VirtualPet singlePet = virtualPetsMap.get(name);
		if(singlePet instanceof OrganicPet) {
			return ((OrganicPet) singlePet).getBoredomCounter();
		} else {
			return -1;
		}
	}
	public boolean getPetRabiesStatus(String name) {
		VirtualPet singlePet = virtualPetsMap.get(name);
		if(singlePet instanceof OrganicPet) {
			return ((OrganicPet) singlePet).getRabiesStatus();
		} else {
			return false;
		}
	}
	public int getPetSoilRate(String name) {
		VirtualPet singlePet = virtualPetsMap.get(name);
		if(singlePet instanceof OrganicPet) {
			return ((OrganicPet) singlePet).getSoilRate();
		} else {
			return -1;
		}
	}
	public int getHowManyPets() {
		return virtualPetsMap.size();
	}
	
	public ArrayList<String> getAllNames() {
		ArrayList<String> allNames = new ArrayList<String>();
		for (VirtualPet virtualPet : virtualPetsMap.values()) {
			allNames.add(virtualPet.getName());
		}
		return allNames;
	}
	
	

	
	
	public VirtualPet getSinglePet(String name) {
		return virtualPetsMap.get(name);
	}
	
	public void sendPetToShelter(String name) {
		virtualPetsMap.get(name).sendPetToShelter();
	}
	
	
	}
	
	
