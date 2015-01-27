import java.util.*;

public class Main {

	static ArrayList<String> features = new ArrayList<String>();

	public static void addMenus(ArrayList<String> features){
		// Pointcut

		}
	
	public static void startFeature (String feature){
		
	}
	
	public static void main(String[] args) {
		//Listenuebergabe
		addMenus(features);
		
		System.out.println("Multifunc_App v.0.02");
		System.out.println("");
		
		System.out.println("__-Menu-__");
		System.out.println("Bitte waehlen sie die Zahl des Features welches genutzt werden soll...");
	
		
		
		for(int i=0; i < features.size(); i++){
			System.out.println(features.get(i));
		}
		
	
		
		
		//Scanner fuer Userinput
		System.out.println();
		System.out.println("Feature-NAMEN eingeben: ");
		String resArg;
		Scanner sc = new Scanner(System.in);
		
		resArg = sc.next();
				
		startFeature(resArg);

	}

}
