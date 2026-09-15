// Week 8 - Task 4
// Question: Implement the Visitor pattern to calculate leaf sum, product of red nodes and fancy difference.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-vistor-pattern/
// Core visitor implementation; HackerRank supplies the tree template and calls these visitors.
enum Color { RED, GREEN }
abstract class TreeVis {
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}
abstract class Tree {
    int value, depth; Color color;
    Tree(int value, Color color, int depth){ this.value=value; this.color=color; this.depth=depth; }
    int getValue(){ return value; } Color getColor(){ return color; } int getDepth(){ return depth; }
    abstract void accept(TreeVis visitor);
}
class TreeNode extends Tree {
    java.util.List<Tree> children = new java.util.ArrayList<>();
    TreeNode(int v, Color c, int d){ super(v,c,d); }
    void addChild(Tree t){ children.add(t); }
    void accept(TreeVis v){ v.visitNode(this); for(Tree t:children) t.accept(v); }
}
class TreeLeaf extends Tree {
    TreeLeaf(int v, Color c, int d){ super(v,c,d); }
    void accept(TreeVis v){ v.visitLeaf(this); }
}
class SumInLeavesVisitor extends TreeVis {
    int result=0; public int getResult(){return result;}
    public void visitNode(TreeNode n){} public void visitLeaf(TreeLeaf l){result+=l.getValue();}
}
class ProductOfRedNodesVisitor extends TreeVis {
    long result=1; static final int MOD=1000000007; public int getResult(){return (int)result;}
    void add(Tree t){if(t.getColor()==Color.RED) result=result*t.getValue()%MOD;}
    public void visitNode(TreeNode n){add(n);} public void visitLeaf(TreeLeaf l){add(l);}
}
class FancyVisitor extends TreeVis {
    int nodes=0, leaves=0; public int getResult(){return Math.abs(nodes-leaves);}
    public void visitNode(TreeNode n){if(n.getDepth()%2==0) nodes+=n.getValue();}
    public void visitLeaf(TreeLeaf l){if(l.getColor()==Color.GREEN) leaves+=l.getValue();}
}
