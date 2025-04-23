import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class GestionCalificaciones extends JFrame {
    private JPanel panel1;
    private JTextField tfNombre;
    private JTextField tfNota;
    private JTextArea areaNotas;
    private JButton btnAgregar;
    private JButton btnGuardar;
    private JButton btnCargar;
    private String[] nombres;
    private double[] notas;
    private int indice = 0;
    
    public GestionCalificaciones() {
        setTitle("Gestión de Calificaciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setSize(450,300);
        setResizable(false);
        setLocationRelativeTo(null);
        cargarNotas();
        btnAgregar.addActionListener(e -> {
            acciones(e);
        });
        btnGuardar.addActionListener(e -> {
            acciones(e);
        });
        btnCargar.addActionListener(e -> {
            acciones(e);
        });
    }

    private void acciones(ActionEvent e) {
        if (e.getSource() == btnGuardar) {
            guardarNotas();
        }
        if (e.getSource() == btnAgregar) {
            agregarNota();
        }
        if (e.getSource() == btnCargar) {
            cargarNotas();
        }
    }

    private void agregarNota() {
        try {
            String nombre = tfNombre.getText();
            Double nota = Double.parseDouble(tfNota.getText());
            if (!nombre.isEmpty()) {
                if (nota >= 1 && nota <= 10) {
                    int posicion = buscarEstudiante();
                    if (posicion == -1) {
                        nombres[indice] = nombre;
                        notas[indice] = nota;
                        indice++;
                        areaNotas.setText(areaNotas.getText()+nombre+"-"+nota+"\n");
                    } else {
                        int opcion = JOptionPane.showConfirmDialog(panel1,"El estudiante "+nombre+" ya tiene una nota. ¿Desea cambiarla?","Modificar nota",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if (opcion == JOptionPane.YES_OPTION) {
                            notas[posicion] = nota;
                            String texto="";
                            for (int i = 0; i < indice; i++) {
                                texto = texto + nombres[i]+"-"+notas[i]+"\n";
                            }
                            areaNotas.setText("");
                            areaNotas.setText(texto+"\n");
                            JOptionPane.showMessageDialog(panel1,"Nota modificada correctamente");
                        }
                    }
                }else
                    throw new LimiteNotaException("La nota debe estar entre 1 y 10");
            } else
                throw new NombreVacioException("El nombre no puede estar vacío");
        } catch (NombreVacioException | LimiteNotaException e) {
            JOptionPane.showMessageDialog(panel1, e.getMessage());
        } finally {
            tfNombre.setText("");
            tfNota.setText("");
        }
    }

    private int buscarEstudiante() {
        int posicion = -1;
        int contador = 0;
        boolean encontrado = false;

        while (!encontrado && contador < indice) {
            if (nombres[contador].equalsIgnoreCase(tfNombre.getText())) {
                encontrado = true;
                posicion = contador;
            } else
                contador++;
        }
        return posicion;
    }

    private void guardarNotas() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("misArchivos/calificaciones.txt");
            for (int i = 0; i < indice; i++) {
                pw.println(nombres[i]+"-"+notas[i]);
            }
            JOptionPane.showMessageDialog(panel1,"Notas guardadas correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    private void cargarNotas() {
        File f = new File("misArchivos/calificaciones.txt");
        nombres = new String[30];
        notas = new double[30];
        indice = 0;
        if (f.exists()) {
            BufferedReader br = null;
            FileReader fr = null;
            try {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                String linea = br.readLine();
                areaNotas.setText("");
                while (linea != null) {
                    String[] datos = linea.split("-");
                    nombres[indice] = datos[0];
                    notas[indice] = Double.parseDouble(datos[1]);
                    areaNotas.setText(areaNotas.getText()+datos[0]+"-"+datos[1]+"\n");
                    indice++;
                    linea = br.readLine();
                }
            } catch (FileNotFoundException e) {
                System.out.println("No se encontro el archivo");
            } catch (IOException e) {
                System.out.println("No es posible leer el archivo");
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                    tfNombre.setText("");
                    tfNota.setText("");
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        }
    }
}
