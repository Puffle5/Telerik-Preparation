package basic_Programming;
import java.util.Scanner;

public class DigitSum
{
public static void main(String arguments[])
{//A loop, where it’s not supposed to be:
Scanner scanner = new Scanner(System.in);
int number = Integer.parseInt(scanner.nextLine());
if (number >= 1000 && number <= 9999)
{
int sum = 0;
while (number > 0) {sum = sum + number%10; number = number/10;}
System.out.println(sum);
}}}
