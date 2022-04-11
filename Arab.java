package CalculatorAR;

import java.io.IOException;

public class Arab {
    public static int calc1(int a, char b, int c) {
        int z = 0;
        switch (b) {
            case '+':
                z = a + c;
                break;
            case '-':
                z = a - c;
                break;
            case '*':
                z = a * c;
                break;
            case '/':
                try {
                    z = a / c;
                } catch (Exception e){
                }
                break;
            default:
                System.out.println("");
        }
        return z;
    }
}
