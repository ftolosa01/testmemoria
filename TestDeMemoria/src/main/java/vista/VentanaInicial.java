package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaInicial extends JFrame {

    private JButton iniciarSesion;
    private JButton crearNuevaSesion;
    private VentanaTest ventanaTest;
    private VentanaUsuario usuario;

    public VentanaInicial() {

        this.setSize(500, 500);
        this.setTitle("Test De Memoria");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.iniciarSesion = new JButton("Iniciar Sesion");
        this.crearNuevaSesion = new JButton("Crear Nueva Sesion");

        this.add(this.iniciarSesion);
        this.add(this.crearNuevaSesion);

        iniciarSesion.addActionListener((e) -> {
            iniciarSesion(e);
        });
    }

    public void iniciarSesion(ActionEvent e) {

        this.usuario = new VentanaUsuario();
        this.usuario.setVisible(true);
        this.setVisible(false);

    }

    public void crearNuevoUsuario(ActionEvent e) {
        throw new UnsupportedOperationException();
    }
}
