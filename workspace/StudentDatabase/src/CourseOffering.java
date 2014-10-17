import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;


public class CourseOffering {
	
	String deptCode;
	Integer courseCode;
	Integer section;
	String semester;
	Integer year;
	String location;
	Integer TA_UIN;
	Integer prof_UIN;
	
	String sem[] = {"Summer", "Fall", "Spring"};
	
	public CourseOffering(Course c) {
		this.setDeptCode(c.getDeptCode());
		this.setCourseCode(c.getCourseCode());
		this.setSection(c.getSection());
		Random ran = new Random();
		int x = ran.nextInt(2);
		this.setSemester(sem[x]);
		x = ran.nextInt(2014 - 1900) + 1900;
		this.setYear(x);
		RandomStringUtils rs = new RandomStringUtils();
		this.setLocation(rs.randomAlphanumeric(20));
		
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public Integer getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Integer courseCode) {
		this.courseCode = courseCode;
	}

	public Integer getSection() {
		return section;
	}

	public void setSection(Integer section) {
		this.section = section;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getTA_UIN() {
		return TA_UIN;
	}

	public void setTA_UIN(Integer tA_UIN) {
		TA_UIN = tA_UIN;
	}

	public Integer getProf_UIN() {
		return prof_UIN;
	}

	public void setProf_UIN(Integer prof_UIN) {
		this.prof_UIN = prof_UIN;
	}
	
}
