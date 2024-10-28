import javax.swing.JFrame;
//Note: Above we are importing the UI frame in java

public class Gui {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame ();
        String myTitle = "Blank Frame";

        //Note: Below we are setting the spec of the frame
        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
    
}
