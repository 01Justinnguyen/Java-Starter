package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Video40 {
	public static void main(String[] args) {
		System.out.println("Video 40.2");
		Pattern pattern = Pattern.compile("\\d{12}");
		Matcher matcher = pattern.matcher("123456789012a");

		System.out.println("Input string matches regex - " + matcher.matches());
	}
}
