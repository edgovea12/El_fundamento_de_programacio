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
public class B12017_Ej02_06_a 
{
    public static void main(String args [])
    {
        String strEstado;
        /*String strCasado;
        String strDivorciado;
        String strViudo;
        String strUnion;*/
        try
        {       // entrada de datos por teclado InputStreamReader
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese su Esatado Civil (S=Soltero;C=Casado;D=Divorciado;V=Viudo;U=Union):");
            //leo o capturo lo que escribi 
            strEstado=bur.readLine();
            
            if (strEstado.equalsIgnoreCase("S"))
                System.out.println(" Soltero " );
            else if (strEstado.equalsIgnoreCase("C"))
                System.out.println("Casado");
            else if (strEstado.equalsIgnoreCase("D"))
                System.out.println("Divorciado");
            else if (strEstado.equalsIgnoreCase("V"))
                System.out.println("Viudo");
            else if (strEstado.equalsIgnoreCase("U"))
                System.out.println("Union Libre");
            else
                System.out.println(" desconocido.");
        }
        catch (IOException e)
        {
            System.out.println("Exception: " + e.toString());       
        }
        catch (NumberFormatException e)
        {
            System.out.println("Exception: " + e.toString());    
        }
    }
}
