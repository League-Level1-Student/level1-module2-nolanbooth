package _04_tea_maker;
import javax.swing.JOptionPane;
public class TeaMakerRunner {

	public static void main(String[]args) {
	TeaBag bill = new TeaBag("Chamomile");
	Kettle bob = new Kettle();
	Cup joe = new Cup();
	
	bill.getFlavor();
	bob.getWater();
	bob.boil();
	joe.makeTea(bill, bob.getWater());
	
	}
}
