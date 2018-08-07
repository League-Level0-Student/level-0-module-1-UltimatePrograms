import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String birth =	JOptionPane.showInputDialog(" what is your birthday (mm/dd)");
if (birth.equals("08/07")) {
	JOptionPane.showMessageDialog(null, "happy birthday");
}
else {
	JOptionPane.showMessageDialog(null, "happy unbirthday");
}
}
}