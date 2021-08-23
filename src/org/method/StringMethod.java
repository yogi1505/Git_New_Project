package org.method;

public class StringMethod {

	public static void main(String[] args) {

		String s = "Java is a Programming Language";
		String s1 = "  java is a programming    language";
		String s2 = "AB7CDefG1233";
		String s3 = "ABcdefgS234";
		
		
		// 1
		char a = s.charAt(10);
		System.out.println("Letter at the 10th position = " + a);

		// 2
		int b = s.indexOf('m');
		System.out.println("Position of Letter M from 0th Position = " + b);

		int c = s.indexOf('a', 20);
		System.out.println("Position of Letter 'a' from 20th Position = " + c);

		// 3
		int d = s.lastIndexOf('m');
		System.out.println("Position of Letter M from last = " + d);

		// 4
		String f = s.toUpperCase();
		System.out.println(f);

		// 5
		String g = s.toLowerCase();
		System.out.println(g);

		// 6
		boolean h = s.isEmpty();
		System.out.println(h);
		if (h) {
			System.out.println("this string is Empty");
		} else {
			System.out.println("this string is Not Empty");
		}

		// 7
		int j = s1.length();
		System.out.println(j);

		// 8
		boolean k = s.startsWith("Java");
		System.out.println(k);

		// 9
		boolean l = s.endsWith("Lang");
		System.out.println(l);

		// 10
		boolean o = s.contains("gram");
		System.out.println(o);

		// 11
		String r = s1.trim();
		System.out.println(r);

		// 12
		String u = s.concat(s1);
		System.out.println(u);

		// 13
		String p = s1.replace("a", "123");
		System.out.println(p);

		// 14
		String pq = s.substring(2, 11);
		System.out.println(pq);

		// 15
		String py = s.substring(4);
		System.out.println(py);
		
		//16
		boolean yu = s.equals(s1);
		System.out.println(yu);
		
		//17
		boolean yi = s.equalsIgnoreCase(s1);
		System.out.println(yi);
		
		int uu=s2.compareTo(s3);
		System.out.println(uu);
		
	}
}
