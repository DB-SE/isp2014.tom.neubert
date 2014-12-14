import java.util.*;


public class Menu implements MenuInterface {

	@Override
	public void showMenu(ArrayList<FeatureInterface> features) {
		// TODO Auto-generated method stub

		for(int i = 0; i<features.size(); i++){
			System.out.println(i + " --> " + features.get(i).getName());
			
		}
		
		//Benutzereingabe
		System.out.print("Waehlen Sie ein Features: ");
		int user;
		Scanner sc = new Scanner(System.in);
		user = sc.nextInt();
		
		if (user >= features.size())
			System.err.println("Diese Option steht nicht zur Verfuegung");
		else
		
		features.get(user).showFeature();

	}

}
