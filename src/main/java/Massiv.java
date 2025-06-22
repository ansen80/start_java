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




}