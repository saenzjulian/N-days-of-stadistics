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
    for(int i = 0; i<size; ++i) {
        x[i] = s.nextInt();
    }
    int top=0, bottom=0, w=0;
    for(int j=0; j<size; ++j){
        w = s.nextInt();
        top += x[j]*w;
        bottom += w;         
    }
    
    System.out.printf("%.1f",(double)top/bottom);
    
    }
}