package Test2;
public class Test2 {
    public static void main(String[] args) {
        IntHolder myFirstIntHolder = new IntHolder(34);
        IntHolder mySecondIntHolder = new IntHolder(56);
        IntHolder myThirdIntHolder = new IntHolder(211);
        IntHolder myFourthIntHolder = new IntHolder(45);
        IntHolder myFifthIntHolder = new IntHolder(8);
        IntHolder mySixthIntHolder = new IntHolder(6);
        IntHolder mySeventhIntHolder = new IntHolder(15);
        IntHolder myEighthIntHolder = new IntHolder(22);
        IntHolder myNinethIntHolder = new IntHolder(19);
        IntHolder myTenthIntHolder = new IntHolder(12);

        myFirstIntHolder.summation(myFirstIntHolder, mySecondIntHolder);
        myThirdIntHolder.difference(myThirdIntHolder, myFourthIntHolder);
        myFifthIntHolder.composition(myFifthIntHolder, mySixthIntHolder);
        mySeventhIntHolder.integerDivision(mySeventhIntHolder, myEighthIntHolder);
        myNinethIntHolder.divisionWithRemainder(myNinethIntHolder, myTenthIntHolder);


        System.out.println("Сумма: " + myFirstIntHolder.getValue());
        System.out.println("Разность: " + myThirdIntHolder.getValue());
        System.out.println("Произведение: " + myFifthIntHolder.getValue());
        System.out.println("Целочисленное деление: " + mySeventhIntHolder.getValue());
        System.out.println("Остаток от деления: " + myNinethIntHolder.getValue());


        IntHolder.swap(myFirstIntHolder, mySecondIntHolder);
        System.out.println(myFirstIntHolder.getValue() + " " + mySecondIntHolder.getValue());
    }


}
