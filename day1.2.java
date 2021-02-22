/**
    Interquartiler (q3 - q1)
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] x = new int[size]; 
        int [] f = new int[size];
        for(int i = 0; i<size; ++i) {
            x[i] = s.nextInt(); 
        }
        int count=0;
        for(int j = 0; j<size; ++j) {
            f[j] = s.nextInt(); 
            count += f[j];
        }
        
        /**
        Lets create the fullArray with the correct frecuency 
        */
        int [] fullArray = new int[count];
        int index=0;
        for(int k = 0; k<size; k++) {            
            for(int m=0; m<f[k]; m++){
                fullArray[index]=x[k];
                index++;                
            }
        }        
        
        int[] lowerArray, upperArray;         
        Arrays.sort(fullArray);
        lowerArray = Arrays.copyOfRange(fullArray, 0, (fullArray.length/2));      
        
        if(fullArray.length % 2 == 0){
            upperArray = Arrays.copyOfRange(fullArray, fullArray.length/2, fullArray.length); 
        }else{
            upperArray = Arrays.copyOfRange(fullArray, fullArray.length/2 +1, fullArray.length);  
        }
    
        System.out.println((double) getMedian(upperArray)-getMedian(lowerArray));  
        
        
        
    }
    
    
    public static double getMedian(int [] a){
    //Arrays.sort(a);
    double median=0;
    int middle=a.length/2;
    if(a.length % 2 == 0){        
        median = (a[middle] + a[middle - 1])/2;
    }else{
        median = a[middle];
    }        
    return median;
    }
    
    
}