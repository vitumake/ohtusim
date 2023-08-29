package series1.task5n6;

import java.util.Scanner;
import series1.task3.Customer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of customers to generate: ");
        int customerNum = scanner.nextInt();
        ServicePoint service = new ServicePoint();

        for(int i=0; i<customerNum; i++) {
            service.customerAdd(new Customer());
        }
        scanner.close();
        service.startService();
        System.out.println("Average service time: " + service.getTimeServed()/1000/customerNum + " seconds");
    }
}
