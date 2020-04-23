
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BuzzFizzTest {

  private BuzzFizz buzzFizz = new BuzzFizz();

  @Test
  public void shouldProcess1() {
    assertThat(buzzFizz.processInput(1)).isEqualTo("1");
  }
}