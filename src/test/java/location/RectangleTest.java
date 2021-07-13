package location;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {

    @Test
    void 사각형_넓이() {
        Rectangle rectangle = Rectangle.of("(10,10)-(22,10)-(22,18)-(10,18)");
        assertThat(rectangle.getArea()).isEqualTo(96);
    }
}