package MCQs_22_06_2025;

public class Challenge_7 {
    public static void main(String[] args) {
        Manager manager=new Manager(50000);
        manager.calculateSalary();
        System.out.println("Manager salary->" + manager.getSalary());
        Developer d=new Developer(50,1000);
        d.calculateSalary();
        System.out.println("Developer Salary->" + d.getSalary());

    }
}
class Employees{
    public void salary(){
        int salary;
        System.out.println("Salary");
    }
}
class Manager{
    private double salary;
    private double bonus=10000;
    public Manager(int salary){
        this.salary=salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void calculateSalary(){
        this.salary=salary+bonus;
    }
}
class  Developer{
    private double basesalary;
    private double Salary;
    int hourRate;
    public Developer(int hourRate,double baseSalary){
        this.hourRate=hourRate;
        this.basesalary=baseSalary;
    }
    public double getSalary(){
        return this.Salary;
    }
    public void calculateSalary(){
        this.Salary=(hourRate*6)*basesalary;
    }
}