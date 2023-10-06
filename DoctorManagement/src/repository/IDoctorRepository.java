/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Doctor;

/**
 *
 * @author Admin
 */
public interface IDoctorRepository {
    void addDoctor(ArrayList<Doctor> ld);
    void updateDoctor(ArrayList<Doctor> ld);
    void deleteDoctor(ArrayList<Doctor> ld);
    void searchDoctor(ArrayList<Doctor> ld);
}
