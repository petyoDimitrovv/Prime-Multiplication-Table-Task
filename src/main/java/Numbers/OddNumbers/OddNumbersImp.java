package Numbers.OddNumbers;

import Numbers.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersImp extends OddNumber {
    @Override
    public List<Integer> generate(int numb) {

        List<Integer> odds = new ArrayList<>();

        if (numb <= 0) {
            throw new IllegalArgumentException("Number should be positive odd number");
        }
        int i = 1;

        while (odds.size() < numb) {
            odds.add(i);
            i += 2;
        }
        return odds;

    }
}
