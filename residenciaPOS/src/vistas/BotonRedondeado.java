/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

/**
 *
 * @author sofia
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class BotonRedondeado extends JButton {
    public BotonRedondeado(String texto) {
        super(texto);
        setContentAreaFilled(false); // Establece el área de contenido transparente
        setFocusPainted(false); // Elimina el efecto de foco al hacer clic
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(new Color(0x9B5257)); // Establece el color de fondo cuando se presiona el botón
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10); // Redondea el botón con bordes de radio 10
        super.paintComponent(g);
    }
}
