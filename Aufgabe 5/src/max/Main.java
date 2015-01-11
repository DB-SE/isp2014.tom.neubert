import java.util.*; public   class  Main {
	
	
	//static String resArg;
	static ArrayList<String> mainmenu = new ArrayList<String>();

	
	
	 private static void  main__wrappee__Main  (String[] args) {
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

	
	
	 private static void  main__wrappee__Taschenrechner  (String[] args){
		
		mainmenu.add("Taschenrechner");
		

		main__wrappee__Main(args);

		
	}

	
	 private static void  main__wrappee__Benzinrechner  (String[] args){
		
		mainmenu.add("Benzinrechner");
		

		main__wrappee__Taschenrechner(args);

		
	}

	
	 private static void  main__wrappee__Bussgeldrechner  (String[] args){
		
		mainmenu.add("Bussgeldrechner");
		

		main__wrappee__Benzinrechner(args);

		
	}

	
	 private static void  main__wrappee__Nettolohnrechner  (String[] args){
		
		mainmenu.add("Nettolohnrechner");
		

		main__wrappee__Bussgeldrechner(args);

		
	}

	
	
	 private static void  main__wrappee__BMI  (String[] args){
		
		mainmenu.add("BMI");
		

		main__wrappee__Nettolohnrechner(args);

		
	}

	
	 private static void  main__wrappee__Timer  (String[] args){
		
		mainmenu.add("Timer");
		

		main__wrappee__BMI(args);

		
	}

	
	 private static void  main__wrappee__Stromrechner  (String[] args){
		
		mainmenu.add("Stromrechner");
		

		main__wrappee__Timer(args);

		
	}

	
	 private static void  main__wrappee__Stoppuhr  (String[] args){
		
		mainmenu.add("Stoppuhr");
		
		
		main__wrappee__Stromrechner(args);

		
	}

	
	public static void main(String[] args){
		
		mainmenu.add("Quiz");
		

		main__wrappee__Stoppuhr(args);

		
	}

	
	
	 private static void  startFeature__wrappee__Main  (String resArg){

	
		
}

	
	
	 private static void  startFeature__wrappee__Taschenrechner  (String resArg){
		
		startFeature__wrappee__Main(resArg);		
		if(resArg.equalsIgnoreCase("Taschenrechner"))
			new FeatureTaschenrechner();

	//startFeature__wrappee__Main();
		
		
	}

	
	
	 private static void  startFeature__wrappee__Benzinrechner  (String resArg){


		startFeature__wrappee__Taschenrechner(resArg);		
		if(resArg.equalsIgnoreCase("Benzinrechner"))
			new FeatureBenzinrechner();
		
			
		
	}

	
	
	 private static void  startFeature__wrappee__Bussgeldrechner  (String resArg){


		startFeature__wrappee__Benzinrechner(resArg);		
		if(resArg.equalsIgnoreCase("Bussgeldrechner"))
			new FeatureBussgeldrechner();
		
			
		
	}

	
	
	 private static void  startFeature__wrappee__Nettolohnrechner  (String resArg){


		startFeature__wrappee__Bussgeldrechner(resArg);		
		if(resArg.equalsIgnoreCase("Nettolohnrechner"))
			new FeatureNettolohnrechner();
		
			
		
	}

	
	
	 private static void  startFeature__wrappee__BMI  (String resArg){


		startFeature__wrappee__Nettolohnrechner(resArg);		
		if(resArg.equalsIgnoreCase("BMI"))
			new FeatureBMI();
		
			
		
	}

	
	
	 private static void  startFeature__wrappee__Timer  (String resArg){


		startFeature__wrappee__BMI(resArg);		
		if(resArg.equalsIgnoreCase("Timer"))
			new FeatureTimer();
		
			
		
	}

	
	
	 private static void  startFeature__wrappee__Stromrechner  (String resArg){


		startFeature__wrappee__Timer(resArg);		
		if(resArg.equalsIgnoreCase("Stromrechner"))
			new FeatureStromrechner();
		
			
		
	}

	

	 private static void  startFeature__wrappee__Stoppuhr  (String resArg){

		startFeature__wrappee__Stromrechner(resArg);
		if(resArg.equalsIgnoreCase("Stoppuhr"))
			new FeatureStoppuhr();
		

			
		
	}

	
	
	public static void startFeature (String resArg){


		startFeature__wrappee__Stoppuhr(resArg);		
		if(resArg.equalsIgnoreCase("Quiz"))
			new FeatureQuiz();
		
			
		
	}


}
