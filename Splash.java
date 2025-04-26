package employee.management.system;
import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame{
    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1170,650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,430);
        add(image);
        setSize(800,430);
        setLocation(300,150);
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(3000);
            setVisible(false);
            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Splash();
    }
}
