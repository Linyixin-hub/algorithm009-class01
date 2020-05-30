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

3、堆和二叉堆、图
3.1堆 
 用于找最大值或者最小值
二叉堆：通过完全二叉树实现
插入：先把元素放在堆尾，再向上比较
删除：直接删除最大值，把堆尾的值放在根节点，再向下比较
3.2 代码：找出k个最大值，就直接建立一个有k个元素的大顶堆，再往里面加元素。
3.3 图
图可能有重复，输入一定要写vistited 
demo：def dfs（node,vistited）：