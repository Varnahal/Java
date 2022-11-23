package Apps.app006;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Eventos extends JFrame implements ActionListener{

    public Eventos(){
        super("Butão sei lá");

        JButton botao = new JButton("Clique");//cria o butão
        botao.addActionListener(this);//adiciona um evento de clique ao butão

        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Eventos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("VocÊ clicou!!!");//oque sera executado caso clique no butão
        
    }



}
