import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F3 extends JFrame implements ActionListener{
private JPanel p1,p2;
private JButton canc,inv,dup,b1,b2,b3;
private JTextField tf;

public F3(String titolo) {
super(titolo);
//Istanzio i widgets
p1= new JPanel(new FlowLayout(FlowLayout.RIGHT));
p2= new JPanel(new GridLayout(0,3));
canc= new JButton("CANC");
inv= new JButton("INV");
dup= new JButton("DUP");
b1= new JButton("1");
b2= new JButton("2");
b3= new JButton("3");
tf= new JTextField();
//Posiziono gli elementi
add(tf,BorderLayout.NORTH);
p2.add(inv);
p2.add(canc);
p2.add(dup);
p2.add(b1);
p2.add(b2);
p2.add(b3);
p1.add(p2);
add(p1,BorderLayout.SOUTH);
//Registrazione Listener
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
//inv.addActionListener(this);
canc.addActionListener(this);
dup.addActionListener(this);
//Operazioni finali
setSize(300,200);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if(e.getSource()==b1)
      tf.setText(tf.getText()+"1");
    if(e.getSource()==b2)
      tf.setText(tf.getText()+"2");
    if(e.getSource()==b3)
      tf.setText(tf.getText()+"3"); 
    if(e.getSource()==canc)
      tf.setText("");
    if(e.getSource()==dup)
      tf.setText(tf.getText() + tf.getText());
}
}