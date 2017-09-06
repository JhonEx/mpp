package lesson2.labs.prob4.domain;

import java.util.*;

public class Student {
	String id;
	String name;
	List<TranscriptEntry> grades;
	
	public Student() {
		grades = new ArrayList<TranscriptEntry>();
	}

	public Transcript getTranscript() {
		return new Transcript(grades, this);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean meetsGrade(String grade) {
		for(TranscriptEntry entry : grades) {
			if(entry.grade.equals(grade)) {
				return true;
			}
		}
		return false;
	}
	
	public String getCourses(){
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("[");
		for(TranscriptEntry entry : grades) {
			sb.append(entry.section.courseName);
			sb.append(" ");
		}
		
		sb.append("]");
//		sb.append("\n");
		return sb.toString();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID");
		sb.append(":");
		sb.append(id);
		sb.append(" ");
		sb.append("name");
		sb.append(":");
		sb.append(name);
		return sb.toString();
	}
}
