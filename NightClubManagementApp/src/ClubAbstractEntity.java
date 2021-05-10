import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Component;



public abstract class ClubAbstractEntity {
    private JButton okButton;
    private JButton cancelButton;
    private JPanel centerPanel;
    private class ButtonsHandler {
//in here: a main method like this one :public void mousePressed(MouseEvent e) with button instead
    }
    //constructor
    //here

    protected void addToCenter(Component guiComponent) {

    }
    public abstract boolean match(String key);
    protected abstract boolean validateData();
    protected abstract void commit();
    protected abstract void rollBack();
}
