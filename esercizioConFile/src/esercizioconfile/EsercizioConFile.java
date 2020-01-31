package esercizioconfile;

import java.io.File;
import java.io.IOException;

public class EsercizioConFile {

    public static void main(String[] args) throws IOException {

        generateFile gf = new generateFile();
        gf.popolaFile();

        readBuffer rb = new readBuffer();
        rb.leggiFile();
        //rb.stampaArray();
        
        readScanner rs = new readScanner();
        rs.leggiFile();
        //rs.stampaArray();
    }

}
