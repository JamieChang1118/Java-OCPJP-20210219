package com.ocp.day22;

public class Propagate {
    public static void main(String[] args) {
        try {
            System.out.println(reverse("ABC"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }      
    }
    
    public static String reverse(String s) throws Exception{
        if(s.length() == 0){
            Exception e = new Exception("字數的長度不可為零");
            throw e;
        }
        
        String reverseStr = " ";
        for (int i = s.length()-1 ; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    } 
    
}
