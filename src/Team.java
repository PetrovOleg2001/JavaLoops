import java.util.*;

public class Team {

	public static void main(String[] args) {
		
		List<Developer> developers = new ArrayList<Developer>();
		
		Developer Andrew = new Developer("Andrew");
		Andrew.language = ProgrammingLanguage.JavaScript;
		Andrew.salary = 15000;
		Andrew.experience = 5;
		
		developers.add(Andrew);
			
		Developer Alexander = new Developer("Alexander");
		Alexander.language = ProgrammingLanguage.Python;
		Alexander.salary = 11000;
		Alexander.experience = 3;
		
		developers.add(Alexander);
		
		Developer Oleg = new Developer("Oleg");
		Oleg.language = ProgrammingLanguage.Java;
		Oleg.salary = 17000;
		Oleg.experience = 7;
		
		developers.add(Oleg);

		Developer Maxim = new Developer("Maxim");
		Maxim.language = ProgrammingLanguage.CSharp;
		Maxim.salary = 14000;
		Maxim.experience = 4;
		
		developers.add(Maxim);

		Scanner in = new Scanner(System.in);
		System.out.println("Все разработчики в команде: (при помощи цикла foreach)");
		for (Developer developer : developers)
			System.out.println(developer);
		System.out.println();

		System.out.print("Введите имя разработчика: ");
		String name = in.nextLine();
		System.out.println("Все разработчики с именем " + name +  ":  (при помощи цикла for)");
		
		for (int i = 0; i < developers.size(); i++)
			if (developers.get(i).name.equals(name))
				System.out.println(developers.get(i));
		System.out.println();
		System.out.print("Введите максимальную зарплату разработчика: ");
		double salary = in.nextDouble();
		System.out.println("Все разработчики с зарплатой меньше " + salary +  ":  (при помощи цикла while)");
		
		int i = 0;
		while (i < developers.size()) {
			if (developers.get(i).salary < salary)
				System.out.println(developers.get(i));
			i++;
		}
		System.out.println();

		System.out.print("Введите опыт разработчика:");
		double experience = in.nextDouble();
		System.out.println("Все разработчики с опытом больше " + experience +  ":  (при помощи цикла do while)");
		
		i = 0;
		do {
			try {
				if (developers.get(i).experience > experience) 
					System.out.println(developers.get(i));
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("В команде нет разработчиков");
			}
			i++;
		} while(i < developers.size());
		
		in.close();
			
	}

}
