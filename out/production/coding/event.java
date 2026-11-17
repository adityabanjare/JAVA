import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mymouse extends JFrame implements MouseListener
{
 jlabel 1;
 mymouse() {
    1=new jLabel();
    setsize(400,400);
    setLayout(new FlowLayout());
    setVisible(true);
    add(1);
    addMouseListener(this);

    }
    public void mouseClicked(MouseEvent e){
        1.setText("x = +e.getX()+",  "y=+e.getY()");

    }
    public void mouseEntered(MouseEvent e){

    }
    public void mouseExited(MouseEevent e){

    }
    public void mousePressed(MouseEvent e){
        
    }
    
}

