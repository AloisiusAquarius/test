package TestRegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegExTest {

	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);
			boolean gefunden = false;
			System.out.println("Bitte geben Sie einen regul�ren Ausdruck ein:");

			Pattern p = null;

			try {
				p = Pattern.compile(sc.nextLine()); // nextLine hollt Daten aus
													// dem Tastaturstream
													// komplett raus und leert
													// diesen danach
			} catch (PatternSyntaxException e) {
				System.out.println(e.getMessage() + "Syntaxfehler!");
			} catch (NullPointerException e) {
				System.out.println(e.getMessage() + "Keine Eingabe!!!");
			}
			System.out
					.println("Bitte geben Sie einen zu durchsuchenden Text ein:");

			// Matcher m = p.matcher(sc.nextLine());
			
			// while(m.find()){
			// gefunden = true;
			// System.out.println("Treffer \"" + m.group() + "\" zwischen " +
			// m.start() + " und " + m.end() );
			//
			// }

			Matcher m = null;
			try {
				m = p.matcher(sc.nextLine());

				// Hier direkt unten h�tte das Catch keine Komplette Funktion,
				// weil dann in der WhileSchleife die einzufangende
				// NullPointerException aufkommen w�rde

				// Desweiteren kann man sich die Try-Catch L�usung f�r den
				// Matcher komplett sparen wenn man das Catch von Pattern
				// einfach ganz an das Ende stellt!

				// }catch(NullPointerException e){
				// System.err.println(e.getMessage() + "Kein Suchmuster!");
				// }
				while (m.find()) {
					gefunden = true;
					System.out.println("Treffer \"" + m.group()
							+ "\" zwischen " + m.start() + " und " + m.end());

				}
				if (!gefunden) {
					System.out.println("Keine Treffer!");
				}

			} catch (NullPointerException e) {
				System.err.println(e.getMessage() + "Kein Suchmuster!");
			}
			// p = null;

			// sc.close(); -> Warnung das Scanner nicht geschlossen wird
			// ignorieren, sonst der Stream System.in f�r immer geschlossen!

		}

	}

}
