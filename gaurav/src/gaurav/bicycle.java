package gaurav;

public class bicycle {
private String name;
private String type;
private int wheels;
private String color;

public bicycle(String name, String type, int wheels, String color) {
	super();
	this.name = name;
	this.type = type;
	this.wheels = wheels;
	this.color = color;
}
void move() {System.out.println("it is running");}
String show() {String A= "The name is here"; return A;}
int calculation() {int a= 44; return a;}


	public static void main(String[] args) {
		
	bicycle bicycle= new bicycle("Hero", "2-wheeleer", 2, "black");


		bicycle.move();
		bicycle.show();
		bicycle.calculation();
		System.out.println (bicycle);

	}

}