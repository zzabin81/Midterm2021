package databases;

/**
 * Created by mrahman on 4/23/17.
 */
public class User {

    String name = "Ali";
    int id = 60;

    public User(){}

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
