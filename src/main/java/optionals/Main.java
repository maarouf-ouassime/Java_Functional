package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        Object value1 = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");

        System.out.println(value);
        System.out.println(value1);

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email-> System.out.println("Sending email to : "+email),
                        ()->{
                            System.out.println("cannot send email");
                        }
                );
        Optional.ofNullable("maarouf@gmail.com")
                .ifPresentOrElse(
                        email-> System.out.println("Sending email to : "+email),
                        ()->{
                            System.out.println("cannot send email");
                        }
                );
    }
}
