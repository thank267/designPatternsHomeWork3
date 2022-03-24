package lesson3.buiders;

import thank267.commons.models.Property;

public class PropertyBuilder {
	private final Property property;

	public PropertyBuilder() {
		property = new Property();
	}

	public PropertyBuilder name(String name){
		property.setName(name);
		return this;
	}

	public PropertyBuilder rooms(Integer rooms){
		property.setRooms(rooms);
		return this;
	}

	public PropertyBuilder square(Float square){
		property.setSquare(square);
		return this;
	}

	public PropertyBuilder squareUnit(String squareUnit){
		property.setSquareUnit(squareUnit);
		return this;
	}

	public PropertyBuilder liveSquare(Float liveSquare){
		property.setLiveSquare(liveSquare);
		return this;
	}

	public Property build() {
		return property;
	}

}
