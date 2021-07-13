package location;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void 사각형_넓이(){
        Triangle triangle = new Triangle("(10,10)-(14,15)-(20,8)");
        assertThat(triangle.length()).isEqualTo(29.0);
    }
}