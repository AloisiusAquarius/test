import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HelloRegEx_World {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[Tt]est"); // Das zu suchende "Muster" oder der Suchbegriff (Die Nadel)
		Matcher m = p.matcher("Test Test test tester");	// Das zu DURCHsuchende (Der Heuhaufen)
		
		System.out.println("Wir suchen [Tt]est: ");
		while(m.find()){
			System.out.println(m.group());
		}
		System.out.println();
		
		Pattern p1 = Pattern.compile("[0-9]{6}[- ]?[A-Z][- ]?[1-7][0-9]{4}");
		Matcher m1 = p1.matcher("260183-F-61218 123456 G 12345 654321G12345 665544-F-99999");
		
		System.out.println("Wir suchen eine PK: ");
		while(m1.find()){
			System.out.println(m1.group());
		}
		System.out.println();
		
		Pattern p2 = Pattern.compile("A(B)(C)((D)E)");
		Matcher m2 = p2.matcher("ABCDE");
		
		System.out.println("Wir zählen die Gruppen: ");
		while(m2.find()){
			for(int i = 0; i <= m2.groupCount(); i++){
				System.out.println( i + ":" +m2.group(i));
			}
			
		}
		System.out.println();
		
		Pattern p3 = Pattern.compile("([0-9]{6})[- ]?([A-Z])[- ]?([1-7][0-9]{4})");
		Matcher m3= p3.matcher("260183-F-61218 123456 G 12345 654321G12345 665544-F-99999");
		
		System.out.println("Wir suchen die Gruppen in der PK: ");
		while(m3.find()){
			for(int i = 0; i <= m3.groupCount(); i++){
				System.out.println( i + ":" +m3.group(i));
			}
		System.out.println();
		}

	}

}
