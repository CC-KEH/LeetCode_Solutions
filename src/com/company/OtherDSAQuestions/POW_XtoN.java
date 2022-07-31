package com.company.OtherDSAQuestions;

public class POW_XtoN {
    public static void main(String[] args) {
        System.out.println("Refer to function below");
    }
        public double myPow(double x, int n) {
            if(n<0){
                n = -n;
                x = 1/x;
            }
            double result = 1;
            while(n !=0){
                //if n is Odd, simply dividing n by 2 won't solve the problem
                if((n & 1)!=0) result *= x;
                //Updating x by multiplying by itself for future computations
                x *=x;
                //dividing power ie n by 2 in terms of bits
                n >>>= 1;
            }
            return result;
        }
}
