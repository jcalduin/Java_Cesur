import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Contactos contactos = new Contactos();
            contactos.setVisible(true);
        });
    }
}
