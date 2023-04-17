import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public Main() throws Exception {
    }

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }
    public String dataSplitter() throws Exception {
        Pattern splitter = Pattern.compile("##");
        Matcher matcher = splitter.matcher(readRawDataToString());
        StringBuffer sb = new StringBuffer();
        String replacement = "\n";
        while(matcher.find()){
            matcher.appendReplacement(sb,replacement);
        }

        return matcher.appendTail(sb).toString();
    }
    public String input = dataSplitter();

    public int errorCounter(){
        int count = 0;
        Pattern error = RegPatterns.error;
        Matcher matcher = error.matcher(input);
        while(matcher.find()){
            if(matcher.find()){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception{
        Main main = new Main();
        System.out.println(main.input);
        System.out.println( main.errorCounter());

    }
}
