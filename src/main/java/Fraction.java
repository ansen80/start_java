
public class Fraction {

    public static int sum(int x, int y) {
        return (x + y);
    }


    public static double fraction(double x) {
        double fractional = x - (long) x;
        // Округляем до 10 знаков после запятой, чтобы избежать ошибок округления
        return Math.round(fractional * 10.0) / 10.0;
    }


    public static int sumLastNums(int x) {
        int last = x % 10;// Получаем последнюю цифру (8)
        int secondLastDigit = (x / 10) % 10; // Получаем предпоследнюю цифру (6)
        return last + secondLastDigit;
    }


    public static int charToNum(char x) {
        return x - '0'; //это вычитание ASCII-кода символа '0' из ASCII-кода символа x. ; Код '5' = 53 ; Код '0' = 48 ; 53 - 48 = 5 → получаем число 5.
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean is2Digits(int x) {
        return x >= 10 && x <=99;
    }


    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static boolean isInRange(int a, int b, int num) {
        return a < num && b > num;
    }

    public static boolean isDivisor (int a, int b) {
        return (a%b == 0) || (b%a == 0);
    }

    public static boolean isEqual (int a, int b, int c) {
        return (a == b && b == c);
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }

    public static int abs(int x) {
        if(x<0) x=-x;
        return x;
    }

    public static int safeDiv(int x, int y) {
        if(y==0) return 0;
        return x/y;
    }

    public static int max(int x, int y) {
        if (x > y) return x;
        return y;
    }

    public static String makeDecision(int x, int y) {
        if (x>y) return x+">"+y;
        if (x<y) return x+"<"+y;
        return x+"=="+y;
    }

    public static int max3(int x, int y, int z) {
        int max=x;
        if (y>max) return y;
        if (z>max) return z;
        return max;
    }

    public static boolean sum3(int x, int y, int z) {  /* Необходимо реализовать метод таким образом, чтобы он возвращал true,
    если два любых числа (из трёх принятых) можно сложить так, чтобы получить третье. */
        return ((x+y==z) || (z+x==y) || (y+z==x));
    }


    public static int sum2(int x, int y) { /* Необходимо реализовать метод таким образом, чтобы он возвращал сумму чисел x и y.
     Однако если сумма попадает в диапазон от 10 до 19, то надо вернуть число 20. */;
        int sum = x + y;
        if (sum >= 10 && sum <=19) return 20;
        return sum;
    }


    public static boolean is35(int x) { /* Необходимо реализовать метод таким образом, чтобы он возвращал true,
    если число x делится нацело на 3 или 5. При этом, если оно делится и на 3, и на 5, то вернуть надо false. */
        if ((x%3==0) && (x%5==0)) return false;
        return ((x%3==0) || (x%5==0));
    }


    public static boolean magic6(int x, int y) { /* Необходимо реализовать метод таким образом, чтобы он возвращал true,
     если одно из принятых методом чисел равно шести, или их сумма равна шести, или разница между ними равна шести. */
       int raz=x-y;
       if (raz<0) raz=-raz;
       return x==6 || y==6 || (x+y)==6 || raz==6;
    }


    public static String age(int x){
        if(x%100>=10&&x%100<=20) return x+" лет";
        if(x%10==1) return x+" год";
        if(x%10==2||x%10==3||x%10==4) return x+" года";
        return x+" лет";
    }


    public static String day(int x) {
        switch (x){
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }


    public static String printD(String x) {
        switch (x) {
            case "понедельник":System.out.println("понедельник");
            case "вторник":System.out.println("вторник");
            case "среда":System.out.println("среда");
            case "четверг":System.out.println("четверг");
            case "пятница":System.out.println("пятница");
            case "суббота":System.out.println("суббота");
            case "воскресенье":System.out.println("воскресенье");
            default:System.out.println("это не день недели");
            break;
        }
        return x;
    }



}