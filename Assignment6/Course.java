package homework6;

public class Course {
	
	private String name;
	private String desc;
	private String dept;
	private String startTime;
	private String dayOfTheWeek;
	
	Course(){
		this.name = "none";
		this.desc = "none";
		this.dept = "none";
		this.startTime = "none";
		this.dayOfTheWeek = "none";
	}
	
	Course(String name, String description, String department, String startTime, String weekday){
		this.name = name;
		this.desc = description;
		this.dept = department;
		this.startTime = startTime;
		this.dayOfTheWeek = weekday;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String desc) {
		this.desc = desc;
	}
	
	public void setDepartment(String dept) {
		this.dept = dept;
	}
	
	public void setStartTime(String start) {
		this.startTime = start;
	}
	
	public void setDayOfTheWeek(String day) {
		this.dayOfTheWeek = day;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.desc;
	}
	
	public String getDepartment() {
		return this.dept;
	}
	
	public String getStartTime() {
		return this.startTime;
	}
	
	public String getDayOfTheWeek() {
		return this.dayOfTheWeek;
	}
	
	public String toString() {
		return this.name + ", " + this.desc + ", " + this.dept + ", " + this.startTime + ", " + this.dayOfTheWeek + "\n";
	}
}
