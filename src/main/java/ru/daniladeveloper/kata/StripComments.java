package ru.daniladeveloper.kata;

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
		StringBuilder result = new StringBuilder();
        String[] lines= text.split("\n");
        for (String line : lines) {
            for (String commentSymbol : commentSymbols) {
                int commentStart = line.indexOf(commentSymbol);
                if (commentStart != -1 ) {
                    line = line.substring(0, commentStart);
                    int lastWhitespace = indexOfFirstWhitespace(line);
                    if (lastWhitespace != -1) {
                        line = line.substring(0, lastWhitespace);
                    }
                }
            }
            result.append(line).append("\n");
        }
        result.setLength(result.length() - 1);
        return result.toString();
	}

    public static int indexOfFirstWhitespace(String str) {
        int lastIndex = -1;
        for (int i = str.length() - 1; i >=0 ; i--) {
            if (str.charAt(i) == ' ') {
                lastIndex = i;
            } else {
                break;
            }
        }
        return lastIndex;
    }
}
