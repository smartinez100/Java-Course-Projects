import java.util.Scanner;
public class CustomerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter customer address: ");
        String address = scanner.nextLine();
        System.out.println("Enter phone number of customer: ");
        String number = scanner.nextLine();
        System.out.println("Enter customer number: ");
        String customerNumber = scanner.nextLine();
        System.out.println("Receive mail? (true/false): ");
        boolean receiveMail = scanner.nextBoolean();
        scanner.close();

        Customer customer = new Customer(name, address, number, customerNumber, receiveMail);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Customer Phone Number: " + customer.getNumber());
        System.out.println("Customer Number: " + customer.getCustomerNumber());
        System.out.println("Receive Mail: " + customer.getReceiveMail());


        
    }
}
