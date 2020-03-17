import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Angulo{
   public static void main(String[] args){
      double angulo, anguloRad, sin, cos, tg, ctg, cossec, sec;
      String resp;
      DecimalFormat df = new DecimalFormat("###,##0.00");

      angulo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o angulo:"));
      
      anguloRad = Math.toRadians(angulo);
      
      sin = Math.sin(anguloRad);
      cos = Math.cos(anguloRad);
      tg = Math.tan(anguloRad);
      ctg = 1 / tg;
      cossec = 1 / sin;
      sec = 1 / cos;

      resp = "Em relacao a " + angulo + "º, temos: \n";
      resp = resp + "Seno: " + df.format(sin) + "\n";
      resp = resp + "Cosseno: " + df.format(cos) + "\n";
      resp = resp + "Tangente: " + df.format(tg) + "\n";
      resp = resp + "Cotangente: " + df.format(ctg) +  "\n";
      resp = resp + "Cossecante: " + df.format(cossec) + "\n";
      resp = resp + "Secante: " + df.format(sec) + "\n";
      
      JOptionPane.showMessageDialog(null, resp );
   }
}