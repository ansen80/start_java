public class Cycles {

    public static String listNums(int x) { /* Необходимо реализовать метод таким образом, чтобы он
    возвращал строку, в которой будут записаны все числа от 0 до x (включительно). */
        String res = "";
        for (int i = 0; i < x; i++) {
            res += i + " ";
        }
        return res + x;
    }


    public static String reverseListNums(int x) { /* Необходимо реализовать метод таким образом, чтобы он
    возвращал строку, в которой будут записаны все числа от x до 0 (включительно). */
        String res = "";
        for (int i = 5; i > x; i--) {
            res += i + " ";
        }
        return res + x;

    }


    public static String chet(int x) { /* Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    в которой будут записаны все чётные числа от 0 до x (включительно). */
        String res = "";
        for (int i = 0; i <= x; i += 2) {
            res += i + " ";
        }
        return res + x;
    }


    public static int pow(int x, int y) { /* Необходимо реализовать метод таким образом,
    чтобы он возвращал результат возведения x в степень y. */
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }


    public static int numLen(long x) { /* Необходимо реализовать метод таким образом,
   чтобы он возвращал количество знаков в числе x. */
        int count;
        for (count = 0; x > 0; count++) {
            x /= 10;
        }
        return count;
    }


    public static boolean equalNum(int x) { /* Необходимо реализовать метод таким образом,
    чтобы он возвращал true, если все знаки числа одинаковы, и false в ином случае. */
        long tmp = x % 10;
        while (x > 0) {
            if (x % 10 != tmp) return false;
            x /= 10;
        }
        return true;
    }


    public static void square(int x) { /* Необходимо реализовать метод таким образом,
   чтобы он выводил на экран квадрат из символов ‘*’ размером х, у которого х символов в ряд и х символов в высоту. */
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void leftTriangle(int x) { /* Необходимо реализовать метод таким образом, чтобы он выводил
    на экран треугольник из символов ‘*’ у которого х символов в высоту,
    а количество символов в ряду совпадает с номером строки. */
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int x) { /* Необходимо реализовать метод таким образом, чтобы он выводил на экран
     треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с
     номером строки, при этом треугольник выровнен по правому краю. */
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }



    /* Данный метод считывает с консоли введённое пользователем число и выводит, угадал ли пользователь то,
    что было загадано, или нет. Перепишите этот метод таким образом, чтобы он запускался до тех пор,
    пока пользователь не угадает число. После этого выведите на экран количество попыток,
    которое потребовалось пользователю, чтобы угадать число.
    */
    public static void guessGame() {
        int randomNum = 3;
        int x = 0,count=0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (x != randomNum) {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
            count++;
        }
        System.out.println("You have made "+count+" attempts");
    }

}
