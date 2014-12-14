import java.util.*;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
//import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.Timer;


public class feature_timer implements FeatureInterface {
String name;
Toolkit tools;
	public feature_timer(String name){
		this.name=name;
	}
	

	public void showFeature() {
		System.out.println("                                         Timer                                  ");
		System.out.println("                                         v0.1                                       ");
		System.out.println("");
		
		
		System.out.println("Geben sie die Zeit in Sekunden an: ");
		
		int user;
		Scanner sc = new Scanner(System.in);
		user = sc.nextInt();
	

		
		Timer timer = new Timer (user*1000,null);
		timer.start();
		
		System.out.print("Timer laueft ");
		
		for(int i =0; i<user; i++){
			System.out.print(". ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}

		}
	
	System.out.println("");
	System.out.println("Die " + user + " Sekunden sind abgelaufen");
		
		
		

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
