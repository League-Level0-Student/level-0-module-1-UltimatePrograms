import javax.swing.JOptionPane;

public class riddle {
	public static void main(String[] args) {
		int score = 0;
		String rid = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		if (rid.equals("candle")) {
			score++;
		} else {
			score--;

		}
		if (score >= 0) {
			speak("your score is" + score);
		} else {
			speak("your score is negative" + score);
		}
		String rid1 = JOptionPane.showInputDialog("Take off my skin - I won't cry, but you will! What am I?");
		if (rid1.equals("onion")) {
			score++;
		} else {
			score--;

		}
		if (score >= 0) {
			speak("your score is" + score);
		} else {
			speak("your score is negative" + score);
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}