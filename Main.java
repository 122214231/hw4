/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main
{
	public static void main(String[] args) {
	Path filePath = Path.of("C:\\Users\\88692\\Downloads\\demo.txt"); 
        try {
            String content = Files.readString(filePath);
            System.out.println(content);

            Pattern pattern = Pattern.compile("01AF0055\\/\\d{6}[a-z]\\.HRV\\.jpg\\?HRV\\.bpp");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                System.out.println("Found: " + matcher.group());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
