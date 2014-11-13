import java.util.*;

import feature_taschenrechner.FeatureTaschenrechner;
import feature_benzinrechner.FeatureBenzinrechner;
import feature_BMI.FeatureBMI;
import feature_bussgeldrechner.FeatureBussgeldrechner;
import feature_nettolohnrechner.FeatureNettolohnrechner;
import feature_quiz.FeatureQuiz;
import feature_stoppuhr.FeatureStoppuhr;
import feature_stromrechner.FeatureStromrechner;
import feature_timer.FeatureTimer;



public class Main {

	//es sind alle moeglichen Kombinationen ausfuehrbar
	
	//globale Variablen
	static boolean Taschenrechner   = false;
	static boolean Benzinrechner    = false;
	static boolean Bu�geldrechner   = false;
	static boolean Nettolohnrechner = false;
	static boolean BMI				= false;
	static boolean Stoppuhr		    = false;
	static boolean Timer			= false;
	static boolean Quiz			    = false;
	static boolean Stromrechner		= false;
	static String resArg;
	
	public static void parseArgs(String[] args){
	
		if(args.length !=0){
			for(int i=0; i<args.length;i++){
				resArg =args[i];
				System.out.println(resArg);
				if(resArg.equalsIgnoreCase("Taschenrechner"))
						Taschenrechner = true;
				else if(resArg.equalsIgnoreCase("Benzinrechner"))
						Benzinrechner = true;
				else if(resArg.equalsIgnoreCase("Bu�geldrechner"))
						Bu�geldrechner = true;
				else if(resArg.equalsIgnoreCase("Nettolohnrechner"))
						Nettolohnrechner = true;
				else if(resArg.equalsIgnoreCase("BMI"))
						BMI = true;
				else if(resArg.equalsIgnoreCase("Stoppuhr"))
						Stoppuhr = true;
				else if(resArg.equalsIgnoreCase("Timer"))
						Timer = true;
				else if(resArg.equalsIgnoreCase("Quiz"))
						Quiz = true;
				else if(resArg.equalsIgnoreCase("Stromrechner"))
						Stromrechner = true;
				else
					System.err.print("go home");	
			}
		}else{
			System.err.print("keine Argumente");
			
		}
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Multifunc_App v0.01");
		System.out.println("");
		
		if(args == null || args.length == 0){
			System.err.print(" Keine Argumente ausgewaehlt \n");
			System.out.println("Bitte rufe das Programm mit einem oder mehreren der folgenen Argumente auf: ");
			System.out.println("");
			System.out.println("Argumente: Taschenrechner, Benzinrechner, Bu�geldrechner, Nettolohnrechner, BMI, Stoppuhr, Timer, Quiz");
			}
		else{
			parseArgs(args);
			ArrayList<String> mainmenu = new ArrayList<String>();
			if(Taschenrechner == true)
				mainmenu.add("Taschenrechner");
			if(Benzinrechner == true)
				mainmenu.add("Benzinrechner");
			if(Bu�geldrechner == true)
				mainmenu.add("Bu�geldrechner");
			if(Nettolohnrechner == true)
				mainmenu.add("Nettolohnrechner");
			if(BMI == true)
				mainmenu.add("BMI");
			if(Stoppuhr == true)
				mainmenu.add("Stoppuhr");
			if(Timer == true)
				mainmenu.add("Timer");
			if(Quiz == true)
				mainmenu.add("Quiz");
			if(Stromrechner == true)
				mainmenu.add("Stromrechner");
			
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
				System.err.println("Diese Option steht nicht zur Verf�gung");
			else
				resArg = mainmenu.get(user);
				System.out.println("Sie haben gew�hlt: " + resArg + "...");

			if(resArg.equalsIgnoreCase("Taschenrechner"))
				new FeatureTaschenrechner();
			if(resArg.equalsIgnoreCase("Benzinrechner"))
				new FeatureBenzinrechner();
			if(resArg.equalsIgnoreCase("BMI"))
				new FeatureBMI();
			if(resArg.equalsIgnoreCase("Bu�geldrechner"))
				new FeatureBussgeldrechner();
			if(resArg.equalsIgnoreCase("Nettolohnrechner"))
				new FeatureNettolohnrechner();
			if(resArg.equalsIgnoreCase("Stoppuhr"))
				new FeatureStoppuhr();
			if(resArg.equalsIgnoreCase("Timer"))
				new FeatureTimer();
			if(resArg.equalsIgnoreCase("Quiz"))
				new FeatureQuiz();
			if(resArg.equalsIgnoreCase("Stromrechner"))
				new FeatureStromrechner();
			}
			
		}
	
	}


