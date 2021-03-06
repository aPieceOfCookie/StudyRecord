# Mysql学习
## 1，分类

### 1，数据定义语言（Data Definition Language，DDL）（对数据库，表的操作）
- drop:删除
- create:创建
- alter 修改
### 2，数据操作语言（Data Manipulation Language，DML）（表中数据的操作）
- SELECT：查询表中的数据
- INSERT：向表中插入新数据
- UPDATE：更新表中的数据
- DELETE：删除表中的数据
### 3，数据查询语言（Data Query Language，DQL）
- 用来查询表中的记录，主要包含 SELECT 命令，来查询表中的数据。
### 4，数据控制语言（Data Control Language，DCL）
- GRANT：赋予用户操作权限
- REVOKE：取消用户的操作权限
- COMMIT：确认对数据库中的数据进行的变更
- ROLLBACK：取消对数据库中的数据进行的变更
## 2，使用
### 1，注释
```mysql
#
-- 
/*
*/
```
### 2，关键字
1. 去重：distinct	(字段名)
2. 限制查询条数： limit (数量) 或者 limit(起始位置，数量)
3. 排序： order by
4. 条件： where
5. 模糊查询： like 	其中'_'占一个字符，'%'占一个或者不占字符
6. 范围： between 	and
7. 空值： is null	相反	is not null
8. 分组查询： group by
9. 过滤分组： having
- 区别：
- 一般情况下，WHERE 用于过滤数据行，而 HAVING 用于过滤分组。
- WHERE 查询条件中不可以使用聚合函数，而 HAVING 查询条件中可以使用聚合函数。
- WHERE 在数据分组前进行过滤，而 HAVING 在数据分组后进行过滤 。
- WHERE 针对数据库文件进行过滤，而 HAVING 针对查询结果进行过滤。也就是说，WHERE 根据数据表中的字段直接进行过滤，而 HAVING 是根据前面已经查询出的字段进行过滤。
- WHERE 查询条件中不可以使用字段别名，而 HAVING 查询条件中可以使用字段别名。
10. 交叉连接：cross join
11. (重点)内连接： inner join	格式：SELECT <字段名> FROM <表1> INNER JOIN <表2> [ON子句]	（on子句用来添加条件）	
12. (重点)外连接： left outer join	SELECT <字段名> FROM <表1> LEFT OUTER JOIN <表2> <ON子句>
    表1为基表，只要表二与表一有匹配行，那么就返回这一行。如果没有匹配行，那么返回null
13. (重点)子查询	WHERE <表达式> <操作符> (子查询)	（子查询的意思就是查询语句的嵌套）（操作符:比较运算符和 IN、NOT IN、EXISTS、NOT EXISTS 等关键字）
    注意：在 SELECT 语句中，子查询可以被嵌套在 SELECT 语句的列、表和查询条件中，即 SELECT 子句，FROM 子句、WHERE 子句、GROUP BY 子句和 HAVING 子句。
## 3,数据处理（增删改查）
1. select
2. INSERT INTO <表名> [ <列名1> [ , … <列名n>] ] VALUES (值1) [… , (值n) ];
3. INSERT INTO <表名> SET <列名1> = <值1>,  <列名2> = <值2>,
4. UPDATE <表名> SET 字段 1=值 1 [,字段 2=值 2… ] [WHERE 子句 ] [ORDER BY 子句] [LIMIT 子句]
5. DELETE FROM <表名> [WHERE 子句] [ORDER BY 子句] [LIMIT 子句]
6. TRUNCATE [TABLE] 表名	（清空表）
## 4,视图
只关注某几个特定表的字段。举例，企业领导只关注员工每日的上班时间状况，那么只需要展示员工的姓名和打卡时间即可。员工的性别，年龄可以不做展示。
1. 定制用户数据，聚焦特定的数据
- 在实际的应用过程中，不同的用户可能对不同的数据有不同的要求。
- 例如，当数据库同时存在时，如学生基本信息表、课程表和教师信息表等多种表同时存在时，可以根据需求让不同的用户使用各自的数据。学生查看修改自己基本信息的视图，安排课程人员查看修改课程表和教师信息的视图，教师查看学生信息和课程信息表的视图。
2.简化数据操作
- 在使用查询时，很多时候要使用聚合函数，同时还要显示其他字段的信息，可能还需要关联到其他表，语句可能会很长，如果这个动作频繁发生的话，可以创建视图来简化操作。
3. 提高数据的安全性
- 视图是虚拟的，物理上是不存在的。可以只授予用户视图的权限，而不具体指定使用表的权限，来保护基础数据的安全。
4. 共享所需数据
- 通过使用视图，每个用户不必都定义和存储自己所需的数据，可以共享数据库中的数据，同样的数据只需要存储一次。
5. 更改数据格式
- 通过使用视图，可以重新格式化检索出的数据，并组织输出到其他应用程序中。
6. 重用 SQL 语句
- 视图提供的是对查询操作的封装，本身不包含数据，所呈现的数据是根据视图定义从基础表中检索出来的，如果基础表的数据新增或删除，视图呈现的也是更新后的数据。视图定义后，编写完所需的查询，可以方便地重用该视图。
而且原数据表的字段更改，视图数据自动更改
<p style="color: red">
注意：
使用视图的时候，还应该注意以下几点：<br>
创建视图需要足够的访问权限。<br>
创建视图的数目没有限制。<br>
视图可以嵌套，即从其他视图中检索数据的查询来创建视图。<br>
视图不能索引，也不能有关联的触发器、默认值或规则。<br>
视图可以和表一起使用。<br>
视图不包含数据，所以每次使用视图时，都必须执行查询中所需的任何一个检索操作。如果用多个连接和过滤条件创建了复杂的视图或嵌套了视图，可能会发现系统运行性能下降得十分严重。因此，在部署大量视图应用时，应该进行系统测试。
</p>

### 1，使用

1，创建：CREATE VIEW <视图名> AS <SELECT语句>

2，查看：DESCRIBE 视图名;或DESC 视图名;

3，修改：ALTER VIEW <视图名> AS <SELECT语句>

4，删除：DROP VIEW <视图名1> [ , <视图名2> …]

## 5，索引
1. 索引是一种特殊的数据库结构，由数据表中的一列或多列组合而成，可以用来快速查询数据表中有某一特定值的记录。
2. 索引就是根据表中的一列或若干列按照一定顺序建立的列值与记录行之间的对应关系表，实质上是一张描述索引列的列值与原表中记录行之间一一对应关系的有序表。
- mysql访问方式
    1. 顺序访问  
        顺序访问是在表中实行全表扫描，从头到尾逐行遍历，直到在无序的行数据中找到符合条件的目标数据。 顺序访问实现比较简单，但是当表中有大量数据的时候，效率非常低下。例如，在几千万条数据中查找少量的数据时，使用顺序访问方式将会遍历所有的数据，花费大量的时间，显然会影响数据库的处理性能。
    2. 索引访问  
        索引访问是通过遍历索引来直接访问表中记录行的方式。使用这种方式的前提是对表建立一个索引，在列上创建了索引之后，查找数据时可以直接根据该列上的索引找到对应记录行的位置，从而快捷地查找到数据。索引存储了指定列数据值的指针，根据指定的排序顺序对这些指针排序。 
3. 索引的优缺点
- 优点
    - 通过创建唯一索引可以保证数据库表中每一行数据的唯一性。
    - 可以给所有的 MySQL 列类型设置索引。
    - 可以大大加快数据的查询速度，这是使用索引最主要的原因。
    - 在实现数据的参考完整性方面可以加速表与表之间的连接。
    - 在使用分组和排序子句进行数据查询时也可以显著减少查询中分组和排序的时间
- 缺点
    - 增加索引也有许多不利的方面，主要如下：
    - 创建和维护索引组要耗费时间，并且随着数据量的增加所耗费的时间也会增加。
    - 索引需要占磁盘空间，除了数据表占数据空间以外，每一个索引还要占一定的物理空间。如果有大量的索引，索引文件可能比数据文件更快达到最大文件尺寸。
    - 当对表中的数据进行增加、删除和修改的时候，索引也要动态维护，这样就降低了数据的维护速度。
4. 索引创建  
- 使用 CREATE INDEX 语句  
<code>CREATE <索引名> ON <表名> (<列名> [<长度>] [ ASC | DESC])</code>  
- 使用 CREATE TABLE 语句  
<code>CONSTRAINT PRIMARY KEY [索引类型] (<列名>,…)</code><br>
<code>KEY | INDEX [<索引名>] [<索引类型>] (<列名>,…)</code><br>
<code>UNIQUE [ INDEX | KEY] [<索引名>] [<索引类型>] (<列名>,…)</code><br>