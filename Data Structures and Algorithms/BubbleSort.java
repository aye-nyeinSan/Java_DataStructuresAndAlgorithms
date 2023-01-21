/**
 * BubbleSort
 */
public class BubbleSort {

    public static void bubbleSort(int arr[],int size) {
       for (int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if (arr[i]>arr[j]) {
                swap(arr,i,j);
            }
        }
        
       }
        
    }
    public static void swap(int arr [],int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []arr={1,23,2,56,9,8,10,100};
        bubbleSort(arr,arr.length);
        System.out.print("Sorted: ");
        printArray(arr);
    }
}