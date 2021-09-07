package mockSQL;

public interface stuff {
	public void executeQuery(String query);
}


public class SQL implements stuff {
    public static String sanitizeString(String string) {
        // mock sanitization
        return string;
    }

    public void executeQuery(String query) {
    }
}
