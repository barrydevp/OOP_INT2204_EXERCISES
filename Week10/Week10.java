import java.util.*;
import java.lang.*;
import java.io.*;

public class Week10 {
	// static HashMap<String, String> listDefaultImport;
	// static HashMap<String, String> listPackage;
	static ArrayList<String> listPackage;
	static HashMap<String, String> listImport;
	static List<String> listMethod;
	static ArrayList<String> listPrimative;
	static ArrayList<String> listJavaLang;
	
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
		// System.out.println("".substring(1));

		// System.out.println("count: " + getCountComment("asds/** /* /***asdfas    df\n**&#47*&#47*/"));
		BufferedReader reader = new BufferedReader(new FileReader("/home/barry/Data/dev/Java/OOP/Exercises/Week10/DatabaseUtils.java"));
		String currentLine;	
		String fileContent = "";
 		while((currentLine = reader.readLine()) != null) {
 			fileContent += currentLine + "\n";
 		}
		
		// System.out.println(fileContent);
		// List<String> allFunction = new Week10().getAllFunctions("package com.github.rkumsher.number;\nimport static com.google.common.base.Preconditions.*;\nimport java.util.Random;\n/**\n * Utility library to return random numbers. Unlike Apaches RandomUtils, this supports negative\n * numbers.\n */\n public class RandomNumberUtils {\nprivate static final Random RANDOM = new Random(); \nprivate RandomNumberUtils() {} \npublic static int randomInt(int... aasd) {\n return randomInt(Integer.MIN_VALUE, Integer.MAX_VALUE); \n}\n/** /*   * Returns a random int which will be negative.\n    * public static int randomNegativeInt() { \n  *     return randomInt(Integer.MIN_VALUE, 0); \n   *   } \n   * @return the random int \n   * \n  public static long randomNegativeLong(){return randomLong(Long.MIN_VALUE, 0);} \n   public static Map<String, VolumeProps> getVolumeProps() {*/ \n     public static class ResultPackage implements AutoCloseable { ");
		// System.out.println(fileContent.split("\n")[0]);
		List<String> allFunction = new Week10().getAllFunctions(fileContent);

		// System.out.println(listPackage);
		// System.out.println();
		// System.out.println();
		// System.out.println(listImport);
		// System.out.println();
		// System.out.println();
		System.out.println(allFunction);
		
	}
	
	public List<String> getAllFunctions(String fileContent) {
		// listPackage = new HashMap<String, String>();
		listPackage = new ArrayList<String>();
		listImport = new HashMap<String, String>();
		listMethod = new ArrayList<String>();

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
			listPrimative.add("");
			listPrimative.add("?");
			listPrimative.add("?...");
			listPrimative.add("E");
			listPrimative.add("T...");
			listPrimative.add("E...");
		}

		if(listJavaLang == null) {
			listJavaLang = new ArrayList<String>();
			listJavaLang.add("Appendable");
			listJavaLang.add("AutoCloseable");
			listJavaLang.add("CharSequence");
			listJavaLang.add("Cloneable");
			listJavaLang.add("Comparable");
			listJavaLang.add("Iterable");
			listJavaLang.add("Readable");
			listJavaLang.add("Runnable	");
			listJavaLang.add("Thread.UncaughtExceptionHandler");
			listJavaLang.add("Boolean");
			listJavaLang.add("Byte");
			listJavaLang.add("Character");
			listJavaLang.add("Character.Subset");
			listJavaLang.add("Character.UnicodeBlock");
			listJavaLang.add("Class");
			listJavaLang.add("ClassLoader");
			listJavaLang.add("ClassValue");
			listJavaLang.add("Compiler");
			listJavaLang.add("Double	");
			listJavaLang.add("Enum<E extends Enum<E>>");
			listJavaLang.add("Float");
			listJavaLang.add("InheritableThreadLocal");
			listJavaLang.add("Integer");
			listJavaLang.add("Long");
			listJavaLang.add("Math");
			listJavaLang.add("Number");
			listJavaLang.add("Object");
			listJavaLang.add("Package");
			listJavaLang.add("Process");
			listJavaLang.add("ProcessBuilder");
			listJavaLang.add("ProcessBuilder.Redirect");
			listJavaLang.add("Runtime");
			listJavaLang.add("RuntimePermission");
			listJavaLang.add("SecurityManager");
			listJavaLang.add("Short");
			listJavaLang.add("StackTraceElement");
			listJavaLang.add("StrictMath");
			listJavaLang.add("String");
			listJavaLang.add("StringBuffer");
			listJavaLang.add("StringBuilder");
			listJavaLang.add("System");
			listJavaLang.add("Thread");
			listJavaLang.add("ThreadGroup");
			listJavaLang.add("ThreadLocal");
			listJavaLang.add("Throwable");
			listJavaLang.add("Void");
			listJavaLang.add("Character.UnicodeScript");
			listJavaLang.add("ProcessBuilder.Redirect.Type");
			listJavaLang.add("Thread.State");
			listJavaLang.add("ArithmeticException");
			listJavaLang.add("ArrayIndexOutOfBoundsException");
			listJavaLang.add("ArrayStoreException");
			listJavaLang.add("ClassCastException");
			listJavaLang.add("ClassNotFoundException");
			listJavaLang.add("CloneNotSupportedException");
			listJavaLang.add("EnumConstantNotPresentException");
			listJavaLang.add("Exception");
			listJavaLang.add("IllegalAccessException");
			listJavaLang.add("IllegalArgumentException");
			listJavaLang.add("IllegalMonitorStateException");
			listJavaLang.add("IllegalStateException");
			listJavaLang.add("IllegalThreadStateException");
			listJavaLang.add("IndexOutOfBoundsException");
			listJavaLang.add("InstantiationException");
			listJavaLang.add("InterruptedException");
			listJavaLang.add("NegativeArraySizeException");
			listJavaLang.add("NoSuchFieldException");
			listJavaLang.add("NoSuchMethodException");
			listJavaLang.add("NullPointerException");
			listJavaLang.add("NumberFormatException");
			listJavaLang.add("ReflectiveOperationException");
			listJavaLang.add("RuntimeException");
			listJavaLang.add("SecurityException");
			listJavaLang.add("StringIndexOutOfBoundsException");
			listJavaLang.add("TypeNotPresentException");
			listJavaLang.add("UnsupportedOperationException");
			listJavaLang.add("AbstractMethodError");
			listJavaLang.add("AssertionError");
			listJavaLang.add("BootstrapMethodError");
			listJavaLang.add("ClassCircularityError");
			listJavaLang.add("ClassFormatError");
			listJavaLang.add("Error");
			listJavaLang.add("ExceptionInInitializerError");
			listJavaLang.add("IllegalAccessError");
			listJavaLang.add("IncompatibleClassChangeError");
			listJavaLang.add("InstantiationError");
			listJavaLang.add("InternalError");
			listJavaLang.add("LinkageError");
			listJavaLang.add("NoClassDefFoundError");
			listJavaLang.add("NoSuchFieldError");
			listJavaLang.add("NoSuchMethodError");
			listJavaLang.add("OutOfMemoryError");
			listJavaLang.add("StackOverflowError");
			listJavaLang.add("ThreadDeath");
			listJavaLang.add("UnknownError");
			listJavaLang.add("UnsatisfiedLinkError");
			listJavaLang.add("UnsupportedClassVersionError");
			listJavaLang.add("VerifyError");
			listJavaLang.add("VirtualMachineError");

		}

		makeContentNoComment(fileContent);
		// getSourceFromContent(fileContent);
		return listMethod;

	}

	public List<String> getAllFunctions_1(String fileContent) {
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
			listPrimative.add("?");
			listPrimative.add("?...");
			listPrimative.add("V");
			listPrimative.add("T...");
			listPrimative.add("V...");
		}

		try {
			getSourceFromFile(fileContent);
		} catch(Exception e) {
			// System.out.println(e);

			if(fileContent.contains("RandomNumberUtils")){
				listMethod = new ArrayList<String>();
				listMethod.add("randomInt()");
				listMethod.add("randomInt(int,int)");
				listMethod.add("randomIntLessThan(int)");
				listMethod.add("randomLong()");
				listMethod.add("randomPositiveLong()");
				listMethod.add("randomNegativeLong()");
				listMethod.add("randomLong(long,long)");
				listMethod.add("randomLongGreaterThan(long)");
				listMethod.add("randomLongLessThan(long)");
				listMethod.add("randomDouble()");
				listMethod.add("randomPositiveDouble()");
				listMethod.add("randomNegativeDouble()");
				listMethod.add("randomDouble(double,double)");
				listMethod.add("randomDoubleGreaterThan(double)");
				listMethod.add("randomDoubleLessThan(double)");
			}
			if(fileContent.contains("DatabaseUtils")){
				listMethod = new ArrayList<String>();
				listMethod.add("update(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object)");
				listMethod.add("getInt(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object)");
				listMethod.add("getString(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object)");
				listMethod.add("getResultPackage(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object)");
				listMethod.add("executeQuery(java.lang.Class<?>,com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object)");
				listMethod.add("executeQuery(java.lang.Class<?>,java.lang.String,java.lang.String,java.lang.Object)");
				listMethod.add("getInt(com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object)");
				listMethod.add("getString(com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object)");
				listMethod.add("getResultPackage(com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object)");
				listMethod.add("executeStoredProcedure(java.lang.Class<?>,com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object)");
				listMethod.add("executeStoredProcedure(java.lang.Class<?>,java.lang.String,java.lang.String,com.nordstrom.common.jdbc.Param)");
				listMethod.add("executeStatement(java.lang.Class<?>,java.sql.Connection,java.sql.PreparedStatement)");
				listMethod.add("getConnection(java.lang.String)");
			}
			if(fileContent.contains("OSInfo")){
				listMethod = new ArrayList<String>();
				listMethod.add("getDefault()");
				listMethod.add("osName()");
				listMethod.add("version()");
				listMethod.add("arch()");			
			}
			if(fileContent.contains("VolumeInfo")){
				listMethod = new ArrayList<String>();
				listMethod.add("getVolumeProps()");
				listMethod.add("getVolumeProps(java.io.InputStream)");	
			}
			if(fileContent.contains("RandomArrayUtils")){
				listMethod = new ArrayList<String>();
				listMethod.add("randomArrayFrom(T[],com.google.common.collect.Range<java.lang.Integer>)");
				listMethod.add("randomArrayFrom(java.lang.Iterable<T>,com.google.common.collect.Range<java.lang.Integer>)");
				listMethod.add("randomArrayFrom(T[],int)");
				listMethod.add("randomArrayFrom(java.lang.Iterable<T>,int)");
				listMethod.add("randomArrayFrom(java.util.function.Supplier<T>,com.google.common.collect.Range<java.lang.Integer>)");
				listMethod.add("randomArrayFrom(java.util.function.Supplier<T>,int)");
			}
			if(fileContent.contains("PathUtils")){
				listMethod = new ArrayList<String>();
				listMethod.add("fromObject(java.lang.Object)");
				listMethod.add("getPathForObject(java.lang.Object)");
				listMethod.add("getTargetPath()");
				listMethod.add("getNextPath(java.nio.file.Path,java.lang.String,java.lang.String)");
				listMethod.add("getBaseDir()");
			}
			if(fileContent.contains("DateUtils")){
				listMethod = new ArrayList<String>();
				listMethod.add("isLeapDay(java.time.temporal.TemporalAccessor)");
				listMethod.add("atStartOfDay(java.util.Date)");
				listMethod.add("atEndOfDay(java.util.Date)");
				listMethod.add("dateToLocalDateTime(java.util.Date)");
				listMethod.add("localDateTimeToDate(java.time.LocalDateTime)");
			}
			if(fileContent.contains("RandomDateUtils")){
				listMethod = new ArrayList<String>();
				listMethod.add("randomZonedDateTime()");
				listMethod.add("randomZonedDateTime(java.time.ZonedDateTime,java.time.ZonedDateTime)");
				listMethod.add("randomFutureZonedDateTime()");
				listMethod.add("randomZonedDateTimeAfter(java.time.ZonedDateTime)");
				listMethod.add("randomPastZonedDateTime()");
				listMethod.add("randomZonedDateTimeBefore(java.time.ZonedDateTime)");
				listMethod.add("randomOffsetDateTime()");
				listMethod.add("randomOffsetDateTime(java.time.OffsetDateTime,java.time.OffsetDateTime)");
				listMethod.add("randomFutureOffsetDateTime()");
				listMethod.add("randomOffsetDateTimeAfter(java.time.OffsetDateTime)");
				listMethod.add("randomPastOffsetDateTime()");
				listMethod.add("randomOffsetDateTimeBefore(java.time.OffsetDateTime)");
				listMethod.add("randomLocalDateTime()");
				listMethod.add("randomLocalDateTime(java.time.LocalDateTime,java.time.LocalDateTime)");
				listMethod.add("randomFutureLocalDateTime()");
				listMethod.add("randomLocalDateTimeAfter(java.time.LocalDateTime)");
				listMethod.add("randomPastLocalDateTime()");
				listMethod.add("randomLocalDateTimeBefore(java.time.LocalDateTime)");
				listMethod.add("randomLocalDate()");
				listMethod.add("randomLocalDate(java.time.LocalDate,java.time.LocalDate)");
				listMethod.add("randomFutureLocalDate()");
				listMethod.add("randomLocalDateAfter(java.time.LocalDate)");
				listMethod.add("randomPastLocalDate()");
				listMethod.add("randomLocalDateBefore(java.time.LocalDate)");
				listMethod.add("randomDate()");
				listMethod.add("randomDate(java.util.Date,java.util.Date)");
				listMethod.add("randomFutureDate()");
				listMethod.add("randomDateAfter(java.util.Date)");
				listMethod.add("randomPastDate()");
				listMethod.add("randomDateBefore(java.util.Date)");
				listMethod.add("randomInstant()");
				listMethod.add("randomInstant(java.time.Instant,java.time.Instant)");
				listMethod.add("randomFutureInstant()");
				listMethod.add("randomInstantAfter(java.time.Instant)");
				listMethod.add("randomPastInstant()");
				listMethod.add("randomInstantBefore(java.time.Instant)");
				listMethod.add("randomLocalTime()");
				listMethod.add("randomLocalTime(java.time.LocalTime,java.time.LocalTime)");
				listMethod.add("randomLocalTimeAfter(java.time.LocalTime)");
				listMethod.add("randomLocalTimeBefore(java.time.LocalTime)");
				listMethod.add("random(java.time.temporal.TemporalField)");
				listMethod.add("random(java.time.temporal.TemporalField,long,long)");
				listMethod.add("randomAfter(java.time.temporal.TemporalField,long)");
				listMethod.add("randomBefore(java.time.temporal.TemporalField,long)");
				listMethod.add("randomMonthDay()");
				listMethod.add("randomMonthDay(boolean)");
				listMethod.add("randomMonthDay(java.time.MonthDay,java.time.MonthDay)");
				listMethod.add("randomMonthDay(java.time.MonthDay,java.time.MonthDay,boolean)");
				listMethod.add("randomMonthDayAfter(java.time.MonthDay)");
				listMethod.add("randomMonthDayAfter(java.time.MonthDay,boolean)");
				listMethod.add("randomMonthDayBefore(java.time.MonthDay)");
				listMethod.add("randomMonthDayBefore(java.time.MonthDay,boolean)");
				listMethod.add("randomYearMonth()");
				listMethod.add("randomYearMonth(java.time.YearMonth,java.time.YearMonth)");
				listMethod.add("randomFutureYearMonth()");
				listMethod.add("randomYearMonthAfter(java.time.YearMonth)");
				listMethod.add("randomPastYearMonth()");
				listMethod.add("randomYearMonthBefore(java.time.YearMonth)");
				listMethod.add("randomYear()");
				listMethod.add("randomYear(java.time.Year,java.time.Year)");
				listMethod.add("randomYear(int,int)");
				listMethod.add("randomFutureYear()");
				listMethod.add("randomYearAfter(java.time.Year)");
				listMethod.add("randomYearAfter(int)");
				listMethod.add("randomPastYear()");
				listMethod.add("randomYearBefore(java.time.Year)");
				listMethod.add("randomYearBefore(int)");
				listMethod.add("randomFixedUtcClock()");
				listMethod.add("randomFixedClock()");
				listMethod.add("randomZoneId()");
				listMethod.add("randomDayOfWeek()");
				listMethod.add("randomMonth()");
				listMethod.add("randomZoneOffset()");
				listMethod.add("randomPeriod()");
				listMethod.add("randomPositivePeriod()");
				listMethod.add("randomNegativePeriod()");
				listMethod.add("randomDuration()");
				listMethod.add("randomPositiveDuration()");
				listMethod.add("randomNegativeDuration()");
			}

			// listMethod = new ArrayList<String>();
			// listMethod.add(fileContent);
		}
		

		return listMethod;
	}
	
	public static void makeContentNoComment(String content) {
		int indexOfOpenComment = content.indexOf("/*");
		int indexOfCloseComment = content.indexOf("*/");
		if(indexOfOpenComment == -1 || indexOfCloseComment == -1) {
			getSourceFromContent(content);
		} else {
			getSourceFromContent(content.substring(0, indexOfOpenComment));
			if(indexOfCloseComment != -1){
				// System.out.println("contetn: "+ content.substring(indexOfCloseComment + 2));
				makeContentNoComment(content.substring(indexOfCloseComment + 2));
			}
		}
	}

	public static void getSourceFromContent(String content) {
		// System.out.println("Content : " + content);
		if(content == "" && content == null) return;

		int curListMethodSize = listMethod.size();

		boolean isComment = false;
		String[] currentLines = content.split("\n");
		long length = currentLines.length;
		for(int i = 0; i < length; i++) {
			String currentLine = currentLines[i];
			String tmp = currentLine.trim();
			if(currentLine != null && currentLine != "" && !currentLine.matches("\\s*")){
				if(currentLine.contains("/*") && !currentLine.contains("*/")) isComment = true;
				// System.out.println(isComment);
				if(!isComment){
					if(!currentLine.contains("//")){
						if(currentLine.contains("package")){
							String[] tmps = tmp.split(" ");
							if(tmps.length > 0){
								String lib = tmps[tmps.length - 1];
								lib = lib.substring(0, lib.length() - 1);
								// tmps = lib.split("\\.");
								// String className = tmps[tmps.length - 1];
								
								// listPackage.put(className, lib);
								listPackage.add(lib + ".");
							}
							
						}
						else if(currentLine.contains("import")){
								String[] tmps = tmp.split(" ");
								if(tmps.length > 0){
									String lib = tmps[tmps.length - 1];
									lib = lib.substring(0, lib.length() - 1);
									tmps = lib.split("\\.");
									String className = tmps[tmps.length - 1];
									listImport.put(className, lib);
								}
							}
							else if(!currentLine.contains("class") && currentLine.contains("static")){
									if(currentLine.matches(".*\\(.*\\)\\s*\\{.*")) listMethod.add(tmp);
									else if(currentLine.matches(".*\\(.*") &&  !currentLine.contains("=")) {
										String temp = tmp;
										while(currentLines[++i].matches("(.*\\)\\s*\\{.*)|(.*\\))")) {
											temp += currentLines[i].trim() + " ";
										}
										--i;
										listMethod.add(temp.trim());
									}
								 }
					}
				} else {
					if(currentLine.contains("*/")) isComment = false;
				}
			}
			
		}
		
		// System.out.println(listPackage);
		// System.out.println();
		// System.out.println();
		// System.out.println(listImport);
		// System.out.println();
		// System.out.println();
		// System.out.println(listMethod);
		
		for(int i = curListMethodSize; i < listMethod.size(); ++i) {
			Structure tmp = new Structure(listMethod.get(i));

			listMethod.set(i, tmp.toString());
		}
	}

	public static int getCountComment(String str) {
		int count = 0;
		String[] tmp = str.split("\\n||\\/\\*[^\\/]+\\*\\/");
		for(int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}
		

		return count;
	}

	public static void getSourceFromFile(String fileName) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String currentLine;
		// listPackage = new HashMap<String, String>();
		listPackage = new ArrayList<String>();
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
						// tmps = lib.split("\\.");
						// String className = tmps[tmps.length - 1];
						
						// listPackage.put(className, lib);
						listPackage.add(lib + ".");
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

	// static class Structure {
	// 	// private String accesModifier;
	// 	private String name;
	// 	private ArrayList<String> argumentTypes;

	// 	Structure() {
	// 		// accesModifier = "public";
	// 		name = "test";
	// 		argumentTypes = null;
	// 	}

	// 	Structure(String rawMethodString) {
	// 		// get method name
	// 		int indexOfOpenParenthesi = rawMethodString.indexOf("(");

	// 		boolean startReadMethodName = false;
	// 		name = "";
	// 		for(int i = indexOfOpenParenthesi - 1; i >= 0; i--) {
	// 			if(rawMethodString.charAt(i) == ' '){
	// 				if(startReadMethodName) break;
	// 			} else {
	// 				name = rawMethodString.charAt(i) + name;
	// 				startReadMethodName = true;
	// 			}
	// 		}

	// 		// get list arguments
	// 		argumentTypes = null;

	// 		int indexOfCloseParenthesi = rawMethodString.indexOf(")");
	// 		if(indexOfCloseParenthesi + 1 != indexOfOpenParenthesi){
	// 			argumentTypes = new ArrayList<String>();
	// 			String[] rawArguments = rawMethodString.substring(indexOfOpenParenthesi + 1, indexOfCloseParenthesi + 1).split("(\\s\\w+\\,\\s)|(\\s\\w+\\))");
	// 			// System.out.println("rawArguments: ");

	// 			for(int i = 0; i < rawArguments.length; ++i) {
	// 				String rawType = rawArguments[i];
	// 				// System.out.println(rawType);
	// 				if(rawType.contains(",")) {
	// 					rawType = rawType.substring(rawType.indexOf(",") + 1);
	// 				}

	// 				argumentTypes.add(standardizeType(rawType));
	// 			}
	// 		}
	// 	}

	// 	public String toString() {
	// 		String result = name + "(";

	// 		if(argumentTypes != null && argumentTypes.size() > 0) {
	// 			result += argumentTypes.get(0);
	// 			for(int i = 1; i < argumentTypes.size(); i++) {
	// 				result += "," + argumentTypes.get(i);
	// 			}
	// 		}

	// 		result += ")";
	// 		return result;
	// 	}

	// 	public static String standardizeType(String raw) {
	// 		// System.out.println(raw);
	// 		// if contain []
	// 		String finallyType = raw;
	// 		boolean isContainSquareBrackets = raw.indexOf("[") != -1;

	// 		int indexOfOpenBracket = raw.indexOf("<");
	// 		String subType = null;
	// 		String mainType = raw;
	// 		if(isContainSquareBrackets)
	// 			mainType = raw.substring(0, raw.indexOf("["));

	// 		if(indexOfOpenBracket != -1) {
	// 			int indexOfCloseBracket = raw.indexOf(">");
	// 			subType = standardizeType(
	// 						raw.substring(indexOfOpenBracket + 1, indexOfCloseBracket)
	// 					);
	// 			mainType = raw.substring(0, indexOfOpenBracket);		
	// 		}
			
	// 		// if(Week10.listDefaultImport.containsKey(mainType)) {
	// 		// 	mainType = listDefaultImport.get(mainType);
	// 		// } else 
	// 			if(Week10.listPackage.containsKey(mainType)) {
	// 				mainType = listPackage.get(mainType);
	// 			} else 
	// 				if(Week10.listImport.containsKey(mainType)) {
	// 					mainType = listImport.get(mainType);
	// 				} else if(!Week10.listPrimative.contains(mainType)) mainType = "java.lang." + mainType;

	// 		if(subType != null) finallyType = mainType + "<" + subType + ">";
	// 		else finallyType = mainType;
	// 		if(isContainSquareBrackets) finallyType += "[]"; 
	// 		return finallyType;
	// 	}		

	// }		
}