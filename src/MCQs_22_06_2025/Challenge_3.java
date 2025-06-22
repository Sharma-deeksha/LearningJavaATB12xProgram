package MCQs_22_06_2025;

public class Challenge_3 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setName("Deeksha");e.setEmpid(22);e.setSalary(100000);
        System.out.println("EmployeeId : " +e.getEmpid());
        System.out.println("Name : " +e.getName());
        System.out.println("Salary : " +e.getSalary());

    }
}
class Employee {
    private int empid;
    private String name;
    private double salary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}