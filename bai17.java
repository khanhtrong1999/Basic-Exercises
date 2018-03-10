import java.util.Scanner;

public class bai17 {
	public static void main(String[] args)
	 {
	  long binary1, binary2, multiply = 0;
	  int digit, factor = 1;
	  Scanner in = new Scanner(System.in);
	  System.out.print("Input the first binary number: ");
	  binary1 = in.nextLong();
	  System.out.print("Input the second binary number: ");
	  binary2 = in.nextLong();
	  //System.out.println(binary1);
	  //System.out.println(binary2);
	  String s = String.valueOf(binary1);
	  String s2 = String.valueOf(binary2);
	  System.out.println(s);
	  System.out.println(s2);
	  int decimalValue = Integer.parseInt(s, 2);
	  int decimalValue2 = Integer.parseInt(s2, 2);
	  int sum = decimalValue + decimalValue2;
	  //System.out.println(sum);
	  String stkq = Integer.toBinaryString(sum);
	  System.out.println("Kq = "+stkq);
	 }
}
