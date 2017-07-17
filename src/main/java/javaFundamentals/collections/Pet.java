package javaFundamentals.collections;

public class Pet {
	private int petId;

	private String petType;

	public Pet(int argPetId, String argPetType) {
		petId = argPetId;
		this.petType = argPetType;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}
}
