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
public class B12017_Ej02_010 
{
    public static void main(String args [])
    {
        String strEstCiv, strRes;
         try
        {       // entrada de datos por teclado InputStreamReader
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese su EStado sivil (S=Soltero;C=Casado;D=Divorciado;V=Viudo;U=UnionLibre) : ");
            //leo o capturo lo que escribi 
            strEstCiv=bur.readLine().toUpperCase();
            switch (strEstCiv)
            {
                case "S":
                    strRes="Soltero";
                    break;
                    
                case "C":
                    strRes="Casado";
                    break;
                    
                case "D":
                    strRes="Divorciado";
                    break;
                    
                case "V":
                    strRes="Viudo";
                    break;
                    
                case "UnionLibre":
                    strRes="Union Libre";
                    break;
                    
                    default:
                        
                        strRes="Error: Estado ciivil desconocido";        
            }
            System.out.println(strRes); 
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
