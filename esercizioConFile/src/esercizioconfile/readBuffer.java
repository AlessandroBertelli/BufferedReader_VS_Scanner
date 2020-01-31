package esercizioconfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readBuffer {
    
    FileReader fr;
    BufferedReader br;
    int[] array = new int[500000];
    int counter = 0;
    
    public readBuffer() throws FileNotFoundException {
        try {
            fr = new FileReader("file.txt");
            br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato!");
        }
    }
    
    public void leggiFile() throws IOException {
        long startTime = System.currentTimeMillis();
        String s; 
        String[] numStr;
        for (int i = 0; i < 100000; i++) {                       
            s = br.readLine();            
            numStr = s.split(" ");            
            for (int j = 0; j < 5; j++) {                
                array[counter++] = Integer.parseInt(numStr[j]);
            }            
        }
        System.out.println("Il tempo di esecuzione con BufferReader è di: "+(System.currentTimeMillis()-startTime)+" ms");
    }
    
    public void stampaArray() {
        
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    
    
}
