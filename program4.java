// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.ArrayList;
class HelloWorld {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the size of the array");
         int size=sc.nextInt();
         int arr[]=new int[size];
         System.out.println("Enter elements");
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
         //printing the array element
         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
         //this is for insertion
         System.out.println("Insert element and index :[inbetween 0 to size]");
         int elementToInsert=sc.nextInt();
         int positionToInsert=sc.nextInt();
         if(positionToInsert>=0 && positionToInsert<=size){
          int tempArr[]=new int[size+1];
          int i=0;
          while(i<positionToInsert){
              tempArr[i]=arr[i];
              i++;
          }
          tempArr[i++]=elementToInsert;
          while(i<arr.length+1){
              tempArr[i]=arr[i-1];
              i++;
          }
          arr=tempArr;
         }
         else{
             System.out.println("Invalid index for insertion");
         }
         //printing after insertion
          for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
         //this is for removal
         System.out.println("enter the index to be removed :[inbetween 0 to size-1]");
         int positionToRemove=sc.nextInt();
         if(positionToRemove>=0 && positionToRemove<arr.length){
             int tempArr[]=new int[arr.length-1];
             int i=0;
             while(i<positionToRemove){
              tempArr[i]=arr[i];
              i++;
             }
             i++;
             while(i<arr.length){
              tempArr[i-1]=arr[i];
                     i++;
          }
          arr=tempArr;
         }
         else{
             System.out.println("Invalid positon for removal");
         }
         //printing after removal
         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
         //get values
         System.out.println("Enter the index to be displayed");
         int displayIndex=sc.nextInt();
         if(displayIndex<arr.length)
         System.out.println("disp "+arr[displayIndex]);
         else{
               System.out.println("Invalid index"); 
         }
         //sort
         
         for(int i=0;i<arr.length-1;i++){
             if(arr[i]>arr[i+1]){
                 int temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
                 i=-1;
             }
         }
         
         //printing after sorting
         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
         
         //mininum and maximum
         System.out.println("min "+arr[0]);
         System.out.println("max "+arr[arr.length-1]);
         
         //duplicate removal
         ArrayList al=new ArrayList();
         for(int i=0;i<arr.length-1;i++){
             if(arr[i]!=arr[i+1]){
                 al.add(arr[i]);
             }
         }
         al.add(arr[arr.length-1]);
         
         //after removing dublicate
         System.out.println(al);
    }
}
