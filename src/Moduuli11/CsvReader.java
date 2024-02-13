package Moduuli11;
import java.io.*;
public class CsvReader {
    private final static String FILENAME = "C:\\Users\\Umut Uygur\\Downloads\\temploki.csv";
    public static void main(String[] args){
        FileReader file;
        BufferedReader bufferedStream = null;
        String line;
        String[] columnNames = new String[0];
        boolean header = true;

        try{
            file = new FileReader(FILENAME);
            bufferedStream = new BufferedReader(file);
            do{
                line = bufferedStream.readLine();
                if(line != null){
                    if(header){
                        columnNames = line.split(";");
                        header = false;
                    }
                    else{
                        String[] columns = line.split(";");
                        for(int i = 0; i < columnNames.length; i++){
                            System.out.print(columnNames[i] + ": " + columns[i] + "\n");
                        }
                    }
                }
            }while(line != null);
        }catch (IOException e){
            System.err.println(e);
        } finally {
            try {
                if (bufferedStream != null)
                    bufferedStream.close();
            }catch (Exception e){
                System.out.println("Error while closing the file: " + FILENAME);
            }
        }
    }
}
