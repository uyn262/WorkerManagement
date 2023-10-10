/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.Hashtable;
import java.util.List;
import model.SalaryHistory;
import model.Worker;

/**
 *
 * @author Admin
 */
public interface IWorkerRepository {
    void addWorker(Hashtable<String, Worker> workers);
    void changeSalary(Hashtable<String, Worker> workers, List<SalaryHistory> salaryHistorys, String status);
    void displaySalary(List<SalaryHistory> salaryHistorys);
}
