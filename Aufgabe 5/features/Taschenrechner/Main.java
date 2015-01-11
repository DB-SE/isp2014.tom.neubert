import java.util.*;
public class Main{
	
	public static void main(String[] args){
		
		mainmenu.add("Taschenrechner");
		

		original(args);

		
	}
	
	public static void startFeature(String resArg){
		
		original(resArg);		
		if(resArg.equalsIgnoreCase("Taschenrechner"))
			new FeatureTaschenrechner();

	//original();
		
		
	}

	
}