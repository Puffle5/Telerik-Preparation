package basic_Programming;
import java.util.Scanner;

public class BottleDeposit
{
public static void main(String[] arguments)
{//Calculating bottle deposit:
Scanner scanner = new Scanner(System.in);
int halfLiterCount = Integer.parseInt(scanner.nextLine());
int wholeLiterCount = Integer.parseInt(scanner.nextLine());
double sum = 0.1*halfLiterCount + 0.25*wholeLiterCount;
System.out.printf("%.2f", sum);
}}

