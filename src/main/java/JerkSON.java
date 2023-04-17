import java.util.ArrayList;
import java.util.HashMap;

public class JerkSON extends HashMap<String, ArrayList<String>> {
    public JerkSON(){
        this.put("name", new ArrayList<>(1));
        this.put("price", new ArrayList<>());
    }
}
