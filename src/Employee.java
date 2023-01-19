public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;
    public static int counter = 0;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;

    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Ф.И.О: " + this.fullName + ", отдел; " + this.department + ", зарплата " + this.salary + ", id " + this.id;
    }
}
