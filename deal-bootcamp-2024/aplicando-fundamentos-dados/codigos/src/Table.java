import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Table {

    private Map<Integer, String> table;

    public Table() {
        this.table = new HashMap<>();
    }
    
    public void insert(int id, String name) {
        table.put(id, name);
    }

    public void display() {
        for (String name : table.values()) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Table table = new Table();

        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            scanner.nextLine(); 
            String name = scanner.nextLine();
            table.insert(id, name);
        }

        table.display();
        scanner.close();
    }
}
