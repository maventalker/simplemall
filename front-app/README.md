默认情况，启动抛出异常：Cannot determine embedded database driver class for database type NONE

不知道使用什么数据库，需要在pom.xml标注使用什么数据库，如h2 
解决思路：修改pom.xml

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>