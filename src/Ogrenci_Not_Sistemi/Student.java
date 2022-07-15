package Ogrenci_Not_Sistemi;

public class Student {
	 String name,stuNo;
	    int classes;
	    Course mat;
	    Course fizik;
	    Course kimya;
	    double avarage;
	    boolean isPass;


	    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
	        this.name = name;
	        this.classes = classes;
	        this.stuNo = stuNo;
	        this.mat = mat;
	        this.fizik = fizik;
	        this.kimya = kimya;
	        calcAvarage();
	        this.isPass = false;
	    }


	    public void addBulkExamNote(int mat, int matSozlu, int fizik,int fizikSozlu, int kimya, int kimyaSozlu) {

	        if (mat >= 0 && mat <= 100 && matSozlu>=0 && matSozlu<=100) {
	            this.mat.note = (mat*0.8) + (matSozlu*0.2);
	            System.out.println("S�zl�n�n etkisi %20");
	            System.out.println("S�nav Notu: " + mat + " S�zl� Notu: " +matSozlu +" Ortalamas� :" +this.mat.note);
	        }

	        if (fizik >= 0 && fizik <= 100 && fizikSozlu>=0 && fizikSozlu<=100) {
	            this.fizik.note = (fizik*0.8) +(fizikSozlu*0.3);
	            System.out.println("S�zl�n�n etkisi %30");
	            System.out.println("S�nav Notu: " + fizik + " S�zl� Notu: " +fizikSozlu +" Ortalamas� :" +this.fizik.note);
	        }

	        if (kimya >= 0 && kimya <= 100 && fizikSozlu>=0 && fizikSozlu<=100) {
	            this.kimya.note = (kimya*0.8) +(kimyaSozlu*0.1);
	            System.out.println("S�zl�n�n etkisi %10");
	            System.out.println("S�nav Notu: " + kimya + " S�zl� Notu: " +kimyaSozlu +" Ortalamas� :" +this.kimya.note);
	        }

	    }

	    public void isPass() {
	        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
	            System.out.println("Notlar tam olarak girilmemi�");
	        } else {
	            this.isPass = isCheckPass();
	            printNote();
	            System.out.println("Ortalama : " + this.avarage);
	            if (this.isPass) {
	                System.out.println("S�n�f� Ge�ti. ");
	            } else {
	                System.out.println("S�n�fta Kald�.");
	            }
	        }
	    }
	    

	    public void calcAvarage() {
	        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
	    }

	    public boolean isCheckPass() {
	        calcAvarage();
	        return this.avarage > 55;
	    }

	    public void printNote(){
	        System.out.println("=========================");
	        System.out.println("��renci : " + this.name);
	        System.out.println("Matematik Notu : " + this.mat.note);
	        System.out.println("Fizik Notu : " + this.fizik.note);
	        System.out.println("Kimya Notu : " + this.kimya.note);
	    }
}
