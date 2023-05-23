import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    InputPanel aOldal;
    InputPanel bOldal;
    InputPanel cOldal;
    InputPanel terfogatPanel;
    JPanel buttonPanel;
    JPanel adatok;
    JButton calcButton;
    
    public MainFrame() {
        this.initComponent();
        this.addComponent();
        this.handleEvent();
        this.setFrame();
    }
    private void initComponent() {
        this.aOldal = new InputPanel("A oldal");
        this.bOldal = new InputPanel("B oldal");
        this.cOldal = new InputPanel("C oldal");
        this.buttonPanel = new JPanel();
        this.terfogatPanel = new InputPanel("Térfogat");
        this.calcButton = new JButton("Számít");
    }
    private void addComponent() {
        this.add(this.aOldal);
        this.add(this.bOldal);
        this.add(this.cOldal);
        this.add(this.buttonPanel);
        this.add(this.terfogatPanel);
        this.buttonPanel.add(this.calcButton);
    }
    private void handleEvent() {
        this.calcButton.addActionListener( e -> {
            startCalc();
        });
    }
    private void startCalc() {
        String aOldalStr = this.aOldal.getValue();
        if(!this.checkInput(aOldalStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }
        double aOldalSzam = Double.parseDouble(aOldalStr);
        
        String bOldalStr = this.bOldal.getValue();
        if(!this.checkInput(bOldalStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }
        double bOldalSzam = Double.parseDouble(bOldalStr);

        String cOldalStr = this.cOldal.getValue();
        if(!this.checkInput(cOldalStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }
        double cOldalSzam = Double.parseDouble(cOldalStr);
        
        Double tesaOldalSzamIndex = this.calTerfogat(aOldalSzam, bOldalSzam, cOldalSzam);
        this.terfogatPanel.setValue(tesaOldalSzamIndex.toString());
    }

    public double calTerfogat(double aOldalSzam, double bOldalSzam, double cOldalSzam) {
        return aOldalSzam*bOldalSzam*cOldalSzam;
    }

    public boolean checkInput(String input) {
        boolean ok = false;
        if(input.matches("[0-9.]+")) {
            ok = true;
        }
        return ok;
    }

    private void setFrame() {
        this.setLayout(new BoxLayout(
            this.getContentPane(), BoxLayout.PAGE_AXIS)
        );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
}
