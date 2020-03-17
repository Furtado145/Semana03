import javax.swing.JOptionPane;

public class DiasVividos {
    public static void main(String[] args) {
        int idade, dias, anos = 365;
        String mensagem;

        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos voce tem?"));
        
        dias = idade *anos;

        mensagem = "Aproximadamente, voce ja viveu\n" + dias + " dias." ;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}