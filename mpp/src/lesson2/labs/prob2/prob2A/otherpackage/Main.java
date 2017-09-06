package lesson2.labs.prob2.prob2A.otherpackage;

import java.util.*;

import lesson2.labs.prob2.prob2A.Student;

public class Main {

	public static void main(String[] args) {
		List<Student> students = getStudents();

		String[] grades = new String[]{"D", "B", "E", "C"};
		
		for(int i = 0; i < grades.length; ++i) {
			students.get(i).getReport().setGrade(grades[i]);
		}

		System.out.println("Students and their grades:\n  " + students);
	}

	private static List<Student> getStudents() {
		Student st1 = new Student("Tom");
		Student st2 = new Student("Hanse");
		Student st3 = new Student("Jim");
		Student st4 = new Student("High");
		
		return Arrays.asList(st1, st2, st3, st4);
	}
}