
public class Student {
	
	String name;
	String stuNo;
	int classes;
	Course mat;
	Course kimya;
	Course fizik;
	double average;
	boolean isPass;
	
	Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya){
		
		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		this.isPass = false;
		
	}
	
	
	void addBulkExamNote(int note1, int note2, int note3, int oralNote1,int oralNote2, int oralNote3) {
		
		if(note1 >= 0 && note1 <= 100) {
			this.mat.note = note1;
		}
		
		if(note2 >= 0 && note2 <= 100) {
			this.fizik.note = note2;
		}
		
		if(note1 >= 0 && note1 <= 100) {
			this.kimya.note = note3;
		}
		
		if(oralNote1 >= 0 && oralNote1 <= 100) {
			this.mat.oralNote = oralNote1;
		}
		
		if(note2 >= 0 && note2 <= 100) {
			this.fizik.oralNote = oralNote2;
		}
		
		if(note1 >= 0 && note1 <= 100) {
			this.kimya.oralNote = oralNote3;
		}
		
	}
	void isPass() {
		
		if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 
				|| this.mat.oralNote == 0 || this.fizik.oralNote == 0 || this.kimya.oralNote == 0) {
			
            System.out.println("Notlar tam olarak girilmemiş");
            
        } else {
        	
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
		
	}
	
	void calcAverage() {
		
		this.average=((this.mat.note*0.80 + this.mat.oralNote*0.20) + (this.kimya.note*0.80 + this.kimya.oralNote*0.20) 
						+(this.fizik.note*0.80 + this.fizik.oralNote*0.20)) / 3.0;
	}
	
	boolean isCheckPass() {
		
	     calcAverage();
	     return this.average > 55;
	}
	
	void printNote() {
		
		System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
		System.out.println(this.mat.name + " Sınav Notu : " + this.mat.note +"\nMathematics Sözlü Notu : " + this.mat.oralNote);
		System.out.println(this.fizik.name + " Sınav Notu : " + this.fizik.note +"\nPhysics Sözlü Notu : " + this.fizik.oralNote);
		System.out.println(this.kimya.name + " Sınav Notu : " + this.kimya.note +"\nChemistry Sözlü Notu : " + this.kimya.oralNote);
		
	}

}
