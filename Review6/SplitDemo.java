package Review6;

public class SplitDemo {
	
	public static void main(String[] args) {
		String longStr = "I Am very happy today, because today is not Monday.";
        String[] stringArray = longStr.split("today");
        System.out.println(stringArray.length);
        for (int i = 0; i < stringArray.length; i++) {
            if (i == stringArray.length - 1) {
                System.out.print(stringArray[i]);
            } else {
                System.out.print(stringArray[i] + "today");
            }
        }
        System.out.println();
        System.out.println("---For each---");
        for (String str : stringArray) {
            System.out.print(str);
        }
        System.out.println();
        System.out.println("-----------------");
        
        stringArray = longStr.split(" ");
        System.out.println(stringArray.length);
        
        for (String str: stringArray) {
            System.out.println(str);
        }
        
        System.out.println();
        System.out.println("-----------------");
        
        longStr = "I like number 3 and 4 because 7 ate 9.";
        stringArray = longStr.split("[0-9]");
        for (String str : stringArray) {
            System.out.println(str);
        }
        System.out.println(longStr);
        int result = longStr.indexOf("today");
        System.out.println(result);
        int result1 =longStr.indexOf("today", 17);
        System.out.println(result1);
        int result2 =longStr.indexOf("today", 31);
        System.out.println(result2); // No today after 31st character - so returns /-1/
        
    
	}

}
