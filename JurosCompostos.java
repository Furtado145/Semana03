import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class JurosCompostos{
   public static void main(String[] args){
      double valorInicial, valorFinal, juros;
      int tempo;
      String resp;
      DecimalFormat df = new DecimalFormat("#,###,##0.00");
      
      valorInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor atual da divida?"));
      juros = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto de juros sera cobrado?"));
      tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Em quantos meses planeja pagar?"));
      
      valorFinal = Math.pow((1 + juros/100),tempo);
      
      valorFinal = valorFinal * valorInicial;
      
      resp = "Com uma divida de R$" + valorInicial + ", parcelado em " + tempo+ " meses,";
      resp = resp + " com juros de "+ juros + "% ao mes.\n";
      resp = resp + "Ao final, sera gasto um valor de R$"+ df.format(valorFinal)+".";
      
      
      JOptionPane.showMessageDialog(null, resp);
      
   }
}