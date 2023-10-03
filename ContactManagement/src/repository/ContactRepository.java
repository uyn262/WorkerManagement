/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.ContactDao;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import model.Contact;

/**
 *
 * @author Admin
 */
public class ContactRepository implements IContactRepository {
    @Override
    public void addContact(List<Contact> list) {
        ContactDao.Instance().createContact(list);
    }

    @Override
    public void displayAll(List<Contact> list) {
        for (Contact contact : list) {
            System.out.println(contact);
        }  
    }

    @Override
    public boolean deleteContact(List<Contact> list) {
        return ContactDao.Instance().deleteContact(list);
    }
    public List<Contact> search(Predicate<Contact> condition) {
        List<Contact> list = new ArrayList<>();
            list.forEach(c -> {
                if (condition.test(c))
                    list.add(c);
            }); 
        return list;
    }
    
}
