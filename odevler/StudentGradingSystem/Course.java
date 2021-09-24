
public class Course {
	
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int oralNote;
	
	Course(String name, String code, String prefix){
		
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		int oralNote=0;
	}
	
	void addTeacher(Teacher t) {
		
		if(this.prefix.equals(t.branch)) {
			this.teacher = t;
		}
		else
			System.out.println(t.name + " Akademisyeni bu dersi veremez.");
		
	}
	
	void printTeacher() {
		
		if (teacher != null ) {
			System.out.println(this.name + " dersinin akademisyeni : " + teacher.name);
		}
		else
			System.out.println(this.name + " dersine akademisyen atanmamıştır.");
		
	}

}
