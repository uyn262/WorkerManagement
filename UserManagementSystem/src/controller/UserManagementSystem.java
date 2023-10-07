/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import view.Menu;
import repository.UserManagement;
/**
 *
 * @author Admin
 */
public class UserManagementSystem extends Menu<String> {

    static String[] mc = {"Create a new account", "Login system", "Exit"};
    UserManagement program;

    public UserManagementSystem() {
        super("     USER MANAGEMENT SYSTEM", mc);
        program = new UserManagement();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.createNewAccount();
                break;
            case 2:
                program.loginSystem();
                break;
            case 3:
                System.exit(0);
        }
    }

}
