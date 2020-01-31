package esercizioconfile;

import java.io.*;
import java.util.*;

public class generateFile {
    
    File file;
    
    public generateFile() throws IOException {
        file = new File("file.txt");
        if (file.exists()) {
            file.delete();
        } else {
            file.createNewFile();
        }
    }
    
    public void popolaFile() throws IOException {
        
        FileWriter fw = new FileWriter(file);   
        String str;
        for (int i = 0; i < 100000; i++) {
            str = "";           
            for (int j = 0; j < 5; j++) {
                str += generaNumero() + " ";
            }            
            fw.write(str + System.getProperty("line.separator"));           
            fw.flush();
        }
        
    }
    
    private int generaNumero() {
        // Utilizzando la classe Random genero un numero casuale tra 0 e 254
        return new Random().nextInt(254);
    }
    
}
