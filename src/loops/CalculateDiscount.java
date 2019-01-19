package loops;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculateDiscount
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int count = Integer.parseInt(scanner.nextLine());
ArrayList<Double> discountPrices = new ArrayList<>();
for (int i = 0; i < count; i++)
{
double price = Double.parseDouble(scanner.nextLine());
discountPrices.add(price - price*13/20);
}
for (int i = 0; i < count; i++)
{System.out.printf("%.2f%n", discountPrices.get(i));}
}}
