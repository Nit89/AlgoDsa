public class BubbleSort {

    void sort(int arr[])
    {
         int n = arr.length;
         for(int i = 0; i<n-1; i++)
         {
           
            for(int j = 0; j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;
                }
            }

            
         }
    }

    void printArray(int arr[])
    {
         int n = arr.length ;
         for(int i = 0 ; i<n; i++)
         {
            System.out.print(arr[i]+" ");

         }
         System.out.println();

    }
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 25, 12, 22, 11 }; 
        ob.sort(arr);
        System.out.println("Sorted array"); 
        ob.printArray(arr);
    }
}
// TIME COMPLEXITY ------> O(N^2)
// SPACE COMPLEXITY ------>O(1)