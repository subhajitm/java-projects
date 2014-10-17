import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


public class Course {

	Integer courseCode;
	String deptCode;
	String title;
	Integer section;
	float credits;
	String description;
	
	public Course(String dept) {
		RandomStringUtils rs = new RandomStringUtils();
		setDeptCode(dept);
		Random ran = new Random();
		int x = ran.nextInt(999-100) + 100;
		setCourseCode(x);
		setTitle(rs.randomAlphabetic(20));
		setSection(Integer.parseInt(rs.randomNumeric(1)));
		x = ran.nextInt(4) + 1;
		setCredits((float)x);
		setDescription(rs.randomAlphabetic(30));		
	}

	public Integer getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Integer courseCode) {
		this.courseCode = courseCode;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getSection() {
		return section;
	}

	public void setSection(Integer section) {
		this.section = section;
	}

	public Float getCredits() {
		return credits;
	}

	public void setCredits(Float credits) {
		this.credits = credits;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
