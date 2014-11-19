package UmlauteErsetzen;

public class Starter {

	public static void main(String[] args) {
		
		Transliterale t = new Transliterale();
		
		System.out.println(t.ersetzen("umlauts_orig.txt"));

	}

}
