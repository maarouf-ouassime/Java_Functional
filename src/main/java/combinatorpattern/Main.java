package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Ouassime",
                "ouassime@gmail.com",
                "0621006146",
                LocalDate.of(1997,6,9)
        );
        Customer customer1 = new Customer(
                "Maarouf",
                "maaroufgmail.com",
                "621006146",
                LocalDate.of(2015,6,9)
        );

        // System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db

        // using combinator pattern

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);
        System.out.println("Ouassime : "+result);

        ValidationResult result1 = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer1);
        System.out.println("Maarouf : "+result1);


    }
}
