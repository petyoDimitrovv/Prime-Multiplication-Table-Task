package Numbers.EvenNumbers;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberImpl extends EvenNumber {
    @Override
    public List<Integer> generate(int numb) {
        List<Integer> even = new ArrayList<>();

        if (numb <= 0) {
            throw new IllegalArgumentException("Number should be positive even number");
        }
        int i = 2;

        while (even.size() < numb) {
            even.add(i);
            i += 2;
        }
        return even;

    }
    }
