package ar.edu.tecnica;

/**
 * @author NOMBRE Y APELLIDO ALUMNO
 * 
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		ejemploList();
		ejemploSet();
		ejemploMap();
		ejemploQueue();
		ejemploDeque();

		ejemploSort();
		ejemploReverse();
		ejemploShuffle();
		ejemploSwap();
		ejemploFill();
		ejemploMin();
		ejemploMax();
	}

	// Ejemplo de List usando ArrayList
	public static void ejemploList() {
		// ArrayList
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		System.out.println("Lista de números: " + numeros);
	}

	// Ejemplo de Set usando HashSet
	public static void ejemploSet() {
		// HashSet
		HashSet<Integer> numeros = new HashSet<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(10); // No se agrega porque los Sets no permiten duplicados
		System.out.println("Set de números (sin duplicados): " + numeros);
	}

	// Ejemplo de Queue usando PriorityQueue
	public static void ejemploQueue() {
		// PriorityQueue
		PriorityQueue<Integer> numeros = new PriorityQueue<Integer>();
		numeros.add(40);
		numeros.add(10);
		numeros.add(30);
		numeros.add(20);
		System.out.println("Queue de números (ordenados por prioridad): " + numeros);
	}

	// Ejemplo de Deque usando ArrayDeque
	public static void ejemploDeque() {
		// ArrayDeque
		ArrayDeque<Integer> numeros = new ArrayDeque<Integer>();
		numeros.addFirst(10);
		numeros.addLast(20);
		numeros.addFirst(30);
		numeros.addLast(40);
		System.out.println("Deque de números: " + numeros);
	}

	// Ejemplo de Map usando HashMap
	public static void ejemploMap() {
		// HashMap
		HashMap<String, Integer> numeros = new HashMap<String, Integer>();
		numeros.put("X", 10);
		numeros.put("Y", 20);
		numeros.put("Z", 30);
		System.out.println("Mapa de claves y valores: " + numeros);
	}

	// Ejemplo de SortedSet usando TreeSet
	public static void loadSortedSet() {
		// TreeSet
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.add(30);
		numeros.add(10);
		numeros.add(20);
		System.out.println("TreeSet (elementos ordenados): " + numeros);
	}

	// Ejemplo de SortedMap usando TreeMap
	public static void loadSortedMap() {
		// TreeMap
		TreeMap<String, Integer> numeros = new TreeMap<String, Integer>();
		numeros.put("Z", 30);
		numeros.put("X", 10);
		numeros.put("Y", 20);
		System.out.println("TreeMap (ordenado por claves): " + numeros);
	}

	// Ejemplo de sort usando Collections.sort()
	public static void ejemploSort() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(40);
		numeros.add(10);
		numeros.add(30);
		numeros.add(20);
		Collections.sort(numeros);
		System.out.println("Lista ordenada: " + numeros);
	}

	// Ejemplo de reverse usando Collections.reverse()
	public static void ejemploReverse() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		Collections.reverse(numeros);
		System.out.println("Lista invertida: " + numeros);
	}

	// Ejemplo de shuffle usando Collections.shuffle()
	public static void ejemploShuffle() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		Collections.shuffle(numeros);
		System.out.println("Lista mezclada aleatoriamente: " + numeros);
	}

	// Ejemplo de swap usando Collections.swap()
	public static void ejemploSwap() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		System.out.println("Lista antes de swap: " + numeros);
		Collections.swap(numeros, 1, 3);  // Intercambia los elementos en las posiciones 1 y 3
		System.out.println("Lista después de swap: " + numeros);
	}

	// Ejemplo de fill usando Collections.fill()
	public static void ejemploFill() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		Collections.fill(numeros, 100);  // Rellena toda la lista con el valor 100
		System.out.println("Lista después de fill: " + numeros);
	}

	// Ejemplo de min usando Collections.min()
	public static void ejemploMin() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(33);
		numeros.add(-32);
		var min = Collections.min(numeros);
		System.out.println("El mínimo es: " + min);
	}

	// Ejemplo de max usando Collections.max()
	public static void ejemploMax() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(33);
		numeros.add(-32);
		var max = Collections.max(numeros);
		System.out.println("El máximo es: " + max);
	}

}
