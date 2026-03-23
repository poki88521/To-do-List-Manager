## To-do List需求文档

### 1.功能
- 添加内容（文本）
- 标记完成、删除

### 2.业务实现
- 前端采用Scene Builder创建
  + 每个待办事项除了任务内容、是否完成以外应有删除按键
- 类`Task`用于存储任务
  + `String`变量`content`：存储任务内容
  + `boolean`变量`isComplete`: 任务是否完成
- 使用`ObservableList<Task>`列表`taskList`存储新建的任务

