package io.ushi.olio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/**
 * Created by leibo on 2016/11/3.
 */
public class Deserializer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try (ObjectInputStream in = new ObjectInputStream(
                ClassLoader.getSystemResourceAsStream("activiti_act_ge_bytearray_BYTES__ID__731255.bin"))) {

            BigDecimal num = (BigDecimal) in.readObject();

            System.out.println(num);
        }
    }
}
