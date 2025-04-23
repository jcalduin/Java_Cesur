import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Contactos extends JFrame {
    private JPanel panel1;
    private JTextField tfNombre;
    private JTextField tfTelefono;
    private JTextField tfEmail;
    private JComboBox<String> cbCategoria;
    private JTextArea areaTexto;
    private JButton btnNuevo;
    private JButton btnCargar;
    private JButton btnGuardar;
    private Contacto[] contactos;
    private int numcontactos;

    public Contactos() {
        setTitle("Contactos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,500);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        contactos = new Contacto[30];
        numcontactos = 0;
        cbCategoria.addItem("Todos");
        cbCategoria.addItem("Amigos");
        cbCategoria.addItem("Trabajo");
        cbCategoria.addItem("Familia");

        cbCategoria.addActionListener(e -> {
            filtrarContactos();
        });
        btnNuevo.addActionListener(e -> {
            nuevoContacto();
        });
        btnCargar.addActionListener(e -> {
            cargarContactos();
        });
        btnGuardar.addActionListener(e -> {
            guardarContactos();
        });
    }

    private void guardarContactos() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("misArchivos/contactos.csv");
            for (int i = 0; i < numcontactos; i++) {
                pw.println(contactos[i].getNombre()+","+contactos[i].getTelefono()+","+contactos[i].getEmail()+","+contactos[i].getCategoria());
            }
            JOptionPane.showMessageDialog(panel1, "Contactos guardados correctamente");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(panel1, "No se puede guardar el contacto");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    private void cargarContactos() {
        File archivo = new File("misArchivos/contactos.csv");
        if (archivo.exists()) {
            BufferedReader br = null;
            try {
            br = new BufferedReader(new FileReader(archivo));
            String linea = br.readLine();
            StringBuilder resultado = new StringBuilder();
            while (linea != null) {
                String[] datos = linea.split(",");
                Contacto contacto = new Contacto(datos[0], datos[1], datos[2], datos[3]);
                contactos[numcontactos] = contacto;
                numcontactos++;
                resultado.append(contacto).append("\n");
                linea = br.readLine();
            }
            areaTexto.setText(resultado.toString());
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(panel1,"Archivo no encontrado");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1,"No se puede leer el archivo");
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(panel1,"Error al cerrar el archivo");
                    }
                }
            }
        } else
            JOptionPane.showMessageDialog(panel1,"Archivo de contactos no encontrado");
    }

    private void nuevoContacto() {
        if (!tfNombre.getText().isEmpty() && !tfTelefono.getText().isEmpty() && !tfEmail.getText().isEmpty()) {
            if (!cbCategoria.getSelectedItem().equals("Todos")) {
                Contacto contacto = new Contacto(tfNombre.getText(), tfTelefono.getText(), tfEmail.getText(), cbCategoria.getSelectedItem().toString());
                contactos[numcontactos] = contacto;
                numcontactos++;
                tfNombre.setText("");
                tfTelefono.setText("");
                tfEmail.setText("");
                areaTexto.setText(areaTexto.getText() + contacto);
                JOptionPane.showMessageDialog(panel1,"Contacto agregado correctamente");
            } else
                JOptionPane.showMessageDialog(panel1,"Desbes seleccionar una categoria");
        } else
            JOptionPane.showMessageDialog(panel1,"Debe rellenar todos los campos");
    }

    private void filtrarContactos() {
        StringBuilder texto = new StringBuilder();
        areaTexto.setText("");
        for (int i = 0; i < numcontactos; i++) {
            if (cbCategoria.getSelectedItem().equals("Todos"))
                texto.append(contactos[i].toString()).append("\n");
            else {
                if (cbCategoria.getSelectedItem().equals(contactos[i].getCategoria()))
                    texto.append(contactos[i].toString()).append("\n");
            }
        }
        areaTexto.setText(texto.toString());
    }
}
