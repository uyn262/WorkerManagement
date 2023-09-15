/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.CandidateC;
import java.util.ArrayList;
import model.Candidate;
import view.Menu;

/**
 *
 * @author Admin
 */
public class CandidateManager extends Menu {
    
    private static ArrayList<Candidate> arr = new ArrayList();

    public CandidateManager() {
    }

    public CandidateManager(String title, String[] s) {
        super(title, s);
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                CandidateC.createNewCandidate(arr, 0);
                break;
            case 2:
                CandidateC.createNewCandidate(arr, 1);
                break;
            case 3:
                CandidateC.createNewCandidate(arr, 2);
                break;
            case 4:
                CandidateC.searchCandidate(arr);
                break;
            case 5: 
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-5");
        }
    } 
}
