import javax.swing.JOptionPane;

public class Cat extends Animal {

	private String bigotes;
	
	public Cat(String nombre, String color, int edad, String bigotes) {
		super(nombre, color, edad);
		this.bigotes = bigotes;
	}

	public String getBigotes() {
		return bigotes;
	}

	public void setBigotes(String bigotes) {
		this.bigotes = bigotes;
	}

	@Override
	public String toString() {
		return "Cat [bigotes=" + bigotes + ", Nombre=" + getNombre() + ", Color=" + getColor()
				+ ", Edad=" + getEdad() + "]";
	}
	
	@Override
	public void hacerSonido() {
		JOptionPane.showMessageDialog(null, "miau");
	}

	
}
