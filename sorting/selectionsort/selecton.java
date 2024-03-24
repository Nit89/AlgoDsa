public class selecton {

    void sort(int arr[])
    {
         int n = arr.length;
         for(int i = 0 ; i<=n-2; i++)
         {
            int min = i;
            for(int j = i; j<=n-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
         
        selecton ob = new selecton();
        int arr[] = { 64, 25, 12, 22, 11 }; 
        ob.sort(arr);
        System.out.println("Sorted array"); 
        ob.printArray(arr);
    }
}
