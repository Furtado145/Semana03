import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class LogBase10 {
    public static void main(String[] args) {
        double log10, num01;
        
        num01 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Digite um valor:"));

        DecimalFormat df = new DecimalFormat("###,###.###");
        log10 = Math.log10(num01);

        JOptionPane.showMessageDialog(null, df.format(log10));
           
            
    }
}