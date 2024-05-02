  class BasicsDemo {
    // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
    static void print() {
      System.out.println("\n\nInside print ...");
      System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
      System.out.println();                 // Print empty line
      System.out.print("Hello, world!!");   // Cursor stayed after the printed string
      System.out.println("Hello,");
      System.out.print(" ");                // Print a space
      System.out.print("world!!");
    }
	
	static void primitives() {
	  System.out.println("\n\nInside primitives ..."); 
	  // literals demo
	  int intHex = 0x0041;
	  System.out.println("intHex: " + intHex);
	  int intBinary = 0b01000001;
	  System.out.println("intBinary: " + intBinary);
	  int intChar = 'A'; // holds decimal equivalent, which is 65
	  System.out.println("intChar: " + intChar);
	  int intUnderscore = 1_23_456;
	  System.out.println("intUnderscore: " + intUnderscore);
	  
	  char charA = 'A';
	  System.out.println("charA: " + charA);
	  char charInt = 65;
	  System.out.println("charInt: " + charInt);
	  char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode1: " + charUnicode1);
	  char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode2: " + charUnicode2);
	  char charBinary = 0b01000001; // binary corresponding to decimal 65
	  System.out.println("charBinary: " + charBinary);	  		  	  
    }
  
    static void typeCasting() {
      System.out.println("\nInside typeCasting ...");
      // Explicit casting
      long y = 42;
      //int x = y;
      int x = (int)y;
      
      // Information loss due to out-of-range assignment
      byte narrowdByte = (byte)123456;
	  System.out.println("narrowdByte: " + narrowdByte); 
	  
	  // Truncation
	  int iTruncated = (int)0.99;
	  System.out.println("iTruncated: " + iTruncated); 
	  
	  // Implicit cast (int to long)
	  y = x;
	  
	  // Implicit cast (char to int)
	  char cChar = 'A';
	  int iInt = cChar; 
	  System.out.println("iInt: " + iInt);
	  
	  // byte to char using an explicit cast
	  byte bByte = 65;
	  cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
	  System.out.println("cChar: " + cChar);
    }
	
	static void arrays() {
	   System.out.println("\nInside arrays ...");
	   int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
       System.out.println("myArray.length: " + myArray.length);
	   System.out.println("myArray[1]: " + myArray[1]);
	   System.out.println("myArray[7]: " + myArray[7]);	   
	}

    static void threeDimensionalArrays() {
	   System.out.println("\nInside threeDimensionalArrays ...");
	   int[][][] unitsSold = new int[][][]{ 
										   { // New York
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,850,0,0}// Apr	
										   },
										   { // San Francisco
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,0,0,0}  // Apr
										   },
										   { 
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   },
										   {
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   }
										 };
		                    	 
		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}	
	
	static void varargsOverload(boolean b, int i, int j, int k){
	   System.out.println("\nInside varargsOverload without varargs ...");
	}
	static void varargsOverload(boolean b, int... list){
	   System.out.println("\nInside varargsOverload with varargs ...");
	   System.out.println("list.length: " + list.length);
	}	
	
		
	static void preAndPost() {
		System.out.println("\nInside preAndPost ...");
		
		int x = 5;
		
		//--x;		
		//System.out.println("x: " + x);	

		//int y = x--;		
		//System.out.println("y: " + y + ", x: " +  x);
		
		int index = 0;
		int[] array = new int[3];
		array[index++] = 10;		
		array[index++] = 20;		
		array[index++] = 30;
		
		System.out.println(index);
	}
	
	
	static void compoundArithmeticAssignment() {
		int x = 100;
		
		System.out.println("x += 5: " + (x += 5));
		System.out.println("x -= 5: " + (x -= 5));
		System.out.println("x *= 5: " + (x *= 5));
		System.out.println("x /= 5: " + (x /= 5));
		System.out.println("x %= 5: " + (x %= 5));
		
		// Invalid
		System.out.println("x =+ 5: " + (x =+ 5)); // Unary plus ~ x = +5
		System.out.println("x =- 5: " + (x =- 5)); // Unary minus ~ x = -5
		/*System.out.println("x =* 5: " + (x =* 5));
		System.out.println("x =/ 5: " + (x =/ 5));
		System.out.println("x =% 5: " + (x =% 5));*/
	}
	
	static void isOddOrEven(int num) {
		System.out.println(num % 2);
	}
	
	
	// Comparison or Relational operators
	/*
       static void comparisonOperators() {
	    System.out.println("\nInside comparisonOperators ...");
		int age = 20;
	        //if (age > 21) {
		//	System.out.println("Graduate student");
		//}
		System.out.println("age > 21: " + (age > 21));
		System.out.println("age >= 21: " + (age >= 21));  
		System.out.println("age < 21: " + (age < 21));
		System.out.println("age <= 21: " + (age <= 21));	  
		System.out.println("age == 21: " + (age == 21)); // equal to (equality operator)
		System.out.println("age != 21: " + (age != 21)); // not equal to (equality operator)
		
		boolean isInternational = true;
		//System.out.println("isInternational <= true: " + (isInternational <= true));  
		System.out.println("isInternational == true: " + (isInternational == true)); 
		System.out.println("isInternational != true: " + (isInternational != true));
		
		Student s1 = new Student(1000, "Dheeru");
		Student s2 = new Student(1000, "Dheeru");
		System.out.println("s1 == s2: " + (s1 == s2)); // See object class
		System.out.println("s1 != s2: " + (s1 != s2));
		
		update(s1, "John");
	}		
	
	static boolean update(Student s, String name) {
	    if (s == null) {
		   return false;
		}
		
		s.name = name;		
		return true;
	}
        
	
	static void logicalOperators() {
		System.out.println("\nInside logicalOperators ...");
		int age = 37;
	    int salary = 85000;
	    boolean hasBadCredit = false;
		
		// 1. Core (AND, OR, NOT & Operator Chaining)
	    
	    if (age > 35 && salary > 90000 || !hasBadCredit) {
	    	System.out.println("Loan approved!");
	    } else {
			System.out.println("Loan not approved!");
		}
		
		// 2. 
		//    (a) Left-associative ~ Order of grouping
		//    (b) Associativity (a && b) && c = a && (b && c)
		//    Applies to both && and ||
		
		
		// 3. 
		//    (a) Operator precedence of Logical Operators: Helps with ONLY grouping operations. Not order of execution. (! > && > ||)
		
		          // Other Examples: A && B || C && D = (A && B) || (C && D)
				  //                 A && B && C || D = ((A && B) && C) || D
		
		
		//    (b) Operator Precedence across logical, comparison and arithmetic
		//          ! > arithmetic > comparison > &&, ||
		//    See resources section for complete precedence rules
		
		// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence rules
		
		// 4. Use && to avoid NullPointerException
		Student s1 = new Student(1001, "Raj");
		update(s1, "Dheeru");
	}
	*/
	
	static void bitwiseOperators() {
	    System.out.println("\nInside bitwiseOperators ...");
	    int x = 1;
		int y = 3;
		
		System.out.println("x & y: " + (x & y));
		System.out.println("x | y: " + (x | y));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + (~x));
		System.out.println("true & false: " + (true & false));
		 
		char c1 = 'a'; // U+0061 --> 0110 0001
		char c2 = 'b'; // U+0062 --> 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal		
		
		// Since bitwise work only on Integer types, following will not compile
		//double d1 = 3.14;
		//double d2 = 5.15;
		//System.out.println("d1 | d2: " + (d1 | d2));
	}
		
	
	static boolean ifStatement() {
		boolean approved = false;
		
		int age = 27;
		int salary = 60000;
		boolean hasBadCredit = false;
		
		if (age >= 25 && age <= 35 && salary >= 50000) {		
			approved = true;            			
			System.out.println("age >= 25 && age <= 35 && salary >= 50000");
		} else if (age > 35 && age <= 45 && salary >= 70000) {
			approved = true;			
			System.out.println("age > 35 && age <= 45 && salary >= 70000");
		} else if (age > 45 && age <= 55 && salary >= 90000) {
			approved = true;			
			System.out.println("age > 45 && age <= 55 && salary >= 90000");
		} else {
		    if (age > 55 && !hasBadCredit) {
				approved = true;			
				System.out.println("age > 55 && !hasBadCredit");
			}
			System.out.println("else block");
		}
		
				
		System.out.println("outside if");
		return approved;
	}
	
	// Constant Expression (In the context of switch):
	    // (i) int literals (e.g., 3), string literals ("March"), enum constants (e.g., MARCH)
		// (ii) Constant variables
		         // (a) final variables that are INITIALIZED + 
				 // (b) variable type has to be byte/short/char/int/String		
				 
	static String getSeason(int month) {
		
		String season = null;				
		
		/*
		if (month == 1) {
			season = "Spring";
		} else if (month == 2) {
			season = "Spring";
		} else if (month == 3) {
			season = "Spring";
		} else if (month == 4) {
			season = "Summer";
		} else if (month == 5) {
			season = "Summer";
		} else if (month == 6) {
			season = "Summer";
		} else if (month == 7) {
			season = "Rainy";
		} else if (month == 8) {
			season = "Rainy";
		} else if (month == 9) {
			season = "Rainy";
		} else if (month == 10) {
			season = "Winter";
		} else if (month == 11) {
			season = "Winter";
		} else if (month == 12) {
			season = "Winter";			
		} else {
			season = "unknown";
		}
		*/
		
		switch (month) {
			case 1: season = "Spring";
					break;					
			case 2: season = "Spring";
					break;
			case 3: season = "Spring";
					break;
			case 4: season = "Summer";
					break;
			case 5: season = "Summer";
					break;
			case 6: season = "Summer";
					break;
			case 7: season = "Rainy";	
					break;
			case 8: season = "Rainy";
					break;
			case 9: season = "Rainy";
					break;
			case 10: season = "Winter";
					break;
			case 11: season = "Winter";
					break;
			case 12: season = "Winter";
					break;
			default : season = "unknown";
					break;
		}
				
		return season;	
	}
	
		
	public static void main(String[] args) {	
	  // Language Basics 1
	  //print();				
	  //primitives();
	  //typeCasting();
	  //arrays();	
          //threeDimensionalArrays();	
      	  /*varargsOverload(true, 1, 2, 3);
     	    varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);	  
            varargsOverload(true);*/
	  
	  //preAndPost();
	  //compoundArithmeticAssignment();
	  //isOddOrEven(51);
	  
      	  //comparisonOperators();
      	  //logicalOperators();	  
	  //bitwiseOperators();
	  //ifStatement();
	  
      String season = getSeason(3);
	  //String season = getSeason("March"); // Java 7
	  //String season = getSeason(Month.MARCH);
	  
	  System.out.println(season);
    }  

	// String -> from Java 7
	static String getSeason(String month) {
		String season = null;
				
		switch (month) {
			case "January" : 
			   season = "Spring";
			   break;
			case "February":
			   season = "Spring";
			   break;
			case "March":
			   season = "Spring";
			   break;
			case "April":
			   season = "Summer";
			   break;
			case "May":
			   season = "Summer";
			   break;
			case "June": 
			   season = "Summer";
			   break;			   
			case "July": 
				 season = "Rainy";
				 break;
			case "August": 
				 season = "Rainy";
				 break;
			case "September": 
				 season = "Rainy";
				 break;
			case "October": 
				 season = "Winter";
				 break;
			case "November": 
				 season = "Winter";
				 break;
			case "December":
			     season = "Winter";
				 break;
			default :
			     season = "unknown";
				 break;
		}
				
		return season;
	}

	enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}
	
	static String getSeason(Month month) {
		String season = null;
		
		switch (month) {
			case JANUARY : 
			   season = "Spring";
			   break;
			case FEBRUARY:
			   season = "Spring";
			   break;
			case MARCH:
			   season = "Spring";
			   break;
			case APRIL:
			   season = "Summer";
			   break;
			case MAY:
			   season = "Summer";
			   break;
			case JUNE: 
			   season = "Summer";
			   break;			   
			case JULY: 
				 season = "Rainy";
				 break;
			case AUGUST: 
				 season = "Rainy";
				 break;
			case SEPTEMBER: 
				 season = "Rainy";
				 break;
			case OCTOBER: 
				 season = "Winter";
				 break;
			case NOVEMBER: 
				 season = "Winter";
				 break;
			case DECEMBER: 
				 season = "Winter";
				 break;
		}
				
		return season;
	}
    	
  }
  