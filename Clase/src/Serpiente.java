import javax.swing.JOptionPane;

public class Serpiente extends Animal {
	
	private String veneno;

	
	public Serpiente(String nombre, String color, int edad, String veneno) {
		super(nombre, color, edad);
		this.veneno = veneno;
	}

	public String getVeneno() {
		return veneno;
	}

	public void setVeneno(String veneno) {
		this.veneno = veneno;
	}

	@Override
	public String toString() {
		return "Serpiente [veneno=" + veneno + ", Nombre=" + getNombre() + ", Color=" + getColor()
				+ ", Edad=" + getEdad() + "]";
	}

	public void hacerSonido() {
		JOptionPane.showMessageDialog(null, "zZzZzZzZz");
	}
	
	public void caminar() {
		JOptionPane.showMessageDialog(null, "estoy reptando");
	}
	
}
