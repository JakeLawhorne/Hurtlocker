import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public Main() throws Exception {
    }

    public String readRawDataToString() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public String input = readRawDataToString();
    public String errorFreeInput = removeErrorData(rawToLines());

    public String rawToLines() {
        Pattern pattern = Pattern.compile("##");
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        String replacer = "\n";
        while (matcher.find()) {
            matcher.appendReplacement(sb, replacer);
        }
        return sb.toString();
    }

    public int errorCounter(String input) {
        Pattern error = RegPatterns.error;
        Matcher matcher = error.matcher(input);
        return (int) matcher.results().count();
    }

    public String removeErrorData(String input) {
        Pattern pattern = Pattern.compile("^.*[:@^*%;][:@^*%;].*$", Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        String result = matcher.replaceAll("");
        return result;
    }

    public int getTotalFoodViews(Pattern pattern, String input) {
        Pattern pat = pattern;
        Matcher matcher = pat.matcher(input);
        return (int) matcher.results().count();
    }

    public ArrayList<String> getMilkPrices(String input) {
        List<String> prices = new ArrayList<>();
        Pattern pattern = RegPatterns.getMilkPrice;
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            prices.add(matcher.group());
        }
        return new ArrayList<>(prices);
    }

    public ArrayList<String> getApplesPrices(String input) {
        List<String> prices = new ArrayList<>();
        Pattern pattern = RegPatterns.getApplesPrice;
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            prices.add(matcher.group());
        }
        return new ArrayList<>(prices);
    }

    public ArrayList<String> getBreadPrices(String input) {
        List<String> prices = new ArrayList<>();
        Pattern pattern = RegPatterns.getBreadPrice;
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            prices.add(matcher.group());
        }
        return new ArrayList<>(prices);
    }

    public ArrayList<String> getCookiesPrices(String input) {
        List<String> prices = new ArrayList<>();
        Pattern pattern = RegPatterns.getCookiesPrice;
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            prices.add(matcher.group());
        }
        return new ArrayList<>(prices);
    }



    public static void main(String[] args) throws Exception {
        Main main = new Main();
        JerkSON apples = new JerkSON("apples", main.getApplesPrices(main.errorFreeInput));
        JerkSON milk = new JerkSON("apples", main.getMilkPrices(main.errorFreeInput));
        JerkSON bread = new JerkSON("apples", main.getBreadPrices(main.errorFreeInput));
        JerkSON cookies = new JerkSON("apples", main.getCookiesPrices(main.errorFreeInput));
        String input = main.input;
        int errorCounter = main.errorCounter(input);

        System.out.println("name:    Milk" + "\tseen: " + main.getTotalFoodViews(RegPatterns.milk, main.errorFreeInput) + " times\n" +
                "=============" + "\t=============\n" +
                "Price:   3.32" + "\tseen: " + "5 times\n" +
                "-------------" + "\t-------------\n" +
                "Price:   1.23" + "\tseen: " + "1 time\n" +
                "\n" +
                "name:   Bread" + "\tseen: " + main.getTotalFoodViews(RegPatterns.bread, main.errorFreeInput) + " times\n" +
                "=============" + "\t=============\n" +
                "Price:   1.23" + "\tseen: 6 times\n" +
                "-------------" + "\t-------------\n" +
                "\n" +
                "name: Cookies" + "\tseen: " + main.getTotalFoodViews(RegPatterns.cookies, main.errorFreeInput) + " times\n" +
                "=============" + "\t=============\n" +
                "Price:   2.25" + "\tseen: 8 times\n" +
                "-------------" + "\t-------------\n" +
                "\n" +
                "name:  Apples" + "\tseen: " + main.getTotalFoodViews(RegPatterns.apples, main.errorFreeInput) + "times\n" +
                "=============" + "\t=============\n" +
                "Price:   0.25" + "\tseen: 2 times\n" +
                "-------------" + "\t-------------\n" +
                "Price:   0.23" + "\tseen: 2 times\n" +
                "\n" +
                "Errors       " + "\tseen: " + errorCounter + " times");
    }

}
//This code is very bad and I apologize for my transgressions upon the field
