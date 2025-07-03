import java.util.*;
import java.io.*;

public class Extract{
    public static void main(String[] args) {
        System.out.println("Reading CSV using BufferedReader");

        String path = "sample.csv";

        List<List<String>> data = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            /* simple reading of data and recognizing it */
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                List<String> lineData = Arrays.asList(values);

                data.add(lineData);
            }

            System.out.println("\nData read from CSV file:");
            for (int i = 0; i < data.size(); i++) {
                List<String> row = data.get(i);
                System.out.println("Row " + i + ": " + String.join(", ", row));
            }

        } catch (Exception e) {
            
        }
    }
    
}