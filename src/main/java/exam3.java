public class exam3 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6};
        int b = 5;
        int a = 3;
        for (int number:numbers)
        {
            switch (number)
            {
                case 2: if (a==number) {
                    b = a*number;
                }
                    break;
                case 4: if (a==(number / 2)) {
                    b = a+number;
                }
                    break;
                case 6: if ( (a * 2) == number) {
                    b = a*(number*2);
                }
                    break;
            }
        }
        System.out.println(b);
    }
}
