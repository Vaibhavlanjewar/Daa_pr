

public class merge_sort14 {
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        System.out.println("original array\n");
        printArr(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println("\narray after sorting\n ");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println("\n");
    }


    public static void mergeSort(int[] arr, int si, int ei) {
      
        // base case 
        if(si>=ei) return ;
        int mid= si + (ei-si)/2; // (si+ei)/2 
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){

        int temp[]=new int[ei-si+1];
        int i=si; // iterator for left part
        int j=mid+1;  // iterator for right part
        int k=0; // iterator for  temp

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i++];
            }
            else{
                temp[k]=arr[j++];
            }
            k++;
        }
        // remaining from left part 
        while(i<=mid){
            temp[k++]=arr[i++];
        }
          // remaining from right part 
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // copy the elements from temp to arr 
        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    
}
