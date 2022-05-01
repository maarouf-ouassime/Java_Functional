package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String PhoneNumber){
        return PhoneNumber.startsWith("06")&& PhoneNumber.length()==10;
    }

    private boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears()>18;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail())&&
                isPhoneNumberValid(customer.getPhoneNumber())&&
                isAdult(customer.getDob());
    }
}
