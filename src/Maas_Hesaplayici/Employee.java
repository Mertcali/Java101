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
			System.out.println("Maaþ : " +salary);
			System.out.println("Vergi uygulanmamýþtýr.");
			this.newSalary=salary;			
		}
		if(salary>=1000) {
			System.out.println("Maaþ : " +salary);
			this.tax = 1000 * 0.03;
			this.newSalary = salary - this.tax;
			System.out.println("Yüzde 3 vergi kesintisi ile yeni maaþ : " + this.newSalary);
		}
	}
	
	public void bonus(int workHour) {
		if(workHour>40) {
			System.out.println("Ek Mesai : " +(workHour-40) + " saat");
			this.ekMesaiUcreti = (workHour - 40) * 30;
			System.out.println("Ek Mesai Ücreti : " +this.ekMesaiUcreti);
			this.newSalary = this.newSalary + this.ekMesaiUcreti;
		}
	}
	
	public void raiseSalary(int hireYear) {
		int workYear = 2021-hireYear;
		if(workYear<10) {
			System.out.println("***Çalýþma Yýlýna Göre Maaþ Artýþý Yüzde 5***");
			this.newSalary = this.newSalary + (this.newSalary * 0.05);
			System.out.println("Yeni Maaþ: " +this.newSalary);
		}if(workYear>9 && workYear<20) {
			System.out.println("***Çalýþma Yýlýna Göre Maaþ Artýþý Yüzde 10***");
			this.newSalary = this.newSalary + (this.newSalary * 0.10);
			System.out.println("Yeni Maaþ: " +this.newSalary);
		}if(workYear>19) {
			System.out.println("***Çalýþma Yýlýna Göre Maaþ Artýþý Yüzde 15***");
			this.newSalary = this.newSalary + (this.newSalary * 0.15);
			System.out.println("Yeni Maaþ: " +this.newSalary);
		}
	}
	
	public void yazdir() {
		System.out.println("****ÇALIÞAN BÝLGÝLERÝ****");
		System.out.println("Ad: " +this.name + "\nMaaþ: " 
				+this.salary 
				+ "\nHaftalýk Çalýþma Saati:"
				+ " " +this.workHours 
				+"\nÝþe Baþlangýç Yýlý: " +this.hireYear);
		
		System.out.println("Vergi : " +this.tax);
		System.out.println("Bonus : " +this.ekMesaiUcreti);
		System.out.println("Maaþ Artýþý : " + (this.newSalary - this.salary));
		System.out.println("Toplam Maaþ : " + this.newSalary);
	}
	
}
