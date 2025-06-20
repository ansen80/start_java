
public class Start01 {
    public static void main(String[] args) {


        System.out.println(Fraction.sum(2, 5));
        System.out.println(Fraction.sum(5,9));
        System.out.println(Fraction.sum(3,8));


        System.out.println(Fraction.fraction(5.3));


        System.out.println(Fraction.sumLastNums(4568));
        System.out.println(Fraction.sumLastNums(2345654));


        System.out.println(Fraction.charToNum('5'));


        System.out.println(Fraction.isPositive(3));
        System.out.println(Fraction.isPositive(-5));


        System.out.println(Fraction.is2Digits(32));
        System.out.println(Fraction.is2Digits(516));


        System.out.println(Fraction.isUpperCase('D'));
        System.out.println(Fraction.isUpperCase('q'));

        System.out.println(Fraction.isInRange(1, 5, 3));
        System.out.println(Fraction.isInRange(1, 5, 34));



        System.out.println(Fraction.isDivisor(3,6));
        System.out.println(Fraction.isDivisor(2,15));

        System.out.println(Fraction.isEqual(3,3,3));
        System.out.println(Fraction.isEqual(2,15,3));


        System.out.println(Fraction.lastNumSum(Fraction.lastNumSum(Fraction.lastNumSum(Fraction.lastNumSum(5, 11), 123), 14), 1));


        System.out.println(Fraction.abs(5));
        System.out.println(Fraction.abs(-3));

        System.out.println(Fraction.safeDiv(5,  0 ));
        System.out.println(Fraction.safeDiv(8,2));

        System.out.println(Fraction.max(5,  0 ));
        System.out.println(Fraction.max(8,2));


        System.out.println(Fraction.makeDecision(5,  7 ));
        System.out.println(Fraction.makeDecision(8,  -1 ));
        System.out.println(Fraction.makeDecision(5,  5 ));


        System.out.println(Fraction.max3(5,  7, 7));
        System.out.println(Fraction.max3(8,  1, 4));


        System.out.println(Fraction.sum3(8,  4, 4));


        System.out.println(Fraction.sum2(5,  7));
        System.out.println(Fraction.sum2(8,  -1));


        System.out.println(Fraction.is35(5));
        System.out.println(Fraction.is35(8));


        System.out.println(Fraction.magic6(5,7));
        System.out.println(Fraction.magic6(8,2));


        System.out.println(Fraction.age(5));
        System.out.println(Fraction.age(31));
        System.out.println(Fraction.age(44));


        System.out.println(Fraction.day(5));


        System.out.println(Fraction.printD("четверг"));
        System.out.println(Fraction.printD("чт"));


        System.out.println(Cycles.listNums(5));

        System.out.println(Cycles.reverseListNums(0));

        System.out.println(Cycles.chet(9));

        System.out.println(Cycles.pow(2, 5));

        System.out.println(Cycles.numLen(12567));

        System.out.println(Cycles.equalNum(1111));
        System.out.println(Cycles.equalNum(1211));


        Cycles.square(2);
        Cycles.square(4);


        Cycles.leftTriangle(2);
        Cycles.leftTriangle(4);


        Cycles.rightTriangle(3);
        Cycles.rightTriangle(4);


        Cycles.guessGame();

        int [] arr = {1,2,3,4,2,2,5};
        System.out.println(Massiv.findFirst(arr, 2));













    }


}
