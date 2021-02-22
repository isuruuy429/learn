package org.wso2;

public class Math {

    public int addNumbers(int a, int b){
        return a+b;
    }

    public int substractNumbers(int a, int b){
        return a-b;
    }

    public int divideNumbers(int a, int b){
        if(b !=0)
        {
            return a/b;
        }
        else
        {
            return -1;
        }
    }

    public int multiply(int a, int b){
        if (a==0 || b==0){
            return 0;
        }
        else {
            return a*b;
        }

    }
}
