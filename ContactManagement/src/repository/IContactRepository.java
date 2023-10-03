/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.Contact;

/**
 *
 * @author Admin
 */
public interface IContactRepository {
    void addContact(List<Contact> list);
    void displayAll(List<Contact> list);
    boolean deleteContact(List<Contact> list);
}
