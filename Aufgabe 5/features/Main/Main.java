import java.util.*;

public class Main{
	
	//static String resArg;
	static ArrayList<String> mainmenu = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Multifunc_App v.0.02");
		System.out.println("");
		
		System.out.println("__-Menu-__");
		System.out.println("Bitte waehlen sie die Zahl des Features welches genutzt werden soll...");
		for (int i= 0; i < mainmenu.size();i++){
		//System.out.println(mainmenu.size());
		System.out.println(mainmenu.get(i));
		}
		
		
		
		
		
		
		
		
		
		//Scanner fuer Userinput
		System.out.println();
		System.out.println("Feature-NAMEN eingeben: ");
		String resArg;
		Scanner sc = new Scanner(System.in);
		resArg = sc.next();
		
		startFeature(resArg);

	}
	
	public static void startFeature (String resArg){

	
		
}
	
	
}