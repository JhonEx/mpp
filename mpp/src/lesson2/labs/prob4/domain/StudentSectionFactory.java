package lesson2.labs.prob4.domain;

public class StudentSectionFactory {

	private int stuId;
	
	public StudentSectionFactory() {
		stuId = 0;
	}
	
	public Section createSection(int secNum, String courseName) {
		Section section = new Section();
		section.courseName = courseName;
		section.sectionNumber = secNum;
		return section;
	}
	
	public Student createStudent(String name) {
		stuId++;
		Student stu = new Student();
		stu.id = stuId + "";
		stu.name = name;
		
		return stu;
	}
	
	public void newTranscriptEntry(Student s, Section sect, String grade) {
		TranscriptEntry te = new TranscriptEntry();
		te.grade = grade;
		te.section = sect;
		te.student = s;
		
		s.grades.add(te);
		sect.gradeSheet.add(te);
	}

}
