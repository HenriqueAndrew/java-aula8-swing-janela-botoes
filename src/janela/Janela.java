// Aula 8 - Criar janela e adicionar titulo, rotulo, caixa de texto, botoes e organizar layout - Henrique Andrew da Silva

package janela;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Janela {

    public static void main(String[] args) {
        JFrame jan1 = new JFrame();
        int larg = 300, alt = 250;
        jan1.setSize(larg,alt);
        jan1.setTitle("Primeira Janela -Form de Entrada de Dados ");
        JLabel rot1 = new JLabel();
        rot1.setText("Rotulo 1 - Nome");
        jan1.add(rot1);
        JTextField entrada1 = new JTextField(20);
        jan1.add(entrada1);
        JButton bt1 = new JButton("Clique aqui");
        bt1.setMnemonic('C'); //descomente e veja que traceja o caracter C (teclas de atalho)
        jan1.add(bt1);
        //bt1.setVisible(true);
        jan1.setLayout(new FlowLayout());
        jan1.setVisible(true);
    }
}
