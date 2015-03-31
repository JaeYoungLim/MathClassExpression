import java.util.Scanner;

public class MathClassExpression {
	public static void main(String [] args) { //main method
		
		output(h(Hfuction()));
		output(f(Ffuction1(), Ffuction2()));
		output(g(Gfuction1(), Gfuction2(), Gfuction3()));
		
	}
	
		public static void output(int x) { //main output
			System.out.println(x);
		}

		public static void output(double x) { //main output
			System.out.println(x);
		}
		
		
			public static int Hfuction() { //h(x) input
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Enter the value x of 'h(x) = x to the 10th power'");
				return keyboard.nextInt();			
			}		
			
				public static int h(int x) { //h(x) = x to the 10th power
					int y=10;
					return (int) Math.pow(x,y);	
				}
				
			
					public static int Ffuction1() { //f(x,y) input1 (value x)
						Scanner keyboard = new Scanner(System.in);
						System.out.println("\nEnter the value x of 'f(x,y) = x+y'");
						int x = keyboard.nextInt();
						return x;
						}		
					
					public static int Ffuction2() { //f(x,y) input2 (value y)
						Scanner keyboard = new Scanner(System.in);
						System.out.println("Enter the value y of 'f(x,y) = x+y'");
						int y = keyboard.nextInt();
						return y;
						}		
			
		
						public static int f(int x, int y) { //f(x,y) = x+y
							return x+y;	
						}
						
						
							public static double Gfuction1() { //g(x,y,z) input1 (value x)
								Scanner keyboard = new Scanner(System.in);
								System.out.println("\nEnter the value x of 'g(x,y,z) = total sum of square root of x,"
										+ " absolute value of y, and z to the yth power'");
								int x = keyboard.nextInt();
								return x;
							}
							
							public static int Gfuction2() { //g(x,y,z) input2 (value y)
								Scanner keyboard = new Scanner(System.in);
								System.out.println("Enter the value y of 'g(x,y,z) = total sum of square root of x,"
									+ " absolute value of y, and z to the yth power'");
							int y = keyboard.nextInt();
							return y;
						}
							
							public static int Gfuction3() { //g(x,y,z) input3 (value z)
								Scanner keyboard = new Scanner(System.in);	
							System.out.println("Enter the value z of 'g(x,y,z) = total sum of square root of x,"
									+ " absolute value of y, and z to the yth power'");
							int z = keyboard.nextInt();
							return z;
						}
					
								public static double g(double x, int y, int z) { //g(x,y,z) = square root of x + absolute value of y + z to the yth power
									x = java.lang.Math.sqrt(x); // to find square root of x
									y = Math.abs(y); // to find absolute value of y
									z = (int) Math.pow(z, y); // to find z to the yth power
									return x+y+z;	
								}
						
	
}