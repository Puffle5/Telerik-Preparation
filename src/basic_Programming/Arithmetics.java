package basic_Programming;
import java.util.Scanner;
public class Arithmetics
{
public static void main(String[] arguments)
{//Basic Math:
Scanner scanner = new Scanner(System.in);
int a = Integer.parseInt(scanner.nextLine());
int b = Integer.parseInt(scanner.nextLine());
Double power = Math.pow(a, b);
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a%b);
System.out.println(power.intValue());
}}

