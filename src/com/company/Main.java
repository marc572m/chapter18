package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Pow(4));

        reverseDisply("David");

        int[] array = {1,2,3,4,5,6,7};
        reverseDisplayInt(array,array.length);

    }

    public static int Pow(int n){
        if (n == 1) return 2;
        else return 2*Pow(n-1);
    }

    public static void reverseDisply(String s){

        System.out.println();

        for (int i = s.length() -1; i >= 0; i--) {
            System.out.print(s.charAt(i));

        }
        System.out.println();

    }

    public static void reverseDisplayInt(int[] array, int antal){

        if(antal != 0) {
            System.out.println(array[antal -1]);
            reverseDisplayInt(array, antal - 1);

        }
    }

}
