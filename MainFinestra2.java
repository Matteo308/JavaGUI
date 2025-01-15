import javax.swing.*;
import java.awt.*;

public class MainFinestra2 extends JFrame {
    //elenco componenti
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JLabel l1;
    JLabel l2;
    JTextField tf1;
    JTextField tf2;
    JButton b1;

    public MainFinestra2(String titolo){
        super(titolo);
        //instanzia i widget
        p1= new JPanel(new GridLayout(2,0));
        p2= new JPanel(new GridLayout(2,0));
        p3= new JPanel(new BorderLayout());
        p4= new JPanel(new FlowLayout(FlowLayout.RIGHT));
        l1= new JLabel("Lire");
        l2= new JLabel("Euro");
        tf1= new JTextField();
        tf2= new JTextField();
        b1= new JButton("Converti");
        //posaizionamento
        add(p3,BorderLayout.NORTH);
        p1.add(l1);
        p1.add(l2);
        p3.add(p1, BorderLayout.WEST);
        p2.add(tf1);
        p2.add(tf2);
        p3.add(p2, BorderLayout.CENTER);
        add(p3,BorderLayout.NORTH);
        p4.add(b1);
        add(p4, BorderLayout.SOUTH);
        //Registrazione Listener
        //Operazioni finali
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
