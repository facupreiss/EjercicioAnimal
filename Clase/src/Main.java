import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat francis = new Cat ("Francis", "Naranja", 6, "Largos");
		
		JOptionPane.showMessageDialog(null, francis);
		
		francis.hacerSonido();
		francis.caminar();
		
		Serpiente lucas = new Serpiente ("Lucas", "Verde", 19, "Mortal");
		
		JOptionPane.showMessageDialog(null, lucas);
		
		lucas.hacerSonido();
		lucas.caminar();
		
		
	}

}
