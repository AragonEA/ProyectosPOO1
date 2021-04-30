package proyecto_supermercado;

public class DemoSupermercado {

	public static void main(String[] args) {
		System.out.println("DIA");
		Supermercado dia = new Supermercado();
		dia.agregarClientesColaA(10);
		System.out.println(dia);
		dia.abrirColaB(15);
		System.out.println(dia);
		System.out.println();
		
		System.out.println("CARREFOUR");
		Supermercado carrefour = new Supermercado();
		carrefour.agregarClienteColaA(new Cliente(1, 9));
		carrefour.agregarClienteColaA(new Cliente(2, 3));
		carrefour.agregarClienteColaA(new Cliente(3, 7));
		System.out.println(carrefour);
		carrefour.abrirColaB(5);
		System.out.println(carrefour);		
	}

}
