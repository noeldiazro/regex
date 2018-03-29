import java.util.Arrays;
import junit.framework.TestCase;

public class StringRegexTest extends TestCase {
    private static final String SOURCE = "Jeffrey   Hyman";

    public void testSplit_Space() {
	assertSplit(" ", "Jeffrey", "", "", "Hyman");
    }

    public void testSplit_WhitespaceGroup() {
	assertSplit("\\s+", "Jeffrey", "Hyman");
    }

    private void assertSplit(String regex, String... expected) {
	assertArrayEquality(expected, SOURCE.split(regex));
    }

    private void assertArrayEquality(Object[] a, Object[] b) {
	assertTrue(Arrays.equals(a, b));
    }

    public void testStripPhoneNumber() {
	final String phoneNumber = "(719) 555-9353 (home)";
	assertEquals("7195559353", strip(phoneNumber));
    }

    private String strip(String text) {
	return text.replaceAll("\\D+", "");
    }
}
