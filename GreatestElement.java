//Greatest Element

import java.util.*;
public class GreatestElement{
    public static int Greatest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]>largest){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,3,6,8,9,10};
        System.out.println("Greatest Element is: "+Greatest(number));
    }
}