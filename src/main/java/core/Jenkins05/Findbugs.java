/**
 *   File Name: Findbugs.java<br>
 *
 *   Yutaka<br>
 *   Created: May 22, 2017
 *   
 */

package core.Jenkins05;

import java.math.BigInteger;

/**
 * Findbugs //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class Findbugs {

// FinalParametersCheck
	@SuppressWarnings("null")
	public static boolean A(String name) {
		boolean n;
		n = true;
		return n;
		}
	/*
	public void findBugs02() {
	String aString = "bob";
	aString.replace('b', 'p');
	if(aString.equals("pop"));
	}
	*/
	
	/*
	public void findBugs03() {
	String aString = "";
	aString.replace(' ', ' ');
	if(aString.equals(" "));
	}
	*/
	public String globalS;
	public void findBugs04() {
		for (int i = 0; i < 1000000; i++) {
			globalS += globalS;
		}

	}
	
	// BigIntegerInstantiation
	public void BigInteger() {
		BigInteger bi1 = new BigInteger("1"); 	// reference BigInteger.ONE
												// instead
		BigInteger bi2 = new BigInteger("0"); 	// reference BigInteger.ZERO
												// instead
		BigInteger bi3 = new BigInteger("0.0"); // reference BigInteger.ZERO
												// instead
		BigInteger bi4;
		bi4 = new BigInteger("0"); 				// reference BigInteger.ZERO instead
		System.out.println(bi1 + ", " + bi2 + ", " + bi3 + ", " + bi4);
	}
	
	
	// JumbledIncrementer
	public class JumbledIncrementerRule1 {
		public void foo() {
			for (int i = 0; i < 10; i++) { // only references 'i'
				for (int k = 0; k < 20; i++) { // references both 'i' and 'k'
					System.out.println("Hello");
				}
			}
		}
	}

	// ForLoopShouldBeWhileLoop

	public class Foo {
		void bar() {
			for (; true;)
				; // No Initialization or Update part, may as well be: while
					// (true)
		}
	}
	
}
