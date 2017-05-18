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
public class B12017_Ej02_010Mes 
{
    public static void main(String args [])
    {
        String strMeses, strMes;
         try
        {       // entrada de datos por teclado InputStreamReader
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese Numero del Mes (1=Enero;2=Febrero;3=Marzo;4=Abril;5=Mayo;6=Junio;7=Julio;8=Agosto;9=Septiembre;10=Octubre;11=Noviembre;12=Diciembre) : ");
            //leo o capturo lo que escribi 
            strMeses=bur.readLine().toUpperCase();
            switch (strMeses)
            {
                case "1":
                    strMes="Enero";
                    break;
                    
                case "2":
                    strMes="Febrero";
                    break;
                    
                case "3":
                    strMes="Marzo";
                    break;
                    
                case "4":
                    strMes="Abril";
                    break;
                    
                case "5":
                    strMes="Mayo";
                    break;
                
                case "6":
                    strMes="Junio";
                    break;
                    
                case "7":
                    strMes="Julio";
                    break;
                    
                case "8":
                    strMes="Agosto";
                    break;
                    
                case "9":
                    strMes="Septiembre";
                    break;
                    
                case "10":
                    strMes="Octubre";
                    break;
                    
                case "11":
                    strMes="Noviembre";
                    break;
                    
                 case "12":
                    strMes="Diciembre";
                    break;
                    default:
                        
                        strMes="Error: Mes no existe.";        
            }
              System.out.println(strMes); 
        }
              catch (IOException e)
        {
              System.out.println ("Exception:" + e.toString());
        }
              catch (NumberFormatException e)
        {
              System.out.println("Exception:" + e.toString());
        }
    }
}
