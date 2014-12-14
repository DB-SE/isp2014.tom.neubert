import java.util.*;
public class feature_taschenrechner implements FeatureInterface {

	String name;

	
	public feature_taschenrechner(String name){
		this.name = name;
	}
	
	
	
	public static void standartrechner(){
		
		float erg = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte geben Sie den 1. Zahlenwert ein: ");
		float a = sc.nextInt();
		
		System.out.print("Bitte waehlen Sie einen der folgenden Recheroperatoren: + - * /: ");
		
		String operator = sc.next();
		
		System.out.print("Bitte geben Sie den 2. Zahlenwert ein: ");
		float b = sc.nextInt();
		
		if (operator.equalsIgnoreCase("+")){
			erg = a + b;
		}
		if (operator.equalsIgnoreCase("-"))
			erg = a - b;
		
		if (operator.equalsIgnoreCase("*"))
			erg = a * b;
		
		if (operator.equalsIgnoreCase("/"))
			erg = a / b;
		
		System.out.println("Ergebnis: " + erg);
		
			
		
		
	}
	
	public static void advancedrechner(){
		float erg = 0;

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte geben Sie den 1. Zahlenwert ein: ");
		float a = sc.nextInt();
		
		System.out.print("Bitte waehlen Sie einen der folgenden Recheroperatoren: + - * / quadrat : ");
		
		String operator = sc.next();
		
		System.out.print("Bitte geben Sie den 2. Zahlenwert ein: ");
		float b = sc.nextInt();
		
		if (operator.equalsIgnoreCase("+")){
			erg = a + b;
		}
		if (operator.equalsIgnoreCase("-"))
			erg = a - b;
		
		if (operator.equalsIgnoreCase("*"))
			erg = a * b;
		
		if (operator.equalsIgnoreCase("/"))
			erg = a / b;
		
		if (operator.equalsIgnoreCase("quadrat"))
			erg = (float) Math.pow(a, b);
		
		System.out.println("Ergebnis: " + erg);
		
			
			
	}
	
	
	
	
	public void showFeature() {
		// TODO Auto-generated method stub
		for(int i = 0; i<=1; i++){
			System.out.println("                                         Taschenrechner                                 ");
			System.out.println("                                             v1.01                                       ");
		System.out.println("Bitte waehlen Sie die zu nutzende TaschenrechnerVariante:");
		System.out.println("1 --> Standart");
		System.out.println("2 --> Advanced");
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		input = sc.nextInt();
		

		
		if(input == 1)
			standartrechner();
		
		if(input == 2)
			advancedrechner();
		
		if(input != 1 && input !=2)
			System.err.println("falsche Eingabe");
		
		System.out.println("Wollen sie das Programm beenden???: ");
		
		System.out.println("0 --> weiter");
		System.out.println("1 --> beenden");
		
		i = sc.nextInt();
		
		
		if(i != 0 && i !=1)
			System.err.println("falsche Eingabe");

	}
}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
