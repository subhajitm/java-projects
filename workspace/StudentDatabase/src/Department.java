import org.apache.commons.lang3.RandomStringUtils;

public class Department {

	String deptCode;
    String name;
    Integer hod;
    String address;
    String state;
    String city;
    Integer zip;
    
    public void Department() {
    	
    	
    }
    
	public static void main(String[] args) {
		
		RandomStringUtils rs = new RandomStringUtils();

        for(int i=0; i<5; i++) {
            System.out.println(rs.randomAlphabetic(5));
        }
        
        Department dept = new Department();
        dept.deptCode = "CSCE";
        dept.name = "Computer Science and Engineering";
        dept.hod = 20000000;
        dept.address = "HRBB TAMU";
        dept.state = "Texas";
        dept.city = "College station";
        dept.zip = 77840;
        
        System.out.println(dept.toString());
	}

}
