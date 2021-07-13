package location;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void Line_두_점_사이의_거리() {
        Line line = Line.of("(10,10)-(14,15)");
        assertThat(line.length()).isEqualTo(6.403124, offset(0.00099));
        assertEquals(6.403124, line.length(), 0.0001);
    }
}