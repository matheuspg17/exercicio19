

import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        int numero;
        
        String frase = JOptionPane.showInputDialog("Digite a frase:");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
        
        for (int i = 1; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, "frase:" + frase + i);
        }
    }
}