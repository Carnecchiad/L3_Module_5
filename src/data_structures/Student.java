package data_structures;

public class Student {

	private String eyeColor;
	private String name;

	Student(String name, String eyeColor) {
		this.name = name;
		this.eyeColor = eyeColor;
	}

	String getEyeColor() {
		return eyeColor;
	}

}