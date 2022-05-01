package combinatorpattern.finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        //Function<String,String> upperCaseName = name -> name.toUpperCase();

        Function<String,String> upperCaseName = name -> {
            // logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction<String,Integer,String> upperCaseName2 = (name,age) -> {
            // logic
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName2.apply("Ali",20));;
    }
}
