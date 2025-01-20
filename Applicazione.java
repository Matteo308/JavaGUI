import javax.swing.*;
import java.awt.*;

public class Applicazione {
    public static void main(String[] args) {
        F1 nuova = new F1("Esercitazione");
        nuova.setVisible(true);
        nuova.setLocation(300,400);
        nuova.setSize(null);

        MainFinestra2 nuove = new MainFinestra2(null);
        //nuove.setVisible(true);
        //nuove.setLocation(900,400);
        //nuove.setSize(null);
    }
}