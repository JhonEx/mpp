package lesson2.labs.prob2.prob2A;


public class Student {
	private String name;
	private GradeReport gradeReport;

	public Student(String nm) {
		name = nm;
		gradeReport = new GradeReport(this);
	}
	public String getName() {
		return name;
	}
	public GradeReport getReport() {
		return gradeReport;
	}

	@Override
	public String toString() {
		return name + ": " + gradeReport;
	}
}
