public class insersonsort {
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;           
             }
             // insertion 
             arr[prev+1]=curr;
        }


    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        System.out.println("Array befor sorting ");
        printarr(arr);
        insertionSort(arr);
        System.out.println("Array After sorting ");
        printarr(arr);

    }
    
}
