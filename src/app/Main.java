package app;

public class Main {

    public static void main(String[] args){

        int sum = 0;

        for (int a = 1; a <= 6; a++) {
            sum += a;
            System.out.println(a + ") Num is " + a + ", sum is " + sum);
        }
        System.out.println("-".repeat(24) +
                "\nSum of numbers is " + sum);
    }
}
