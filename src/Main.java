import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {

        User testUser = new User(showInputDialog("Bitte geben Sie Ihren Benutzernamen ein:"),
                showInputDialog("Bitte geben Sie Ihre E-Mail-Adresse ein:"),
                showInputDialog("Bitte geben Sie Ihr Passwort ein:"));

        System.out.println("Benutzername: " + testUser.nutzername
                + "\nE-Mail: " +testUser.email + "\nPasswort: "
                + testUser.password + "\nAlter: " + testUser.alter);
    }
}