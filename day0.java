import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int [] a = new int[size]; 
    for(int i = 0; i<size; ++i) {
        a[i] = s.nextInt();
    }
    System.out.println(getMean(a));
    System.out.println(getMedian(a));
    System.out.println(getMode(a));
        
    }
    
    public static double getMean(int [] a){
        int sum = 0;
        for (int i: a){
            sum += i;
        }
        double mean = (double)sum/a.length;
        return mean;
    }
    
    public static double getMedian(int [] a){
        Arrays.sort(a);
        double median=0;
        int middle=0;
        if(a.length % 2 == 0){
            middle = a.length/2;
            median = (double)(a[middle] + a[middle - 1])/2;
        }else{
            median = (double)a[middle-1]/2;
        }        
        return median;
    }
    
    public static int getMode(int [] a){
        int mode = 0;
        int size = a.length;
        int [] copy = a.clone();
        Arrays.sort(copy);
        int count = 0, max = 0;
        int current = copy[0];
        for(int i = 0;i < size;i++) {
            if (copy[i] == current) {
                count++;
            } else {
                count = 1;
                current = copy[i];
            }
            if (count > max) {
                max = count;
                mode = copy[i];
            }
        }
        return mode;    
    }
}