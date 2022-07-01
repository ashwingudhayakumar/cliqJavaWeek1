// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
    //union
       HashSet<Integer>h1=new HashSet<>();
       int arr1[]={1,2,3};
       int arr2[]={100,2,1,10};
       int arr3[]={1,2,3};
       for(int i=0;i<arr1.length;i++){
           h1.add(arr1[i]);
       }
       for(int i=0;i<arr2.length;i++){
           h1.add(arr2[i]);
       }
       System.out.print(h1);
       System.out.println();
     //intersection  
       HashSet<Integer>h2=new HashSet<>();
       for(int i=0;i<arr1.length;i++){
           h2.add(arr1[i]);
       }
       for(int i=0;i<arr2.length;i++){
           if(h2.contains(arr2[i])){
               System.out.print(arr2[i]+" ");
           }
       }
       //equality
       System.out.println(Arrays.equals(arr1,arr3));
       
       
    }
}
