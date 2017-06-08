import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int i,E=100,d=0;
        while(d<n)
            {
            d=(d+k)%n;
            if(c[d]==1)
                {
                E=E-3;
            }
            else 
                E=E-1;
            if(d==0)
                break;
        }
        System.out.println(E);
    }
}
