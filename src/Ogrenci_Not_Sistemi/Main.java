package Ogrenci_Not_Sistemi;

public class Main {

	public static void main(String[] args) {
		Course mat = new Course("Matematik", "MAT101", "MAT");
		Course fizik = new Course("Fizik", "FZK101", "FZK");
		Course kimya = new Course("Kimya", "KMY101", "KMY");

		Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
		Teacher t2 = new Teacher("Fatma Ayþe", "90550000001", "FZK");
		Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);

		Student s1 = new Student("Ýnek Þaban", 4, "140144015", mat, fizik, kimya);
		s1.addBulkExamNote(50,100,20,80,40,80);
		s1.isPass();

		Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
		s2.addBulkExamNote(100,100,50,80,40,70);
		s2.isPass();

		Student s3 = new Student("Hayta Ýsmail", 4, "221121312", mat, fizik, kimya);
		s3.addBulkExamNote(50,70,20,60,40,60);
		s3.isPass();
	}

}
