package day8;

import java.util.Scanner;

public class twodimensional {

	public static void main(String[] args) {
		int age[] []= new int[2][5];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<age.length;i++)
		{
			for(int j=0; j<age[i].length; j++) 
			{
				System.out.println("enter the age of the student" + j + "Batch" +i);
				age[i][j]=s.nextInt();
			}
		}
	}
}

