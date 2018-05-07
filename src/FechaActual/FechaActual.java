/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//adding more coments on this code.
package FechaActual;

import java.util.Calendar;

/**
 *
 * @author Angel
 */
public class FechaActual {

    public String fechaActual;
    public String fechaMes;
    public String fechaAño;
    public String dia;
    public String mess;
    public String año;

    public void FechaActual() {

    }

    public void generarFechaDia() {

        Calendar c1 = Calendar.getInstance();
        int diaa = c1.get(Calendar.DATE);
        dia = Integer.toString(diaa);
        if (diaa <= 9) {
            dia = "0" + dia;
        }

        int mes = c1.get(Calendar.MONTH) + 1;
        mess = Integer.toString(mes);
        if (mes <= 9) {
            mess = 0 + mess;
        }
        año = Integer.toString(c1.get(Calendar.YEAR));
        fechaActual = año + "-" + mess + "-" + dia;

    }

    public void generarFechaMes() {
        Calendar c1 = Calendar.getInstance();
        int mes = c1.get(Calendar.MONTH) + 1;
        mess = Integer.toString(mes);
        if (mes <= 9) {
            mess = 0 + mess;
        }
        año = Integer.toString(c1.get(Calendar.YEAR));
        fechaMes = año + "-" + mess;

    }

    public void generarAño() {
        Calendar c1 = Calendar.getInstance();
        dia = Integer.toString(c1.get(Calendar.DATE));

        año = Integer.toString(c1.get(Calendar.YEAR));
        fechaAño = año + "-";

    }
}
