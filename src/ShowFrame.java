public class ShowFrame {
    public static void main(String[] args) {
        //Note: Below we use the full reference of JFrame instead of importing jframe as we should at the beginning of the file.
        javax.swing.JFrame myFrame = new javax.swing.JFrame();
        String myTitle = "Blank Frame";
        myFrame.setTitle(myTitle);
        myFrame.setSize(3200, 200);
        myFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

