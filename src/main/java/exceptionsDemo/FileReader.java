package exceptionsDemo;

import java.io.*;

public class FileReader {

    public static void readFile(String fileName) {
        FileInputStream fileInputStream = null;
        String tmp = "";
        try {
            fileInputStream = new FileInputStream(fileName);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                if (!((tmp = bufferedReader.readLine()) != null)) {
                    System.out.println(tmp);
                }
                fileInputStream.close();

                bufferedReader.close();
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            //logic for logging usually here using the object e
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
