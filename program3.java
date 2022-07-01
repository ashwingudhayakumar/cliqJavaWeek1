import java.util.Scanner;
class Main {

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the rows to be printed");
      int rows=sc.nextInt();
      

    for (int i = 1; i <= rows; ++i) {
        int k = 0;
      for (int space = 1; space <= rows - i; space++) {
        System.out.print("*");
      }

      while (k != i ) {
        System.out.print(i+" ");
        k++;
      }

      System.out.print("\n");
    }
  }
}
