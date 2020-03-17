import javax.swing.JOptionPane;
public class ElevarAoQuadrado{
   public static void main(String[] args){
      int base;
      int elevado;
      String resp;
      
      base = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor:"));
      
      elevado =(int) Math.pow(base, 2);
      
      resp = "" + base + " elevado ao quadrado é:\n " + elevado;
      
      JOptionPane.showMessageDialog(null, resp);
   }
}