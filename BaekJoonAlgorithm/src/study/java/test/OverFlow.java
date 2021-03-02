package study.java.test;

import java.math.BigInteger;

/*
 * 	걍 래퍼클래스에 사이즈가 있네.. 
 */
public class OverFlow {
	public static void main(String[] args) {
		System.out.println("Integer.MIN_VALUE :"+ Integer.MIN_VALUE);
		System.out.println("Integer.MIN_VALUE-1 : "+ (Integer.MIN_VALUE-1));
		System.out.println("Integer.MAX_VALUE :"+ Integer.MAX_VALUE);
		System.out.println("Integer.MAX_VALUE+1 : "+ Integer.MAX_VALUE+1);
		System.out.println("Long.MIN_VALUE : "+ Long.MIN_VALUE);
		System.out.println("Long.MIN_VALUE-1 : "+ (Long.MIN_VALUE-1));
		System.out.println("Long.MAX_VALUE : "+ Long.MAX_VALUE);
		System.out.println("Long.MAX_VALUE+1 : "+ (Long.MAX_VALUE+1));
		System.out.println("Float.MIN_VALUE : "+ (Float.MIN_VALUE));
		System.out.println("Float.MIN_VALUE-1 : "+ (Float.MIN_VALUE-1));
		System.out.println("Float.MAX_VALUE : "+ (Float.MAX_VALUE));
		System.out.println("Float.MAX_VALUE+1 : "+ (Float.MAX_VALUE+1));
		
		// BigInteger 는 클래스타입.
		BigInteger a = new BigInteger("1234");
		System.out.println(a);
		Comparable<BigInteger> b = a;
		System.out.println(a);
	}
}
