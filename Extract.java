import java.util.*;
import java.io.*;

public class Extract{
    public static void main(String[] args) {
        System.out.println("Reading CSV using BufferedReader");

        String path = "sample.csv";

        List<List<String>> data = new ArrayList<>();
        String name = "line";
        Metadata line1 = new Metadata();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            String linetemp = "";
            int number;
            /* simple reading of data and recognizing it */
            line = br.readLine(); //to avoid the first line which is not data
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            

            while (line != null) {
            number = line.indexOf(",");
            int num2 = line.indexOf("\"");
            
            //check for multiple artist, genres...
            if(num2 != -1){
                linetemp = line.substring(0, number);
                System.out.println("D");
            } else{

            }
            linetemp = line.substring(0, number);
            line = line.substring(number+1, line.length());
            System.out.println(linetemp);
            }

            //next put data in object



/* 
reference

            while((line = br.readLine()) != null){
                System.out.print(line.indexOf(","));
                String[] values = line.split(",");
                List<String> lineData = Arrays.asList(values);
                data.add(lineData);
            }

            System.out.println("\nData read from CSV file:");
            for (int i = 0; i < data.size(); i++) {
                List<String> row = data.get(i);
                System.out.println("Row " + i + ": " + String.join(", ", row));
            }
*/



        } catch (Exception e) {
            
        }
    }
    
}