//MessageDialog
// import javax.swing.JOptionPane;
// import javax.swing.JTextField;
import javax.swing.*;

class A
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"hello","title", JOptionPane.PLAIN_MESSAGE);
        
        JFrame fm = new JFrame();
        fm.setLayout(null);
        fm.setVisible(true);
        fm.setSize(400, 300);
        JTextField tf = new JTextField();
        tf.setBounds(0, 0, 130, 140);
        tf.setText("heyy");
        JOptionPane.showMessageDialog(fm,tf.getText());
        
        System.exit(1);
    }
}