//Max subarray sum
public class MaxSubArraySum{
    public static void MaxSumOfArray(int num[]){
        int currsum=0;
        int MaxSum= Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=num[k];
                }
                System.out.println(currsum);
                if(currsum>MaxSum){
                    MaxSum=currsum;
                }
            }
            
        }
        System.out.println("Max Sum is: "+MaxSum);
    }
    public static void main(String ars[]){
        int number[]={1,-2,6,-1,3};
        MaxSumOfArray(number);
    }
}