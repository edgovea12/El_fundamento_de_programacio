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
public class B12017_Ej02_014 
{
    public static void main(String args [])
    {
        int intNum1, intNum2, intSum;
        try
        {       // entrada de datos por teclado InputStreamReader
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.println("Ingrese Numero 1: ");
            //leo o capturo lo que escribi 
            //la conversion a string de un entero es .parseInt
            intNum1=Integer.parseInt(bur.readLine());
            System.out.print("Ingrese Numero 2: \n");
            intNum2=Integer.parseInt(bur.readLine());
            intSum=intNum1+intNum2;
            System.out.println(" Suma" + intSum);
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
