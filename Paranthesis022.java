import java.util.ArrayList;
import java.util.List;

public class Paranthesis022 {
    public Paranthesis022() {
        System.out.println(generateParenthesis(3).toString());
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        build(res, new StringBuilder(""), 0,0,0, n);
        return res;
    }

    public void build(List<String> res, StringBuilder sb, int start, int opened, int closed, int n) {
        if (closed==n) {
            res.add(sb.toString());
            return;
        }
        if (opened < n) {
            sb.append("(");
            build(res, sb, start + 1, opened + 1, closed, n);
            sb.setLength(sb.length() - 1);
        }
        if (closed < opened) {
            sb.append(")");
            build(res, sb, start + 1, opened, closed + 1, n);
            sb.setLength(sb.length() - 1);
        }
    }
}
