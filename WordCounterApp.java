import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterApp {
    
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);  
        
      
        JTextArea textArea = new JTextArea(10, 30);  
        JButton countButton = new JButton("Count Words"); 
        JLabel resultLabel = new JLabel("Word Count: 0");  
        
       
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER); 
        frame.add(countButton, BorderLayout.SOUTH); 
        frame.add(resultLabel, BorderLayout.NORTH); 
        
        
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textArea.getText().trim();  
                int wordCount = countWords(inputText); 
                resultLabel.setText("Word Count: " + wordCount); 
            }
        });
        
       
        frame.setVisible(true);
    }
    
    
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+"); 
        return words.length;
    }
}
