import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mladjan on 27.3.2014.
 */
public class AnagramTest {

    Anagram subject;
    List<String> expected;

    @Before
    public void setUp() {
        subject = new Anagram();
    }

    @Test
    public void mustReturEmptyStringForEmptyString() {
        expected = Arrays.asList("");
        assertEquals(expected, subject.createAnagram(""));
    }

    @Test
    public void mustReturnAForAString() {
        expected = Arrays.asList("A");
        assertEquals(expected, subject.createAnagram("A"));
    }

    @Test
    public void mustReturnAB_BAForStringAB() {
        expected = Arrays.asList("AB", "BA");
        assertEquals(expected, subject.createAnagram("AB"));
    }

    @Test
    public void mustReturnAnagramForABC() {
        expected = Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");
        assertEquals(expected, subject.createAnagram("ABC"));
    }
    @Test
      public void mustReturnAnagramForABCD_24() {
        expected = Arrays.asList("ABCD", "ABDC", "ACBD", "ACDB", "ADBC", "ADCB", "BACD", "BADC", "BCAD", "BCDA", "BDAC", "BDCA", "CABD", "CADB", "CBAD", "CBDA", "CDAB", "CDBA", "DABC", "DACB", "DBAC", "DBCA", "DCAB", "DCBA");
        assertEquals(expected, subject.createAnagram("ABCD"));
    }

    @Test
    public void musjtReturnAnagramForABCDE_120() {
        assertEquals(120, subject.createAnagram("ABCDE").size());
    }

}
