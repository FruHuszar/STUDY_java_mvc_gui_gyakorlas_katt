package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
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
        JLabel lbl = nezet.getLblKiir();
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Katt");
                nezet.megjelenit("Katt");
            }
        });
    }
}
