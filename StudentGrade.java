import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("TASK-2:STUDENT GRADE CALCULATOR");
		System.out.println("enter no.of subjects");
		int n=sc.nextInt();
		int sum=0;
		int marks[]=new int[n];		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter subject"+(i+1)+" marks");
			marks[i]=sc.nextInt();
			sum+=marks[i];
			
		}
		System.out.println("sum.of marks obtained is "+sum+"/"+(n*100));
	     double avgpercentage = (double) sum / (n * 100) * 100;
	     String formattedpercentage = String.format("%.2f%%", avgpercentage);

		System.out.println("average percentage obtained is "+formattedpercentage);
		System.out.print("Grade:");
		if(avgpercentage>=90)
		{
			System.out.println("A");
		}
		else if(avgpercentage>=80 && avgpercentage<90)
		{
			System.out.println("B");
		}
		else if(avgpercentage>=70 && avgpercentage<80)
		{
			System.out.println("C");
		}
		else if(avgpercentage>=65 && avgpercentage<70)
		{
			System.out.println("D");
		}
		else if(avgpercentage>=45 && avgpercentage<65)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("FAIL");
		}
			
		
		// TODO Auto-generated method stub

	}

}
