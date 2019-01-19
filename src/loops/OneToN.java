package loops;
import java.util.Scanner;

public class OneToN
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int number = Integer.parseInt(scanner.nextLine());
if (number >= 1)
{
for (int i = 1; i <= number; i++)
{System.out.print(i+" ");}
}}}
