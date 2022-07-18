package StringFormatter;

public class Main {

	public static void main(String[] args) {
		String str = "merhaba dunya";
		System.out.println(str);
		System.out.println(capitalizeWord(str));

	}
	
	public static String capitalizeWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  
	}  

}
