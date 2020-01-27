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
        for (int i = 0; i < 100000; i++) {
            String s;
            s = br.readLine(); //1 1 1 1 1 
            for (int j = 0; j < 5; j++) {
                array[counter++] = Character.getNumericValue(s.charAt(j + 1));
            }
            
        }
        System.out.println("Il tempo di esecuzione con BufferReader è di: "+(System.currentTimeMillis()-startTime)/1000);
    }
    
}
