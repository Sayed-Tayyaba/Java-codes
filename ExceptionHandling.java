
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionHandling {
    public static void ReadFile(String path){
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e){
            System.out.println("Error reading files"+e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath="C:\\Users\\Sayed Tayyaba\\Desktop\\MyFile.txt";
        ReadFile(filePath);

    }
}
