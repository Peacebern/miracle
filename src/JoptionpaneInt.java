import javax.swing.JOptionPane;

public class JoptionpaneInt {
    public static void main(String[] arg){
        int princessAge = Integer.parseInt(JOptionPane.showInputDialog("How many years is princess"));
        double princessWeight = Double.parseDouble(JOptionPane.showInputDialog("What is princess weight"));



        System.out.println(princessAge);
        System.out.println(princessWeight);

    }

}
