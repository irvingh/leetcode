import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {
    LetterCombinations() {
        letterCombinations("23");
    }
    public List<String> letterCombinations(String digits) {
        String[] nl = new String[] {" ", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>(Arrays.asList(nl[digits.charAt(0) - '0'].split("")));
        for (int i=1; i<digits.length(); i++) {
            int len = res.size();
            int digit = digits.charAt(i) - '0';
            for (int j=1; j<nl[digit].length(); j++)
                for (int k=0; k<len; k++)
                    res.add(res.get(k));
            for (int j=0; j<nl[digit].length(); j++)
                for (int k=0; k<len; k++)
                    res.set(j*len+k, res.get(j*len+k)+nl[digit].charAt(j));
        }
        return res;
    }
}
