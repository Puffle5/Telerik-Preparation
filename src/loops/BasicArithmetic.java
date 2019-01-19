package loops;
import java.util.Scanner;
import java.util.ArrayList;

public class BasicArithmetic
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int count = Integer.parseInt(scanner.nextLine());
double sum = 0;
ArrayList<Double> numbers = new ArrayList<>();
for (int i = 0; i < count; i++)
{
double number = Double.parseDouble(scanner.nextLine());
numbers.add(number);
}
double min = numbers.get(0); double max = numbers.get(0);

for (int i = 0; i < numbers.size(); i++)
{
if (min > numbers.get(i)) {min = numbers.get(i);}
if (max < numbers.get(i)) {max = numbers.get(i);}
sum+=numbers.get(i);
}
System.out.printf("min=%.2f%n", min);
System.out.printf("max=%.2f%n", max);
System.out.printf("sum=%.2f%n", sum);
System.out.printf("avg=%.2f%n", sum/numbers.size());
}}
