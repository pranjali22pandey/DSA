public static void preorder(Node root) {
        if(root == null) {
        System.out.print(-1+" ");
        return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        }

public static void inorder(Node root) {
        if(root == null) {
        System.out.print(-1+" ");
        return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        }

public static void postorder(Node root) {
        if(root == null) {
        System.out.print(-1+" ");
        return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
        }
public static void levelOrder(Node root) {
        if(root == null) {
        return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
        Node curr = q.remove();
        if(curr == null) {
        System.out.println();
        //queue empty
        if(q.isEmpty()) {
        break;
        } else {
        q.add(null);
        }
        } else {
        System.out.print(curr.data+" ");
        if(curr.left != null) {
        q.add(curr.left);
        }
        if(curr.right != null) {
        q.add(curr.right);
        }
        }
        }
        }
