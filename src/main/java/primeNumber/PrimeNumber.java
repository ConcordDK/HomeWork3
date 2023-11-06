package primeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите число: ");
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " это простое число");
        }
        else{
            System.out.println(number + " это не простое число");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}