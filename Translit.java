

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Translit {
	  public static String Transliting(String s) {
		  String res = "";
	      String [] rus = {"А","Б","В","Г","Д","Е","Ё", "Ж", "З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х","Ч", "Ц","Ш", "Щ", "Э","Ю", "Я", "Ы","Ъ", "Ь", "а","б","в","г","д","е","ё", "ж", "з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","ч", "ц","ш", "щ", "э","ю", "я", "ы","ъ","ь"};
	      String [] eng = {"A","B","V","G","D","E","Е","Zh","Z","I","J","K","L","M","N","O","P","R","S","T","U","F","H","Ch","C","Sh","Csh","E","Ju","Ja","Y","`", "'", "a","b","v","g","d","e","e","zh","z","i","j","k","l","m","n","o","p","r","s","t","u","f","h","ch","c","sh","csh","e","ju","ja","y","`","'"};
	      
	      for (int i = 0; i < s.length(); i++) {
	         String temp = s.substring(i, i + 1);
	         for (int j = 0; j < rus.length; j++) {
	            if (rus[j].equals(temp)) {
	               temp = eng[j];
	            }
	         }
	         res += temp;
	      }

	      return res;
	   }

	public static void main(String[] args) throws IOException  {
		System.out.println("Введите строку");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
		String s=reader.readLine();
		 System.out.println(Transliting(s));  

	}

}
