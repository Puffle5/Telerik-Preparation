package test;

import java.util.Scanner;

public class TargetSpeed
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
int targets = Integer.parseInt(scanner.nextLine());
int goshoTime = Integer.parseInt(scanner.nextLine());
int goshoLatency = Integer.parseInt(scanner.nextLine());
int peshoTime = Integer.parseInt(scanner.nextLine());
int peshoLatency = Integer.parseInt(scanner.nextLine());

int gosho = targets*goshoTime + 2*goshoLatency;
int pesho = targets*peshoTime + 2*peshoLatency;

if (pesho < gosho) {System.out.println("Pesho");}
else if (gosho < pesho) {System.out.println("Gosho");}
else {System.out.println("Draw");}
}}
