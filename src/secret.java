import javax.swing.JOptionPane;

public class secret {
public static void main(String[] args) {
	String sec = JOptionPane.showInputDialog("Enter Message");
	String pass = sec;
String m = JOptionPane.showInputDialog("enter password");
 if (m.equalsIgnoreCase(pass)) {
	 JOptionPane.showMessageDialog(null, sec);
 }
 else {
	 speak("INTRUDER!!!");
	 
 }
}

static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
}
}