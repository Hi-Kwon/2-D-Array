import java.util.Scanner;

public class twoDArray
	{
		static final int n = 3;
		static final int m = 3;
		public static int numberCount = 1;
		
		public static void main(String[] args)
		{
			challenge1();
			challenge2();
			challenge3();
		}
		public static void challenge1()
			{
				int arrayNumbers[] [] = new int [3] [2];
				arrayNumbers [0] [0] = 10;
				arrayNumbers [0] [1] = 20;
				arrayNumbers [1] [0] = 30;
				arrayNumbers [1] [1] = 40;
				arrayNumbers [2] [0] = 50;
				arrayNumbers [2] [1] = 60;
				
				for (int row = 0; row < arrayNumbers.length; row++)
					{
						for (int column = 0; column < arrayNumbers[row].length; column++)
							{
								System.out.print(arrayNumbers[row][column] + " ");
							}
						System.out.println();
					}
				System.out.println();
			}
		public static void challenge2()
		{
			Scanner userStringInput = new Scanner(System.in);
			
			System.out.println("What are the initials of your school");
			
			String school = userStringInput.nextLine();
			
			String arraySchool [] [] = new String [4] [3];
			arraySchool [0] [0] = school;
			arraySchool [0] [1] = school;
			arraySchool [0] [2] = school;
			arraySchool [1] [0] = school;
			arraySchool [1] [1] = school;
			arraySchool [1] [2] = school;
			arraySchool [2] [0] = school;
			arraySchool [2] [1] = school;
			arraySchool [2] [2] = school;
			arraySchool [3] [0] = school;
			arraySchool [3] [1] = school;
			arraySchool [3] [2] = school;
			
			for (int row = 0; row < arraySchool.length; row++)
				{
					for (int column = 0; column < arraySchool[row].length; column++)
						{
							System.out.print(arraySchool[row][column] + " ");
						}
					System.out.println();
				}
			System.out.println();
		}
		public static void challenge3()
		{
			int arrayTotalSum [] [] = new int [3] [3];
					for (int row = 0; row < arrayTotalSum.length; row++)
						{
							for (int column = 0; column < arrayTotalSum[row].length; column++)
								{
									arrayTotalSum [row] [column] = numberCount;
									numberCount++;
									System.out.print(arrayTotalSum[row][column] + " ");
								}
								System.out.println();
			
						}
						System.out.println();
							
			int sum = 0;
							
			System.out.println("Left top corner " + arrayTotalSum [0] [0]);
			System.out.println("Right top corner " + arrayTotalSum [0] [m-1]);
			System.out.println("Left bottom corner " + arrayTotalSum [n-1] [0]);
			System.out.println("Right bottom corner " + arrayTotalSum [n-1] [m-1]);
			
			sum = arrayTotalSum [0] [0] + arrayTotalSum [0] [m-1] + arrayTotalSum [n-1] [0] + arrayTotalSum [n-1] [m-1];
			System.out.println(" ");
			System.out.println(sum);
			
		
		}
	}
