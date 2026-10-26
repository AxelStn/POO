package exilio.Interfaz;

import javax.swing.*;
import java.awt.*;

public class VentanaJuego extends JFrame {

    public VentanaJuego() {
        this.setTitle("EXILIO");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new FlowLayout());
        JLabel textoEstado = new JLabel("Horda: 1 (Bosque)  |  Vida: 100  |  Escudo: 0  |  Puntaje: 0");
        panelSuperior.add(textoEstado);
        this.add(panelSuperior, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.DARK_GRAY);
        this.add(panelCentral, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel(new FlowLayout());
        JButton btnHabilidad1 = new JButton("Elegir Habilidad 1");
        JButton btnHabilidad2 = new JButton("Elegir Habilidad 2");
        panelInferior.add(btnHabilidad1);
        panelInferior.add(btnHabilidad2);
        this.add(panelInferior, BorderLayout.SOUTH);

        this.setVisible(true);
    }
}