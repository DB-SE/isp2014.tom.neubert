package multifunc_antenna;


import java.util.*;


//#if BMI
import feature_BMI.FeatureBMI;
//#endif

//#if Benzinrechner
import feature_benzinrechner.FeatureBenzinrechner;
//#endif

//#if Bussgeldrechner
//@import feature_bussgeldrechner.FeatureBussgeldrechner;
//#endif

//#if Nettolohnrechner
//@import feature_nettolohnrechner.FeatureNettolohnrechner;
//#endif

//#if Quiz
//@import feature_quiz.FeatureQuiz;
//#endif

//#if Stoppuhr
import feature_stoppuhr.FeatureStoppuhr;
//#endif

//#if Stromrechner
//@import feature_stromrechner.FeatureStromrechner;
//#endif

//#if Taschenrechner
import feature_taschenrechner.FeatureTaschenrechner;
//#endif

//#if Timer
//@import feature_timer.FeatureTimer;
//#endif


public class Main {
	//es sind alle moeglichen Kombinationen ausfuehrbar
	
	//globale Variablen

	static String resArg;
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Multifunc_App v0.02");
		System.out.println("");
		

			ArrayList<String> mainmenu = new ArrayList<String>();
			//#if Taschenrechner
				mainmenu.add("Taschenrechner");
			//#endif
			
			//#if Benzinrechner
				mainmenu.add("Benzinrechner");
			//#endif
			
			//#if Bussgeldrechner
//@				mainmenu.add("Bussgeldrechner");
			//#endif
			
			//#if Nettolohnrechner
//@				mainmenu.add("Nettolohnrechner");
			//#endif
			
			//#if BMI
				mainmenu.add("BMI");
			//#endif
			
			//#if Stoppuhr
				mainmenu.add("Stoppuhr");
			//#endif
			
			//#if Timer
//@				mainmenu.add("Timer");
			//#endif
			
			//#if Quiz
//@				mainmenu.add("Quiz");
			//#endif
			
			//#if Stromrechner
//@				mainmenu.add("Stromrechner");
			//#endif
			
			//Menu
			System.out.println("__-Menu-__");
			System.out.println("Bitte waehlen sie die Zahl des Features welches genutzt werden soll...");
			for (int i= 0; i < mainmenu.size();i++){
				//System.out.println(mainmenu.size());
				System.out.println(i + " --> " + mainmenu.get(i));
			
			}
			//Scanner fuer Userinput
			System.out.println();
			System.out.println("Feature No.: ");
			int user;
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			

			
			//Ausfuehren des Features
			if(user >= mainmenu.size())
				System.err.println("Diese Option steht nicht zur Verfuegung");
			else
				resArg = mainmenu.get(user);
				System.out.println("Sie haben gewaehlt: " + resArg + "...");

			//#if Taschenrechner
			if(resArg.equalsIgnoreCase("Taschenrechner"))
				new FeatureTaschenrechner();
			//#endif
			
			//#if Benzinrechner
			if(resArg.equalsIgnoreCase("Benzinrechner"))
				new FeatureBenzinrechner();
			//#endif
			
			//#if BMI
			if(resArg.equalsIgnoreCase("BMI"))
				new FeatureBMI();
			//#endif
			
			//#if Bussgeldrechner
//@			if(resArg.equalsIgnoreCase("Bussgeldrechner"))
//@				new FeatureBussgeldrechner();
			//#endif
			
			//#if Nettolohnrechner
//@			if(resArg.equalsIgnoreCase("Nettolohnrechner"))
//@				new FeatureNettolohnrechner();
			//#endif
			
			//#if Stoppuhr
			if(resArg.equalsIgnoreCase("Stoppuhr"))
				new FeatureStoppuhr();
			//#endif
			
			//#if Timer
//@			if(resArg.equalsIgnoreCase("Timer"))
//@				new FeatureTimer();
			//#endif
			
			//#if Quiz
//@			if(resArg.equalsIgnoreCase("Quiz"))
//@				new FeatureQuiz();
			//#endif
			
			//#if Stromrechner
//@			if(resArg.equalsIgnoreCase("Stromrechner"))
//@				new FeatureStromrechner();
			//#endif
			
			}
			
		}
