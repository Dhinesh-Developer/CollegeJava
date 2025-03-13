package com.dk;
class Developer{
	public void add(int a,int b) {
		System.out.println("Both are integer :"+(a+b));
	}
	
	public void add(int a,float b) {
		System.out.println("One integer one float :"+(a+b));
	}
	
	public void add(byte a,short b,int c) {
		System.out.println("One byte one short one int: "+(a+b+c));
	}
	
	public void add(double a,long b) {
		System.out.println("one double one long :"+(a+b));
	}
}

class DAY1{
	public static void main(String[] args) {
		
		Developer d = new Developer();
		d.add(10, 20);
		d.add(20.00, 987l);
		d.add(10, 20.0f);
		
	}
	
	/*
Both are integer :30
one double one long :1007.0
One integer one float :30.0
*/
}

/*
 * package com.dk;

import java.util.Scanner;

class Developer{
	private String title;
	private String name;
	private float price;
	
	Developer(String title,String name,float price){
		this.title = title;
		this.name = name;
		this.price = price;
	}
	
	public Developer() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}

class Validate extends Developer{
	Developer d = new Developer();
	public void getUserInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the title");
		d.setTitle(in.nextLine());
		System.out.println("Enter the name");
		d.setName(in.nextLine());
		System.out.println("Enter the price");
		d.setPrice(in.nextFloat());
		
	}
	
	public void displayDetails() {
		System.out.print("Title : ");
		System.out.println(d.getTitle());
		System.out.print("Name : ");
		System.out.println(d.getName());
		System.out.print("Price : ");
		System.out.println(d.getPrice());
	}
}

public class DAY1 {
	public static void main(String[] args) {
		
		Validate v = new Validate();
		v.getUserInput();
		v.displayDetails();
	}
	
Enter the title
Java Programming
Enter the name
James Gosling
Enter the price
2000.00
Title : Java Programming
Name : James Gosling
Price : 2000.0

}
*/
 