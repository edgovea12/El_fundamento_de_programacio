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
public class B22016_Ej02_24
{
    public static void main(String args[])
    {
        String strCad, strCadAux; //Cadena de texto, Cadena auxiliar.
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese una cadena de texto: ");
            strCad=bur.readLine();
            strCadAux="";
            for (int i=0; i<strCad.length(); i++)
            {
                strCadAux+=strCad.charAt(i) + "-";
            }
            System.out.print(strCadAux.substring(0, strCadAux.length()-1));
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
