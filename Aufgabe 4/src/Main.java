import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuInterface mainMenu = new Menu();
		
		ArrayList<FeatureInterface> features = new ArrayList <FeatureInterface>();
		
		FeatureInterface Taschenrechner = new feature_taschenrechner ("Taschenrechner");
		FeatureInterface BMI = new feature_BMI("BMI");
		FeatureInterface Stoppuhr = new feature_Stoppuhr("Stoppuhr");
		FeatureInterface Benzinrechner = new feature_Benzinrechner("Benzinrechner");
		FeatureInterface Quiz = new feature_quiz("Quiz");
		FeatureInterface Timer = new feature_timer("Timer");
		
		
		//hier entsprechende Config einstellen
		features.add(Taschenrechner);
		features.add(BMI);
		features.add(Stoppuhr);
		features.add(Benzinrechner);
		features.add(Quiz);
		features.add(Timer);
		
		
		
		mainMenu.showMenu(features);

	}

}
