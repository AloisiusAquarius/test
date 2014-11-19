package UmlauteErsetzen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Transliterale {
	
	HashMap <Character, String> hm = new HashMap <Character, String>();
	
	public Transliterale (){
		hm.put('�', "Ae");
		hm.put('�', "ae");
		hm.put('�', "Oe");
		hm.put('�', "oe");
		hm.put('�', "Ue");
		hm.put('�', "ue");
		hm.put('�', "ss");
	}
	
	public String ersetzen (String filename){
		
		StringBuilder sb = new StringBuilder();
		
		try (	BufferedReader br = new BufferedReader(new FileReader(filename));
				BufferedWriter bw = new BufferedWriter(new FileWriter("tr_"+filename))){
			
			String s;
			
			while ((s = br.readLine()) != null){
				
				for (char c : hm.keySet()){
					String tmp = "" + c;
					s = s.replaceAll(tmp, hm.get(c));
				}
				
				sb.append(s + "\n");
			}
			
			bw.write(sb.toString());
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return sb.toString();
	}

}
