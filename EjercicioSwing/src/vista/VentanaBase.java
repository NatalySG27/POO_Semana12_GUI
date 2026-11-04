/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author UCA40407
 */
public class VentanaBase extends JFrame {
    private JLabel titulo;
    private JTextField caja;
    private JButton ver;

    public VentanaBase() {
        inicializarControles();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar programa al dar x
        setSize(400,500);//ancho y alto
        setLocationRelativeTo(null);//centrar
        setLayout(null);//posicionamiento
        setResizable(true);//redimensionar
        setVisible(true);//hace visible la ventana
        setTitle("Ventana Base");//coloca título
    }
    
    public void inicializarControles(){
        titulo = new JLabel();
        titulo.setBounds(110, 50, 180, 25);//X,Y ancho alto
        titulo.setText("MENSAJE");//Texto
        add(titulo);//Agregar
        
        caja = new JTextField();
        caja.setBounds(110, 70, 180, 25);
        caja.setText("");
        add(caja);
        
        ver = new JButton();
        ver.setBounds(110, 100, 180, 25);
        ver.setText("VER");
        add(ver);
    }
}
