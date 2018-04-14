import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
public static void main(String[] args) {
	Robot bob = new Robot();
	Robot.setWindowImage("nightsky.jpeg");
	Color color = null;
	bob.setPenWidth(6);
	bob.setSpeed(1000000);
	bob.moveTo(830,550);
	bob.turn(-90);
	String height = "";
	String small = "60";
	String medium = "120";
	String large = "250";
	
	for(int i=0;i<10;i++) {
		if(i%2==0) {
			height = small;
			color=Color.WHITE;
			
		}
		else if(i%3==0) {
			height=medium;
			color = Color.BLUE;
			
		}
		else {
			height=large;
			color = Color.RED;
			
		}
		
		house(bob, height,color );
		
	}

}

public static void house(Robot bob, String height, Color color  ) {
	
//	bob.setPenWidth(6);
	//bob.setSpeed(1000000);
		int h = Integer.parseInt(height);
	
		
		bob.setPenColor(0,100,0);
		bob.penDown();
		bob.move(40);
		bob.penUp();
		bob.turn(90);
		bob.penDown();
		bob.setPenColor(color);
		
		bob.move(h);
		if(h<121) {
			drawPointyRoof(bob);
		}
		else {
		bob.turn(-90);
		bob.move(30);
		
		bob.turn(-90);
		}
		bob.move(h);
		bob.turn(90);

}
public static void drawPointyRoof(Robot bob) {
	bob.turn(-45);
	bob.move(10);
	bob.turn(-90);
	bob.move(10);
	bob.turn(-45);
}
}