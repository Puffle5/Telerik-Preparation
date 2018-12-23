package basic_Programming;
import java.util.Scanner;

public class SumPositive
{
public static void main(String[] arguments)
{//Some math:
Scanner scanner = new Scanner(System.in);
int n = Math.abs(Integer.parseInt(scanner.nextLine()));
int sum = n*(n + 1)/2;
System.out.println(sum);
}}
