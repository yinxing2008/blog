# 功能列表
1.登录
2.注册
3.查看博客列表
4.发博客
5.修改博客
6.删除博客

# 技术特色  
后端:SpringBoot+MyBatis+MySQL  
前端:Vue+Vuex+ElementUI   

# 项目部署 
部署服务器:
1、在本地mysql数据库中，创建数据库，名称为：blog。   
2、在mysql数据库中，导入"初始化数据.sql"中的sql。  
3、修改src/main/resources/application-dev.yml，设置数据库用户名（username）和密码（password）。  
4、在IDEA中，直接运行：HspBlogApplication，启动后端应用。

部署前端:
1、工程目录下，先执行：
```
yarn install
```
2、再执行：
```
yarn serve
```
3、在浏览器中访问
http://localhost:8090/#/blog/login


# 作者信息  
10年软件开发+5年编程培训教学经验  
想学编程的可以联系我,QQ:309032663
