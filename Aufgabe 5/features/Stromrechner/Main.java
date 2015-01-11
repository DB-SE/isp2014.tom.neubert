public class Main{
	public static void main(String[] args){
		
		mainmenu.add("Stromrechner");
		

		original(args);

		
	}
	
	public static void startFeature (String resArg){


		original(resArg);		
		if(resArg.equalsIgnoreCase("Stromrechner"))
			new FeatureStromrechner();
		
			
		
	}
}