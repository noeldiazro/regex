import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.TestCase;

public class RegexTest extends TestCase {
    public void testSearch() {
	Pattern pattern = Pattern.compile("public void");
	String input = "public class Test {\n" + // 20 characters
	    "public void testMethod() {}";
	Matcher matcher = pattern.matcher(input);
	assertTrue(matcher.find());
	assertEquals(20, matcher.start());
    }
}
