import javax.swing.JOptionPane;
public class AreaRetangulo{
   public static void main(String[] args){
      double base, altura, area;
      String resp;
      
      base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do retangulo:"));
      altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a base do retangulo:"));
      
      area = altura * base;
      
      resp = "A area do retangulo é:\n" + area + "m2";
      
      JOptionPane.showMessageDialog(null, resp);
      }
}