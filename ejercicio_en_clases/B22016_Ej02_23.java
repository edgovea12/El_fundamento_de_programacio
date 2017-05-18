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
 * @author prof_tes_a
 */
public class B22016_Ej02_23
{
    public static void main(String args[])
    {
        String strCad; //Cadena de texto.
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese una cadena de texto: ");
            strCad=bur.readLine();
            for (int i=0; i<strCad.length(); i++)
            {
                System.out.print(strCad.charAt(i));
                if (i<strCad.length()-1)
                    System.out.print("-");
            }
        }
        catch (IOException e)
        {
            System.out.println("Excepción: " + e.toString());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Excepción: " + e.toString());
        }
    }
    
}
