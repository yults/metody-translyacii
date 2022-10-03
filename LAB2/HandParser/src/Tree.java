import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    String node;
    List<Tree> children;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
        children = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        for (Tree t : children) {
            ans.append(node).append("->").append(t.node).append(";").append("\n").append(t);
        }
        return ans.toString();
    }
}
