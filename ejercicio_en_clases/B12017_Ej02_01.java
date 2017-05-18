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
public class B12017_Ej02_01 
{
    public static void main(String args [])
    {
        String strNom;
        try
        {       // entrada de datos por teclado InputStreamReader
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese su nombre ");
            //leo o capturo lo que escribi 
            strNom=bur.readLine();
            System.out.println(" Buenas noches" + strNom);
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
