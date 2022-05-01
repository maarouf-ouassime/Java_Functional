package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("without predicate :");
        System.out.println(isPhoneNumberValid("0621006146"));
        System.out.println(isPhoneNumberValid("0708081702"));

        System.out.println("with predicate :");
        System.out.println(isPhoneNumberValidPredicate.test("0621006146"));
        System.out.println(isPhoneNumberValidPredicate.test("0708081702"));

        System.out.println("is phone number valid and contains number 3 :");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0621006146"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0621306146"));
        System.out.println("is phone number valid or contains number 3 :");
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("0621006146"));

    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("06") && phoneNumber.length()==10;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("06") && phoneNumber.length()==10;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}

