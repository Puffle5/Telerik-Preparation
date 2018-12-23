package basic_Programming;

import java.util.Scanner;
public class Tips
{
public static void main(String[] arguments)
{//Earning a tip in Israel:
Scanner scanner = new Scanner(System.in);
int bill = Integer.parseInt(scanner.nextLine());
int total = bill + bill/10;
System.out.println(total);
}}
