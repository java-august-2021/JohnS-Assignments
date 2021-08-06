import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    //Print 1-255
    public void oneToTwoFiveFive() {
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }
    
    //Print odd numbers between 1-255
    public void oddOneToTwoFiveFive() {
        for(int i = 1; i <= 255; i++){
            if(i %2 != 0){
                System.out.println(i);
            }
        }
    }

    //Sigma of 255 AKA Sum to 255
    public int sigmaTwoFiveFive() {
        int sum = 0;
        for(int i = 1; i <= 255; i++){
            sum += i;
        }
    return sum;
    }

    //Iterating through an array
    public void iterateArray(int arr[]) {
        for(int i : arr){
            System.out.println(i);
        }
    }

    //Max in array
    public void maxInArray(int arr[]) {
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }

    //Array with Odd Numbers 
    public ArrayList oddArray255() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i++){
            if(i%2 !=0){
                y.add(i);
            }
        }
        return y;
    }


    //Array avg
    public void arrayAvg(int arr[]) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum / arr.length);
    }

    //Greater than Y
    public void greaterThanY(int arr[], int num) {
        int count = 0;
        for(int i : arr){
            if(i > num){
                count++;
            }
        }
        System.out.println(count);
    }

    //Square the values
    public String squareArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        return Arrays.toString(arr);
    }

    //Eliminate Negative Numbers
    public String noNegArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <0){
                arr[i] = 0;
            }
        }
        return Arrays.toString(arr);
    }

    //Max, Min, and Average
    public String maxMinAvg(int arr[]){
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        int[] result = {max, min, sum/arr.length};
        return Arrays.toString(result);
    }

    //Shifting the Values in the Array
    public String shiftFrontOne(int arr[]){
        for (int i = 0; i < arr.length; i++){
            if(i == arr.length - 1) {
                arr[i] = 0;
            }else{
                arr[i] = arr[i+1];
            }
            
        }
        return Arrays.toString(arr);
        }
}