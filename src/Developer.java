
public class Developer {
	String name;
	ProgrammingLanguage language;
	double salary;
	int experience;
	
	Developer(String name) {
		this.name = name;
	}
	
	void writeCode() {
		System.out.println("Developer " + name + " writes code  on " + language.toString());
	}
	void increaseSalary(double increase) {
		salary += increase;
	}
	void changeLanguage(ProgrammingLanguage language) {
		this.language = language;
	}
	void increaseExperience() {
		experience++;
	}
	
	@Override
	public String toString() {
		return "Developer [name=" + name + ", language=" + language + ", salary=" + salary + ", experience="
				+ experience + "]";
	}
	 
}
