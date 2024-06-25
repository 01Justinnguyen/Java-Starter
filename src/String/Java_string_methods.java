package String;

public class Java_string_methods {
	public static void main(String[] args) {
		// Các phương thức string trong java
//		1. charAt(): trả về ký tự tại chỉ mục đã chỉ định

//		String str = "Hello, World!";
//		char ch1 = str.charAt(0); // phải truyền ký tự vào
//		System.out.println("Ký tự tại vị trí 0: " + ch1); // Kết quả: 'H'

//		2. compareTo(): So sánh hai chuỗi theo từ điển
		// => trả về số âm, số 0 nếu bằng nhau và số dương

//		String str1 = "apple";
//		String str2 = "banana";
//		String str4 = "Apple";

		// So sánh str1 với str2
//		int result1 = str1.compareTo(str2);
//		System.out.println("So sánh 'apple' với 'banana': " + result1);
		// Kết quả: một số âm vì 'apple' nhỏ hơn 'banana'

		// So sánh str1 với str4
//		int result3 = str1.compareTo(str4);
//		System.out.println("So sánh 'apple' với 'Apple': " + result3);
		// Kết quả: một số dương vì 'a' lớn hơn 'A' theo bảng mã ASCII

//		3. compareToIgnoreCase(): So sánh hai chuỗi bỏ qua chữ thường, chữ hoa
		// => trả về số âm, số 0 nếu bằng nhau và số dương
//		String myStr1 = "Hello";
//		String myStr2 = "hello";
//
//		System.out.println("So sánh 'myStr1' với 'myStr2': " + myStr1.compareToIgnoreCase(myStr2));

//		4. equals(): So sánh 2 chuỗi
		// => trả về true nếu 2 chuỗi bằng nhau, false nếu không bằng nhau

//		String myStr1 = "Hello";
//		String myStr2 = "Hello";
//		String myStr3 = "Another String";
//		System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
//		System.out.println(myStr1.equals(myStr3)); // false

//		5. equalsIgnoreCase(): So sánh hai chuỗi bỏ qua chữ thường, chữ hoa
		// => trả về true hoặc false

//		String myStr1 = "Hello";
//		String myStr2 = "HELLO";
//		String myStr3 = "Another String";
//		System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
//		System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false

//		6. concat(): Nối chuỗi

//		String firstName = "John ";
//		String lastName = "Doe";
//		System.out.println(firstName.concat(lastName)); // => John Doe

//		7. contains(): Kiểm tra xem một chuỗi có chứa một chuỗi ký tự hay không
		// => trả về true hoặc false

//		String myStr = "Hello";
//		System.out.println(myStr.contains("Hel")); // true
//		System.out.println(myStr.contains("e")); // true
//		System.out.println(myStr.contains("Hi")); // false

//		8. copyValueOf(): Tạo một chuỗi mới từ một mảng ký tự
//		có 2 dạng
//		+ copyValueOf(char[] data)
//		+ copyValueOf(char[] data, int offset, int count)

//		char[] charArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
//
//		// Sử dụng copyValueOf(char[] data) để tạo chuỗi từ toàn bộ mảng
//		String fullString = String.copyValueOf(charArray);
//		System.out.println("Chuỗi từ toàn bộ mảng ký tự: " + fullString);
//		// Kết quả: "Hello World"
//
//		// Sử dụng copyValueOf(char[] data, int offset, int count) để tạo chuỗi từ một
//		// phần của mảng
//		String partString = String.copyValueOf(charArray, 6, 5);
//		System.out.println("Chuỗi từ một phần của mảng ký tự: " + partString);
//		// Kết quả: "World"

//		9. endsWith(): Kiểm tra xem một chuỗi có kết thúc bằng (các) ký tự được chỉ định hay không
		// => trả về true hoặc false

//		String myStr = "Hello";
//		System.out.println(myStr.endsWith("Hel")); // false
//		System.out.println(myStr.endsWith("llo")); // true
//		System.out.println(myStr.endsWith("o")); // true

//		10. format(): được sử dụng để tạo một chuỗi đã được định dạng dựa trên 
//		một chuỗi mẫu và các tham số được cung cấp. 
//		Phương thức này rất hữu ích khi bạn cần định dạng dữ liệu 
//		một cách chính xác và nhất quán, 
//		tương tự như cách hoạt động của printf() trong C.

//		String myStr = "Hello %s! One kilobyte is %,d bytes.";
//		String result = String.format(myStr, "World", 1024);
//		System.out.println(result); // Hello World! One kilobyte is 1,024 bytes.

//		11. getChars(): Sao chép các ký tự từ một chuỗi sang một mảng ký tự
//		có dạng
//		+ getChars(int start, int end, char[] destination, int position)

//		char[] myArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
//		System.out.println(myArray); // 0123456789
//
//		String myStr = "Hello, World!";
//		myStr.getChars(7, 12, myArray, 4);
//		System.out.println(myArray); // 0123World9

//		12. indexOf(): Trả về vị trí xuất hiện đầu tiên của các 
//		ký tự được chỉ định trong chuỗi nếu không trả về -1
//		Có 4 dạng
//		+ indexOf(String str)
//		+ indexOf(String str, int fromIndex)
//		+ indexOf(int char)
//		+ indexOf(int char, int fromIndex)

//		String myStr = "Hello planet earth, you are a great planet.";
//		System.out.println(myStr.indexOf("planet"));
//		
//		13. lastIndexOf(): Trả về vị trí xuất hiện cuối cùng được 
//		tìm thấy của các ký tự được chỉ định trong chuỗi nếu không trả về -1

//		String myStr = "Hello planet earth, you are a great planet.";
//		System.out.println(myStr.lastIndexOf("planet"));

//		14. isEmpty(): kiểm tra xem 1 chuỗi có rỗng hay không
		// trả về boolean

//		String myStr1 = "Hello";
//		String myStr2 = "";
//		System.out.println(myStr1.isEmpty()); // false
//		System.out.println(myStr2.isEmpty()); // true

//		15. join(): Nối một hoặc nhiều chuỗi bằng dấu phân cách được chỉ định

//		String fruits = String.join("-", "Orange", "Apple", "Mango");
//		System.out.println(fruits); // Orange-Apple-Mango

//		16. length(): Trả về độ dài của một chuỗi được chỉ định

//		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		System.out.println(txt.length()); // 26

//		17. matches(): Tìm kiếm một chuỗi so khớp với biểu thức chính quy và trả về kết quả khớp
		// trả về boolean

//		String regex = "cat|dog|fish";
//
//		System.out.println("cat".matches(regex)); // true
//		System.out.println("dog".matches(regex)); // true
//		System.out.println("catfish".matches(regex)); // false
//		System.out.println("doggy bag".matches(regex)); // false

//		18. replace(): Thay thế tất cả chuỗi được chỉ định
//		có dạng
//		+ replace(char searchChar, char newChar)

//		String myStr = "Hello";
//		System.out.println(myStr.replace('l', 'p'));

//		19. replaceAll(): Thay thế từng chuỗi con của chuỗi này khớp với 
//		biểu thức chính quy đã cho bằng chuỗi thay thế đã cho

//		String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
//		String regex = "(?i)cat";
//		System.out.println(myStr.replaceAll(regex, "dog"));
		// I love dogs. dogs are very easy to love. dogs are very popular.

//		20. replaceFirst(): Thay thế lần xuất hiện đầu tiên của chuỗi con khớp với 
//		biểu thức chính quy đã cho bằng chuỗi thay thế đã cho

//		String myStr = "This is W3Schools";
//		String regex = "is";
//		System.out.println(myStr.replaceFirst(regex, "at")); // That is W3Schools

//		21. split(): Tách một chuỗi thành một mảng các chuỗi con
//		Có 2 dạng
//		+ split(String regex, int limit(optional)) Limit: The maximum length of the returned array.
//		+ split(String regex)
//		String myStr = "Split a string by spaces and also punctuation.";
//		String[] myArray = myStr.split(" ");
//		System.out.println(Arrays.toString(myArray));

//		22. startsWith(): Kiểm tra xem một chuỗi có bắt đầu bằng các ký tự được chỉ định hay không
		// => trả về boolean

//		String myStr = "Hello";
//		System.out.println(myStr.startsWith("Hel")); // true
//		System.out.println(myStr.startsWith("llo")); // false
//		System.out.println(myStr.startsWith("o")); // false

//		23. substring(): Trả về một chuỗi mới là chuỗi con của một chuỗi đã chỉ định

//		String myStr = "Hello, World!";
//		System.out.println(myStr.substring(7, 12)); // World

//		24. toCharArray(): Chuyển đổi chuỗi này thành một mảng ký tự mới

//		String myStr = "Hello";
//		char[] myArray = myStr.toCharArray();
//		System.out.println(myArray[0]); // H

	}
}
