package lab11;

class College {
	String name;
	String address;
	Student student;
	Department department;
	College(String name, String address, Student student, Department department ){
		this.name=name;
		this.address=address;
		this.student=student;
		this.department=department;
	}
	public static void main(String[] args) {
		Student s = new Student("Chase", "401 Red Bud ln", "CE",18);
		Department d = new Department("CE","Robert");
		College c = new College("Bellarmine","203 Newburg", s,d);
		
		System.out.println("----College----");
		System.out.println("Name: "+c.name);
		System.out.println("Address: "+c.address);
		System.out.println("----Student----");
		System.out.println("Name: "+c.student.name);
		System.out.println("Address: "+c.student.address);
		System.out.println("Dept: "+c.student.dept);
		System.out.println("Age: "+c.student.age);
		System.out.println("---Department---");
		System.out.println("Name: "+c.department.name);
		System.out.println("Chair: "+c.department.chair);

	}

}
