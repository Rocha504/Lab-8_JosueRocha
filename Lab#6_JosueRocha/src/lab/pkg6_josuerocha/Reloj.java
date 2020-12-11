 
package lab.pkg6_josuerocha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Reloj implements Runnable{
    
    private JLabel reloj;
    
    public Reloj (JLabel reloj){
        this.reloj=reloj;
    }

    @Override
    public void run() {//Este metodo simula un reloj dandole texto a un JLabel con la hora de la computadora
        while(true){
            Date x=new Date();
            DateFormat y=new SimpleDateFormat("hh:mm:ss");
            reloj.setText(y.format(x));
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                System.out.println("Algo salio mal");
            }
            
            
        }
    }
    
    
}
