package application;



import model.entities.AbstractShape;
import model.entities.Circlei;
import model.entities.Rectanglei;
import model.enums.Color;

public class ProgramInterface {

	public static void main(String[] args) {

		AbstractShape s1 = new Circlei(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectanglei(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
