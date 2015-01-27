import java.util.ArrayList;


public aspect Stromrechner {
	private pointcut showpc(ArrayList<String> features):
		execution(public static void Main.addMenus(ArrayList<String>)) && args(features);

	private pointcut startFeature(String feature):
		call(public static void Main.startFeature(String)) && args(feature);
	
	
	void around(ArrayList<String> features): showpc(features){
		proceed(features);
		
		features.add("Stromrechner");
	}
	after(String feature) : startFeature(feature){
		if(feature.equals("Stromrechner")){
			System.out.println("                                Stromrechner v.0.01");
		}
	}
}