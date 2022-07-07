package chapter8;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if (this.age > o.age) {
			return 1;
		} else if (this.age < o.age) {
			return -1;

		} else {
			return 0;
		}
		// return this.name.compareTo(o.name);
	}

}
