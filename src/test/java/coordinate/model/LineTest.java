package coordinate.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class LineTest {
    private Line line;

    @BeforeEach
    void setUp(){
        List<Point> points = Arrays.asList(new Point(1,2), new Point(3,4));
        line = new Line(points);
    }

    @DisplayName("주어진 포인트를 가지고 있는지 확인")
    @Test
    void getPoint(){
        assertThat(line.hasPoint(3,4)).isTrue();
        assertThat(line.hasPoint(3,5)).isFalse();
    }

    @Test
    void getArea(){
        assertThat(line.area()).isEqualTo(2.828, offset(0.00099));
    }

    @AfterEach
    void tearDown(){
        line = null;
    }
}