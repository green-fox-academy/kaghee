import java.util.ArrayList;
import java.util.Arrays;

public class StringTransformer {
  private static ArrayList<String> transformStringList(ArrayList<String> inputStrings) {
    ArrayList<String> result = new ArrayList<>();
    for (int i = 0; i < inputStrings.size(); i++) {
      StringBuilder sb = new StringBuilder();
      for (String currentString: inputStrings) {
        sb.append(currentString.charAt(i));
      }
      result.add(sb.toString());
    }
    return result;
  }

  public static void main(String[] args) {
    ArrayList<String> input = new ArrayList<>(Arrays.asList("abc", "ijk", "xyz"));
    System.out.println(transformStringList(input));
  }
}
