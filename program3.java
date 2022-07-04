import java.util.Scanner;
class Main {

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the rows to be printed");
      int totalRows=sc.nextInt();
      

    for (int rowValueItr = 1; rowValueItr <= totalRows; rowValueItr++) {
        
      for (int space = 1; space <= totalRows - rowValueItr; space++) {
        System.out.print("*");
      }
    int numIterator = 0;
      while (numIterator != rowValueItr ) {
        System.out.print(rowValueItr+" ");
        numIterator++;
      }

      System.out.print("\n");
    }
  }
}
