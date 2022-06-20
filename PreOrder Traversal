//PreOrder Traversal in java
public class BT01 {
    private TreeNode root;

    class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBinaryTree(){
        TreeNode first=new TreeNode(9);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(4);
        TreeNode fourth=new TreeNode(3);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
    }
    public void preorder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.println(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }
    public static void main(String[] args) {
        BT01 ob=new BT01();
        ob.createBinaryTree();
        ob.preorder(ob.root);
    }

}
