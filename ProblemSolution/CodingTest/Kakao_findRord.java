package sol1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * 2019년 카카오 1 길 찾기 게임
 *  
 */

class TreeNode {
    int x;
    int y;
    int index;

    TreeNode left;
    TreeNode right;
    
    TreeNode(int x, int y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
    }
    
}

public class Kakao_findRord {
	
public static void main(String[] args) {
		
		int[][] node ={{5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}};
		Solution sol = new Solution();
		int[][] result = sol.solution(node);
		
		for(int i=0;i<result.length;i++) {	
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}		
}

class Solution{

	public int[][] solution(int[][] nodeinfos) {
	    List<TreeNode> list = new LinkedList<>();
	    int i = 0;
	    // create List of Nodes
	    for (int[] nodeinfo: nodeinfos) {
	        list.add(new TreeNode(nodeinfo[0], nodeinfo[1], ++i));
	    }
	    // sort y axis
	    Collections.sort(list, new YCmparator());
	    
	    for (TreeNode node: list) {
	        root = add(root, node);
	    }
	    int[][] ret = new int[2][nodeinfos.length];
	    preorder(root, ret[0], new int[1]);
	    postorder(root, ret[1], new int[1]);
	    return ret;
	}
	
	public void preorder(TreeNode node, int[] list, int[] index) {
	    // middle->left -> right
	    if (node == null) return;
	    list[index[0]++] = node.index;
	    preorder(node.left, list, index);
	    preorder(node.right, list, index);
	}
	public void postorder(TreeNode node, int[] list, int[] index) {
	    // left -> right -> middle
	    if (node == null) return;
	    postorder(node.left, list, index);
	    postorder(node.right, list, index);
	    list[index[0]++] = node.index;
	}
	
	class YCmparator implements Comparator<TreeNode> {
	    @Override
	    public int compare(TreeNode a1, TreeNode a2) {
	        return a2.y - a1.y;
	    }
	}
	
	TreeNode root;
	TreeNode add(TreeNode node, TreeNode val) {
	    if (node == null) {
	        return val;
	    }
	    if (val.x < node.x) {
	        node.left = add(node.left, val);
	    } else {
	        node.right = add(node.right, val);
	    }
	    return node;
	}
}

