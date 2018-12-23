package basic_Programming;
import java.util.Scanner;

public class Interest
{
public static void main(String[] arguments)
{//Calculating interest:
Scanner scanner = new Scanner(System.in);
double amount = Math.abs(Double.parseDouble(scanner.nextLine()));
for (int i = 0; i < 3; i++)
{
amount = amount + amount/20; System.out.printf("%.2f%n", amount);
}}}

