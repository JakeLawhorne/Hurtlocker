import java.util.ArrayList;
import java.util.HashMap;

public class JerkSON extends HashMap<String, ArrayList<String>> {
    public JerkSON(String name, ArrayList<String> prices){
        this.put(name, new ArrayList<>());
        this.put("price", prices);
    }
}
