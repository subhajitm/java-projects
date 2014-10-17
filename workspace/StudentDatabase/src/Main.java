import java.io.*;
import java.util.*;

import org.apache.commons.lang3.RandomStringUtils;


public class Main {
	
	void writeToFile(String filename, ArrayList<Object> list) {
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(filename), "utf-8"));
		    Iterator iterator = list.iterator();
	        while (iterator.hasNext()) {
	        	writer.write((String)iterator.next());
	        }
		} catch (IOException ex) {
		  ex.printStackTrace();
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}

	public static void main(String[] args) {
		int noOfCourses = 300;
		int noOfOffering = 400;
		int noOfEnrollement = 10000;
		int noOfStudent;
		int noOfProfessor;
		int i, d;
		
		String deptCode[] = {"CSCE","ECEN","CVEN","MECH","AERO","STAT","PTRLM","CHEM"};
		ArrayList<Course> courseObj = new ArrayList<Course>(noOfCourses);
		ArrayList<CourseOffering> courseOfferingObj = new ArrayList<CourseOffering>(noOfOffering);

		// Courses		
		i = 0;
		Set<String> courseList = new HashSet<String>(noOfCourses);
		ArrayList<String> courseInsert = new ArrayList<String>(noOfCourses);
		Random r = new Random();
		while(i < noOfCourses) {
			d = r.nextInt(8);
			Course c = new Course(deptCode[d]);
			String stmt = "INSERT INTO "+ "Course" +" VALUES("+
							c.getCourseCode()+","+
							c.getDeptCode()+","+
							c.getTitle()+","+
							c.getSection()+","+
							c.getCredits()+","+
							c.getDescription()+");";
			String newCourse = c.getDeptCode()+" "+c.getCourseCode()+" "+c.getSection();
			if (courseList.contains(newCourse)) {
				// System.out.println("PRESENT");
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
		
		// Course Offering
		i = 0;
		Set<String> courseOfferingList = new HashSet<String>(noOfOffering);
		ArrayList<String> courseOfferingInsert = new ArrayList<String>(noOfOffering);
		while(i < noOfOffering) {
			d = r.nextInt(noOfCourses);
			Course c = courseObj.get(d);
			//d = r.nextInt(noOfStudent);
			//StudentInfo s = studentObj.get(d);
			//d = r.nextInt(noOfProfessor);
			//PrefessorInfo p = professorObj.get(d);
			
			CourseOffering cof = new CourseOffering(c);
			String stmt = "INSERT INTO "+ "Course_Offerings" +" VALUES("+
							cof.getDeptCode()+","+
							cof.getCourseCode()+","+
							cof.getSection()+","+
							cof.getSemester()+","+
							cof.getYear()+","+
							cof.getLocation()+","+
							cof.getTA_UIN()+","+
							cof.getProf_UIN()+");";
			String newCof = cof.getDeptCode()+cof.getCourseCode()+cof.getSection()+
								cof.getSemester()+cof.getYear();
			if (courseList.contains(newCof)) {
				// System.out.println("PRESENT");
				continue;
			}
			courseOfferingInsert.add(stmt);
			courseOfferingList.add(newCof);
			courseOfferingObj.add(cof);
			i++;			
		}
		courseOfferingInsert.add("COMMIT;");
		for (i=0; i<=noOfOffering; i++)
			System.out.println(courseOfferingInsert.get(i));
		
		// Enrollments
		i = 0;
		Set<String> courseEnrollmentList = new HashSet<String>(noOfEnrollement);
		ArrayList<String> courseEnrollmentInsert = new ArrayList<String>(noOfEnrollement);
		while(i < noOfEnrollement) {
			d = r.nextInt(noOfOffering);
			CourseOffering cof = courseOfferingObj.get(d);
			//d = r.nextInt(noOfStudent);
			//StudentInfo s = studentObj.get(d);
			
			Enrollments e = new Enrollments(cof);
			String stmt = "INSERT INTO "+ "Enrollments" +" VALUES("+
							e.getStudUIN()+","+
							e.getDeptCode()+","+
							e.getCourseCode()+","+
							e.getSection()+","+
							e.getSemester()+","+
							e.getYear()+","+
							e.getGrade()+");";
							
			String newEnroll = e.getStudUIN()+e.getDeptCode()+e.getCourseCode()+e.getSection()+
								e.getSemester()+e.getYear();
			if (courseList.contains(newEnroll)) {
				// System.out.println("PRESENT");
				continue;
			}
			courseEnrollmentInsert.add(stmt);
			courseEnrollmentList.add(newEnroll);
			i++;			
		}
		courseEnrollmentInsert.add("COMMIT;");
		for (i=0; i<=noOfEnrollement; i++)
			System.out.println(courseEnrollmentInsert.get(i));
	}

}
