import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class F1 extends JFrame implements ActionListener{
    private JTextField tf;
    private JTextArea ta;
    private JPanel p1;
    private JButton b1;
    private JButton b2;


    public F1(String titolo){
        super(titolo);
        //Istanzio i widgets
        tf = new JTextField();
        ta = new JTextArea();
        p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        b1 = new JButton("Inserisci");
        b2 = new JButton("Ok");
        //Posizione gli elementi
        add(tf,BorderLayout.NORTH);
        add(ta,BorderLayout.CENTER);
        p1.add(b1);
        p1.add(b2);
        add(p1, BorderLayout.SOUTH);
        //Registrazione Listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        //Operazioni finali
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==b1)
          ta.append(tf.getText()+"\n");
        if(e.getSource()==b2)
          ta.setText("");
    }
}