import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AdivinaNumero extends JFrame {
    private JPanel panel1;
    private JLabel lblTexto;
    private JTextField tfNumero;
    private JButton btnAdivinar;
    private JLabel lblIntentos;
    private JButton btnNuevoJuego;
    private int intentos;
    private int secreto;
    private Random r = new Random();

    public AdivinaNumero() {
        setTitle("Juego de adivinar el número secreto");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,150);
        setLocationRelativeTo(null);
        generarSecreto();
        btnAdivinar.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(tfNumero.getText());
                if (numero < 1 || numero > 100)
                    throw new LimiteNumeroException("El número de estar entre 1 y 100");
                intentos++;
                if (numero < secreto) {
                    lblTexto.setText("El número secreto es mayor");
                    lblIntentos.setText("Intentos :"+intentos);
                } else if (numero > secreto) {
                    lblTexto.setText("El número secreto es menor");
                    lblIntentos.setText("Intentos :"+intentos);
                } else {
                    lblTexto.setText("¡Correcto! Has adivinado el número secreto en "+intentos+" intentos");
                    lblIntentos.setText("Intentos :"+intentos);
                    tfNumero.setEnabled(false);
                    btnAdivinar.setEnabled(false);
                }
            } catch (NumberFormatException ex) {
                lblTexto.setText("Introduce caracteres numéricos válidos");
            } catch (LimiteNumeroException ex) {
                lblTexto.setText(ex.getMessage());
            }
            tfNumero.setText("");
        });

        btnNuevoJuego.addActionListener(e -> {
            intentos = 0;
            tfNumero.setEnabled(true);
            btnAdivinar.setEnabled(true);
            lblIntentos.setText("Intentos :"+intentos);
            lblTexto.setText("Intenta adivinar el número secreto");
            generarSecreto();
        });
    }

    private void generarSecreto() {
        secreto = r.nextInt(100)+1;
    }
}
