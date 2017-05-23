/**
 *   File Name: PMD.java<br>
 *
 *   Yutaka<br>
 *   Created: May 22, 2017
 *   
 */

package core.Jenkins05;

import java.math.BigInteger;

/**
 * PMD //ADDD (description of class)
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
public class PMD {
	
	public PMD() {
		
	}

	// Useless parentheses
			void bar() {
				int value = 0;
				int i = 0;
				String s = null;
				value += (s.replaceAll("\\s", "").toLowerCase().charAt(i));

			}
		
		
		/**
		 * BigInteger analysis
		 */
		public void bigInteger() {
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

		// ReturnFromFinallyBlock
		public class Bar {
			public String foo() {
				try {
					throw new Exception("My Exception");
				} catch (Exception e) {
					throw e;
				} finally {
					return "ok"; // return not recommended here
				}
			}
		}

		// UnconditionalIfStatement
		public class Foo2 {
			public void close() {
				if (true) { // fixed conditional, not recommended

				}
			}
		}



		// ShortVariable
		public class ShortVariable {
			private int q = 15; // field - too short

			public void main(String as[]) { // formal argument - too short
				int r = 20 + q; // local variable - too short
				for (int i = 0; i < 10; i++) { // Not a violation (inside 'for'
												// loop)
					r += q;
				}

			}
		}

		// LongVariable
		public class LongVariable {
			int reallyLongIntName = -3; // VIOLATION - Field

			public void main(String argumentsList[]) { 	// VIOLATION - Formal
				int otherReallyLongName = -5; 			// VIOLATION - Local
				for (int interestingIntIndex = 0; 		// VIOLATION - For
						interestingIntIndex < 10; interestingIntIndex++) {
				}
			}

		}
	}

