
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leslie Callejas
 */
public class Vista extends JFrame implements ActionListener {

    JLabel label;
    private JPanel miVistaPrincipal;
    private JPanel panel;
    private JButton boton;
    private Color color;

    public Vista(){
        miVista();
        setTitle("Leslie Callejas");
        setSize(550, 540);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void miVista() {
        miVistaPrincipal = new JPanel();
        miVistaPrincipal.setLayout(null);
        
        label = new JLabel();
        label.setFont(new java.awt.Font("Bodoni MT Black", 0, 22));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("selección de colores con JColorChooser"); 
        label.setBounds(40, 20, 450, 40);

        panel = new JPanel();
        panel.setBounds(10, 80, 510, 350);
        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        boton = new JButton();
        boton.setText("Nuevo color");
        boton.setBounds(190, 460, 150, 20);
        boton.addActionListener(this);

        miVistaPrincipal.add(label);
        miVistaPrincipal.add(panel);
        miVistaPrincipal.add(boton);
        add(miVistaPrincipal);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton) {
            JColorChooser ventanaDeColores = new JColorChooser();
            color = ventanaDeColores.showDialog(null, "Selecciona el de tu preferencia", Color.gray);
            panel.setBackground(color);
        }
    }

}
