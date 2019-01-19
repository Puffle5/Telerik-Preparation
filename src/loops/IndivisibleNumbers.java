package loops;
import java.util.Scanner;

public class IndivisibleNumbers
{
public static void main(String[] arguments) {
Scanner scanner = new Scanner(System.in);
int number = Integer.parseInt(scanner.nextLine());
if (number >= 1)
{
for (int i = 1; i <= number; i++)
{
if (i%3 != 0 && i%7 != 0)
{System.out.print(i+" ");}
}}}}
