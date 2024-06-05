import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {

        User testUser = new User(showInputDialog("Bitte geben Sie Ihren Benutzernamen ein:"),
                showInputDialog("Bitte geben Sie Ihre E-Mail-Adresse ein:"),
                showInputDialog("Bitte geben Sie Ihr Passwort ein:"));

        if (testUser.nutzername.equals("Max") && testUser.password.equals("abc")){
            System.out.println("Anmeldung erfolgreich!");
        } else {
            System.out.println("Anmeldung fehlgeschlagen!");
        }
    }
}