import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EditorTexto editor = new EditorTexto();
            editor.setVisible(true);
        });
    }
}
