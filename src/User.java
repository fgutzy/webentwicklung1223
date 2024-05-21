/**
 * Speichert die Daten eines Benutzers.
 */
public class User {

    String username;
    String email;
    String password;
    int alter;  // Ist eine freiwillige Angabe


    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Konstruktor mit freiwilliger Altersangabe
    public User(String username, String email, String password, int alter) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.alter = alter;
    }
}
