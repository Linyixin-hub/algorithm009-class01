学习笔记
9.1.1深度优先（优先下下一层访问）	递归写法
visited = set() 
def dfs(node, visited):
    if node in visited: # terminator
    	# already visited 
    	return 
	visited.add(node) 
	# process current node here. 
	...
	for next_node in node.children(): 
		if next_node not in visited: 
			dfs(next_node, visited)
		
非递归写法
def DFS(self, tree): 
	if tree.root is None: 
		return [] 
	visited, stack = [], [tree.root]
	while stack: 
		node = stack.pop() 
		visited.add(node)
		process (node) 
		nodes = generate_related_nodes(node) 
		stack.push(nodes) 
	# other processing work 
	...
9.1.2 广度优先（优先访问同一层所有子节点）
# Python
def BFS(graph, start, end):
    visited = set()
	queue = [] 
	queue.append([start]) 
	while queue: 
		node = queue.pop() 
		visited.add(node)
		process(node) 
		nodes = generate_related_nodes(node) 
		queue.push(nodes)
	# other processing work 
	...	
10.1 贪心算法
短期的贪心算法长期可能达不到最优。
可以从后往前贪心，或者从局部贪心。
11.1 二分查找
前提：1、单调；2、存在上下界；3、能通过索引访问
# Python
left, right = 0, len(array) - 1 
while left <= right: 
	  mid = (left + right) / 2 
	  if array[mid] == target: 
		    # find the target!! 
		    break or return result 
	  elif array[mid] < target: 
		    left = mid + 1 
	  else: 
		    right = mid - 1
牛顿迭代法
    cur = 1
        while True:
            pre = cur
            cur = (cur + x / cur) / 2
            if abs(cur - pre) < 1e-6:
                return int(cur)

四步做题法
1、题目边界
2、所有办法
3、找出最优
4、模版测试

期中小结：
学习了一个月了，好的地方就是学到了一些方法论，另外虽然掌握的一般，但是坚持了下来，我知道一旦某一周作业没有提交，下一周估计就拜拜了。
所以坚持很重要，至少知识点坚持听完了，有些理论的东西学到手了。
1个月以来，对算法有了更加具体的了解，以前觉得算法有点神秘，有点不能结合实际，一个月下来只是能和别人讨论下算法。
当然一个月来投入的时间还是太少了，惰性挺厉害的，毕竟很多东西确实有点难，基础薄弱，题目经常靠看答案，有时候能想到解法，但是动手就废。
每周坚持提交作业，这周投入的时间还是太少，只投入了3个小时而已。我感觉做得不好。
也没有回过头看之前的代码等，所以并没有让自己的水平得到质的飞跃。
停留于输入，而不是动手、输出，成果很有限。
下周工作效率提高些，花点时间复习一下，趁着现在课程还追的上，多投入点时间实践。
