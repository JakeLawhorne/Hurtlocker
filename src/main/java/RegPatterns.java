import java.util.regex.Pattern;

public class RegPatterns {
    public static final Pattern milk = Pattern.compile("milk", Pattern.CASE_INSENSITIVE);
    public static final Pattern cookies = Pattern.compile("/c(o|0)(o|0)kies", Pattern.CASE_INSENSITIVE);
    public static final Pattern apples = Pattern.compile("apples", Pattern.CASE_INSENSITIVE);
    public static final Pattern bread = Pattern.compile("bread", Pattern.CASE_INSENSITIVE);
    public static final Pattern error = Pattern.compile("[:@^*%;][:@^*%;]");
    public static final Pattern getMilkPrice = Pattern.compile("(?<=name:milk;price[:,;])[0-9].[0-9][0-9](?=;)", Pattern.CASE_INSENSITIVE);
    public static final Pattern getApplesPrice = Pattern.compile("(?<=name:apples;price[:,;])[0-9].[0-9][0-9](?=;)", Pattern.CASE_INSENSITIVE);
    public static final Pattern getBreadPrice = Pattern.compile("(?<=name:bread;price[:,;])[0-9].[0-9][0-9](?=;)", Pattern.CASE_INSENSITIVE);
    public static final Pattern getCookiesPrice = Pattern.compile("(?<=name:c[o|0][o|0]kies;price[:,;])[0-9].[0-9][0-9](?=;)", Pattern.CASE_INSENSITIVE);

}
