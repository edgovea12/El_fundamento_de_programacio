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
public class B12017_Ej02_07 
{
    public static void main(String args [])
    {
        String strEstCiv;
         try
        {       // entrada de datos por teclado InputStreamReader
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese su EStado sivil (S=Soltero;C=Casado;D=Divorciado;V=Viudo;U=UnionLibre) : ");
            //leo o capturo lo que escribi 
            strEstCiv=bur.readLine();
            switch (strEstCiv)
            {
                case "S":
                    System.out.println("Soltero");
                    break;
                    
                case "C":
                    System.out.println("Casado");
                    break;
                    
                case "D":
                    System.out.println("Divorciado");
                    break;
                    
                case "V":
                    System.out.println("Viudo");
                    break;
                    
                case "UnionLibre":
                    System.out.println("Union Libre");
                    break;
                    
                    default:
                        
                        System.out.println("Error: Estado ciivil desconocido");        
            }
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
