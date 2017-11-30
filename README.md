# Student-Information-Management-System

**学生信息管理系统**

**环境： IDEA+MySQL**

**作者： Chan**



## MVC作业要求

创建“学生信息管理系统”项目，完成注册、登录、学生学籍信息管理和学生成绩管理功能。

要求：

1.           在同一个web项目中完成

2.           项目中包含一个“主页”，主页有简单说明，同时有指向“学生注册页面”、“学生登录页面”和“学生成绩管理页面”的链接。

3.           建立“学生信息管理数据库”，包含两个表“学生学籍信息表”（字段包含“注册页面”中所有信息）和“学生成绩表”（字段包括：姓名、学号、性别、院系、专业、数学成绩、英语成绩、Java课程成绩，C语言成绩、操作系统成绩、Java EE成绩）。

4. “学生注册页面”需要链接数据库，完成“学生学籍信息表”中记录的录入，提交后返回学生基本信息记录（即“注册返回页”），并包含“返回主页”链接。注册内容包括：

Ø  学生姓名（验证器字符长度为4-8）

Ø  学号（长度为6）（学号为登录名）

Ø  密码（长度为6-12位，字母加数字）

Ø  性别

Ø  出生日期

Ø  年级

Ø  院系（下拉列表框，包括信息院、物理院、化工院、数学院、文学院）

Ø  专业（包括计算机、物理、化学、数学、中文）

Ø  邮箱

Ø  地址

Ø  兴趣爱好（多选框）

5.           “学生登录页面”仅仅是练习，无需链接数据库，程序中设定一个登录名和密码即可，提交后通过“登录成功页面”和“登录失败页面”返回学生登录成功或失败信息（信息包含登录名）。同时每个页面包含“返回主页”链接。[若能实现数据库链接登录最好]

6.           “学生成绩信息管理页面”链接数据库“学生成绩表”，实现学生成绩的录入和查询功能。[页面视图风格个人发挥，使用frame框架也可以。]


7.           两个页面链接数据库的方法不限制，普通MVC框架下的JDBC、JPA，甚至Hibernate都可以，选择自己会的。

8.若有时间课程上每位学生演示注册、登录、添加各学科成绩、查找成绩功能。

9.如果需要提交纸质版，要撰写报告。（报告可以在课程结课前再提交）

报告的主要写作格式：

第一部分：需求分析

第二部分：MVC总体设计思路

数据库设计（只提供表结构）

各功能设计

第三部分：M-V-C的代码

第四部分：页面效果截图

 

 