package se.iths.victor.ithsapp;

public class Transfer {
	private static Transfer instance;
	private PersonModel currentPerson;
	
	private Transfer() {
		
	}
	
	public static Transfer getInstance() {
		if(instance == null) {
			instance = new Transfer();
		}
		return instance;
	}
	
	public void setCurrentPerson(PersonModel currentPerson) {
		this.currentPerson = currentPerson;
	}
	
	public PersonModel getCurrentPerson() {
		return currentPerson;
	}
}
