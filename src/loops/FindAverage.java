package loops;
import java.util.Scanner;

public class FindAverage
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int count = Integer.parseInt(scanner.nextLine());
double sum = 0, average = 0;
for (int i = 1; i <= count; i++)
{
double number = Double.parseDouble(scanner.nextLine());
sum+=number; average = sum/count;
}
System.out.printf("%.2f", average);
}}
