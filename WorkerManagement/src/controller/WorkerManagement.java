/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import model.SalaryHistory;
import model.Worker;
import repository.IWorkerRepository;
import repository.WorkerRepository;
import view.Menu;

/**
 *
 * @author Admin
 */
public class WorkerManagement extends Menu<String> {
    private IWorkerRepository workerRepository;
    static String[] options = {"Add worker", "Up salary", "Down salary", 
                                "Display Information salary", "Exit"};
    Hashtable<String, Worker> workers;
    List<SalaryHistory> salaryHistorys;
    public WorkerManagement() {
        super("===== Worker Management =====", options);
        workerRepository = new WorkerRepository();
        workers = new Hashtable<>();
        salaryHistorys = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1: workerRepository.addWorker(workers);
                break;
            case 2: workerRepository.changeSalary(workers, salaryHistorys, "UP");
                break;
            case 3: workerRepository.changeSalary(workers, salaryHistorys, "DOWN");
                break;
            case 4: workerRepository.displaySalary(salaryHistorys);
                break;
            case 5: System.exit(0);
                break;
        }
    }
    
    
    
}
