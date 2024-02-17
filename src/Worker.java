import java.util.Scanner;

public class Worker {
    String name;
    double salary;
    static int totalWorkerNumber;
    int workerNumber;

    Worker() {
        totalWorkerNumber++;
        this.workerNumber = totalWorkerNumber;
    }

    void setName(Scanner input) {
        System.out.println("Please enter the name of the worker " + (totalWorkerNumber) + ": ");
        this.name = input.nextLine();
    }

    void setSalary(Scanner input) {
        try {
            System.out.println("Please enter a salary amount for the worker " + (totalWorkerNumber) + ": ");
            salary = Double.parseDouble(input.nextLine());

            if (salary <= 0) {
                throw new IllegalArgumentCustomException();
            }
        } catch (IllegalArgumentCustomException e) {
            System.out.println("Salary amount must be greater than zero!");
            setSalary(input);
        }
    }
}