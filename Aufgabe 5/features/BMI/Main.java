public class Main{
	
	public static void main(String[] args){
		
		mainmenu.add("BMI");
		

		original(args);

		
	}
	
	public static void startFeature (String resArg){


		original(resArg);		
		if(resArg.equalsIgnoreCase("BMI"))
			new FeatureBMI();
		
			
		
	}

	
}