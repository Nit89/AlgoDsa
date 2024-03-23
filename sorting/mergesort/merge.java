public class merge {

     void merge(int arr[], int l, int m, int r)
    {   
        //left side  and right side length ;
       
        int i = l;
        int j = m+1;
        int k = 0;


        int temp[] = new int[r-l+1];

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
    
        // Copy remaining elements of left subarray
        while (i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }
    
        // Copy remaining elements of right subarray
        while (j <=r ) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int p = l, q = 0; p <= r; p++, q++) {
            arr[p] = temp[q];
        }


    }

    void sort(int[] arr , int l,int r )
    {
       if(l<r)
       {
         int mid = (l+r)/2;
         sort(arr, l, mid );
         sort(arr, mid+1, r);
         merge(arr,l,mid,r);
       }
       else
       {
        return;
       }
    }

    static void printArray(int arr[])
    {
         int n = arr.length ;
         for(int i = 0 ; i<n; i++)
         {
            System.out.print(arr[i]+" ");

         }
         System.out.println();

    }
    public static void main(String[] args) {
         int arr[] ={4,2,3,5,1,9,6};
         int n = arr.length;
         System.out.println("given array");
         printArray(arr);
         
         merge ob = new merge();
         ob.sort(arr, 0, n - 1);
         System.out.println("after sorting");
         printArray(arr);

    }
}