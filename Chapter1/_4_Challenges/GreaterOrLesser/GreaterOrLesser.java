package Chapter1._4_Challenges.GreaterOrLesser;

public class GreaterOrLesser {
    //    If a is less than b, return the string "Lesser". if a is greater than b, return "Greater".
//    If neither is true, return "Equal".
    public String decide(int a, int b) {

        if (a < b) {
            return ("Lesser");

        } else if (a > b) {
            return ("Greater");
        } else {
            return ("Equal");
        }
    }
}
