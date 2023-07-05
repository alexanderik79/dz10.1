import java.util.*;

public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }

    // Суммирование обходом
    public int summ (){
        int summ = value;
        if(left != null){
            summ += left.summ();
        }
        if(right != null){
            summ += right.summ();
        }
        return summ;
    }


    // Суммирование обходом в глубину
    public int summDeep (Tree tree) {
        int summ = 0;
        Stack<Tree> stack = new Stack<>();
        stack.push(tree);

        while(!stack.isEmpty()){
            Tree node = stack.pop();
            summ += node.value;

            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }
        return summ;
    }

    // Суммирование обходом в ширину
    public int summWide (Tree tree) {
        int summ = 0;
        ArrayDeque<Tree> dequeue = new ArrayDeque<>();
        dequeue.push(tree);
        while(!dequeue.isEmpty()){
            Tree node = dequeue.pop();
//            System.out.println(node.value); // если раскоментить то можно посмотреть порядок обхода по дереву
            summ += node.value;
            if(node.left!=null){
                dequeue.add(node.left);
            }
            if(node.right!=null){
                dequeue.add(node.right);
            }
        }
        return summ;
    }
}
