package com.kateromaniv.runners.classwork.lesson11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*Created by katr on 29.05.2017.
 */
public class FileWrite {
    private static final String FILENAME = "D:\\filename.txt";
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null; FileWriter fw = null;
            try {
                String data = "\r\n This is new content";
                File file = new File(FILENAME); // if file not exists => create it
                if (!file.exists()) {
                    file.createNewFile(); } // true = append file
                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);
                bw.write(data);
                System.out.println("Done");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bw != null) { bw.close(); }
                    if (fw != null) { fw.close(); }
                } catch (IOException e) { e.printStackTrace();
                }
            }
    }
}
