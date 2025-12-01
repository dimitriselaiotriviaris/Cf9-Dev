package gr.aueb.cf.cf9.ch9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Demo of file readers in the java.io package
 */

public class FileReadersJavaIo {

    public static void main(String[] args) {
        File file = new File("D:/Coding Factory/Cf9Dev/src/gr/aueb/cf/cf9/ch9/file.txt");

        try{
            bufferedReader(file);
        }catch (IOException e){
            System.out.println("There was a problem during reading");
        }
    }

    // Scanner is useful for reading primitive types and Strings.
    public static void fileReader(String file) throws IOException{
        try (FileReader fr = new FileReader(file, StandardCharsets.UTF_8)) {
            int byteRead = 0;

            while ((byteRead = fr.read()) != -1){       //while not EOF
                System.out.println((char) byteRead);
            }
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }

    }

    public static void bufferedReader (String file) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(file,StandardCharsets.UTF_8))){
            String line;

            while ((line = br.readLine()) != null){     //while not EOF
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
