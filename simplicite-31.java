package main.java.eraser;

public class Eraser {
    public static String erase(String str) {
    	String Newmot = "";
        int size = str.length();
        for (int i = 0;i<size;i++) {
        	if (str.charAt(i)==32) {
        		if ((i+1<size&&str.charAt(i+1)==32)|| ((i!=0&&str.charAt(i-1)==32))){
        			 Newmot+=str.charAt(i);
        		}
        	}else {
        		Newmot+=str.charAt(i);
        	}
        }
        System.out.println(Newmot);
		return Newmot;
        
    }
}
