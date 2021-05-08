import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainPrinter {
    public static void main(String[] args){
        TimePrinter2 printer=new TimePrinter2(1000);
        JOptionPane.showMessageDialog(null,"ok");
    }
}

class TimePrinter2{
    class TimerListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Mineło xx sekunbd");
        }
    }
    private int interval;
    Timer t;


    public TimePrinter2(int interval) {
        this.interval = interval;
        TimerListener tl=new TimerListener();
        t=new Timer(interval, tl);
        t.start();
    }
}

