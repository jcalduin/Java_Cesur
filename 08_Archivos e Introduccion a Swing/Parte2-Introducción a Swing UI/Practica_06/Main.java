import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdivinaNumero adivinar = new AdivinaNumero();
            adivinar.setVisible(true);
        });
    }
}
