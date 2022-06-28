/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author AC_Inc
 */
public class Descuentos {
	public static double descuento(double promedio, int edad, int estrato) {
		int MATRICULA = 630000;
		double saldo = MATRICULA, valorDescuento;
		valorDescuento = 0;
		if (estrato < 4 && edad < 18) {
			valorDescuento = valorDescuento + (MATRICULA*0.7);
		};
		if (estrato>=4) {
			valorDescuento=valorDescuento + (MATRICULA*0.2);
		};
		if (promedio >= 4) {
			valorDescuento = valorDescuento+((MATRICULA - valorDescuento)*0.5);
		}
		return valorDescuento;
	}

	public static double descuento(double promedio, int edad) {
		int MATRICULA = 630000;
		double saldo = MATRICULA, valorDescuento;
		valorDescuento = 0;
		if (edad < 20) {
			valorDescuento = valorDescuento + (MATRICULA*0.2);
		}else{
			valorDescuento = valorDescuento + (MATRICULA*0.35);
		};
		if (promedio >= 4.5) {
			valorDescuento = valorDescuento+((MATRICULA - valorDescuento)*0.2);
		}
		return valorDescuento;
	}	
	
}
