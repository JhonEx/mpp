package lesson2.labs.prob4;
import java.util.*;

import lesson2.labs.prob4.domain.Section;
import lesson2.labs.prob4.domain.Student;
import lesson2.labs.prob4.domain.StudentSectionFactory;

/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {

	private static List<Student> stus = new ArrayList<Student>();
	private static List<Section> secs = new ArrayList<Section>();
	
	public static void main(String[] args) { 
		Main m = new Main();
		m.readDataFromDb();
		
		for(Student stu : stus) {
			System.out.println(stu.getTranscript());
		}

		System.out.println("letter grades for any given Section");
		for(Section sec : secs) {
			System.out.println(sec);
		}
		
		System.out.println("courses taken by any given Student");
		for(Student stu : stus) {
			System.out.println(stu.getCourses());
		}
		
		System.out.println("Students who got A's: ");
		System.out.println(m.getStudentsWith("A"));
		
//		System.out.println(m.getTranscript(m.bob));
//		System.out.println("Grades for math section:\n " + m.getGrades(m.math));
//		System.out.println("Courses that Tim took: " + m.getCourseNames(m.tim));
//		System.out.println("Students who got A's: " + m.getStudentsWith("A"));
	}
	
//	private Transcript getTranscript(Student s) {
//		return s.getTranscript();
//	}
//	private List<String> getCourseNames(Student s) {
//		List<TranscriptEntry> all = s.grades;
//		List<String> courseNames = new ArrayList<>();
//		for(TranscriptEntry te : all) {
//			courseNames.add(te.section.courseName);
//		}
//		return courseNames;
//	}
//	private List<String> getGrades(Section s) {
//		List<String> grades  = new ArrayList<>();
//		for(TranscriptEntry t : s.gradeSheet) {
//			grades.add(t.grade);
//		}
//		return grades;
//	}
	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
		for(Student std : stus) {
			if(std.meetsGrade(grade)) {
				studentNames.add(std.getName());
			}
		}
		
		return studentNames;
	}
	private void readDataFromDb() {
		
		StudentSectionFactory factory = new StudentSectionFactory();
		
		Student bob = factory.createStudent("Bob");
		Student tim = factory.createStudent("Tim");
		Student allen = factory.createStudent("Allen");
		
		stus.add(bob);
		stus.add(tim);
		stus.add(allen);
		
		Section bio1 = factory.createSection(1, "Biology");
		Section bio2 = factory.createSection(2, "Biology");
		Section math = factory.createSection(1, "Mathematics");
		
		secs.add(bio1);
		secs.add(bio2);
		secs.add(math);
		
		factory.newTranscriptEntry(bob, bio1, "A");
		factory.newTranscriptEntry(bob, math, "B");
		factory.newTranscriptEntry(tim, bio1, "B+");
		factory.newTranscriptEntry(tim, math, "A-");
		factory.newTranscriptEntry(allen, math, "B");
		factory.newTranscriptEntry(allen, bio2, "B+");
	}
}
