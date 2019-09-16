public class StudentManagement {

	private final int MAX = 100;
	private Student[] students;
	private int lengthOfStudents;

	/**
	 * [StudentManagement description]
	 * @return [description]
	 */
	public StudentManagement() {
		students = new Student[MAX];
		lengthOfStudents = 0;
	}

	/**
	 * [addStudent description]
	 * @param newStudent [description]
	 */
	public void addStudent(Student newStudent) {
		if(lengthOfStudents < 100){
			boolean isDup = false;
			for(int i = 0; i < lengthOfStudents; i++) {
				if(students[i].getId() == newStudent.getId()) {
					isDup = true;
					break;
				}
			}

			if(!isDup){
				this.students[lengthOfStudents] = newStudent;
				this.lengthOfStudents++;
			}
		}
	}

	/**
	 * [removeStudent description]
	 * @param id [description]
	 */
	public void removeStudent(String id) {
		boolean startRemove = false;

		for(int i = 0; i < this.lengthOfStudents; i++) {
			if(this.students[i].getId() == id) {
				startRemove = true;
			}
			if(startRemove) {
				for(int j = i; j < this.lengthOfStudents - 1; j++) {
					this.students[j] = this.students[j + 1];
				}

				this.lengthOfStudents = this.lengthOfStudents - 1;
				this.students[this.lengthOfStudents] = new Student();
				startRemove = false;
				break;
			}
		}

	}

	/**
	 * [studentsByGroup description]
	 * @return [description]
	 */
	public String studentsByGroup() {
		String result = "";

		if(this.lengthOfStudents > 0) {
			Student[] copyOfStudents = new Student[this.lengthOfStudents];

			for(int i = 0; i < this.lengthOfStudents; i++) {
				copyOfStudents[i] = new Student(this.students[i]);
			}

			for(int i = 0; i < this.lengthOfStudents; i++) {
				int count = 0;
				int curIndex = i + 1;
				for(int j = i + 1; j < this.lengthOfStudents; j++) {
					if(copyOfStudents[i].getGroup() == copyOfStudents[j].getGroup()) {
						count++;
						Student tmp = copyOfStudents[j];
						for(int k = j; k > curIndex; k--) {
							copyOfStudents[k] = copyOfStudents[k - 1];
						}
						copyOfStudents[curIndex] = tmp;
						curIndex++;
					}
				}
				i += count;
			}

			result += copyOfStudents[0].getGroup() + "\n";
			result += copyOfStudents[0].getInfor() + "\n";
			for(int i = 1; i < this.lengthOfStudents; i++) {
				if(copyOfStudents[i].getGroup() != copyOfStudents[i - 1].getGroup()) {
					result += copyOfStudents[i].getGroup() + "\n";
				}
				result += copyOfStudents[i].getInfor() + "\n";
			}
		}

		return result;
	}

	/**
	 * [sameGroup description]
	 * @param  s1 [description]
	 * @param  s2 [description]
	 * @return    [description]
	 */
	public static boolean sameGroup(Student s1, Student s2) {
		return s1.getGroup() == s2.getGroup();
	}

	/**
	 * [main description]
	 * @param args [description]
	 */
	public static void main(String[] args) {
		StudentManagement manager = new StudentManagement();
    Student s1 = new Student();
    Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
    Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
    Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
    Student s5 = new Student("Nguyen Van D", "17020005", "17020004@vnu.edu.vn");
    Student s6 = new Student("Nguyen Van D", "17020006", "17020004@vnu.edu.vn");
    Student s7 = new Student("Nguyen Van D", "17020007", "17020004@vnu.edu.vn");

    s1.setName("Nguyen Van An");
    s1.setId("17020001");
    s1.setEmail("17020001@vnu.edu.vn");
    s1.setGroup("K62CC");
    s2.setGroup("K62CC");
    s5.setGroup("K62CB");
    s6.setGroup("K62CA");
    s7.setGroup("K62CC");

    System.out.println(sameGroup(s1, s2));

    manager.addStudent(s1);
    manager.addStudent(s2);
    manager.addStudent(s3);
    manager.addStudent(s4);
    manager.addStudent(s5);
    manager.addStudent(s6);
    manager.addStudent(s7);
    manager.addStudent(s7);

    System.out.println( manager.studentsByGroup());
    // System.out.println( manager.studentsByGroup());
    manager.removeStudent("17020002");
    manager.removeStudent("17020005");
    manager.removeStudent("17020004");

    System.out.println( manager.studentsByGroup());

	}
}