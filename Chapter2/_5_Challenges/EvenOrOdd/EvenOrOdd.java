package Chapter2._5_Challenges.EvenOrOdd;

import java.util.Scanner;

/*
return "Even" if n is even, "Odd" if n is odd.
The modulus operator may be useful here.
 */
public class EvenOrOdd {
    public String decide(int n){

        if(n % 2 == 0)
        return "Even";
        else {
            return "Odd";
        }
    }
}
