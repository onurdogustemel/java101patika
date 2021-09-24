
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1 = new Teacher ("Mehmet","05054503489","MATH");
		Teacher t2 = new Teacher("Asya","05321235874","CHEM");
		Teacher t3 = new Teacher("Deniz","05078975600","PHYS");
		
		Course mat = new Course("Mathematics","101","MATH");
		Course kimya = new Course("Chemistry","102","CHEM");
		Course fiz = new Course("Physics","103","PHYS");
		
		
		mat.addTeacher(t1);
		kimya.addTeacher(t2);
		fiz.addTeacher(t3);
		
		Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fiz, kimya);
	    s1.addBulkExamNote(50,20,40,80,70,60);
	    s1.isPass();

	    Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fiz, kimya);
	    s2.addBulkExamNote(100,50,40,50,40,70);
	    s2.isPass();

	    Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fiz, kimya);
	    s3.addBulkExamNote(50,20,40,50,90,30);
	    s3.isPass();
		

	}

}
