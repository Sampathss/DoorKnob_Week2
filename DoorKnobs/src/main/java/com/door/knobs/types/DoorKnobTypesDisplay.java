package com.door.knobs.types;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DoorKnobTypesDisplay implements DoorKnobTypes {
	Scanner scan = new Scanner(System.in);

	public static List<String> doorKnobTypes = Arrays.asList("Commercial", "Dummy", "Exterior", "Interior",
			"KeyedEntry", "Passage", "Privacy");

	public String display() {
		System.out.println(" Please Select the Type of Door Knob   " + "\n");
		int i = 1;
		for (String type : doorKnobTypes) {
			System.out.println(i + ". " + type);
			i++;
		}
		int doorKnobTypeNumber = scan.nextInt();
		System.out.println("You selected: " + doorKnobTypes.get(doorKnobTypeNumber - 1) + "\n");
		return doorKnobTypes.get(doorKnobTypeNumber - 1);
	}

}
