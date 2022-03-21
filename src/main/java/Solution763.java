import java.util.ArrayList;
import java.util.List;

/**
 * Ищем сперва для каждого символа его последнее положение в строке.
 * Дальше используем технику two pointers:
 * берем символ, ищем его последнее положение в строке rightPointer. Дальше бежим до этого положения,
 * если там появился символ, последнее положение которого больше изначального rightPointer, то
 * изменяем значение rightPointer на последнее положение этого символа. Если i сравнялся с rightPointer, то
 * можно добавить длину слова в массив с результатами(для этого мы фиксировали перед циклом while int leftPointer = i;)
 * Пример:
 * "abcabd".
 * Берем символ а. Его последнее положение 3. Значит rightPointer = 3.
 * Теперь бежим в цикле пока i < rightPointer. Следующий символ b. Его последнее положение 4, что больше 3.
 * Поэтому теперь rightPointer=4. Следующий символ 'c', его последнее положение 2, поэтому идем дальше.
 * В итоге мы дойдем до положения 4, добавили в массив с ответами дляну 5 и выходим из цикла while.
 * Берем символ d, его посленее положение 5. Значит в цикл while мы не попадем, а сразу добавим в результат
 * длину 1.
 */
public class Solution763 {

    public List<Integer> partitionLabels(String s) {
        int[] lastIndexOfArr = new int[26];
        fillAllLettersLastIndexOf(lastIndexOfArr, s);

        List<Integer> res = new ArrayList<>();
        int rightPointer = 0;
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            rightPointer = lastIndexOfArr[t - 'a'];
            int leftPointer = i;
            while (i < rightPointer) {
                i++;
                int temp = lastIndexOfArr[(s.charAt(i) - 'a')];
                if (temp > rightPointer) {
                    rightPointer = temp;
                }
            }
            res.add(rightPointer - leftPointer + 1);
        }
        return res;
    }

    private void fillAllLettersLastIndexOf(int[] lastIndexOfArr, String s) {
        for (int i = 0; i < lastIndexOfArr.length; i++) {
            lastIndexOfArr[i] = s.lastIndexOf('a' + i);
        }
    }
}
