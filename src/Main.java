import java.util.Scanner;

class IllegalArgumentCustomException extends Exception {
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, this program saves three workers' names and their salaries.");

        Worker worker1 = new Worker();
        worker1.setName(input);
        worker1.setSalary(input);

        Worker worker2 = new Worker();
        worker2.setName(input);
        worker2.setSalary(input);

        Worker worker3 = new Worker();
        worker3.setName(input);
        worker3.setSalary(input);

        System.out.println("****************************");
        System.out.println("****WORKER INFORMATION'S****");
        System.out.println();
        System.out.println("Information's of Worker " + worker1.workerNumber);
        System.out.println("Name: " + worker1.name);
        System.out.println("Salary: $" + worker1.salary);
        System.out.println();

        System.out.println("Information's of Worker " + worker2.workerNumber);
        System.out.println("Name: " + worker2.name);
        System.out.println("Salary: $" + worker2.salary);
        System.out.println();

        System.out.println("Information's of Worker " + worker3.workerNumber);
        System.out.println("Name: " + worker3.name);
        System.out.println("Salary: $" + worker3.salary);

        System.out.println("****************************");
    }
}