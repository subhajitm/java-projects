import java.io.*;
import java.util.*;

import org.apache.commons.lang3.RandomStringUtils;


public class Main {
	
	/*
	 * writes the generated data to files.
	 */
	void writeToFile(String filename, ArrayList<String> list) {
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(filename), "utf-8"));
		    Iterator iterator = list.iterator();
	        while (iterator.hasNext()) {
	        	writer.write((String)iterator.next()+"\n");
	        }
		} catch (IOException ex) {
		  ex.printStackTrace();
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		int noOfCourses = 300; // hard coding the no. of courses, offerings and enrollments
		int noOfOffering = 400;
		int noOfEnrollement = 10000;
		int i, d;
		
		String deptCode[] = {"CSCE","ECEN","CVEN","MECH","AERO","STAT","PTRLM","CHEM"};
		ArrayList<Course> courseObj = new ArrayList<Course>(noOfCourses);
		ArrayList<CourseOffering> courseOfferingObj = new ArrayList<CourseOffering>(noOfOffering);

		// Courses Data Generator		
		i = 0;
		Set<String> courseList = new HashSet<String>(noOfCourses);
		ArrayList<String> courseInsert = new ArrayList<String>(noOfCourses);
		Random r = new Random();
		while(i < noOfCourses) {
			d = r.nextInt(8);
			// create new Course object
			Course c = new Course(deptCode[d]);
			String stmt = "INSERT INTO "+ "Course" +" VALUES('"+
							c.getCourseCode()+"','"+
							c.getDeptCode()+"','"+
							c.getTitle()+"','"+
							c.getSection()+"','"+
							c.getCredits()+"','"+
							c.getDescription()+"','"+
							c.getLevel()+"');";
			// generate the primary key for checking uniqueness
			String newCourse = c.getDeptCode()+c.getCourseCode()+c.getSection();
			if (courseList.contains(newCourse)) { // already present ?
				// System.out.println("PRESENT"); // debug code
				continue;
			}
			courseInsert.add(stmt);
			courseList.add(newCourse);
			courseObj.add(c);
			i++;			
		}
		courseInsert.add("COMMIT;");
		for (i=0; i<=noOfCourses; i++)
			System.out.println(courseInsert.get(i));
		main.writeToFile("Course.sql", courseInsert);
		
		// Course Offering Data Generator
		i = 0;
		Set<String> courseOfferingList = new HashSet<String>(noOfOffering);
		ArrayList<String> courseOfferingInsert = new ArrayList<String>(noOfOffering);
		while(i < noOfOffering) {
			d = r.nextInt(noOfCourses);
			Course c = courseObj.get(d);
			int studUIN = r.nextInt(500000000 - 499992001) + 499992001;
			int profUIN = r.nextInt(900001999 - 900000000) + 900000000;
			// create a new CoureOffering object
			CourseOffering cof = new CourseOffering(c, studUIN, profUIN);
			String stmt = "INSERT INTO "+ "Course_Offerings" +" VALUES('"+
							cof.getDeptCode()+"','"+
							cof.getCourseCode()+"','"+
							cof.getSection()+"','"+
							cof.getSemester()+"','"+
							cof.getYear()+"','"+
							cof.getLocation()+"','"+
							cof.getTA_UIN()+"','"+
							cof.getProf_UIN()+"');";
			// generate the primary key for checking uniqueness
			String newCof = cof.getDeptCode()+cof.getCourseCode()+cof.getSection()+
								cof.getSemester()+cof.getYear();
			if (courseOfferingList.contains(newCof)) { // check if already present
				// System.out.println("PRESENT"); // debug code
				continue;
			}
			// maintain list
			courseOfferingInsert.add(stmt);
			courseOfferingList.add(newCof);
			courseOfferingObj.add(cof);
			i++;			
		}
		courseOfferingInsert.add("COMMIT;");
		for (i=0; i<=noOfOffering; i++)
			System.out.println(courseOfferingInsert.get(i));
		main.writeToFile("CourseOffering.sql", courseOfferingInsert);
		
		// Enrollments Data Generator
		i = 0;
		Set<String> courseEnrollmentList = new HashSet<String>(noOfEnrollement);
		ArrayList<String> courseEnrollmentInsert = new ArrayList<String>(noOfEnrollement);
		while(i < noOfEnrollement) {
			d = r.nextInt(noOfOffering);
			CourseOffering cof = courseOfferingObj.get(d);
			int studUIN = r.nextInt(500000000 - 499992001) + 499992001;
			Enrollments e = new Enrollments(cof, studUIN); // create a new Enrollment object
			String stmt = "INSERT INTO "+ "Enrollments" +" VALUES('"+
							e.getStudUIN()+"','"+
							e.getDeptCode()+"','"+
							e.getCourseCode()+"','"+
							e.getSection()+"','"+
							e.getSemester()+"','"+
							e.getYear()+"','"+
							e.getGrade()+"');";
			// generate the primary key for checking uniqueness				
			String newEnroll = e.getStudUIN()+e.getDeptCode()+e.getCourseCode()+e.getSection()+
								e.getSemester()+e.getYear();
			if (courseEnrollmentList.contains(newEnroll)) {
				// System.out.println("PRESENT"); // debug code
				continue;
			}
			courseEnrollmentInsert.add(stmt);
			courseEnrollmentList.add(newEnroll);
			i++;			
		}
		courseEnrollmentInsert.add("COMMIT;");
		for (i=0; i<=noOfEnrollement; i++) // print on console
			System.out.println(courseEnrollmentInsert.get(i));
		main.writeToFile("Enrollment.sql", courseEnrollmentInsert);
	}

}
