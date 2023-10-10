/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import model.SalaryHistory;
import model.Worker;
import view.Menu;
import dataAccess.WorkerDAO;

/**
 *
 * @author Admin
 */
public class WorkerRepository implements IWorkerRepository {

    @Override
    public void addWorker(Hashtable<String, Worker> workers) {
        WorkerDAO.Instance().addWorker(workers);
    }

    @Override
    public void changeSalary(Hashtable<String, Worker> workers, List<SalaryHistory> salaryHistorys, String status) {
        WorkerDAO.Instance().changeSalary(workers, salaryHistorys, status);
    }

    @Override
    public void displaySalary(List<SalaryHistory> salaryHistorys) {
        WorkerDAO.Instance().displayInfomationSalary(salaryHistorys);
    }
    
}

    
    
    

