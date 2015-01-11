public class Main{
	public static void main(String[] args){
		
		mainmenu.add("Quiz");
		

		original(args);

		
	}
	
	public static void startFeature (String resArg){


		original(resArg);		
		if(resArg.equalsIgnoreCase("Quiz"))
			new FeatureQuiz();
		
			
		
	}
}