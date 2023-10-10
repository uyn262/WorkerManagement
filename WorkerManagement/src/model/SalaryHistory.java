/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class SalaryHistory extends Worker implements Comparable<SalaryHistory>{
    private String status;
    private String date;

    public SalaryHistory() {
    }

    public SalaryHistory(String status, String date) {
        this.status = status;
        this.date = date;
    }

    public SalaryHistory(String id, String name, int age, double salary, String workLocation, String status, String date) {
        super(id, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + status + " | " + date;
    }

    @Override
    public int compareTo(SalaryHistory o) {
        return getId().compareTo(o.getId());
    }
    
    
}