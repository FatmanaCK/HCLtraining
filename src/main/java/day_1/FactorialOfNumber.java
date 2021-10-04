package day_1;

public class FactorialOfNumber {
    public static void main(String[] args) {
        //n!=n*(n-1)*....

        factorialWithLoop();
        System.out.println (recursion(3));

    }

    private static void factorialWithLoop() {
        int num1= 3;
        int num2= 1;
        for (int a=1; a<=num1; a++) {
            num2= num2*a;
        }

        System.out.println(num2);
    }

    private static int recursion(int num ){
       if (num == 0 || num == 1)
            return 1;
       else
            return num*recursion(num-1);


    }

}
