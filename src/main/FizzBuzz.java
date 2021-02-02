
public class FizzBuzz {
    public String convert(int input) {
        if(input % 5 == 0) {
            return "buzz";
        }
        if(input % 3 == 0) {
            return "fizz";
        }
        return Integer.toString(input);
    }
}
