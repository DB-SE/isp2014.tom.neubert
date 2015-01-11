public class Main{
	public static void main(String[] args){
		
		mainmenu.add("Stoppuhr");
		
		
		original(args);

		
	}

	public static void startFeature (String resArg){

		original(resArg);
		if(resArg.equalsIgnoreCase("Stoppuhr"))
			new FeatureStoppuhr();
		

			
		
	}
}