/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Duvan
 */
public class VentanaPrincipal extends JFrame{
    
    private Dialogo dialogo;
    private JPanel panel1;
    
    public VentanaPrincipal(){
    setSize(800,600);
    setBackground(Color.WHITE);
        setTitle("Botones");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        dialogo = new Dialogo(this);
        
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 800, 600);
        panel1.setBackground(Color.yellow);
        panel1.setLayout(null);
        add(panel1);
        
        
        setVisible(true);
        add(dialogo);
}

    public JPanel getPanel1() {
        return panel1;
    }
   
}
