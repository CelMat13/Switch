
package pkgswitch;
import java.io.*;

/**
 * @author Mateusz
 */

class osoba
{
    String nazw;
    String imie;
    String nr_alb;
    
    public void inicjuj()
            throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Wprowadz dane.");
        System.out.println("Podaj imie ");
        imie = br.readLine();
        System.out.println("podaj nazwisko");
        nazw = br.readLine();
        System.out.println("Podaj nr albumu");
        nr_alb = br.readLine();
        
        System.out.println();
    }
    
    public void drukuj()
    {
        System.out.println("Wyświetlanie danych.");
        System.out.println("=======================");
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazw);
        System.out.println("Nr albumu: "+nr_alb);
    }
}

public class Switch 
{
   
    public static void main(String[] args)
            throws IOException
   
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        
        osoba student = new osoba();
        
        for(i=0; ;i++)
        {
            System.out.println("MENU");
            System.out.println("1-Dodawanie albumu.");
            System.out.println("2-usuwanie albumu.");
            System.out.println("3-Wyświetlanie albumu.");
            System.out.println("0-Koniec.");
            i = Integer.parseInt(br.readLine());
            
             System.out.println();
            
            switch(i) 
            {
                case 1: System.out.println("Dodawanie albumu.");
                
                student.inicjuj();
                System.out.println("==============");
                
                break; 
                
                case 3:  System.out.println("Wyświetlanie albumu.");
                 student.drukuj();
                 System.out.println("==============");
                 
                 break; 
                 
                case 0:  System.out.println("Koniec pracy.");
                System.out.println("==============");
                         
                        exit(0);
            }
        }
        
    }
    
}
