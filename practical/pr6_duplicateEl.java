package Design_Algo_Analysis.practical;

public class pr6_duplicateEl {
    public static void dupel(int[] a, int n) {
       
        int k=0;
        for (int i=k ; i <n-1 ; ++i) {
         int j=i;
         int count=0;
 
          if(a[i]==a[j+1]){
             count++;
             j++;
            // cout<<a[i]<<" "<<count+1<<endl;
            System.out.println(a[i]  + " " + (count+1));
          }
          
          k=j;
    }
}
    
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8};
        int n = a.length;
        dupel(a, n);
    }

}
