import java.util.Scanner;
public class Subjectmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float per=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Subject 1 marks : ");
		int sub1=in.nextInt();
		System.out.print("Enter Subject 2 marks : ");
		int sub2=in.nextInt();
		System.out.print("Enter Subject 3 marks : ");
		int sub3=in.nextInt();
		
		per=(((float)(sub1+sub2+sub3))*100)/300;
		System.out.printf(" Percentage = %.2f",per);
	}

}
