
package lesson25;

import java.io.IOException;
import java.nio.CharBuffer;


public  class Walk implements Readable{
    public void run() {
        String tName = Thread.currentThread().getName();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%s 走了 %d 步\n", tName, 1);
        }
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
