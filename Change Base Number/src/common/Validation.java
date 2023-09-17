/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author Admin
 */
public class Validation {
    
    public static boolean checkBinary(String number) {
        for(int i = 0; i < number.length(); i++) {
            String n = number.substring(i, i+1);
            if(!n.equalsIgnoreCase("1") && !n.equalsIgnoreCase("0")) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkHex(String number) {
        for(int i = 0; i<number.length();i++) {
            String n = number.substring(i, i+1).toLowerCase();
            if(Character.isLetter(number.charAt(i))) {
                if(!n.equalsIgnoreCase("a") && !n.equalsIgnoreCase("b") && !n.equalsIgnoreCase("c") && !n.equalsIgnoreCase("d") && !n.equalsIgnoreCase("e") && !n.equalsIgnoreCase("f")) {
                    return false;
                }   
            }
            else if(Character.isLetter(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkDecimal(String number) {
        return number.matches("\\d+");
 
    }
}
