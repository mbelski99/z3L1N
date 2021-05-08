import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainPrinter {
    public static void main(String[] args){
        TimePrinter1 printer=new TimePrinter1(1000);
        JOptionPane.showMessageDialog(null,"ok");
    }
}

class TimePrinter1{
    class TimerListener1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Mineło xx sekunbd");
        }
    }
    private int interval;
    Timer t;


    public TimePrinter(int interval) {
        this.interval = interval;
        TimerListener tl=new TimerListener();
        t=new Timer(interval, tl);
        t.start();
    }
}

