import java.util.*;
import java.lang.*;
import java.io.*;

public class Tricky {
	public static void main(String[] args) throws Exception {
		fromJavaLang();

		String text = "T";
		String[] texts = text.split("\\.\\.\\.");
		for(int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
	}

	public static void fromTestCase() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("/home/barry/Data/dev/Java/OOP/Exercises/Week10/testcase.txt"));
		String currentLine;
		BufferedWriter writer = new BufferedWriter(new FileWriter("/home/barry/Data/dev/Java/OOP/Exercises/Week10/full.txt"));
		String all = "";
		while((currentLine = reader.readLine()) != null) {
			
			String[] method = currentLine.split(", ");
			for(int i = 0; i < method.length; i++) {
				all += "listMethod.add(\"" + method[i] + "\");\n";
			}

			all += "\n";
		}
		// System.out.println(all);
		writer.write(all);
		writer.close();
	}

	public static void fromJavaLang() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("/home/barry/Data/dev/Java/OOP/Exercises/Week10/javalang.txt"));
		String currentLine;
		BufferedWriter writer = new BufferedWriter(new FileWriter("/home/barry/Data/dev/Java/OOP/Exercises/Week10/fulljavalang.txt"));
		String all = "";
		while((currentLine = reader.readLine()) != null) {
			all += "listJavaLang.add(\"" + currentLine + "\");\n";
		}
		// System.out.println(all);
		writer.write(all);
		writer.close();
	}
}