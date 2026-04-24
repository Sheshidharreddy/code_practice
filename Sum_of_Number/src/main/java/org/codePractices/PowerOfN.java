package org.codePractices;

public class PowerOfN {
    public static void main(String[] args){


        PowerOfN pow = new PowerOfN();
       double result =  pow.myPower(2,10);
        System.out.println("result " +result);

    }

    public double myPower(int x, int n){
        long num = Math.abs((long) n);

        double result = 1.0;
        while (num != 0){
            if (num % 2 == 1){
                result = result * x;
                num = num -1;
            }
            x = x * x;
            num = num / 2;
        }

        return n < 0 ? 1.0/result:result;
    }
}
