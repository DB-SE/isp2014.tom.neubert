public class Main{
	public static void main(String[] args){
		
		mainmenu.add("Benzinrechner");
		

		original(args);

		
	}
	
	public static void startFeature (String resArg){


		original(resArg);		
		if(resArg.equalsIgnoreCase("Benzinrechner"))
			new FeatureBenzinrechner();
		
			
		
	}
}