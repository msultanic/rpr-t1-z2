package ba.unsa.etf.rpr;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int x;
        System.out.println("Unesite željeni broj: ");
        x = ulaz.nextInt();
        if(x==0)
            System.out.println("Problem, krahirat ćemo se!");
        for(int i=1; i<=x; i++)
            if(i%sumaCifara(i)==0)
                System.out.print(i+" ");
    }

     static int sumaCifara (int broj){
        int suma=0;
        if(broj<0)
            broj*=-1;
        while(broj>0){
            int n=broj%10;
            suma+=n;
            broj/=10;
        }
        return suma;
     }
}
