package ejercicio3;


import org.ejercicio3.Array;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;


public class ArrayTest {

    @Test
    public void testArrayOutOfBounds() {
        Array array = new Array();
        // We verify if the index is invalid (Last index is 9) we Throw an Exception
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            array.getElement(10);
        });
    }
}