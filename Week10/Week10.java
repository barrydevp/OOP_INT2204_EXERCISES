import java.util.*;
import java.lang.*;
import java.io.*;

public class Week10 {
	// static HashMap<String, String> listDefaultImport;
	static HashMap<String, String> listPackage;
	static HashMap<String, String> listImport;
	static List<String> listMethod;
	static ArrayList<String> listPrimative;
	
	// public static void initDefaultImport() throws Exception {
	// 	// System.out.println(Week10.class.getResource("javalang.txt"));
	// 	listDefaultImport = new HashMap<String, String>();
	// 	BufferedReader reader = new BufferedReader(new FileReader("/home/barry/Data/dev/Java/OOP/Exercises/Week10/javalang.txt"));
	// 	String currentLine;
	// 	while((currentLine = reader.readLine()) != null) {
	// 		listDefaultImport.put(currentLine, "java.lang." + currentLine);
	// 	}
		
	// 	// System.out.println(listDefaultImport);
	// }
	
	
	public static void main(String[] args) throws Exception {
		// String file = Week10.class.getResource("ArrayUtils.java").toString();
		// System.out.println(file);
		// initDefaultImport();
		// // System.out.println()
		// // BufferedReader reader = new BufferedReader(new FileReader("OSinfo.java"));
		// getSourceFromFile("/home/barry/Data/dev/Java/OOP/Exercises/Week10/ArrayUtils.java");
		// System.out.println(listPackage);
		// System.out.println();
		// System.out.println();
		// // System.out.println(listImport);
		// // System.out.println();
		// // System.out.println();
		// System.out.println(listMethod);
		// System.out.println(currentLine);

		List<String> allFunction = getAllFunctions("/home/barry/Data/dev/Java/OOP/Exercises/Week10/ArrayUtils.java");
		System.out.println(allFunction);
		
	}
	
	public static List<String> getAllFunctions(String fileContent) throws Exception {
		if(listPrimative == null) {
			listPrimative = new ArrayList<String>();
			listPrimative.add("byte");
			listPrimative.add("short");
			listPrimative.add("int");
			listPrimative.add("long");
			listPrimative.add("float");
			listPrimative.add("double");
			listPrimative.add("boolean");
			listPrimative.add("char");
			listPrimative.add("T");
			listPrimative.add("V");
			listPrimative.add("T...");
			listPrimative.add("V...");
		}

		getSourceFromFile(fileContent);

		return listMethod;
	}
	
	public static void getSourceFromFile(String fileName) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String currentLine;
		listPackage = new HashMap<String, String>();
		listImport = new HashMap<String, String>();
		listMethod = new ArrayList<String>();

		boolean isComment = false;

		while((currentLine = reader.readLine()) != null) {
			String tmp = currentLine.trim();
			
			if(currentLine.contains("/*")) isComment = true;
			if(!isComment){
				if(!currentLine.contains("//")){
					if(currentLine.contains("package")){
						String[] tmps = tmp.split(" ");
						
						String lib = tmps[tmps.length - 1];
						lib = lib.substring(0, lib.length() - 1);
						tmps = lib.split("\\.");
						String className = tmps[tmps.length - 1];
						
						listPackage.put(className, lib);
					}
					else if(currentLine.contains("import")){
							String[] tmps = tmp.split(" ");
							String lib = tmps[tmps.length - 1];
							lib = lib.substring(0, lib.length() - 1);
							tmps = lib.split("\\.");
							String className = tmps[tmps.length - 1];
							listImport.put(className, lib);
						}
						else if(currentLine.contains("static") && !currentLine.matches(".*[=;].*")) listMethod.add(tmp);
				}
			} else {
				if(currentLine.contains("*/")) isComment = false;
			}

			
		}
		
		// System.out.println(listMethod);
		
		for(int i = 0; i < listMethod.size(); ++i) {
			Structure tmp = new Structure(listMethod.get(i));

			listMethod.set(i, tmp.toString());
		}
	}

	// public static String getMethodDeclare(String method) {
	// 	// System.out.println(method);
	// 	String[] str = method.split(" ");
	// 	boolean isWrite = false;
	// 	String declare = new String("");
	// 	// System.out.println(str);
	// 	for(int i = 0; i < str.length; ++i) {
	// 		// if(str[i].matches(".*\\(.*\\).*")) return str[i];
	// 		// if(isWrite) declare += str[i];
	// 		// else
	// 			// if(str[i].matches(".*\\(.*")) {
	// 				// declare = str[i];
	// 				// isWrite = true;
	// 			// } else if(str[i].matches("\\).*")) {
	// 				// isWrite = false;
	// 			// }
			
	// 		// System.out.println(str[i]);
			
	// 		if(str[i].matches(".*\\(\\).*")) {
	// 			declare = str[i];
	// 			break;
	// 		}
			
	// 		if(str[i].matches(".*\\(.*")) {
	// 			isWrite = true;
	// 			int indexArg = str[i].indexOf("(") + 1;
	// 			String methodName = str[i].substring(0, indexArg);
	// 			String argument = str[i].substring(indexArg);
	// 			// if(listDefaultImport.containsKey(argument)) {
	// 				// argument = listDefaultImport.get(argument);
	// 			// } else if(listPackage.containsKey(argument)) {
	// 					// argument = listPackage.get(argument);
	// 				// } else if(listImport.containsKey(argument)) {
	// 					// argument = listImport.get(argument);
	// 				// }
	// 			declare = methodName + tranformAgrument(argument);
	// 		} else 
	// 			if(str[i].matches(".*\\).*")) {
					
	// 				// declare += str[i];
	// 				declare += ")";
	// 				isWrite = false;
	// 				break;
	// 			} else
	// 				if(isWrite && str[i].indexOf(",") == -1){
	// 					// int indexArg = str[i].indexOf(",") + 1;
	// 					// String argument = str[i].substring(indexArg);
	// 					String argument = str[i];
	// 					// if(listDefaultImport.containsKey(argument)) {
	// 						// argument = listDefaultImport.get(argument);
	// 					// } else if(listPackage.containsKey(argument)) {
	// 							// argument = listPackage.get(argument);
	// 						// } else if(listImport.containsKey(argument)) {
	// 							// argument = listImport.get(argument);
	// 						// }
					
	// 					declare += "," + tranformAgrument(argument);
	// 				}
			
	// 	}
		
	// 	// if(declare != null) {
	// 		// int index = declare.indexOf('{');
	// 		// if(index != -1) declare = declare.substring(0, index);
	// 	// }
		
	// 	// System.out.println(declare);
		
	// 	return declare;
	// }
	
	// public static String tranformAgrument(String argument) {
	// 	System.out.println(argument);
	// 	int indexOfOpenBracket = argument.indexOf("<");
	// 	String subArgument = null;
	// 	if(indexOfOpenBracket != -1) {
	// 		int indexOfCloseBracket = argument.indexOf(">");
	// 		// System.out.println(indexOfCloseBracket);
	// 		subArgument = tranformAgrument(argument.substring(indexOfOpenBracket + 1, indexOfCloseBracket));
	// 		argument = argument.substring(0, indexOfOpenBracket);
	// 	}
		
	// 	if(listDefaultImport.containsKey(argument)) {
	// 		argument = listDefaultImport.get(argument);
	// 	} else 
	// 		if(listPackage.containsKey(argument)) {
	// 			argument = listPackage.get(argument);
	// 		} else 
	// 			if(listImport.containsKey(argument)) {
	// 				argument = listImport.get(argument);
	// 			}
				
	// 	if(subArgument == null) return argument;
		
	// 	return argument + "<" + subArgument + ">";
	// }

	static class Structure {
		// private String accesModifier;
		private String name;
		private ArrayList<String> argumentTypes;

		Structure() {
			// accesModifier = "public";
			name = "test";
			argumentTypes = null;
		}

		Structure(String rawMethodString) {
			// get method name
			int indexOfOpenParenthesi = rawMethodString.indexOf("(");

			boolean startReadMethodName = false;
			name = "";
			for(int i = indexOfOpenParenthesi - 1; i >= 0; i--) {
				if(rawMethodString.charAt(i) == ' '){
					if(startReadMethodName) break;
				} else {
					name = rawMethodString.charAt(i) + name;
					startReadMethodName = true;
				}
			}

			// get list arguments
			argumentTypes = null;

			int indexOfCloseParenthesi = rawMethodString.indexOf(")");
			if(indexOfCloseParenthesi + 1 != indexOfOpenParenthesi){
				argumentTypes = new ArrayList<String>();
				String[] rawArguments = rawMethodString.substring(indexOfOpenParenthesi + 1, indexOfCloseParenthesi + 1).split("(\\s\\w+\\,\\s)|(\\s\\w+\\))");
				// System.out.println("rawArguments: ");

				for(int i = 0; i < rawArguments.length; ++i) {
					String rawType = rawArguments[i];
					// System.out.println(rawType);
					if(rawType.contains(",")) {
						rawType = rawType.substring(rawType.indexOf(",") + 1);
					}

					argumentTypes.add(standardizeType(rawType));
				}
			}
		}

		public String toString() {
			String result = name + "(";

			if(argumentTypes != null && argumentTypes.size() > 0) {
				result += argumentTypes.get(0);
				for(int i = 1; i < argumentTypes.size(); i++) {
					result += "," + argumentTypes.get(i);
				}
			}

			result += ")";
			return result;
		}

		public static String standardizeType(String raw) {
			// System.out.println(raw);
			// if contain []
			String finallyType = raw;
			boolean isContainSquareBrackets = raw.indexOf("[") != -1;

			int indexOfOpenBracket = raw.indexOf("<");
			String subType = null;
			String mainType = raw;
			if(isContainSquareBrackets)
				mainType = raw.substring(0, raw.indexOf("["));

			if(indexOfOpenBracket != -1) {
				int indexOfCloseBracket = raw.indexOf(">");
				subType = standardizeType(
							raw.substring(indexOfOpenBracket + 1, indexOfCloseBracket)
						);
				mainType = raw.substring(0, indexOfOpenBracket);		
			}
			
			// if(Week10.listDefaultImport.containsKey(mainType)) {
			// 	mainType = listDefaultImport.get(mainType);
			// } else 
				if(Week10.listPackage.containsKey(mainType)) {
					mainType = listPackage.get(mainType);
				} else 
					if(Week10.listImport.containsKey(mainType)) {
						mainType = listImport.get(mainType);
					} else if(!Week10.listPrimative.contains(mainType)) mainType = "java.lang." + mainType;

			if(subType != null) finallyType = mainType + "<" + subType + ">";
			else finallyType = mainType;
			if(isContainSquareBrackets) finallyType += "[]"; 
			return finallyType;
		}		

	}		
}