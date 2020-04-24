import java.util.List;
import java.util.stream.Collectors;

//Buzz fizz computer
public class BuzzFizz {

  private static final String FIZZ = "Fizz";
  private static final Number FIZZ_VALUE = new Number(3);
  private static final String BUZZ = "Buzz";
  private static final Number BUZZ_VALUE = new Number(5);
  private static final Number FIZZ_BUZZ_VALUE = new Number(15);
  private static final String FIZZ_BUZZ = "FizzBuzz";

  public String processInput(int number) {
    if (FIZZ_BUZZ_VALUE.isFactorOf(number)) {
      return FIZZ_BUZZ;
    }
    if (FIZZ_VALUE.isFactorOf(number)) {
      return FIZZ;
    }
    if (BUZZ_VALUE.isFactorOf(number)) {
      return BUZZ;
    }
    return String.valueOf(number);
  }

  public List<String> processInputs(List<Integer> list) {
    return list
        .stream()
        .map(this::processInput)
        .collect(Collectors.toList());
  }
}

