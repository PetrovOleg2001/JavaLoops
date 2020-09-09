
public class Team {

	public static void main(String[] args) {
		Developer Andrew = new Developer("Andrew");
		Andrew.language = ProgrammingLanguage.JavaScript;
		Andrew.salary = 15000;
		Andrew.experience = 5;
		
		System.out.println(Andrew);
		
		Developer Alexander = new Developer("Alexander");
		Alexander.language = ProgrammingLanguage.Python;
		Alexander.salary = 11000;
		Alexander.experience = 3;
		
		System.out.println(Alexander);
		
		Andrew.increaseExperience();
		Andrew.increaseSalary(2000);
		
		System.out.println(Andrew);
		
		Alexander.changeLanguage(ProgrammingLanguage.Java);
		Alexander.increaseSalary(1500);
		
		System.out.println(Alexander);
		
	}

}
