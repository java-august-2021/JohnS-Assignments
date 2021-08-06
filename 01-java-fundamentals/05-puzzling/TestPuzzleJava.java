import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println(generator.getRandomLetter());
        System.out.println(generator.generatePassword());
        System.out.println(generator.getNewPasswordSet(5));
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(generator.shuffleArray(arr));
    }
}
