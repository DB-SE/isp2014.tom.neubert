import java.util.*;

public aspect Benzinrechner {
	private pointcut showpc(ArrayList<String> features):
		execution(public static void Main.addMenus(ArrayList<String>)) && args(features);

	private pointcut startFeature(String feature):
		call(public static void Main.startFeature(String)) && args(feature);
	
	
	void around(ArrayList<String> features): showpc(features){
		proceed(features);

		features.add("Benzinrechner");
	}
	
	public static float rechner () {
		
		int strecke;
		float verbrauch;
		float preis;
		int personen;
		
		float ergebnis=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie die zu fahrende Strecke in km ein: ");
		strecke = sc.nextInt();
		
		System.out.println("Verbrauch Ihres Autos in l/100: ");
		verbrauch = sc.nextFloat();
		
		System.out.println("aktueller Spritpreis: ");
		preis = sc.nextFloat();
		
		System.out.println("Anzahl der Mitfahrer: ");
		personen = sc.nextInt();

		
		if (personen != 0){
		
			ergebnis = ((verbrauch * (strecke/100) * preis)/personen);
		}
			else {
				System.out.println("Das Auto muss von jemanden gefahren werden!");
			}
			
		return ergebnis;
		}
	
	after(String feature):startFeature(feature){
		if(feature.equals("Benzinrechner")){
			System.out.println("                                         Benzin - Rechner                                  ");
			System.out.println("                                             v1.00                                       ");
			System.out.println("");
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<=1;i++){
			System.out.println("der Spritpreis pro Person betraegt = " + rechner());
			
			System.out.println("Wollen sie das Programm beenden???: ");
			
			System.out.println("0 --> weiter");
			System.out.println("1 --> beenden");
			
			i = sc.nextInt();
			
			
			if(i != 0 && i !=1)
				System.err.println("falsche Eingabe");
			
			}
		}
	}		
}
