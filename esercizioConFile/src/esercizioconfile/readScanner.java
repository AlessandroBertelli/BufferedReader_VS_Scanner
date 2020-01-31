package esercizioconfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readScanner {

    FileReader fr;
    Scanner sc;
    int[] array = new int[500000];
    int counter = 0;

    public readScanner() {
        try {
            fr = new FileReader("file.txt");
            sc = new Scanner(fr);
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato!");
        }
    }

    public void leggiFile() throws IOException {
        long startTime = System.currentTimeMillis();
        String s;
        String[] numStr;
        for (int i = 0; i < 100000; i++) {
            s = sc.nextLine();
            numStr = s.split(" ");
            for (int j = 0; j < 5; j++) {
                array[counter++] = Integer.parseInt(numStr[j]);
            }
        }
        System.out.println("Il tempo di esecuzione con Scanner è di: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    public void stampaArray() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
