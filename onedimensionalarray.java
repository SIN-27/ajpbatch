package day8;
import java.util.Scanner;
public class onedimensionalarray {

	public static void main(String[] args) {
	    int arr[]= new int [5];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("enter the age of the student" + i);
		     arr[i] = s.nextInt();
		}
		
		System.out.println("the students age are : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}




