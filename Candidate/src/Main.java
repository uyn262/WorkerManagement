
import controller.CandidateManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        String title = "/----------------------------------/\nManage Candidate Of Company File";
        String[] s = new String[]{"Experience", "Fresher", "Intern", "Searching", "Exit"};
        CandidateManager manage = new CandidateManager(title, s);
        manage.run();
    }
}

