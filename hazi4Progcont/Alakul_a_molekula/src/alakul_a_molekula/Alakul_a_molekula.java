/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alakul_a_molekula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Husika
 */



class lista_elem implements Comparable<lista_elem>{
    public String nev;
    public List<egy_darab> lista;

    public lista_elem(String nev) {
        this.nev = nev;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nev).append(":").append(System.getProperty("line.separator"));
        
        for(int x=0;x<lista.size();x++)
        {
            sb.append(lista.get(x)).append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }

    @Override
    public int compareTo(lista_elem other) {
        return this.nev.compareTo(other.nev);
    }
    
    
    
}

class egy_darab implements Comparable<egy_darab>{
    public String nev;
    public int tomeg;

    public egy_darab(String nev, int tomeg) {
        this.nev = nev;
        this.tomeg = tomeg;
    }

    @Override
    public String toString() {
        return tomeg+" "+nev;
    }

    @Override
    public int compareTo(egy_darab o) {
        int diff=Integer.compare(o.tomeg, this.tomeg);
        if(diff!=0) return diff;
        
        return this.nev.compareTo(o.nev);
    }
    
}

public class Alakul_a_molekula {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<lista_elem> fo_lista = new ArrayList<lista_elem>();
        //Locale.setDefault(Locale.US);
        Map<String,String> tabla = new TreeMap<String, String>();
        int index=0;
        String sor;
        String[] token;
        
        while( (sor=br.readLine())!=null && !sor.equals("-") )
        {
            
            token=sor.split(":");
            if(tabla.containsKey(token[0])){
                
            }else{
                tabla.put(token[0], token[1]);
            }
        }
     
     while ( ( sor = br.readLine())!=null)
     {
         List<egy_darab> mellek_lista = new ArrayList<egy_darab>();
         
         token=sor.split("[:,]");
         
         
         String nev=token[0];
        
         for(int i=1;i<token.length;i++)
         {
             int talalat=0;
             for(int k=0;k<mellek_lista.size();k++)
             {
                 if(mellek_lista.get(k).nev.equals(tabla.get(token[i])))
                 {
                     mellek_lista.get(k).tomeg++;
                     talalat++;
                     break;
                 }
                 
             }
             if(talalat==0) mellek_lista.add(new egy_darab(tabla.get(token[i]), 1));
         }
         Collections.sort(mellek_lista);
         
         fo_lista.add(new lista_elem(nev)); 
         fo_lista.get(index).lista=new ArrayList<egy_darab>();
         
         for(int x=0;x<mellek_lista.size();x++)
         fo_lista.get(index).lista.add(mellek_lista.get(x));
         mellek_lista.clear();
         mellek_lista.removeAll(fo_lista);
         
         index++;
         
     }
        
        
        Collections.sort(fo_lista);
        
        for(int i=0;i<fo_lista.size();i++)
        {
            System.out.print(fo_lista.get(i));
        }
        
        tabla.clear();
        fo_lista.clear();
        fo_lista.removeAll(fo_lista);
        System.gc();
    }
}