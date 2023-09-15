public class WhileLoopAppl {
    public static void main(String[] args) {
        //gagarin();
        // printOdd(10, 20);
//        double res = pow(2, 4);
//        System.out.println("Pow = " + res);
        double res = countDigits(0);
        System.out.println(res);
    }

    public static void gagarin() {
        int counter = 10;
        while (counter > 0) {
            System.out.println(counter);
            counter--; // counter = counter - 1;
        }
        System.out.println("GO!");
    }

    public static void printOdd(int start, int finish) {
        int i = start;
        while (i <= finish) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static double pow(double a, int n) {
//        if (n==0){
//            return 1;
//        }
        // double res = a;
        double res = 1;
        int i = 1;
        while (i <= n) {
            res = res * a;
            i++;
        }
        // return n==0?1:res;
        return res;
    }

    public static int sumDigits(int num) {
        int res = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            res = res + digit;
        }
        return res;
    }
    public static int countDigits(int num){
        int res = 0;
        while (num != 0) {
            num = num / 10;
            res++;
        }
        return res;
    }
}
