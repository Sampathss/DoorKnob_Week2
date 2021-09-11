package com.door.knobs.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.door.knobs.colour.*;
import com.door.knobs.shapes.*;
import com.door.knobs.types.*;

public class DoorKnobMain {
	static String doorKnobType;
	static String doorKnobShape;
	static String doorKnobColour;
	static int doorKnobQuantity;
	static boolean flag = true;
	static List<DoorKnobData> doorKnobData = new ArrayList<DoorKnobData>();

	public static void main(String[] args) {

		DoorKnobTypes doorKnobTypes = new DoorKnobTypesDisplay();
		DoorKnobShapes doorKnobShapes = new DoorKnobShapesDisplay();
		DoorKnobColours doorKnobColours = new DoorKnobColoursDisplay();
		DoorKnobOrder doorKnobOrderAndCreation = new DoorKnobOrder();

		Scanner scan = new Scanner(System.in);
		System.out.println(" ************ WELCOME TO DOOR KNOB SHOW ROOM ************ " + "\n");
		while (flag) {
			try {
				setDoorKnobType(doorKnobTypes.display());
				setDoorKnobShape(doorKnobShapes.display());
				setDoorKnobColour(doorKnobColours.display());

				System.out.println("How many number of Door Knobs you require? \n");
				setDoorKnobQuantity(scan.nextInt());
				doorKnobData.add(new DoorKnobData(getDoorKnobType(), getDoorKnobShape(), getDoorKnobColour(),
						getDoorKnobQuantity()));

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
		System.out.println("****************************************************************");
		doorKnobOrderAndCreation.order();
		System.out.println("****************************************************************");
		for (DoorKnobData doorKnobDatas : doorKnobData) {
			System.out.println("Type :: " + doorKnobDatas.getType());
			System.out.println("Shape :: " + doorKnobDatas.getShape());
			System.out.println("Colour :: " + doorKnobDatas.getColour());
			System.out.println("Quantity :: " + doorKnobDatas.getQuantity());
			System.out.println("\n" + "\n");
		}
		System.out.println("****************************************************************");
		doorKnobOrderAndCreation.create();
		System.out.println("****************************************************************");

	}

	public static String getDoorKnobType() {
		return doorKnobType;
	}

	public static void setDoorKnobType(String doorKnobType) {
		DoorKnobMain.doorKnobType = doorKnobType;
	}

	public static String getDoorKnobShape() {
		return doorKnobShape;
	}

	public static void setDoorKnobShape(String doorKnobShape) {
		DoorKnobMain.doorKnobShape = doorKnobShape;
	}

	public static String getDoorKnobColour() {
		return doorKnobColour;
	}

	public static void setDoorKnobColour(String doorKnobColour) {
		DoorKnobMain.doorKnobColour = doorKnobColour;
	}

	public static int getDoorKnobQuantity() {
		return doorKnobQuantity;
	}

	public static void setDoorKnobQuantity(int doorKnobQuantity) {
		DoorKnobMain.doorKnobQuantity = doorKnobQuantity;
	}

}
