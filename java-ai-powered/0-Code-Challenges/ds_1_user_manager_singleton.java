import java.util.ArrayList; // <<
import java.util.List;
import java.util.Scanner; // <<

class User {
    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }
}

public class Main {
    private static final List<User> users = new ArrayList<>();
    
    public static void addUser(String name) {
        int id = users.size() + 1;
        User newUser = new User(id, name); // <<
        users.add(newUser);
    }

    public static void listUsers() {
        for (User user : users) {
            System.out.println(user.getId() + " - " + user.getName()); // <<
        }
    }

    public static void main(String[] args) { // << 
        
        Scanner scanner = new Scanner(System.in); // <<

        int quantity = scanner.nextInt(); 
        scanner.nextLine();  // Consumir a quebra de linha após a leitura do número

        for (int i = quantity; i > 0; --i) { // <<
            String name = scanner.nextLine(); // <<
            addUser(name);
        }
       
        listUsers();
    }
}

// Alternative 1 

import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Integer.parseInt;

class User {
    private final int id;
    private final String name;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() { return id; }
    public String getName() { return name; }
}

public class Main {
    private static final List<User> users = new ArrayList<>();
    public static void addUser(String name) {
        User newUser = new User(users.size() + 1, name);
        users.add(newUser);
    }
    public static void listUsers() {
        String ans = "";
        for (User user : users) {
            ans += user.getId() + " - " + user.getName() + "\n";
        }
        new PrintWriter(out).append(ans).flush();
    }

    public static void main(String[] args) throws IOException{
        var topic = new BufferedReader(new InputStreamReader(in));
        for (int i = parseInt(topic.readLine()); i > 0; --i) { addUser(topic.readLine()); }
        listUsers();
    }
}

// Fullspeed
import java.io.*;
import static java.lang.System.*;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException{
        var y = new BufferedReader(new InputStreamReader(in));
        String t = "";
        for (int x = parseInt(y.readLine()),i = 1; i <= x; ++i){ t += i+" - "+y.readLine()+"\n"; }
        new PrintWriter(out).append(t).flush();
    }
}
