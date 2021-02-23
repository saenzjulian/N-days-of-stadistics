import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerator   = 1;
        int denominator = 3;
        int n = 5; 
         
        double p = (double) numerator / denominator;
        System.out.format("%.3f", geometric(n, p));
    }
    
    private static double geometric (int n, double p) {
        return Math.pow(1-p, n-1) * p;
    }
}