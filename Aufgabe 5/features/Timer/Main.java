public class Main{
	public static void main(String[] args){
		
		mainmenu.add("Timer");
		

		original(args);

		
	}
	
	public static void startFeature (String resArg){


		original(resArg);		
		if(resArg.equalsIgnoreCase("Timer"))
			new FeatureTimer();
		
			
		
	}
}