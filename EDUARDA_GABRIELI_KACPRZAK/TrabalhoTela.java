import javax.swing.*;

public class TrabalhoTela {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Trabalho - Design Patterns");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        JLabel label = new JLabel("Trabalho", SwingConstants.CENTER);
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        
        frame.add(label);
        frame.setLocationRelativeTo(null);
    
        frame.setVisible(true);
    }
}