package dv.kinash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringInfoTest {

    @Test
    void testGetInfo() {
        String example = "test";
        StringInfo info = new StringInfo(example);
        assertEquals(example, info.getInfo());
    }
}