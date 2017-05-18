/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.edu.ec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author alum_tes_a
 */
public class B12017_Ej02_016 
{
    public static void main(String args [])
    {
        int intDiaSemNum;//dia de la semana en numero.
        try
        {       // entrada de datos por teclado InputStreamReader
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese unn numero entre 1 y 7: ");
            //leo o capturo lo que escribi 
            intDiaSemNum=Integer.parseInt(bur.readLine());
            System.out.println(" Dia de la semana " + getNombreDiaSemana(intDiaSemNum));
        }
        catch (IOException e)
        {
            System.out.println("Exception: " + e.toString());       
        }
        catch (NumberFormatException e)
        {
            System.out.println("Exception: " + e.toString());    
        }
    }   //obtener
    //si no devuelve nana va el void y nose retorna nada osea return
    private static String getNombreDiaSemana(int intDiaSem)
    {
        String strRes="";//Repuesta
        switch (intDiaSem)
        {
            case 1:
                strRes="Lunes";
                        
                break;
            case 2:
                strRes="Martes";
                break;
            case 3:
                strRes="Miercoles";
                break;
            case 4:
                strRes="Jueves";
                break;
            case 5:
                strRes="Viernes";
                break;
            case 6:
                strRes="Sabado";
                break;
            case 7:
                strRes="Domingo";
                break;
            default:
                    strRes="Error: Dia de la semana desconocido";
        }
        return strRes;
        
    }
}
