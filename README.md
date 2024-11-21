# Nirvana Gen Multi

#### 介绍
我的世界Space同款开发基础框架。

#### 代码优化
1. 您可以直接删除不需要的版本"X.X.X-Forge".
2. 如有必要可以删除"settings.gradle"中的"include("X.X.X-Forge")"

#### 开发思路
您可以在src\main\java中开发内容，如果在编译时X.X.X-Forge出现异常，您可以选择前往X.X.X-Forge\src中开发方法，来实现多版本兼容。
#### 缺点
Gradle为4.10.3，因为在老forge中，不再维护，为实现多版本兼容，不能采用过高版本。

#### 开源来源
https://npyyds.top/<br>
https://gitee.com/newNP/GenMulti/<br>
https://github.com/NirvanaTec/GenMulti/<br>