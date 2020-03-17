import javax.swing.JOptionPane;
public class ContaStrings{
   public static void main(String[] args){
      int qtdLetras = 0;
      String palavra01, palavra02, palavra03, resp;
      
      palavra01 = JOptionPane.showInputDialog(null, "Digite a primeira palavra:");
      palavra02 = JOptionPane.showInputDialog(null, "Digite a segunda palavra:");
      palavra03 = JOptionPane.showInputDialog(null, "Digite a terceira palavra:");
      
      qtdLetras = palavra01.length() + palavra02.length() + palavra03.length();
      
      resp = palavra01 +" "+palavra02 +" "+palavra03 +"\n";
      resp = resp + "Somam " + qtdLetras + " caracteres";
      
      JOptionPane.showMessageDialog(null, resp);  
   }
}