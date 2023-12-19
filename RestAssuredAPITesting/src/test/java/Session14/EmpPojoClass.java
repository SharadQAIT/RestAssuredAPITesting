package Session14;

import java.util.Map;

public class EmpPojoClass {
		
		/*{
	"firstname":"Amod",
	"lastname":"Mahajan",
	"age":28,
	"salary":10000.56,
	"Hobbies":["Music","Computer", "Games"],
	"degrees":["BCA","MCA"],
	"FamilyMembers":{
			"1":"Mother",
			"2": "Father"
			},
	"married" : true
		}*/
	private String firstname;
	private String lastname;
	private String age;
	private double salary;
	private String[] Hobbies;
	private String[] degress;	
	private Map <String,String>familymembers;
	private boolean married;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String[] getHobbies() 
	 { return Hobbies; 
	 } 
	 public void setHobbies(String[] hobbies)
	 { Hobbies = hobbies; 
	 }
	 
	public String[] getDegress() {
		return degress;
	}
	public void setDegress(String[] degress) {
		this.degress = degress;
	}
	public Map<String, String> getFamilymembers() {
		return familymembers;
	}
	public void setFamilymembers(Map<String, String> familymembers) {
		this.familymembers = familymembers;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}

}

