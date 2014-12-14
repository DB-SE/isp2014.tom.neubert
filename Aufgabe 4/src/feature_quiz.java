import java.util.*;
import java.io.IOException;
public class feature_quiz implements FeatureInterface {

String name;
	public feature_quiz(String name){
		this.name = name;
	}
	@Override
	public void showFeature() {
		for (int i=0;i<5;i++){
			System.out.println("");
			}
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		String answer1;

		
		System.out.println("");
		System.out.println("Willkommen beim BVB-QUIZ :-) !");
		System.out.println("");
		System.out.println("Es erwarten dich 10. Fragen, welche ueberpruefen ob du ein echter Borusse bist.");
		System.out.println("Hinweis: antworte nur mit dem Buchstaben vor der Antwort. Zum Beispiel: b ");
		System.out.println("");
		
		System.out.println("Press ENTER to continue");
		try {
		  System.in.read();
		} catch (IOException e) {
		  e.printStackTrace();
		}
		
		System.out.print("Quiz wird gestartet ");
		
		for(int i =0; i<20; i++){
			System.out.print(". ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
		System.out.println("");
		System.out.println("1. Wann wurde der BVB Champions League Sieger?");
		System.out.println("a) 1995");
		System.out.println("b) 1997");
		System.out.println("c) 1995 & 1998");
		System.out.println("d) 1998 & 2013");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		
		
		if(answer1.equals("b")){
			score = 100;
		}

		
		System.out.println("2. Wann wurde der BVB zuletzt Deutscher Meister?");
		System.out.println("a) 2002");
		System.out.println("b) 2011");
		System.out.println("c) 1996");
		System.out.println("d) 2012");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		if(answer1.equals("d")){
			score = score + 100;
		}
		
		
		System.out.println("3. ÔMia san miaÔ sagen Fans aus... ");
		System.out.println("a) Muenchen");
		System.out.println("b) Gelsenkirchen");
		System.out.println("c) Bremen");
		System.out.println("d) mir doch schei§ egal");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		if(answer1.equals("a")){
			score = score + 100;
		}
		
		System.out.println("4. Wieviel PlŠtze hat der Signal Iduna Park? ");
		System.out.println("a) 80.645");
		System.out.println("b) 82.157");
		System.out.println("c) 78.320");
		System.out.println("d) 79.205");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		if(answer1.equals("a")){
			score = score + 100;
		}
		
		System.out.println("5. Wer ist Dortmunds Rekordspieler?");
		System.out.println("a) JŸrgen Kohler");
		System.out.println("b) Stefan Reuter");
		System.out.println("c) Norbert Dickel");
		System.out.println("d) Michael Zorc");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		if(answer1.equals("d")){
			score = score + 100;
		}
		
		System.out.println("6. Wie oft gewann der BVB den DFB Pokal?");
		System.out.println("a) 2");
		System.out.println("b) 3");
		System.out.println("c) 4");
		System.out.println("d) 5");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		if(answer1.equals("b")){
			score = score + 100;
		}
		
		System.out.println("7. Wann wurde der BVB gegrŸndet?");
		System.out.println("a) 19.04.1909");
		System.out.println("b) 21.11.1909");
		System.out.println("c) 19.12.1909");
		System.out.println("d) 21.08.1909");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		if(answer1.equals("c")){
			score = score + 100;
		}
		
		System.out.println("8. Wer ist der Rekordtorschuetze des BVB? ");
		System.out.println("a) Michael Zorc");
		System.out.println("b) Stephan Chapuisat");
		System.out.println("c) Michael Burgsmueller");
		System.out.println("d) Jan Koller");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		if(answer1.equals("c")){
			score = score + 100;
		}
		
		System.out.println("9. Wer war der teuerste Spielertransfer?");
		System.out.println("a) Marco Reus");
		System.out.println("b) Tomas Rosicky");
		System.out.println("c) Jan Koller");
		System.out.println("d) Marcio Amoroso");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		if(answer1.equals("d")){
			score = score + 100;
		}
		
		System.out.println("10. Schei§e");
		System.out.println("a) 04");
		System.out.println("b) 4");
		System.out.println("c) 05");
		System.out.println("d) 2013");
		System.out.print("Antwort: ");
		answer1=sc.nextLine();
		if(answer1.equals("a")){
			score = score + 100;
		}
		
		System.out.println("Punkte: "+score);
		
		if(score <301){
			System.out.println("FCB_FAN!");
		}
		if(score>301 && score<601){
			System.out.println("Die Leistung war ok, aber mehr auch nicht ;)");
		}	
		if(score==700){
			System.out.println("BVB-Sympathisant");
		}	
		if(score==800){
			System.out.println("echter Dortmunder");
		}
		if(score==900){
			System.out.println("Dauerkartenkaeufer");
		}
		if(score==1000){
			System.out.println("Du bist der BVB");
		}


	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
