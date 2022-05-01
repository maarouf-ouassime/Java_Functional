package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        // Normal java function
        Customer ouassime = new Customer("Ouassime", "0621006146");
        greetCustomer(ouassime);

        // Consumer Functional interface
        greetCustomerConsumer.accept(ouassime);

        // BiConsumer
        greetCustomerConsumerV2.accept(ouassime,false);
        greetCustomerConsumerV2.accept(ouassime,true);

    }

    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer,showPhoneNumber) ->
            System.out.println("Hello "+customer.customerName+
                    ", thanks fo registering phone number : "
                    +(showPhoneNumber? customer.customerPhoneNumber: "**********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+customer.customerName+
                    ", thanks fo registering phone number : "+customer.customerPhoneNumber);


    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName+
                            ", thanks fo registering phone number : "+customer.customerPhoneNumber);
    }

    static class Customer{

        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
