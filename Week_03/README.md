学习笔记
本周记住了递归模版，并尝试套用在代码。
代码：
// Java
public void recur(int level, int param) { 
  // terminator  终止条件
  if (level > MAX_LEVEL) { 
    // process result  
    return; 
  }
  // process current logic 逻辑处理
  process(level, param); 
  // drill down     下探一层
  recur( level: level + 1, newParam); 
  // restore current status  清除
 
} 
