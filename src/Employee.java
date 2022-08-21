public class Employee {
    private int id;
    private String name;
    private int department;
    private int salary;

    private static int counter = 0;

    public static void printAllEmployee(){

    }
    public static void printAllEmployeeNames(){

    }

    public Employee (String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    public String getName() {
        return this.name;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", department = " + department +
                ", salary = " + salary +
                ' ';
    }
}

