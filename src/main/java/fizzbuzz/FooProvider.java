package fizzbuzz;

public class FooProvider  implements BuzzwordProvider {

    @Override
    public String calculateBuzzword(int number) {
        if (number % 6 == 0 || number % 7 == 0) {
            return "Foo";
        }
        return "";
    }
    
}
