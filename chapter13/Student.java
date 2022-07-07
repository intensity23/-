package chapter13;

import java.util.Objects;

public class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;

			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
 	}
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	



}
