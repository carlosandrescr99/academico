/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * @author AC_Inc
 */
public class Validador {
	// Devolución validación de valores enteros
	public static int returnInt() {
		int zInt;
		Map<Boolean, Integer> mapa = new HashMap<>();
		mapa = validateInt();
		if (mapa.containsKey(true)){
//		      System.out.println(mapa.get(true)); comando para escribir valor de una clave
		      zInt=(mapa.get(true));
		    }else {
		    	zInt=(mapa.get(false));
			    System.out.println("Solo numeros enteros");
		    }
		return zInt;
	}
	// Validación de valores enteros
	public static Map validateInt(){
		Map<Boolean, Integer> mapa = new HashMap<>();
        int valueInt;
        	try{
                valueInt = new Scanner(System.in).nextInt();
                mapa.put(true, valueInt);
                return mapa;
            }catch(Exception e){
                valueInt = 0;
                mapa.put(false, valueInt);
                return mapa;
            }
	}	


	// Devolución validación de valores float
	public static float returnFloat() {
		float zFloat;
		Map<Boolean, Float> mapa = new HashMap<>();
		mapa = validateFloat();
		if (mapa.containsKey(true)){
		      System.out.println(mapa.get(true));
		      zFloat=(mapa.get(true));
		      System.out.println("Lo encontre");
		    }else {
		    	zFloat=(mapa.get(false));
			    System.out.println("No lo encontre");
		    }
		return zFloat;
	}
	
	// Validación de valores Float
	public static Map validateFloat(){
		Map<Boolean, Float> mapa = new HashMap<>();
        float valueFloat;
        	try{
                valueFloat = new Scanner(System.in).nextFloat();
                mapa.put(true, valueFloat);
                return mapa;
            }catch(Exception e){
                valueFloat = 0;
                mapa.put(false, valueFloat);
                return mapa;
            }
	}

	// Devolución validación de valores double
	public static double returnDouble() {
		double zDouble;
		Map<Boolean, Double> mapa = new HashMap<>();
		mapa = validateDouble();
		if (mapa.containsKey(true)){

		      zDouble=(mapa.get(true));
		    }else {
		    	zDouble=(mapa.get(false));
			    System.out.println("Solo numeros validos");
		    }
		return zDouble;
	}
	
	// Validación de valores Double
	public static Map validateDouble(){
		Map<Boolean, Double> mapa = new HashMap<>();
		double valueDouble;
        	try{
                valueDouble = new Scanner(System.in).nextDouble();
                mapa.put(true, valueDouble);
                return mapa;
            }catch(Exception e){
                valueDouble = -1;
                mapa.put(false, valueDouble);
                return mapa;
            }
	}
}
