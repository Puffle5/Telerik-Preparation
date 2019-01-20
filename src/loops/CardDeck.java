package loops;
import java.util.Scanner;

public class CardDeck
{
public static void printCards(String input)
{System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", input, input, input, input);}

public static boolean intType(String input)
{
try {int number = Integer.parseInt(input);}
catch (NumberFormatException e) {return false;}
return true;
}

public static void main(String[] arguments) {
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
String[] symbols = {"J", "Q", "K", "A"};
if (intType(input) && Integer.parseInt(input) >= 2 && Integer.parseInt(input) <= 10)
{
for (int i = 2; i <= Integer.parseInt(input); i++)
{System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n", i, i, i, i);}
}
else if (!intType(input))
{
for (int i = 2; i <= 10; i++)
{System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n", i, i, i, i);}

int i;
for (i = 0; i < symbols.length; i++)
{if (input.equals(symbols[i])) {break;}}
for (int j = 0; j <= i; j++) {printCards(symbols[j]);}
}}}