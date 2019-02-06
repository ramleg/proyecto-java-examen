package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {

	// listas de ejemplo, pueden variarse su contenido, 
	static Integer[] valoresLista1 = {1, 2, 5, 8, 10, 30, 20, 8, 9, 10};
	static Integer[] valoresLista2 = {1, 2, 4, 20, 5, 10, 7, 8, 10, 9};

	/**	 
	 * Para ejecutar el mÃ©todo main se debe hacer boton derecho sobre la clase
	 * "Run As --> Java Application" 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("**** inicializando datos ****");
		
		List<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(valoresLista1));
		List<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(valoresLista2));
		System.out.println("Lista1 = " + lista1.toString());
		System.out.println("Lista2 = " + lista2.toString());
		System.out.println("**** inicializacion exitosa ****");

		// EJERCICIO 4.1: explicar salidas y sugerir mejoras
		informacion(lista1, 10);
		
		// EJERCICIO 4.2: corregir el metodo
		List<Integer> union = unionListas(lista1, lista2);
		System.out.println("union: " + union.toString());
		
		// EJERCICIO 4.3: implementar
		List<Integer> interseccion = interseccionListas(lista1, lista2);
		System.out.println("interseccion: " + interseccion.toString());
		
		// EJERCICIO 4.4: implementar
		List<Integer> orden1 = ordenaListaAscendente(lista1);
		System.out.println("orden asc: " + orden1);
		
		// EJERCICIO 4.5: implementar
		List<Integer> orden2 = ordenaListaDescendente(lista2);
		System.out.println("orden desc: " + orden2);

		// EJERCICIO 4.6: implementar
		boolean b = tienenMismoContenido(lista1, lista2);
		System.out.println("mismo contenido: " + b);
		
	}

	private static void informacion(List<Integer> lista1, Integer numero) {
		// TODO: explicar salidas de los system out y sugerir alguna mejora a la implementacion
		
		int pares = 0;
		for (Integer n: lista1) {
			if (n % 2 == 0) {
				pares = pares + 1;
			}
		}
		// esta salida imprime la cantidad de numeros pares que contiene la coleccion que se pasa como argumento
		// a traves del operador matematico MOD (%), se puede saber esto ya que devuelve el resto de una divicion, 
		// y al estar dividido por 2, si el resto es 0 significa que el numero es par.
		// para mejorar la salida le agregue en el println un texto que explica la salida misma
		System.out.println("Cantidad de numeros pares en la coleccion: " + pares);
		
		List<Integer> impares = new ArrayList<Integer>();
		for (Integer n: lista1) {
			if (n % 2 != 0) {
				impares.add(n);
			}
		}
		/*
		 * esta salida imprime los elementos impares encontrados en la coleccion
		 * como mejora agregue un texo que explica la salida
		 */
		System.out.println("Numeros impares encontrados en la coleccion: " + impares.toString());
		
		int p = lista1.size() / 2;
		// esta salida imprime el indice del primer elemento encontrado que coincida con el parametro pasado.
		// si el elemento pasado no se encuentra, devuelve -1. por lo que sugiero implementar un imput para especificar el valor a encontrar
		// en vez de en vez de harcodear un valor que sale de la divicion en 2 del tamaño de la lista (en un caso aislado como este no tiene sentido).
		// agregue el texto para explicar el output
		System.out.println("El numero (" + p + ") tiene como indice (" + lista1.indexOf(p) + ") en la coleccion");
		
		int c = 0;
		for (Integer n: lista1) {
			if (n > numero) {
				c = c + 1;
			}
		}
		// numero es = al numero pasado por parametros
		// c es igual a la cantidad de numeros mayores a 'numero' encontrados en la coleccion
		
		if (c > lista1.size() / 2) {
			// imprime esto si la cantidad de numeros mayores a 10 encontrados en la coleccion supera la mitad de la cantidad de elementos en la coleccion
			System.out.println("CASO 1: la cantidad de elementos mayores a " + numero + " supera a la mitad de numeros en total");
		} else if (c > 0) {
			// imprime esto si encuentra al menos 1 numero que sea mayor a 10
			System.out.println("CASO 2: hay al menos 1 elemento mayor a " + numero);
		} else {
			// ningun elemento es mayor a 10
			System.out.println("CASO 3: ningun elemento es mayo a " + numero);
		}
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos de ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> unionListas(List<Integer> lista1, List<Integer> lista2) {
		// TODO: corregir el metodo para que funcione correctamente 
		
		List<Integer> union = new ArrayList<Integer>();
		
		union.addAll(lista1);
		
		for (Integer m: lista2) {
			if (!union.contains(m)) {
				union.add(m);
			}
		}
		return union;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos que estan presentes en ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2) {
		// TODO:
		List<Integer> interseccion = new ArrayList<Integer>();
		
		for(Integer e: lista1) {
			if(lista2.contains(e) && !interseccion.contains(e)) {
				interseccion.add(e);
			}
		}
		
		return interseccion;
	}

	/***
	 * @param lista1
	 * 
	 * retornar la lista recibida, ordenada en forma ascendente
	 * 
	 */
	private static List<Integer> ordenaListaAscendente(List<Integer> lista1) {
		// TODO:
		
		Object[] arreglo = lista1.toArray();
		
		for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if ((Integer)arreglo[j] > (Integer)arreglo[j + 1])
                {
                    int tmp = (Integer) arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
		
		List<Integer> ordenado = new ArrayList<Integer>();
		for(int i = 0;i < arreglo.length; i++)
        {
			ordenado.add((Integer)arreglo[i]);
        }
		
		return ordenado;
	}

	/***
	 * @param lista2
	 * 
	 * retornar la lista recibida, ordenada en forma descendente
	 * 
	 */
	private static List<Integer> ordenaListaDescendente(List<Integer> lista2) {
		// TODO:
Object[] arreglo = lista2.toArray();
		
		for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if ((Integer)arreglo[j] < (Integer)arreglo[j + 1])
                {
                    int tmp = (Integer) arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
		
		List<Integer> ordenado = new ArrayList<Integer>();
		for(int i = 0;i < arreglo.length; i++)
        {
			ordenado.add((Integer)arreglo[i]);
        }
		
		return ordenado;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * devuelve true si contienen los mismos elementos
	 * NO se considera valido que esten en diferente orden
	 * NO se considera valido que la cantidad de repeticiones de los elementos sea diferente
	 * 
	 */
	private static boolean tienenMismoContenido(List<Integer> lista1, List<Integer> lista2) {
		// TODO:		
		
		if(lista1.size() == lista2.size()) {
			int i=0;
			for(Integer e : lista1) {
				if(e != lista2.get(i)) {
				return false;
				}
				i++;
			}
			return true;
		}else {
			return false;
		}
	}

}
