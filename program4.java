import java.util.Scanner;
import java.util.ArrayList;
class HelloWorld {
    static Scanner sc= new Scanner(System.in);
    public static int[] insertion( int arr[]){
        System.out.println("Insert element and index :[inbetween 0 to size]");
         int elementToInsert=sc.nextInt();
         int positionToInsert=sc.nextInt();
         if(positionToInsert>=0 && positionToInsert<=arr.length){
          int tempArr[]=new int[arr.length+1];
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
         return arr;
    }
    
     public static int[] removal( int arr[]){
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
         return arr;
    }
    
    public static void displayValue(int arr[]){
         //get values
         System.out.println("Enter the index to be displayed");
         int displayIndex=sc.nextInt();
         if(displayIndex<arr.length)
         System.out.println("disp "+arr[displayIndex]);
         else{
               System.out.println("Invalid index"); 
         }
    }
    
    public static void sort(int arr[]){
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
    }
    
    public static void minMax(int arr[]){
        sort(arr);
        //mininum and maximum
         System.out.println("min "+arr[0]);
         System.out.println("max "+arr[arr.length-1]);
    }
    
    public static int[] duplicateRemoval(int arr[]){
                 //duplicate removal
         ArrayList al=new ArrayList();
         for(int i=0;i<arr.length-1;i++){
             if(arr[i]!=arr[i+1]){
                 al.add(arr[i]);
             }
         }
         al.add(arr[arr.length-1]);
         
         int arrAfterDubRemoval[]=new int [al.size()];
         for(int itr=0;itr<al.size();itr++){
             arrAfterDubRemoval[itr]=(int)al.get(itr);
             System.out.println(arrAfterDubRemoval[itr]);
         }
         
         //after removing dublicate
         System.out.println(al);
         return arrAfterDubRemoval;
    }
    
    
    public static void main(String[] args) {
         
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
         boolean continued=true;
        while(continued){
            System.out.println("For Insertion press i and enter, For removal press r and enter,For certain index to be printed press c and enter, For sort press s and enter,For displaying min and max value press m and enter,For dublicate removal press d and enter");
             char check=sc.next().charAt(0);
            switch(check){
                case 'i':
         arr=insertion(arr);
         System.out.println("for continue type true to break type false");
         continued=sc.nextBoolean();
         break;
         case 'r':
         arr=removal(arr);
           System.out.println("for continue type true to break type false");
         continued=sc.nextBoolean();
          break;
         case 'c':
         displayValue(arr);
           System.out.println("for continue type true to break type false");
         continued=sc.nextBoolean();
          break;
         case 's':
         sort(arr);
           System.out.println("for continue type true to break type false");
         continued=sc.nextBoolean();
          break;
         case 'm':
         minMax(arr);
           System.out.println("for continue type true to break type false");
         continued=sc.nextBoolean();
          break;
         case 'd':
            arr= duplicateRemoval(arr);
               System.out.println("for continue type true to break type false");
         continued=sc.nextBoolean();
         
          break;
            }
        }
         
         
         

    }
}
