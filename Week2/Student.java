public class Student {
	private String name; // name of student
	private String id; // Student ID
	private String group; // class of Student
	private String email; // email of Student

	/**
	 * [Student description]
	 * @return [description]
	 */
	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "K62CB";
		this.email = "uet@vnu.edu.vn";
	}

	/**
	 * [Student description]
	 * @param  name  [description]
	 * @param  id    [description]
	 * @param  group [description]
	 * @param  email [description]
	 * @return       [description]
	 */
	public Student(String name, String id, String email) {
		this.name = name;
		this.id = id;
		this.group = "K62CB";
		this.email = email;
	}

	/**
	 * [Student description]
	 * @param  student [description]
	 * @return         [description]
	 */
	public Student(Student student) {
		this.name = student.getName();
		this.id = student.getId();
		this.group = student.getGroup();
		this.email = student.getEmail();
	}

	/**
	 * [getName description]
	 * @return [description]
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * [getId description]
	 * @return [description]
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * [getGroup description]
	 * @return [description]
	 */
	public String getGroup() {
		return this.group;
	}

	/**
	 * [getEmail description]
	 * @return [description]
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * [setName description]
	 * @param name [description]
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * [setId description]
	 * @param id [description]
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * [setGroup description]
	 * @param group [description]
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * [setEmail description]
	 * @param email [description]
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * [getInfor description]
	 * @return [description]
	 */
	public String getInfor() {
		return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
	}
}