//Segundo Ejercicio
public class SegundoEjercicio {
	public static void main(String[] args) {
		Coche miCoche = new Coche();
		miCoche.IncPuertas();
		System.out.println(miCoche.puertas);

	}
}

//Creo la clase llamada coche

class Coche {
	//variable numérica que almacena el n°de puertas
	public int puertas = 5;

    //Función que incrementa el n° de puertas que tiene el coche
	public void IncPuertas() {
		this.puertas++; 
	}
}

