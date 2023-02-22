package Managment;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager (String deptName, String name, Integer NI, Double salary){
        super(name, NI, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}
