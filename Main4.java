package sk.kosickaacademic.simon.cykly;

public class Main4 { //Uloha2
    public static void main(String[] args) {
        long x=1221;
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
