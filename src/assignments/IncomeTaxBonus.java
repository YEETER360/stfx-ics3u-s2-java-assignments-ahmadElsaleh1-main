package assignments;
import java.util.Scanner;

public class IncomeTaxBonus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int salary;
		double federalIncomeTax = 0;
		double provincialIncomeTax = 0;
		double totalIncomeTax;
		
		System.out.println("Please enter your annual salary: ");
		salary = sc.nextInt();
		
		if(salary < 53359) provincialIncomeTax = salary * 0.15;
		if(salary > 53359) provincialIncomeTax += (53359 * 0.15) + (salary - 53359) * 0.205;
		if(salary > 106717) provincialIncomeTax += (106717 * 0.26) + (salary - 106717);
		if(salary > 165430) provincialIncomeTax += (salary - 165430) * 0.29;
		if(salary > 235675) provincialIncomeTax += (salary - 235675) * 0.33;
		
		if(salary > 0) federalIncomeTax = salary * 0.0505;
		if(salary > 49231) federalIncomeTax += (salary - 49231) * 0.0915;
		if(salary > 98463) federalIncomeTax += (salary - 98463) * 0.1116;
		if(salary > 150000) federalIncomeTax += (salary - 150000) * 0.1216;
		if(salary > 220000) federalIncomeTax += (salary - 220000) * 0.1316;
		
		totalIncomeTax = provincialIncomeTax + federalIncomeTax;
		
		System.out.println("Your annual income tax ammount is $"+ totalIncomeTax +" in Ontario");
	}

}
