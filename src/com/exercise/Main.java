package com.exercise;

public class Main implements Dimension {
	private static int a = 74;
	private static int b = 36;
	private static int c = 50;
	private static int d = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Alexender Abramov");
		System.out.println("Sum :" + sum());
		System.out.println("Division :" + division());
		System.out.println("Display :" + display(a, d));
		// table();
		System.getProperty("java.version");
		System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home: " + System.getProperty("java.home"));
		System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
		reverse();
		compare(a, b);
		swap(a, b);
		Main m = new Main();
		System.out.println("Area :" + m.area(5.5, 8.5));
		System.out.println("Perimeter :" + m.perimeter(5.5, 8.5));
	}

	public static int sum() {
		return a + b;
	}

	private static int division() {
		return c / d;
	}

	public static int display(int x, int z) {
		return x * z;
	}

	public static int table() {
		int p = 0;
		System.out.println("Table");
		for (int s = 1; s <= 10; s++) {

			for (int i = 1; i <= 10; i++) {
				System.out.println(s + "*" + i + "=" + s * i);
				p = s * i;
			}
		}
		return p;
	}

	@Override
	public double area(double width, double hieght) {

		return width * hieght;
	}

	@Override
	public double perimeter(double width, double hieght) {
		return 2 * (width + hieght);
	}

	private static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a :" + a);
		System.out.println("b :" + b);

	}

	private static void compare(int a, int b) {
		if (a == b) {
			System.out.println("int a = int b ");

		} else {
			if (a > b) {
				System.out.println("a>b");

			} else if (a < b) {
				System.out.println(a < b);
			}

		}

	}

	private static void reverse() {
		String statement = "The Red Riding Hood";
		StringBuilder nw = new StringBuilder(statement);
		StringBuffer bf = new StringBuffer(statement);
		bf.append("This is the first sentance");
		System.out.println("Reverse String " + nw.reverse().toString());
		System.out.println("final String " + bf.length() + "----" + bf);
		String sentance = "My age is 23";
		char[] ch = sentance.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
	}
}
