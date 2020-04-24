
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.Test;

public class BuzzFizzTest {

  private BuzzFizz buzzFizz = new BuzzFizz();

  @Test
  public void shouldProcess1to1() {
    assertThat(buzzFizz.processInput(1)).isEqualTo("1");
  }

  @Test
  public void shouldProcess2To2() {
    assertThat(buzzFizz.processInput(2)).isEqualTo("2");
  }

  @Test
  public void shouldProcess3ToFizz() {
    assertThat(buzzFizz.processInput(3)).isEqualTo("Fizz");
  }

  @Test
  public void shouldProcess5ToBuzz() {
    assertThat(buzzFizz.processInput(5)).isEqualTo("Buzz");
  }

  @Test
  public void shouldProcess6ToFizz() {
    assertThat(buzzFizz.processInput(6)).isEqualTo("Fizz");
  }

  @Test
  public void shouldProcess10ToFizz() {
    assertThat(buzzFizz.processInput(10)).isEqualTo("Buzz");
  }

  @Test
  public void shoulfProcess15ToBuzzFizz() {
    assertThat(buzzFizz.processInput(15)).isEqualTo("FizzBuzz");
  }

  @Test
  public void shouldProcessInputList() {
    List<Integer> list = List.of(2, 3, 4, 5, 15);
    assertThat(buzzFizz.processInputs(list)).containsExactly("2", "Fizz", "4", "Buzz", "FizzBuzz");
  }
}