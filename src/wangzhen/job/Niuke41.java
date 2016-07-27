package wangzhen.job;

public class Niuke41 {
	public  TreeNode reConstructBinaryTree(int [] pre,int [] in){
		if (pre.length==0) {
			return null;
		}
		
		TreeNode root = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
		return root;
	}
	
	//重载函数，这个想法奇特有见解
	public  TreeNode reConstructBinaryTree(int[] pre,int startp,int endp,int[] in,int starti,int endi){
		if (startp > endp||starti > endi) {
			return null;
		}
		TreeNode root = new TreeNode(pre[startp]);
		
		for(int i = startp;i < endp;i++){
			if (in[i] == pre[startp]) {
				root.left = reConstructBinaryTree(pre, startp+1, startp+i-starti, in, starti, i-1);
				root.right = reConstructBinaryTree(pre, i-starti+startp+1, endp, in, i+1, endi);
			}
		}
		return root;
	}
}
