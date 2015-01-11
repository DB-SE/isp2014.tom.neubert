import java.util.Scanner;

import javax.swing.Timer;



public class FeatureTimer {

	public FeatureTimer() {
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
}