package mcv_euro;

public class Mcv_euro {

	public static void main(String[] args) {
		vista vista=new vista();
		Modelo modelo= new Modelo();
		Controlador control=new Controlador(modelo, vista);
		control.InicializarVista();
	}

}
