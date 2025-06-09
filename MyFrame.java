import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

    private int frameWidth = 900;
    private int frameHeight = 600;

    private int gridSize = 15;

    public void initFrame(){
        setVisible(true);
        setSize(frameWidth, frameHeight);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){

        g.setColor(Color.lightGray);

        for (int i=0; i < frameWidth; i = i + gridSize){
            g.drawLine(i, 0, i, frameHeight);
        }

        for (int j=0; j<frameHeight; j=j+gridSize){
            g.drawLine(0, j, frameWidth, j);
        }
    }

    public static void main(String[] args){
        MyFrame frame =new MyFrame();
        frame.initFrame();
    }

}
