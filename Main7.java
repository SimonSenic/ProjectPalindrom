package sk.kosickaacademic.simon.cykly;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long x2=x;
        long y=0;

        while(x2>0){
            y=y+(x2%10);
            y=y*10;
            x2=x2/10;
        }
        y=y/10;

        if(x==y)
            System.out.println("cislo je palindrom");
        else
            System.out.println("cislo nie je palindrom");
    }
}
