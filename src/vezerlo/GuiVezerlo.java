package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import nezet.GuiNezet;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class GuiVezerlo {
    /*private Modell modell; //Most nincs*/
    private GuiNezet nezet;

    public GuiVezerlo(GuiNezet nezet) {
        this.nezet = nezet;
        
        JButton btn = nezet.getBtnKiir();
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Katt");
                
                //A kontroller a nézet cucaival foglalkozik és nem tudja mi van a nézetben. Mivel egy megjelenit-et használjuk nem a simaetText-et, simán kicserélhettük a lbl-t txa-ra, és nem kellett nagyon átírni itt semmit.
                nezet.megjelenit("Katt" + System.lineSeparator());
            }
        });
    }
}
