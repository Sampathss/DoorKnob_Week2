package com.door.knobs.main;

public class DoorKnobData {

	public String type;
	public String shape;
	public String colour;
	public int quantity;

	public DoorKnobData(String type, String shape, String colour, int quantity) {
		this.type = type;
		this.shape = shape;
		this.colour = colour;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
