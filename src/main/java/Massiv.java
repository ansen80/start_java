public class Massiv {

    public static int findFirst(int[] arr, int x) { /*Необходимо реализовать метод таким образом, чтобы он возвращал индекс
    первого вхождения числа <b>x </b>в массив <b>arr</b>. Если число не входит в массив, возвращается -1. */
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==x) return i;
        }
        return  -1;
    }


    public static int findFirst2(int[] arr2, int x) { /*Необходимо реализовать метод таким образом, чтобы он возвращал индекс
    последнего вхождения числа <b>x</b> в массив <b>arr</b>. Если число не входит в массив, возвращается -1. */
        for(int i=arr2.length-1; i>=0; i--){
            if(arr2[i]==x) return i;
        }
        return  -1;

    }


    public static int maxAbs(int[] arr3) {/*Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю
     (то есть без учёта знака) значение массива <b>arr</b>. */
        int max=Math.abs(arr3[0]);
        for(int i = 1; i < arr3.length; i++) {
            int currentAbs = Math.abs(arr3[i]);
            if (currentAbs > max) {
                max = currentAbs;
            }
        }
        return max;

    }


    public static int countPositive(int[] arr4) {/*Необходимо реализовать метод таким образом, чтобы он возвращал количество положительных
    элементов массива <b>arr</b>. */
        int count = 0;
        for(int i=0; i < arr4.length; i++) {
            if (arr4[i] > 0){
                count++;
            }
        }
        return count;
    }


    public static boolean palindrom(int[] arr5) {/*Необходимо реализовать метод таким образом, чтобы он возвращал <b>true</b>,
    если массив <b>arr</b> является палиндромом, то есть справа налево и наоборот читается одинаково. */
        for (int i = 0; i < arr5.length / 2; i++) {
            if (arr5[i] != arr5[arr5.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    public static void reverse(int[] arr7) {/*Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
    После проведённых изменений массив должен быть записан задом наперёд.*/
        int len=arr7.length/2,tmp;
        for(int i=0,j=arr7.length-1;i<len;i++,j--){
            tmp=arr7[i];
            arr7[i]=arr7[j];
            arr7[j]=tmp;
        }
    }


}