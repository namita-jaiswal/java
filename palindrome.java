package com.company;
//TC: 0(n)
public class palindrome {
    static int palindromes(int n){
        int rev=0,temp=n,digit;
        while(temp>0){
            digit=temp%10;
            temp=temp/10;
            rev=rev*10+digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        int palu=1234321;
        int reversed= palindromes(palu);
        if (palu==reversed) {
            System.out.println("no. is palindrome");
        }
        else {
            System.out.println("no. is not palindrome");
        }
        System.out.println(palindromes(reversed));
    }
}