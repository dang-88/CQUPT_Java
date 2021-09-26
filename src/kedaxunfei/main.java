//package kedaxunfei;
//
//import java.util.Scanner;
//
//
//class TreeNode {
//    int val = 0;
//    public TreeNode left = null;
//    public TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//    }
//}
//
//
//public class main {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param root TreeNode类 指向量子树的根
//     * @param b    int整型二维数组 表示每次交换的两个子树
//     * @return TreeNode类
//     */
//    public static int Val=0;
//    public TreeNode solve(TreeNode root, int[][] b) {
//        // write code here
//        TreeNode temp ;
//        if (root.left == null && root.right == null) {
//            return root;
//        }
//        for (int i = 0; i < b.length; i++) {
//            if ((int) (Math.log(b[i][0]) / Math.log(2)) + 1 != (int) (Math.log(b[i][1]) / Math.log(2)) + 1) {
//                return root;
//            }else {
//                TN(root,b[i][0]);
//                temp = new TreeNode(Val);
//                TN(root,b[i][1]);
//
//
//            }
//        }
//    }
//    public void TN(TreeNode root,int b){
//        TreeNode temp;
//        if (root!=null&&root.val!=b){
//            TN(root.left);
//            TN(root.right);
//        }else {
//            Val = root.val;
//        }
//    }
//}
//
////    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        TreeNode root,temp;
////        int b[][];
////        TN(root,b,temp);
////
////    }
//}
//
//
