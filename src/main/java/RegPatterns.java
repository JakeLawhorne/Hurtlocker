import java.util.regex.Pattern;

public class RegPatterns {
    public static final Pattern milk = Pattern.compile("/milk/gi", Pattern.CASE_INSENSITIVE);
    public static final Pattern cookies = Pattern.compile("/c(o|0)(o|0)kies", Pattern.CASE_INSENSITIVE);
    public static final Pattern apples = Pattern.compile("apples", Pattern.CASE_INSENSITIVE);
    public static final Pattern bread = Pattern.compile("bread", Pattern.CASE_INSENSITIVE);
    public static final Pattern error = Pattern.compile("[:@^*%;][:@^*%;]");
}
