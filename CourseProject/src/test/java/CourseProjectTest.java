import org.example.CourseProject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CourseProjectTest {
    private ByteArrayOutputStream outputStream;
    private ByteArrayInputStream inputStream;

    @BeforeEach
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testAddRecord() {
        inputString("1\nTest Record\n4\n");
        CourseProject.main(new String[0]);
        String output = outputStream.toString();

        Assertions.assertTrue(output.contains("Added record: Test Record"));
    }

    @Test
    public void testDeleteRecord() {
        inputString("1\nTest Record\n2\nTest Record\n4\n");
        CourseProject.main(new String[0]);
        String output = outputStream.toString();

        Assertions.assertTrue(output.contains("Deleted record: Test Record"));
    }

    @Test
    public void testAddCategory() {
        inputString("3\nTest Category\n4\n");
        CourseProject.main(new String[0]);
        String output = outputStream.toString();

        Assertions.assertTrue(output.contains("Added category: Test Category"));
    }

    private void inputString(String input) {
        inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
    }
}