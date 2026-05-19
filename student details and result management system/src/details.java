import java.util.Scanner;

public class details {
	
	void getdetails() {
		
		Scanner var=new Scanner(System.in);
		
		System.out.println("Enter the student name");
		String name=var.next();
		
		System.out.println("Enter the student ID");
		int ID=var.nextInt();
		
		System.out.println("Enter the student age");
		int age=var.nextInt();
		
		System.out.println("Enter the student Address");
		String Address=var.next();
		
		System.out.println("Enter sub1 mark");
		int sub1=var.nextInt();
		
		System.out.println("Enter sub2 mark");
		int sub2=var.nextInt();
		
		System.out.println("Enter sub3 mark");
		int sub3=var.nextInt();
		
		System.out.println("Enter sub4 mark");
		int sub4=var.nextInt();
		
		System.out.println("Enter sub5 mark");
		int sub5=var.nextInt();
		
		int sum=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total Mark:"+sum);
		
		double percentage=(sum/500.0)*100;
		System.out.println("percentage:"+percentage+"%");
		
		if(percentage>90) {
			System.out.println("A++");
		}
		else if(percentage>80) {
			System.out.println("A+");
		}
		else if(percentage>60) {
			System.out.println("A");
		}
		else if(percentage>45) {
			System.out.println("B");
		}
		else if(percentage>35) {
			System.out.println("C");
		}
		else {
			System.out.println("Fail");
		}
		
	


		
		
		
	
	}

}
