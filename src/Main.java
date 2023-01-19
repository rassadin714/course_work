public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Сергеев Сергей Сергеевич", 1, 25000);
        employees[1] = new Employee("Михайлов Михаил Михайлович", 1, 30000);
        employees[2] = new Employee("Антонов Антон Антонович", 2, 20000);
        employees[3] = new Employee("Дмитреиев Дмитрий Дмитриевич", 2, 30000);
        employees[4] = new Employee("Андреев Андрей Андреев", 3, 27000);
        employees[5] = new Employee("Давыдов Давид Давидович", 3, 29000);
        employees[6] = new Employee("Петров Петр Петрович", 4, 35000);
        employees[7] = new Employee("Александров Алесандра Александровна", 4, 40000);
        employees[8] = new Employee("Григорьев Григорий Григорьевич", 5, 37000);
        employees[9] = new Employee("Иванов Иван Иванович", 5, 50000);


        listOfAllEmployees(employees);
        System.out.println();
        salarySum(employees);
        System.out.println();
        minimumWageEmployee(employees);
        System.out.println();
        employeeWithMaximumSalary(employees);
        System.out.println();
        System.out.println("Среднее значение зп = " + midSalary(employees));
        System.out.println();
        printFullNameAllEmployees(employees);
        System.out.println();
        increaseSalaryByPercent(employees, 5);
        listOfAllEmployees(employees);
        System.out.println();
        System.out.println("Максимальная зарплата в отделе = " + employeeWithMaximumSalaryInDepartment(employees,2));
        System.out.println("Минимальная зарплата в отделе = " + minimumWageEmployeeInDepartment(employees,2));
        System.out.println("Сумму затрат на зарплату по отделу = " + amountOfSalaryCostsByDepartment(employees,4));
        System.out.println("Средняя зарплата по отделу = " + averageSalaryByDepartment(employees,4));
        System.out.println();
        increaseWagesByPercentagePerDepartment(employees,10, 2);
        employeesDepartment(employees,2);
        System.out.println();
        employeeWithLowerSalary(employees, 25000);
        employeeWithHigherSalary(employees,40_000);
    }

    public static void listOfAllEmployees(Employee[] employees) {
        int emp = 0;
        for (int i = 0; i < employees.length; i++) {
            emp = emp + employees.length;
            System.out.println(employees[i].toString());
        }
    }
    public static void salarySum(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц = " + sum);
    }
    public static void minimumWageEmployee(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        Employee minEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                minEmployee = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зп = " + minEmployee);
    }
    public static void employeeWithMaximumSalary(Employee[] employees) {
        double maxSalary = employees[0].getSalary();
        Employee maxEmployee = employees[0];
        for (int i = 1; i < employees.length; i++){
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxEmployee = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зп = " + maxEmployee);
    }

    public static double midSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();

        }
        return sum / employees.length;
    }

    public static void printFullNameAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
    public static double increaseSalaryByPercent(Employee[]employees, double percent) {
        percent = 0.01 * percent;
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() * (1 + percent));
        }
        return percent;
    }
    public static double  employeeWithMaximumSalaryInDepartment(Employee[]employees, int department) {
        double maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        return maxSalary;
    }

    public static double minimumWageEmployeeInDepartment(Employee[]employees, int department) {
        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        return minSalary;
    }
    public static double amountOfSalaryCostsByDepartment(Employee[]employees, int department) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static double averageSalaryByDepartment(Employee[] employees, int department) {
        double sum = amountOfSalaryCostsByDepartment(employees,department);
        int numbers = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                numbers++;
            }
        }
        return sum/numbers;
    }

    public static void increaseWagesByPercentagePerDepartment(Employee[] employees, double percent, int department) {
        percent = 0.01 * percent;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() * (1 + percent));
            }
        }
    }

    public static void employeesDepartment(Employee[] employees, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getFullName() +", зарплата "+ employees[i].getSalary()+", id " + employees[i].getId());
            }
        }
    }

    public static void employeeWithLowerSalary(Employee[] employees, int salary) {
        System.out.println("меньшая зп");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() < salary){
                System.out.println("id "+ employees[i].getId() +", Ф.И.О "+ employees[i].getFullName() +", зарплата "+ employees[i].getSalary() );
            }
        }
    }

    public static void employeeWithHigherSalary(Employee[] employees, int salary) {
        System.out.println("большая зп");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() >= salary){
                System.out.println("id "+ employees[i].getId() +", Ф.И.О "+ employees[i].getFullName() +", зарплата "+ employees[i].getSalary() );
            }
        }
    }
}