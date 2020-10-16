package Test;

import es.ulpgc.FizzBuzz;
import org.junit.Test;

import static java.lang.String.valueOf;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzz_ {

    @Test
    public void should_return_number_when_it_no_receives_multiple_of_3_or_5() {
        assertThat(new FizzBuzz().of(1)).isEqualTo("1");
        assertThat(new FizzBuzz().of(2)).isEqualTo("2");
    }

    @Test
    public void should_return_number_when_it_receives_multiple_of_3() {
        assertThat(new FizzBuzz().of(3)).isEqualTo("Fizz");
        assertThat(new FizzBuzz().of(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_number_when_it_receives_multiple_of_5() {
        assertThat(new FizzBuzz().of(5)).isEqualTo("Buzz");
        assertThat(new FizzBuzz().of(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_number_when_it_receives_multiple_of_15() {
        assertThat(new FizzBuzz().of(15)).isEqualTo("FizzBuzz");
        assertThat(new FizzBuzz().of(30)).isEqualTo("FizzBuzz");
    }

}
