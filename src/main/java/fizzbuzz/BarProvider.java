package fizzbuzz;

public class BarProvider implements BuzzwordProvider {
    @Override
    public String calculateBuzzword(int number) {
        if (String.valueOf(number).contains("3")) {
            return "Bar";
        }
        return "";
    }
}
