
package lesson39.ne;

import java.io.BufferedReader;
import java.io.FileReader;


public class ReadNews {
    public static void main(String[] args) throws Exception {
        try ( FileReader fr = new FileReader("src/lesson39.ne/news.txt");
                BufferedReader br = new BufferedReader(fr);) {
                
                String data;
                while((data = br.readLine()) != null ) {
                    System.out.println(data);
                }
        }
    }
}
