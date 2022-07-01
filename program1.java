import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class HelloWorld {
    public static void main(String[] args) {
         ArrayList al=new ArrayList();
        System.out.println("Enter the integer");
        Scanner sc=new Scanner(System.in);
        int inputNum=sc.nextInt();
        String convertedInt=Integer.toString(inputNum);
        int i=0;
        while(i<convertedInt.length()){
            int tempStored=inputNum%10;
            inputNum/=10;
            al.add(tempStored);
            i++;
        }
      Collections.reverse(al);
      System.out.println(al);
    }
}
