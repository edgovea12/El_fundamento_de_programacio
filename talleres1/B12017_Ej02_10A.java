/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.edu.ec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/** @author alum_tes_a
 */
public class B12017_Ej02_10A 
{
    
   public static void main(String args[])
   {    
     String strUsa,strCl,strConf;//Inicio de sesion
      try
     { 
         InputStreamReader isr=new InputStreamReader(System.in);
         BufferedReader bur=new BufferedReader(isr);
         System.out.print("Ingrese su usuario(:");
         strUsa=bur.readLine();
         System.out.print("Ingrese su clave(:");
         strCl=bur.readLine();
         System.out.print("Confirme su clave(:");
         strConf=bur.readLine();
        
        
         
             if(strCl.equalsIgnoreCase(strCl))
                 System.out.println("bienvenido"+""+ strUsa); 
      else
     System.out.println("Error: La clave es diferente a la confirmacion");
     }
     catch (IOException e)
     {
         
     } 
      
     }
         
   }




     
   
   
