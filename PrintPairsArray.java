//Print pair of an Array
public class PrintPairsArray{
    public static void PrintPair(int num[]){
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        PrintPair(number);
    }
}