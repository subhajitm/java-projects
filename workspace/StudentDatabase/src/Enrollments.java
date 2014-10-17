import java.util.Random;


public class Enrollments {
	Integer studUIN;
	String deptCode;
	Integer courseCode;
	Integer section;
	String semester;
	Integer year;
	char grade;
	
	char gradeP[] = {'A','B','C','D','F'};
	
	public Enrollments(CourseOffering cof) {
		this.setCourseCode(cof.getCourseCode());
		this.setDeptCode(cof.getDeptCode());
		this.setSection(cof.getSection());
		this.setSemester(cof.getSemester());
		this.setYear(cof.getYear());
		Random r = new Random();
		int x = r.nextInt(5);
		this.setGrade(gradeP[x]);
		
	}

	public Integer getStudUIN() {
		return studUIN;
	}

	public void setStudUIN(Integer studUIN) {
		this.studUIN = studUIN;
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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
