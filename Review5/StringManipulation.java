package Review5;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
	       System.out.println(str.length());
	      
//	       String str2 =str.toLowerCase();
//	       System.out.println(str2);
	       str.toLowerCase();
	       System.out.println(str.toUpperCase());
	      
	       System.out.println("****Content Equals*******");
	       System.out.println(str.contentEquals("hello"));
	      
	       System.out.println("****IgnoreCase*******");
	       System.out.println(str.equalsIgnoreCase("hello"));
	      
	      
	      
	       System.out.println("*****Contains******");
	       boolean result =str.contains("ll");
	       System.out.println(result);
	      
	       System.out.println("****StartsWith*******");
	       System.out.println(str.startsWith("ji"));
	      
	       System.out.println("*****StartsWith******");
	       System.out.println(str.startsWith("ll",2));
	       System.out.println("***** EndsWith ******");
	       String b="ll";
	       System.out.println(str.endsWith(b));
	      
	       System.out.println("*****Substring******");
	      System.out.println(str.substring(0));
	      System.out.println("*****IsEmpty******");
	      String str2 =" ";
	      System.out.println(str2.isEmpty());
	      System.out.println("*****Concat******");
	      String str3= str+" "+"World";
	      System.out.println(str3);
	      String str4=" How are you?";
	      System.out.println(str3.concat(str4));
	      System.out.println("****Trim*******");
	      String str5= str4.trim();
	      System.out.println(str5);
	      System.out.println( str4.trim().concat(str));
	      System.out.println("*****charAt******");
	      char results = str.charAt(2);
	      System.out.println(results);
	      System.out.println("-------------");
	      String str6=""+str.charAt(0)+str.charAt(1)+str.charAt(2)+str.charAt(3)+str.charAt(4);
	      System.out.println(str6);
	      System.out.println("********indexOf*********");
	      System.out.println(str.indexOf('l'));
	      System.out.println(str.indexOf("l"));
	      String str7="lfhd";
	      System.out.println(str5.indexOf("f",2));
	      //-1 - didn't find it.
	  }
	}


