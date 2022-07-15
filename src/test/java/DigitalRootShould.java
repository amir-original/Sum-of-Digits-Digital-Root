import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DigitalRootShould {

    @Test
    void take_the_sum_of_the_digits_of_number_when_given_number() {

        final DigitalRoot digitalRoot = new DigitalRoot();

        assertThat(digitalRoot.sumDigitalRoot(16)).isEqualTo(7);
        assertThat(digitalRoot.sumDigitalRoot(27)).isEqualTo(9);
        assertThat(digitalRoot.sumDigitalRoot(42)).isEqualTo(6);

        assertThat(digitalRoot.sumDigitalRoot(82)).isEqualTo(1);
        assertThat(digitalRoot.sumDigitalRoot(942)).isEqualTo(6);
        assertThat(digitalRoot.sumDigitalRoot(132189)).isEqualTo(6);
        assertThat(digitalRoot.sumDigitalRoot(493193)).isEqualTo(2);

    }
}
