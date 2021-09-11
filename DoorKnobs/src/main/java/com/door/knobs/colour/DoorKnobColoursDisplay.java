package com.door.knobs.colour;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DoorKnobColoursDisplay implements DoorKnobColours {

	Scanner scan = new Scanner(System.in);
	
	public static List<String> doorKnobColours = Arrays.asList("Violet", "Red", "Black", "White", "Blue",
			"Green", "Gray");

	public String display() {
		System.out.println(" Please Select the Type of Door Knob   " + "\n");
		int i=1;
		for (String type : doorKnobColours) {
			System.out.println(i+". "+type);
			i++;
		}
		int doorKnobTypeNumber = scan.nextInt();
		System.out.println("You selected: " + doorKnobColours.get(doorKnobTypeNumber - 1) + "\n");
		return doorKnobColours.get(doorKnobTypeNumber - 1);
	}

}
