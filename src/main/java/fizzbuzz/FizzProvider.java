package fizzbuzz;

public class FizzProvider implements BuzzwordProvider {
    
    @Override
    public String calculateBuzzword(int number) {
        if (number % 5 == 0) {
            return "Fizz";
        }
        return "";
    }
}
