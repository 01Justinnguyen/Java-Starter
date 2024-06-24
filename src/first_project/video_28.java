package first_project;

import OOP.Student;

public class video_28 {
	public static void main(String[] args) {
		System.out.println("Video 28");
		Student std = new Student("Phúc", 22);

		System.out.println("Object is " + std.getName());
		std.setName("Phuc dep trai qua");
		System.out.println("Object is " + std.getName());
	}
}
