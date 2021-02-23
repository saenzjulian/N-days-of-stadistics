public class Solution {
    public static final double ratioBoys= 1.09;
    public static final double ratioGirls= 1;   
   
    public static void main(String[] args){
        double p= (ratioBoys)/(ratioBoys+ratioGirls);
        double q=1-p;
        
        double probability=0.0;
        for(int i =6 ;i >= 3;i--){
           probability +=  combination(i)*Math.pow(p,i) * Math.pow(q,6-i); 
        }
        System.out.printf("%.3f",probability);
    }
    
    public static  int  factorial(int n){
       if(n==0) return 1;
       return n*factorial(n-1);
    }
    
    static double  combination(int r){
        return (factorial(6)/(factorial(r) * factorial(6-r))); 
    }
}
