package feature_BMI;
import java.util.*;

public class FeatureBMI {
	public static void BodyMass (float gewicht , float groesse){
		float BMI;
		float m;
		m= groesse /100;
		BMI = gewicht / (m*m) ;
		for (int i=0;i<2;i++){
			System.out.println("");
			}
		System.out.println("Ihr BMI betraegt: "+ BMI);
		
		if (BMI <= 16){
			System.out.println("                        --> starkes Untergewicht <--                      ");
		}
		if (BMI <= 17 && BMI > 16){
			System.out.println("                        --> maessiges Untergewicht <--                      ");
		}
		if (BMI > 17 && BMI <= 18.5){
			System.out.println("                        --> leichtes Untergewicht <--                      ");
		}
		if (BMI > 18.5 && BMI <= 25){
			System.out.println("                        --> Normalgewicht <--                      ");
			System.out.println("");
			System.out.println("");
			System.out.println("                        *             *             ");
			System.out.println("             ");
			System.out.println("                               *                    ");
			System.out.println("");
			System.out.println("                         *           *             ");
			System.out.println("                          *         *               ");
			System.out.println("                            * * * *                 ");
			System.out.println("");
			System.out.println("");
			
			
		}
		if (BMI > 25 && BMI <=30){
			System.out.println("                        --> Praeadipositas <--                      ");
		}
		if (BMI > 30 && BMI <=35){
			System.out.println("                        --> Adipositas Grad I <--                      ");
		}
		if (BMI > 35 && BMI <= 40){
			System.out.println("                        --> Adipositas Grad II <--                      ");
		}
		if (BMI > 40){
			System.out.println("                        --> Adipositas Grad III <--                      ");
		}
		
		if (BMI>30 || BMI <18.5){
			System.out.println("");
			System.out.println("");
			System.out.println("                        *             *             ");
			System.out.println("             ");
			System.out.println("                               *                    ");
			System.out.println("");
			System.out.println("                            * * * *                 ");
			System.out.println("                          *         *               ");
			System.out.println("                         *           *             ");
			System.out.println("");
			System.out.println("");
		}
		
		
	}
	public FeatureBMI() {
		float gewicht;
		float groesse;

			
			for (int j=0;j<4;j++){
				System.out.println("");
			}
		
		System.out.println("                                         BMI  -  Rechner                                  ");
		System.out.println("                                             v1.07                                       ");
		
		
		for(int i=0; i<=1; i++){
			
		System.out.println("");
		System.out.print("Bitte geben Sie ihr Gewicht ein (in kg): ");
		
		Scanner sc = new Scanner(System.in);
		gewicht = sc.nextFloat();
		
		System.out.print("Bitte geben Sie ihre Koerpergroesse ein (in cm): ");
		
		groesse = sc.nextFloat();

		BodyMass( gewicht, groesse);
		
		
		
		
		System.out.println("Wollen Sie das Programm beenden??? ");
		System.out.println("");
		System.out.println("0 = nicht beenden ");
		System.out.println("1 = beenden  ");
		int k;
		
		// ABBRUCHBEDINGUNGEN
		k = sc.nextInt();
			if(k == 0){
				i = 0;}
			if(k == 1){
				i = 1;}
			if(k > 1){
				System.out.println(" --->!!! FALSCHE EINGABE !!!<---");
				System.out.println("");
				System.out.println("0 --> weiter ");
				System.out.println("1 --> beenden  ");
				k = sc.nextInt();
				if(k == 0){
					i = 0;}
				if(k == 1){
					i = 1;}
				
			}

			}
	}
	
	
}
