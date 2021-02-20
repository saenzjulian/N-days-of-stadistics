/**
Standard Deviation.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] x = new int[n];
        
        for(int i=0; i<n; ++i) {
            x[i] = scan.nextInt();
        }
        
        double mean = getMean(x);
        double sd=0;
        double sum=0;
        
        for (int j=0; j<n; ++j){
           sum += Math.pow((x[j]-mean),2); 
        }
        sd = (double)Math.sqrt(sum/n);
        
        System.out.printf("%.1f\n", sd);
        
    }
    
    public static double getMean(int [] a){
        int sum = 0;
        for (int i: a){
            sum += i;
        }
        double mean = (double)sum/a.length;
        return mean;
    }
}
