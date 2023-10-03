/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Library;
import common.Validation;
import java.util.List;
import model.Contact;

/**
 *
 * @author Admin
 */
public class ContactDao {
    Library l = new Library();
    Validation val = new Validation();
    private static ContactDao instance = null;
    public static ContactDao Instance() {
        if (instance == null)
            synchronized (ContactDao.class) {
                if (instance == null)
                    instance = new ContactDao();
            }
        return instance;        
    }
    public void createContact(List<Contact> list) {
        int id = generateID(list);
        String fullName = l.getString("Enter name: ");
        String group = l.getString("Enter group: ");
        String address = l.getString("Enter address: ");
        String phone = l.getString("Enter phone number: ");
        while (!val.checkInputPhone(phone))
            phone = l.getString("Enter phone again: ");
        String[] str = fullName.split("\\s");
            String firstName = null;
            String lastName = null;
        try {
            firstName = str[0];
            lastName = str[1];
        }
        catch (Exception e) {
            lastName = " ";
        }
        
        list.add(new Contact(id, fullName, group, address, phone, lastName, firstName));
    }

    private int generateID(List<Contact> list) {
        return list.size() + 1;
    }
    public boolean deleteContact(List<Contact> list) {
        int id = l.getInt("Enter id", 1, 100);
        return list.removeIf(c -> c.getId() == id);
    }
}
