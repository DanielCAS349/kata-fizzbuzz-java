package fizzbuzz;

public class BuzzProvider implements BuzzwordProvider {
    @Override
    public String calculateBuzzword(int number) {
        if (number % 7 == 0) {
            return "Buzz";
        }
        return "";
    }
}
