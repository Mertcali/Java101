package Maas_Hesaplayici;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Mert", 2000, 50, 1999);
		e1.tax(e1.salary);
		e1.bonus(e1.workHours);
		e1.raiseSalary(e1.hireYear);
		e1.yazdir();

	}

}
