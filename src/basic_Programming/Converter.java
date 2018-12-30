package basic_Programming;
import java.util.Scanner;
public class Converter
{//Master Race British English VS Peasant American English:
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
Double miles = Double.parseDouble(scanner.nextLine());
if (miles >= 1 && miles <= 100)
{
double gallons = 62.5/miles;
Double litres = Math.floor(gallons*4.54);
System.out.printf("%d litres per 100 km.", litres.intValue());
}}}
