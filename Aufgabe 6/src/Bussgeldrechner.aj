import java.util.ArrayList;



public aspect Bussgeldrechner {
	
	private pointcut showpc(ArrayList<String> features):
		execution(public static void Main.addMenus(ArrayList<String>)) && args(features);

	private pointcut startFeature(String feature):
		call(public static void Main.startFeature(String)) && args(feature);
	
	
	void around(ArrayList<String> features): showpc(features){
		proceed(features);
		
		features.add("Bussgeldrechner");
	}
	after(String feature) : startFeature(feature){
		if(feature.equals("Bussgeldrechner")){
			System.out.println("                                Bussgeldrechner v.0.01");
		}
	}
}