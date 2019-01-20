package loops;
import java.util.Scanner;

public class ComplexSum
{
public static int calculateFactorial(int number)
{
int factorial = 1;
for (int i = 1; i <= number; i++) {factorial*=i;}
return factorial;
}

public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int number = Integer.parseInt(scanner.nextLine());
int x = Integer.parseInt(scanner.nextLine());
double sum = 1;
for (int i = 1; i <= number; i++)
{
int factorial = calculateFactorial(i);
double fragment = factorial/Math.pow(x, i);
sum+=fragment;
}
System.out.printf("%.5f", sum);
}}
