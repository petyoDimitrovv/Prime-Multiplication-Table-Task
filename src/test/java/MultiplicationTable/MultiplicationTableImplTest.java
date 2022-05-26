package MultiplicationTable;

import Numbers.PrimeNumbersImpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiplicationTableImplTest {

    @Test
    public void test_multiplicationTableCreateTheRightNumbersOnGivenRow() {
        int n = 5;
        List<Integer> prime = new PrimeNumbersImpl().generate(n);

        String[][] multiplicationMatrix = new MultiplicationTableImpl().createMultiplicationMatrix(prime);

        String[] expectedFirstRow = { " ", "2", "3", "5", "7", "11"};
        String[] expectedSecondRow = {"2", "4", "6", "10", "14", "22"};
        String[] expectedThirdRow = {"3", "6", "9", "15", "21", "33"};
        String[] expectedFourthRow = {"5", "10", "15", "25", "35", "55"};
        String[] expectedFifthRow = {"7", "14", "21", "35", "49", "77"};
        String[] expectedSixthRow = {"11", "22", "33", "55", "77", "121"};

        assertThat(Arrays.equals(expectedFirstRow, multiplicationMatrix[0]), is(true));
        assertThat(Arrays.equals(expectedSecondRow, multiplicationMatrix[1]), is(true));
        assertThat(Arrays.equals(expectedThirdRow, multiplicationMatrix[2]), is(true));
        assertThat(Arrays.equals(expectedFourthRow, multiplicationMatrix[3]), is(true));
        assertThat(Arrays.equals(expectedFifthRow, multiplicationMatrix[4]), is(true));
        assertThat(Arrays.equals(expectedSixthRow, multiplicationMatrix[5]), is(true));
    }


}
