package data_structures;

import java.util.ArrayList;

public class ListIteration2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		int blue = 0;
		int green = 0;
		int brown = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEyeColor().equals("blue")) {
				blue += 1;
			} else if (list.get(i).getEyeColor().equals("brown")) {
				brown += 1;
			} else if (list.get(i).getEyeColor().equals("green")) {
				green += 1;
			}
		}

		if (green > blue && green > brown) {
			System.out.println("Green");
		} else if (blue > green && blue > brown) {
			System.out.println("Blue");
		} else if (brown > blue && brown > green) {
			System.out.println("Brown");
		}
	}
}
