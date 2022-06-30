public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else{
//             case 1: leaf Node
            if(root.left==null && root.right==null){
                return null;
            }
//            case 2:  one child
            if(root.left==null)
                return root.right;
            else if(root.right==null){
                return root.left;
            }
//            case3: two children
            Node IS=inOrderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node inOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
//    print in range gfg
    public static void printInRange(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            printInRange(root.left,X,Y);
            System.out.println(root.data+" ");
            printInRange(root.right,X,Y);
        }
        else if(root.data>=Y){
            printInRange(root.left,X,Y);
//            System.out.println(root.data);
        }
        else{
            printInRange(root.right,X,Y);
//            System.out.println(root.data);
        }
    }
