public class Main{
	public static void main(String[] args){
		
		mainmenu.add("Bussgeldrechner");
		

		original(args);

		
	}
	
	public static void startFeature (String resArg){


		original(resArg);		
		if(resArg.equalsIgnoreCase("Bussgeldrechner"))
			new FeatureBussgeldrechner();
		
			
		
	}
}