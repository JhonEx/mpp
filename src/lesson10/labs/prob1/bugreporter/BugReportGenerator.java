package lesson10.labs.prob1.bugreporter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import lesson10.labs.prob1.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lesson10.labs.prob1.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		
		class BugDetail{
			String assignedTo;
			int severity;
			String description;
			String reportBy;
			String className;
			public BugDetail(String className, String assignedTo, int severity, String description, String reportBy) {
				super();
				this.className = className;
				this.assignedTo = assignedTo;
				this.severity = severity;
				this.description = description;
				this.reportBy = reportBy;
			}
		}
		Map<String, List<BugDetail>> bugMap = new HashMap<>();
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		List<String> names = new ArrayList<String>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				String name = annotation.assignedTo();
				names.add(name);
				
				String className = cl.getName();
				int severity = annotation.severity();
				String description = annotation.description();
				String reportBy = annotation.reportedBy();
				
				if (!bugMap.containsKey(name)) {
					List<BugDetail> bugs = new ArrayList<>();
					bugMap.put(name, bugs);
				}
				bugMap.get(name).add(new BugDetail(className, name, severity, description, reportBy));
			}
		}
		System.out.println(names);
		
		File bugReportFile = new File("./bug_report.txt");
		try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(bugReportFile))){
			for(Entry<String, List<BugDetail>> bugDetailEntry : bugMap.entrySet()){
				bWriter.write(bugDetailEntry.getKey());
				bWriter.newLine();
				for(BugDetail bugDetail : bugDetailEntry.getValue()){
					bWriter.write("\treportedBy: " + bugDetail.reportBy);
					bWriter.newLine();
					bWriter.write("\tclassname: " + bugDetail.className);
					bWriter.newLine();
					bWriter.write("\tdescription: " + bugDetail.description);
					bWriter.newLine();
					bWriter.write("\tseverity: " + bugDetail.severity);
					bWriter.newLine();
					bWriter.newLine();
				}
			}
			bWriter.flush();
		}catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		BugReportGenerator generator = new BugReportGenerator();
		generator.reportGenerator();
		
		System.out.println("test");
	}
}
