package series1.task4;

import java.util.LinkedList;
import java.util.Scanner;
import series1.task3.Customer;

public class Main {
    public static void main(String[] args) {
        
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        LinkedList<Customer> customerList = new LinkedList<Customer>();

        while(loop) {
            System.out.print("Write a command. 'A'dd, 'R'emove or 'S'top: ");
            String cmd = scanner.nextLine().toUpperCase();
            switch(cmd.charAt(0)) {
                case 'A':
                    customerList.addFirst(new Customer());
                    customerList.getFirst().setStartTime();
                    System.out.println("Added customer "+customerList.getFirst().getId());

                    break;
                case 'R':
                    if(customerList.size()>0) {
                        customerList.getLast().setEndTime();
                        System.out.println(customerList.removeLast().getTimeServed());
                    } else {
                        System.out.println("No customers in queue.");
                    }
                    break;
                case 'S':
                    loop = false;
                    break;
                default: 
                    System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }
}
