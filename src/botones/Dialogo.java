/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Duvan
 */
public class Dialogo extends JDialog implements ActionListener {
    private JPanel panel;
    private JLabel texto1, texto2;
    private JTextField filas, columnas;
    private JButton guardar;
    private VentanaPrincipal ventana;
   
    
    public Dialogo(VentanaPrincipal ventana){
        this.ventana = ventana;
        setSize(400,300);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Escoge las dimensiones"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
        
        texto1 = new JLabel("Cuantos botones desea crear: ");
        texto1.setBounds(20,40,200,50);
        panel.add(texto1);
        filas = new JTextField();
        filas.setBounds(200, 50, 100, 30);
        panel.add(filas);
        /*texto2 = new JLabel("Columnas: ");
        texto2.setBounds(20,120,100,50);
        panel.add(texto2);
        columnas = new JTextField();
        columnas.setBounds(130, 130, 100, 30);
        panel.add(columnas);*/
        
        guardar = new JButton("Guardar");
        guardar.setBounds(80, 200, 80, 30);
        guardar.addActionListener(this);
        panel.add(guardar);
        
        setVisible(true);
    }
    public void crearBoton(){
        int fil, colu;
        int j=0;
        int k=0, l=0, m=0, n=0;
        fil = Integer.parseInt(filas.getText());
        JButton[] botn=new JButton[fil];
        //colu = Integer.parseInt(columnas.getText());
        for(int i= 0; i<fil; i++){
            //for(int j= 0; j<colu; j++){
                
                if(i<=8){
                botn[i] = new JButton("boton"+ i);
                botn[i].setBounds(k, j*50, 100, 50);
                this.ventana.getPanel1().add(botn[i]);
                this.ventana.repaint();
                j = j+1;
                }
                if(i>8&&i<=16){
                botn[i]= new JButton("boton"+ i);
                botn[i].setBounds(k+103, k*50, 100, 50);
                this.ventana.getPanel1().add(botn[i]);
                this.ventana.repaint();
                k = k+1;
                }
                if(i>16&&i<=24){
                botn[i] = new JButton("boton"+ i);
                botn[i].setBounds(l+206, l*50, 100, 50);
                this.ventana.getPanel1().add(botn[i]);
                this.ventana.repaint();
                l = l+1;
                }
                 if(i>24&&i<=32){
                botn[i] = new JButton("boton"+ i);
                botn[i].setBounds(m+309, m*50, 100, 50);
                this.ventana.getPanel1().add(botn[i]);
                this.ventana.repaint();
                m = m+1;
                }
                if(i>32&&i<=40){
                botn[i]= new JButton("boton"+ i);
                botn[i].setBounds(n+412, n*50, 100, 50);
                this.ventana.getPanel1().add(botn[i]);
                this.ventana.repaint();
                n = n+1;
                }
        //}
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        crearBoton();
        dispose();
    }
}
