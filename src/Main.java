import java.util.Arrays;

public class Main {
   static Employee[] employees = new Employee[10];

   public static void main(String[] args) {
      employees[0] = new Employee("Иванов Иван Иванович", 1, 58000);
      employees[1] = new Employee("Петров Петр Петрович", 2, 34000);
      employees[2] = new Employee("Сидоров Александр Александрович", 3, 70000);
      employees[3] = new Employee("Кожевникова Марина Владимировна", 4, 50000);
      employees[4] = new Employee("Любимцева Екатерина Викторовна", 5, 45000);
      employees[5] = new Employee("Маркина Александра Леонидовна", 1, 52000);
      employees[6] = new Employee("Филина Анна Сергеевна", 2, 30000);
      employees[7] = new Employee("Аверин Антон Олегович", 3, 75000);
      employees[8] = new Employee("Бондаренко Василий Васильевич", 4, 48000);
      employees[9] = new Employee("Мальцева Александра Егоровна", 5, 40000);

      printAllEmployee();
      getSumSalary();
      getEmployeeMinSalary();
      getEmployeeMaxSalary();
      getAverageSumSalary();
      printAlLEmployeeNames();
   }

   public static void printAllEmployee() {
      for (int i = 0; i < employees.length; i++) {
         System.out.println(employees[i]);
      }
   }

   public static int getSumSalary() {
      int sum = 0;
      for (int i = 0; i < employees.length; i++) {
         if (employees[i] != null) {
            sum = sum + employees[i].getSalary();
         }
      }
      System.out.println(sum);
      return sum;
   }

   public static Employee getEmployeeMinSalary() {
      int minSalary = -1;
      Employee minSalaryEmployee = null;
      int index = 0;
      for (int i = 0; i < employees.length; i++) {
         if (employees[i] != null) {
            minSalary = employees[i].getSalary();
            minSalaryEmployee = employees[i];
            index = i;
            break;
         }
      }
      for (int i = index; i < employees.length; i++) {
         if (employees[i] != null) {
            if (minSalary > employees[i].getSalary()) {
               minSalary = employees[i].getSalary();
               minSalaryEmployee = employees[i];
            }
         }
      }
      System.out.println(minSalary);
      return minSalaryEmployee;
   }

   public static Employee getEmployeeMaxSalary() {
      int maxSalary = -1;
      Employee maxEmployeeSalary = null;
      int index = 0;
      for (int i = 0; i < employees.length; i++) {
         if (employees[i] != null) {
            maxSalary = employees[i].getSalary();
            maxEmployeeSalary = employees[i];
            index = i;
            break;
         }
      }
      for (int i = index; i < employees.length; i++) {
         if (maxSalary < employees[i].getSalary()) {
            maxSalary = employees[i].getSalary();
            maxEmployeeSalary = employees[i];
         }
      }
      System.out.println(maxSalary);
      return maxEmployeeSalary;
   }

   public static int getAverageSumSalary() {
      if (employees.length != 0) {
         return getSumSalary() / employees.length;
      } else {
         return 0;
      }
   }
   public static void printAlLEmployeeNames() {
         for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
         }
      }
}
