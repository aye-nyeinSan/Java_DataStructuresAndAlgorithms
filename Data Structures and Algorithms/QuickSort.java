public class QuickSort {
    public static int partion(int arr[ ],int low,int high) {
        //j is for looping for comparing with pivot  
        //i is thhe index for swapping for smaller element than pivot
        int pivot=arr[high];
        int i=low-1;//-1,0
         for ( int j = low; j<= high-1;j++) {

            if(arr[j]<pivot){
                i+=1;
                swap(arr, i, j);
            }
          
         }
         swap(arr, i+1, high);
        return i+1;
    }

    public static void swap(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void quickSort(int []arr,int low,int high){
        if (low<high){
            int pi=partion(arr,low,high);
        quickSort(arr, low,pi-1);
        quickSort(arr, pi+1, high);
        }
        
    }
    public static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,6,5,3,9};
        int length=arr.length-1;
        quickSort(arr, 0, length);
        System.out.println("Sorted: ");
        printArray(arr);
    }
    
}
