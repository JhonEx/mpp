package lesson2.labs.prob4.domain;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet;
	public Section() {
		gradeSheet = new ArrayList<TranscriptEntry>();
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		for(TranscriptEntry entry : gradeSheet) {
			sb.append("[");
			sb.append(entry.student);
			sb.append(" ");
			sb.append("course");
			sb.append(":");
			sb.append(courseName);
			sb.append(" ");
			sb.append("grage");
			sb.append(":");
			sb.append(entry.grade);
			sb.append("]");
			sb.append("\n");
		}
		return sb.toString();
	}
}
