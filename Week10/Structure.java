public class Structure {
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
			System.out.println("rawArguments: ");

			for(int i = 0; i < rawArguments.length; ++i) {
				String rawType = rawArguments[i];
				System.out.println(rawType);
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
		System.out.println(raw);
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
			subType = tranformAgrument(
						raw.substring(indexOfOpenBracket + 1, indexOfCloseBracket)
					);
			mainType = raw.substring(0, indexOfOpenBracket);		
		}
		
		if(Week10.listDefaultImport.containsKey(mainType)) {
			mainType = listDefaultImport.get(mainType);
		} else 
			if(Week10.listPackage.containsKey(mainType)) {
				mainType = listPackage.get(mainType);
			} else 
				if(Week10.listImport.containsKey(mainType)) {
					mainType = listImport.get(mainType);
				}

		if(subType != null) finallyType = mainType + "<" + subType + ">";
		else finallyType = mainType;
		if(isContainSquareBrackets) finallyType += "[]"; 
		return finallyType;
	}		

}