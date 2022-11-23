package Apps.app005;
import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
    public Frame(){
        super("Meu Pênio");//define o titulo do frame
        JButton botao = new JButton("Clique");//cria o butão com o texto inserido
        Container c = getContentPane();
        c.add(botao);//adciona o botão no frame
        c.add(BorderLayout.WEST, new JButton("Clique"));
        c.add(BorderLayout.EAST, new JButton("Clique"));
        c.add(BorderLayout.NORTH, new JButton("Clique"));
        c.add(BorderLayout.SOUTH, new JButton("Clique"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//diz oque ocorrera quando clicar em fechar
        setSize(500, 500);//tamanho do frame
        setVisible(true);//visibilidade do frame
    }
}
