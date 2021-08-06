public class TestBasicJava {
    public static void main(String[] args) {
        BasicJava tester = new BasicJava();

        tester.oneToTwoFiveFive();
        tester.oddOneToTwoFiveFive();
        System.out.println(tester.sigmaTwoFiveFive());
        int[] a = {1,3,5,7,9,13};
        tester.iterateArray(a);
        int[] b = {-3, -5, -7};
        tester.maxInArray(b);
        System.out.println(tester.oddArray255());
        int[] c = {2, 10, 3};
        tester.arrayAvg(c);
        int[] d = {1, 3, 5, 7};
        tester.greaterThanY(d, 3);
        int[] e = {1, 5, 10, -2};
        System.out.println(tester.squareArray(e));
        int[] f = {1, 5, 10, -2};
        System.out.println(tester.noNegArray(f));
        int[] g = {1, 5, 10, -2};
        System.out.println(tester.maxMinAvg(g));
        int[] h = {1, 5, 10, 7, -2};
        System.out.println(tester.shiftFrontOne(h));
    }
}
