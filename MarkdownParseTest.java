
import static org.junit.Assert.*;

import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
 
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    
    @Test 
    public void testGetLink() throws IOException {
        
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expectLink = List.of("https://something.com", "some-page.html" );
        assertEquals(expectLink, links);
       
    }
/*
    @Test 
    public void testGetLink1() throws IOException {
        
        Path fileName = Path.of("test-file1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expectLink = List.of("https://something.com", "some-thing.html", "https://quizlet.com/22367675/woodrow-wilson-fourteen-points-and-four-points-flash-cards/","https://www.youtube.com/watch?v=D6xkbGLQesk", "https://u.nu/");
        assertEquals(expectLink, links);
       
    }
*/
    @Test 
    public void testGetLink2() throws IOException {
        
        Path fileName = Path.of("testfile2.md");
        String content = Files.readString(fileName);
        ArrayList<String> emptyArray = new ArrayList<String>();
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(emptyArray, links);
       
    }
    @Test 
    public void testGetLink3() throws IOException {
        
        Path fileName = Path.of("testImage.md");
        String content = Files.readString(fileName);
        ArrayList<String> emptyArray = new ArrayList<>();
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(emptyArray, links);
       
    }
    
}

