import lesson3.buiders.PropertyBuilder;
import thank267.commons.models.Property;

public class App {
	public static void main(String[] args) {
		Property property = new PropertyBuilder()
				.name("Продажа однокомнатная квартира 33.2м2")
				.rooms(1)
				.square(33.2f)
				.squareUnit("м2")
				.build();

		System.out.println(property);
	}
}
