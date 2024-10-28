import javax.swing.JOptionPane; //Note: This is an authenticattor package in java

public class Authenticator {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("username: "); //Note: .showInputDialog is the approximate of System.in in the authenticator package
        String password = JOptionPane.showInputDialog("Password: ");

        if(
                username != null && password != null &&
                        (
                                (username.equals("bburd") && password.equals("swordfish")) || (username.equals("hritter") && password.equals("preakston"))
                        )
        ) {
            JOptionPane.showMessageDialog(null, "you are in"); //Note: .showMessageDialog is the approximate of System.out.println in the authenticator package
        } else {
            JOptionPane.showMessageDialog(null, "you are not in, you are suspicious");
        }
    }

}
