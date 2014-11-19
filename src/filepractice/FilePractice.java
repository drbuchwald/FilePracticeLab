
package filepractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Dan
 */
public class FilePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File data = new File("C:" + File.separatorChar + "temp" + File.separatorChar +
                "lab1.txt");
        
        BufferedReader read = null;
        
        try {
            read = new BufferedReader(new FileReader(data));
            String line = "";
            while (line != null){
                line = read.readLine();

                int lineNumber = 1;
                if (lineNumber == 1){
                    String[] formatter = line.split(" ");
                    System.out.println("Last Name: " + formatter[1]);
                    System.out.println("First Name: " + formatter[0]);
                    lineNumber++;
                }
                if (lineNumber == 2){
                    line = read.readLine();
                    System.out.println("Address: " + line);
                    lineNumber++;
                }
                if (lineNumber == 3){
                    line = read.readLine();
                    System.out.println("Secondary Address: " + line);
                    lineNumber++;
                }
                if (lineNumber == 4){
                    line = read.readLine();
                    System.out.println("City, State, Zip: " + line);
                    
                }
                line = read.readLine();
                if (line != null){
                    System.out.println(line);
                }
                lineNumber = 1;
            }
            //practice catching exceptions
        }catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("Something Went Wrong...");
        }
        finally{
            try{
               read.close(); 
            }catch(Exception e){
                
            }
            
        }
    }
    
}
