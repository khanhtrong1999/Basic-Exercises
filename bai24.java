import java.util.*;

public class bai24 {
public static void main(String[] args) 
{
Scanner k=new Scanner(System.in);
System.out.print("Input a Binary: ");
int a=k.nextInt();
int decimalValue = Integer.parseInt(String.valueOf(a), 2);
System.out.print("Binary to Octal :"+Integer.toOctalString(decimalValue));
}}
