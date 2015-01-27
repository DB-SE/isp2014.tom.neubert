import java.util.*;
public aspect Timer {
	private pointcut showpc(ArrayList<String> features):
		execution(public static void Main.addMenus(ArrayList<String>)) && args(features);

	private pointcut startFeature(String feature):
		call(public static void Main.startFeature(String)) && args(feature);
	
	
	void around(ArrayList<String> features): showpc(features){
		proceed(features);

		features.add("Timer");
	}
	
	after(String feature):startFeature(feature){
		if(feature.equals("Timer")){
			System.out.println("                                         Timer                                  ");
			System.out.println("                                         v0.1                                       ");
			System.out.println("");
			
			
			System.err.println("Funktioniert mit AspectJ nicht!!! ");


		}
	}
}