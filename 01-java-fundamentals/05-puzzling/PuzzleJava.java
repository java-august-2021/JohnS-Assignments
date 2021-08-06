import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    Random rand = new Random();

    //Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public ArrayList getTenRolls(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++){
            arr.add(rand.nextInt(21));
        }
        return arr;
    }

    public char getRandomLetter(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char letter = alphabet[rand.nextInt(26)];
        return letter;
    }

    public String generatePassword(){
        String password = "";
        for(int i = 0; i < 8; i++){
            password += getRandomLetter();
        }
        
        return password;
    }
    
    public ArrayList getNewPasswordSet(int num){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < num; i++){
            String password = generatePassword();
            passwordSet.add(password);
        }
        return passwordSet;
    }

    public String shuffleArray(int[] arr){
        for(int i = 0; i < 20; i++){
            int pos1 = rand.nextInt(arr.length);
            int pos2 = rand.nextInt(arr.length);
            int temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;
        }
        return Arrays.toString(arr);
    }
}
