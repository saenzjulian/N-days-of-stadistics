import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] fullArray = new int[size]; 
        for(int i = 0; i<size; ++i) {
            fullArray[i] = s.nextInt();
        }
               
        int[] lowerArray, upperArray;         
        Arrays.sort(fullArray);
        lowerArray = Arrays.copyOfRange(fullArray, 0, (fullArray.length/2));      
        
        if(fullArray.length % 2 == 0){
            upperArray = Arrays.copyOfRange(fullArray, fullArray.length/2, fullArray.length); 
        }else{
            upperArray = Arrays.copyOfRange(fullArray, fullArray.length/2 +1, fullArray.length);  
        }
    
        System.out.println(getMedian(lowerArray));
        System.out.println(getMedian(fullArray));
        System.out.println(getMedian(upperArray)); 
    }
    
    public static int getMedian(int [] a){
    Arrays.sort(a);
    int median=0, middle=a.length/2;
    if(a.length % 2 == 0){        
        median = (a[middle] + a[middle - 1])/2;
    }else{
        median = a[middle];
    }        
    return median;
    }
}
