package conditional_Statements;
import java.util.Scanner;

public class PhoneBill
{
public static void main(String[] arguments) {
Scanner scanner = new Scanner(System.in);
int textMessages = Integer.parseInt(scanner.nextLine());
int minutes = Integer.parseInt(scanner.nextLine());
double textBill, minuteBill;

if (textMessages <= 20) {textMessages = 0; textBill = 0;}
else {textMessages = textMessages - 20; textBill = textMessages*0.06;}
if (minutes <= 60) {minutes = 0; minuteBill = 0;}
else {minutes = minutes - 60; minuteBill = minutes*0.1;}

System.out.printf("%d additional messages for %.2f levas%n", textMessages, textBill);
System.out.printf("%d additional minutes for %.2f levas%n", minutes, minuteBill);
System.out.printf("%.2f additional taxes%n", (textBill + minuteBill)/5);
System.out.printf("%.2f total bill%n", 12 + textBill + minuteBill + (textBill + minuteBill)/5);
}}

