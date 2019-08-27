package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot b = new Robot(400, 450);
		b.setPenColor(Color.blue);
		Robot bl = new Robot(800, 450);
		bl.setPenColor(Color.black);
		Robot r = new Robot(1200, 450);
		r.setPenColor(Color.red);
		Robot y = new Robot(600, 700);
		y.setPenColor(Color.yellow);
		Robot g = new Robot(1000, 700);
		g.setPenColor(Color.green);
		
		Thread r1 = new Thread(()->circle(b));
		Thread r2 = new Thread(()->circle(y));
		Thread r3 = new Thread(()->circle(bl));
		Thread r4 = new Thread(()->circle(g));
		Thread r5 = new Thread(()->circle(r));
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
	}
	
	public static void circle(Robot rob) {
		rob.setSpeed(10);
		rob.setAngle(-90);
		rob.penDown();
		for (int i = 0; i < 120; i++) {
			rob.turn(3);
			rob.move(10);
		}
	}
}

