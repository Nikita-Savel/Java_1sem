package Test2;
public class test2 {
    public static void main(String[] args) {
        IntHolder myFirstIntHolder = new IntHolder(34);
        IntHolder mySecondIntHolder = new IntHolder(56);
        IntHolder sum = myFirstIntHolder.Summation(mySecondIntHolder);
        IntHolder dif = myFirstIntHolder.Difference(mySecondIntHolder);
        IntHolder comp = myFirstIntHolder.Composition(mySecondIntHolder);
        IntHolder div = myFirstIntHolder.IntegerDivision(mySecondIntHolder);
        IntHolder mod = myFirstIntHolder.DivisionWithRemainder(mySecondIntHolder);


        System.out.println("Сумма: " + sum.getValue());
        System.out.println("Разность: " + dif.getValue());
        System.out.println("Произведение: " + comp.getValue());
        System.out.println("Целочисленное деление: " + div.getValue());
        System.out.println("Остаток от деления: " + mod.getValue());


        IntHolder.swap(myFirstIntHolder, mySecondIntHolder);
        System.out.println(myFirstIntHolder.getValue() + " " + mySecondIntHolder.getValue());
    } 

}
