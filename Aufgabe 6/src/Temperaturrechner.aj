import java.util.ArrayList;


public aspect Temperaturrechner {
	private pointcut showpc(ArrayList<String> features):
		execution(public static void Main.addMenus(ArrayList<String>)) && args(features);

	private pointcut startFeature(String feature):
		call(public static void Main.startFeature(String)) && args(feature);
	
	
	void around(ArrayList<String> features): showpc(features){
		proceed(features);
		
		features.add("Temperaturrechner");
	}
	after(String feature) : startFeature(feature){
		if(feature.equals("Temperaturrechner")){
			System.out.println("                                Temperaturrechner v.0.01");
		}
	}
}