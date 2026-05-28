package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class BuzzwordCalculatorImpl implements BuzzwordCalculator {

    private List<BuzzwordProvider> providerList = new ArrayList<>();

    public BuzzwordCalculatorImpl() {
        providerList.add(new FooProvider());
        providerList.add(new FizzProvider());
        providerList.add(new BarProvider());
        providerList.add(new BuzzProvider());
    }

    @Override
    public String gatherBuzzwords(int number) {

        StringBuilder returnString  = new StringBuilder();
        providerList.stream().forEach(provider -> returnString.append(provider.calculateBuzzword(number)));

        if (returnString.isEmpty()) {
            return String.valueOf(number);
        }

        return returnString.toString();
    }
    
}
