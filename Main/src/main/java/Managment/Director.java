package Managment;



public class Director extends Manager{
    private Double budget;

    public Director (String deptName, String name, Integer NI, Double salary, Double budget){
        super(deptName,name, NI, salary);
        this.budget=budget;


    }

    public double getBudget() {
        return this.budget;
    }
}
