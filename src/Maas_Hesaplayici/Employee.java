package Maas_Hesaplayici;

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;
	double tax;
	double ekMesaiUcreti;
	double newSalary;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		this.newSalary = 0;
		this.tax = 0;
		this.ekMesaiUcreti=0;
	}
	
	public void tax(double salary) {
		if(salary<1000) {
			System.out.println("Maa� : " +salary);
			System.out.println("Vergi uygulanmam��t�r.");
			this.newSalary=salary;			
		}
		if(salary>=1000) {
			System.out.println("Maa� : " +salary);
			this.tax = 1000 * 0.03;
			this.newSalary = salary - this.tax;
			System.out.println("Y�zde 3 vergi kesintisi ile yeni maa� : " + this.newSalary);
		}
	}
	
	public void bonus(int workHour) {
		if(workHour>40) {
			System.out.println("Ek Mesai : " +(workHour-40) + " saat");
			this.ekMesaiUcreti = (workHour - 40) * 30;
			System.out.println("Ek Mesai �creti : " +this.ekMesaiUcreti);
			this.newSalary = this.newSalary + this.ekMesaiUcreti;
		}
	}
	
	public void raiseSalary(int hireYear) {
		int workYear = 2021-hireYear;
		if(workYear<10) {
			System.out.println("***�al��ma Y�l�na G�re Maa� Art��� Y�zde 5***");
			this.newSalary = this.newSalary + (this.newSalary * 0.05);
			System.out.println("Yeni Maa�: " +this.newSalary);
		}if(workYear>9 && workYear<20) {
			System.out.println("***�al��ma Y�l�na G�re Maa� Art��� Y�zde 10***");
			this.newSalary = this.newSalary + (this.newSalary * 0.10);
			System.out.println("Yeni Maa�: " +this.newSalary);
		}if(workYear>19) {
			System.out.println("***�al��ma Y�l�na G�re Maa� Art��� Y�zde 15***");
			this.newSalary = this.newSalary + (this.newSalary * 0.15);
			System.out.println("Yeni Maa�: " +this.newSalary);
		}
	}
	
	public void yazdir() {
		System.out.println("****�ALI�AN B�LG�LER�****");
		System.out.println("Ad: " +this.name + "\nMaa�: " 
				+this.salary 
				+ "\nHaftal�k �al��ma Saati:"
				+ " " +this.workHours 
				+"\n��e Ba�lang�� Y�l�: " +this.hireYear);
		
		System.out.println("Vergi : " +this.tax);
		System.out.println("Bonus : " +this.ekMesaiUcreti);
		System.out.println("Maa� Art��� : " + (this.newSalary - this.salary));
		System.out.println("Toplam Maa� : " + this.newSalary);
	}
	
}
