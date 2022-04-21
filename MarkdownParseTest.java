
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

    
    
}

