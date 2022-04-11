package CalculatorAR;
import java.util.Scanner;

public class CalculatAR {
    static Scanner scan = new Scanner(System.in);
    static int a,c;
    static char b;
    static int result;
    public static void main(String[] args) {
        System.out.println("ВВедите выражение");
        String str = scan.nextLine();
        String[] ar = str.split("");
        String num1 = ar[0];
        String oper = ar[1];
        String num2 = ar[2];

        a = Rome.convert(num1);
        c = Rome.convert(num2);
        char b = oper.charAt(0);
        if(a < 0 && c < 0){
            result = 0;
        } else {
            result = Arab.calc1(a,b,c);
            String roman = Rome.convertRoman(result);
            System.out.println(roman);
        }
        try {
            a = Integer.parseInt(num1);
            c = Integer.parseInt(num2);
            result = Arab.calc1(a, b, c);
            System.out.println(result);
        }catch (Exception e){

        }


    }
}
