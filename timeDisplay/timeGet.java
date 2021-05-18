import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import java.awt.*;
import javax.swing.*;   
public class timeGet {   

  private static void createwindow(String time) {
    JFrame frame = new JFrame("Time");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setUndecorated(true);
    frame.setOpacity(0.5f);

    JLabel textLabel = new JLabel(time, JLabel.CENTER);
    frame.getContentPane().add(textLabel, BorderLayout.CENTER);

    textLabel.setFont(new Font("Courier", Font.PLAIN,25));
    textLabel.setText(time);

    frame.setSize(300, 220);
    frame.setBounds(200, 200, 1100, -600);
    frame.setLocationRelativeTo(null);
    frame.pack();
    frame.setVisible(true);
    while(true){
      textLabel.setText(cTime());
    }
  }

  public static String cTime(){
    while (true){
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();  
      String currTime = dtf.format(now);
      return currTime;
    }
  }
  public static void main(String[] args) {   
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    String currentTime = dtf.format(now);
    createwindow(currentTime);
  }
}