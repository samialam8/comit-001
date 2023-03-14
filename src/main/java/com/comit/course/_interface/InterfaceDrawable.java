package com.comit.course._interface;

//interface declaration by first user
interface Drawable {
	void draw();//one method
}
//implementation by second user
class Rectangle implements Drawable {
	public void draw() {
		System.out.println("Drawing rectangle");
	}	
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("Drawing circle");
	}
	
}
//user interface by third user
public class InterfaceDrawable {

	public static void main(String[] args) {
		
		Drawable d = new Rectangle(), e = new Circle();
		d.draw();
		e.draw();
		
		

	}

}
