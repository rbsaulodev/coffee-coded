import java.util.Scanner;
import java.util.regex.Pattern;

public class EndpointValidator {
    private static final String ENDPOINT_REGEX = "^/api/\\w+(/\\w+)*$";
    private static final Pattern pattern = Pattern.compile(ENDPOINT_REGEX);

    public static String validateEndpoint(String endpoint) {
        if (pattern.matcher(endpoint).matches()) {
            return "Endpoint valido.";
        } else {
            return "Endpoint invalido.";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(validateEndpoint(endpoint));
    }
}
