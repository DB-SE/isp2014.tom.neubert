import java.io.IOException; 
import java.util.*; 

public aspect Stoppuhr {
	private pointcut showpc(ArrayList<String> features):
		execution(public static void Main.addMenus(ArrayList<String>)) && args(features);

	private pointcut startFeature(String feature):
		call(public static void Main.startFeature(String)) && args(feature);
	
	
	void around(ArrayList<String> features): showpc(features){
		proceed(features);

		features.add("Stoppuhr");
	}
	
	public static void stoppuhr(){
		Scanner sc = new Scanner(System.in);
		//int a=0;
		System.out.println("Start --> Press Enter");
		try {
		  System.in.read();
		} catch (IOException e) {
		  e.printStackTrace();
		}
		
		double start= System.currentTimeMillis();
		System.out.println("Messung laueft....................................");
		System.out.println("STOPP --> Press ENTER");
		
		sc.nextLine();
		double stop = System.currentTimeMillis();

		
	
		System.out.println("Dauer in Sek: " + ((stop - start)/1000));
	
	}
	
	after(String feature):startFeature(feature){
		if(feature.equals("Stoppuhr")){
			System.out.println("                                            Stoppuhr                                 ");
			System.out.println("                                             v0.06                                       ");
			
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<=1;i++){
				
				stoppuhr();
				
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