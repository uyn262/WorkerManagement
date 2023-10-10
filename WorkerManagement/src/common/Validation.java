/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Hashtable;
import model.Worker;

/**
 *
 * @author Admin
 */
public class Validation {
        Library l;

    public Validation() {
        l = new Library();
    }
    
    public boolean checkInputIntLimit(int n, int min, int max) {
        try {
            if (n < min || n > max) 
                throw new NumberFormatException();
            return true;
        }
        catch (NumberFormatException e) {
            System.out.println("Please input a number in range [" + min + ", " + max + " ]");
            return false;
        }
    }
    public Worker checkCodeExist(Hashtable<String, Worker> workers, String code) {
        for (String s : workers.keySet()) 
            if (s.equals(code))
                return workers.get(s);
        return null;
    }
    public boolean checkInputPositiveNumber(double salary) {
        try {
            if (salary < 0)
                throw new NumberFormatException();
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
        
        
    }
}
