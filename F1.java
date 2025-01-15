import javax.swing.*;
import java.awt.*;
class F1 extends JFrame{
    private JTextField tf;
    private JTextArea ta;
    private JPanel p1;
    private JButton b1;

    public F1(String titolo){
        super(titolo);
        //Istanzio i widgets
        tf = new JTextField();
        ta = new JTextArea();
        p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        b1 = new JButton("Inserisci");
        //Posizione gli elementi
        add(tf,BorderLayout.NORTH);
        add(ta,BorderLayout.CENTER);
        p1.add(b1);
        add(p1, BorderLayout.SOUTH);
        //Registrazione Listener
        //Operazioni finali
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}