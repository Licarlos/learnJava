import javax.management.StandardEmitterMBean;

public class ArraySort {
    public  static void main(String[] args){
        int[] arr = new int[]{34,15,26,12,53,125,61,1};
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int item : arr){
            System.out.println(item+"\n");
        }
    }
}