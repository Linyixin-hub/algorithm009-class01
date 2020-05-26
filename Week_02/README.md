学习笔记
1、Hash
哈希碰撞，两个哈希值相加等到相同的值。哈希算法如果选择不好或者size不够可能会退化成链表。
HashMap总结：
2、升维思想
二叉树（树和图关键的区别是有没有环） 时间复杂度logn
斐波纳契数
棋盘状态也是树形结构

二叉树的遍历（根在哪里就算那种遍历）：
2.1 前序遍历：根-左—右；
public class TreeNode{
	public int val；
	public TreeNode left，right；
	public TreeNode (int val){
		this.val=val;
		this.left=null;
		this.right=null;
	}
}
2.2 中序遍历：左-根-右；(是升序遍历)
2.2 后序遍历：左-右-根
课后思考：树面试题为什么一般是递归？
因为没办法循环，所以要拥抱递归

