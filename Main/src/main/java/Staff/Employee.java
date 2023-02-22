package Staff;

public abstract class Employee {
    private String name;
    private Integer NI;
    private Double salary;

    public Employee(String name, Integer NI, Double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName (){
        return this.name;
    }
    public Integer getNI (){
        return this.NI;
    }
    public Double getSalary(){
        return this.salary;
    }
    public void raiseSalary(Double raise){
        this.salary += raise;
    }
    public Double payBonus(){
        return this.salary * 0.01;
    }

}
