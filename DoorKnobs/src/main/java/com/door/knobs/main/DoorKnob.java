package com.door.knobs.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.door.knobs.colour.*;
import com.door.knobs.shapes.*;
import com.door.knobs.types.*;

public class DoorKnob {
	static String doorKnobType;
	static String doorKnobShape;
	static String doorKnobColour;
	static int doorKnobQuantity;
	static boolean flag = true;

	public static void main(String[] args) {

		DoorKnobTypes doorKnobTypes = new DoorKnobTypesDisplay();
		DoorKnobShapes doorKnobShapes = new DoorKnobShapesDisplay();
		DoorKnobColours doorKnobColours = new DoorKnobColoursDisplay();
		List<DoorKnobData> doorKnobData = new ArrayList<DoorKnobData>();

		Scanner scan = new Scanner(System.in);
		System.out.println(" ************ WELCOME TO DOOR KNOB SHOW ROOM ************ " + "\n");
		while (flag) {
			try {
				doorKnobType = doorKnobTypes.display();
				doorKnobShape = doorKnobShapes.display();
				doorKnobColour = doorKnobColours.display();

				System.out.println("How many number of Door Knobs you require? \n");
				doorKnobQuantity = scan.nextInt();
				doorKnobData.add(new DoorKnobData(doorKnobType, doorKnobShape, doorKnobColour, doorKnobQuantity));
				System.out.println("Do you need any other type of Door knobs? Please select Y or N: \n");
				char c = scan.next().charAt(0);

				if (c == 'N' || c == 'n') {
					flag = false;
				} else {
					flag = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println("Your Door Knobs are ready... You selected the following: \n");
		for (DoorKnobData doorKnobDatas : doorKnobData) {
			System.out.println("Type :: " + doorKnobDatas.getType());
			System.out.println("Shape :: " + doorKnobDatas.getShape());
			System.out.println("Colour :: " + doorKnobDatas.getColour());
			System.out.println("Quantity :: " + doorKnobDatas.getQuantity());
			System.out.println("\n"+"\n");
		}
		System.out.println("Thanks for the shopping !!! Have a Good Day. ");
	}

}
