/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Contact;
import repository.ContactRepository;
import repository.IContactRepository;
import view.Menu;

/**
 *
 * @author Admin
 */
public class ContactManagement extends Menu<String> {
    private IContactRepository contactRepository;
    static String[] options = {"Add a Contact", "Dislay all Contact", "Delete a Contact", "Exit"};
    List<Contact> list;
    public ContactManagement() {
        super("====== Contact Program ======", options);
        contactRepository = new ContactRepository();
        list = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                contactRepository.addContact(list);
                break;
            case 2: 
                contactRepository.displayAll(list);
                break;
            case 3: 
                contactRepository.deleteContact(list);
                break;
            case 4: 
                System.exit(0);
                break;
            
        }
    }
}    
