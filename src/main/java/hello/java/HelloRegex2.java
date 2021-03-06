package hello.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloRegex2 {

	public static void main(String[] args) {
		String input = "{$.lex}{$.str}{$.xxx}";

		Pattern pattern = Pattern.compile("\\{.+?}");
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			String matched = matcher.group();
			System.out.printf("[%s] がマッチしました。 Pattern:[%s] input:[%s] %d %d \n", matched, pattern, input, start, end);
		}

	}

}
