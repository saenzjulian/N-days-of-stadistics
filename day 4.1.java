import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution { 
    public static final double q= 0.88; 
    public static final double p= 0.12; 
    
public static void main(String[] args) {
    double probability=0.0, probability1=0.0, k=0.0;

    for(int j =10; j >= 2; j--){
       probability +=  combination(j)*Math.pow(p,j) * Math.pow(q,10-j); 
    }  
    
    k =  combination(2)*Math.pow(p,2)*Math.pow(q,8); 

    probability1 = k + 1 - probability;
    
    System.out.printf("%.3f\n",probability1);
    System.out.printf("%.3f\n",probability);

}

public static int factorial(int n) { 
    if(n==0) return 1; 
    return n*factorial(n-1); 
}

public static double  combination(int r){
    return (factorial(10)/(factorial(r) * factorial(10-r))); 
}

}