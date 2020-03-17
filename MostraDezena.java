import javax.swing.JOptionPane;
public class MostraDezena {
    public static void main(String[] args){
        int num03, dezena;

        num03 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Informe um valor entre 100 e 999:"));

        dezena = (num03 % 100) / 10;

        JOptionPane.showMessageDialog(null, dezena);
    }
}