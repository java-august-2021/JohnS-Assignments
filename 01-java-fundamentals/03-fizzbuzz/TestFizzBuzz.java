public class TestFizzBuzz {
    // This will be the launch point for the application
    // For now, we are using this method to test our 
    // FizzBuzz methods
    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();

        System.out.println(tester.fizzBuzz(9));     // Fizz
        System.out.println(tester.fizzBuzz(10));    // Buzz
        System.out.println(tester.fizzBuzz(15));    // FizzBuzz
        System.out.println(tester.fizzBuzz(9, "div3", "div5", "div15"));     // div3
        System.out.println(tester.fizzBuzz(10, "div3", "div5", "div15"));    // div5
        System.out.println(tester.fizzBuzz(15, "div3", "div5", "div15"));    // div15
        System.out.println(tester.fizzBuzz(17));    // 17
        System.out.println(tester.fizzBuzz(1));     // 1

        // Uncomment the following for a more comprehensive test:
        
        for (int i = 1; i <= 50; i++) {
        System.out.println(tester.fizzBuzz(i));
        }

    }
}

