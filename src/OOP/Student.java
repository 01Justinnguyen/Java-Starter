package OOP;

public class Student {
	public String name;
	public int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void learnJava() {
		System.out.println("Learn Java with me");
	}

	int getAge() {
		return this.age;
	}
}
