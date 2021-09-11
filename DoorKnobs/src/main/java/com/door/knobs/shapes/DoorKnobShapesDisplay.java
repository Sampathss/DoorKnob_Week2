package com.door.knobs.shapes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DoorKnobShapesDisplay implements DoorKnobShapes {
	Scanner scan = new Scanner(System.in);
	
	public static List<String> doorKnobShapes = Arrays.asList("Flat", "Round", "Scroll", "Drop");

	public String display() {
		System.out.println(" Please Select the Type of Door Knob   " + "\n");
		int i=1;
		for (String type : doorKnobShapes) {
			System.out.println(i+". "+type);
			i++;
		}
		int doorKnobTypeNumber = scan.nextInt();
		System.out.println("You selected: " + doorKnobShapes.get(doorKnobTypeNumber - 1) + "\n");
		return doorKnobShapes.get(doorKnobTypeNumber - 1);
	}

}
