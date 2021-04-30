package proyecto_videoclub;

public class AplicacionReseteable {

	public static void main(String[] args) {
		Entrega entregas [] = new Entrega[] {
				new Pelicula("Joker", "Todd Phillips"),
				new Serie("Breaking Bad", 2, Genero.DRAMA, "Vince Gilligan"),
				new Pelicula()
		};
		entregas[0].setTitulo("Batman");
		System.out.println(entregas[0]);
		entregas[0].reset();
		System.out.println(entregas[0]);
	}

}
