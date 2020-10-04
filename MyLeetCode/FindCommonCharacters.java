import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[] min = new int[26];
        for (int i = 0; i < 26; i++) {
            min[i] = Integer.MAX_VALUE;
        }
        for (String s : A) {
            int[] cur = new int[26];
            char[] ca = s.toCharArray();
            for (char c : ca) {
                cur[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                min[i] = Math.min(min[i], cur[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < min[i]; j++) {
                list.add(String.valueOf((char) (i + 'a')));
            }
        }
        return list;
    }
}

class FindCommonCharactersDemo {
    public static void main(String[] args) {
        FindCommonCharacters fcc = new FindCommonCharacters();
        String A[] = { "label", "bella", "roller" };
        System.out.println(fcc.commonChars(A));
    }
}
