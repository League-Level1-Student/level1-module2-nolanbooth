package _02_sea_creature;
import javax.swing.JOptionPane;
public class SeaCreatureRunner {
public static void main(String[]args) {

	SeaCreature sBob = new SeaCreature("SPONGEBOB");
	sBob.eat();

	SeaCreature pat = new SeaCreature("PATRICK");
	pat.eat();
	
	System.out.println(sBob.getName() + " " + pat.getName());
	
System.out.println(sBob.getClass() + " " + pat.getClass());

JOptionPane.showMessageDialog(null, sBob.getClass() + " " + pat.getClass());

JOptionPane.showMessageDialog(null, sBob.getName() + " " + pat.getName());

}	
}
