public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {//0<4
            int index=i;
            for (int j = i+1; j< arr.length; j++)
             {
                if(arr[index]>arr[j])
                    index=j;
             }
            
            swap(arr, index, i);
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
        int []arr={15,8,10,2,5};
        System.out.println(arr.length);
        selectionSort(arr);
        System.out.print("Sorted: ");
        printArray(arr);
    }
}
