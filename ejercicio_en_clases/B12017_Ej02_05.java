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
public class B12017_Ej02_05 
{
    public static void main(String args [])
    {
        String strSex;
        try
        {       // entrada de datos por teclado InputStreamReader
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese su sexo (M=Masculino;F=Femenino) : ");
            //leo o capturo lo que escribi 
            strSex=bur.readLine();
            if (strSex.equalsIgnoreCase("M"))
                System.out.println(" Buenas noches caballeros " );
            else
                if (strSex.equalsIgnoreCase("F"))
                    System.out.println("Buenas noches señorita.");
                else
                    System.out.println("Error sexo desconocido.");
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
