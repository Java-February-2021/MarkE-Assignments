public class Fizzbuzz {
    public void fizzBuzzResult() {
        for(int i = 1; i <= 100; i++) {
            String fizz = fizzBuzz(i);
            System.out.println("Number: " + i + " , " + "Result: " + fizz);
        }
    }
    public String fizzBuzz(int value) {
        if (value % 3 == 0 && value % 5 == 0){
            return "Fizzbuzz";
        } else if (value % 3 == 0) {
            return "Fizz"; 
        } else if (value % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(value);
        }
    }
}