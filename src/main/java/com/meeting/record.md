#   java部分
##  了解
    1,jvm,jre,jdk的区别。
        1，jvm：java virtual machine  (java虚拟机，运行java代码)
        2,jre: java runing environment(java运行环境)
        3,jdk : java development kid (java开发包,包含了jre，jvm)
##  基础
    1，标识符和关键字
        常见的有: class public private int void 等
    2，注释
        1，// 2，/**/ 3,/****/
    3,doc注释
        @author,@version,@param
    4,常量
        int a=10.等
    5，静态变量，全局变量，局部变量
        1,静态变量：用static修饰,是被放到静态池中的。其地址在运行期间一直不会改变.
        2,用public修饰的static变量。
        3,形参，方法内，代码块内。
        小知识：成员变量存在于堆内存中和类一起创建。局部变量存在于栈内存中，当方法执行完成，让出内存让其他方法使用.
    6,数据类型
        一个字节=8位
        8个。byte（1）,int（4）,long(8),double(8),char(2),boolean(1),float(4),short(2)。
    7,数据类型转换
        要求：1，两种数据兼容2，目标数据取值范围大于原数据（低类型转高类型）
        隐式转换
        byte->short->int->long->float->double
        char->int
        显示转换（强转）
        (类型)
    8,位运算符(~非,&与,|或,^异或)除了~是单目运算符，其他都是双目。
        规则：
            1，位与运算符为&，其运算规则是：参与运算的数字，低位对齐，高位不足的补零，如果对应的二进制位同时为 1，那么计算结果才为 1，否则为 0。因此，任何数与 0 进行按位与运算，其结果都为 0。
            2，位或运算符为|，其运算规则是：参与运算的数字，低位对齐，高位不足的补零。如果对应的二进制位只要有一个为 1，那么结果就为 1；如果对应的二进制位都为 0，结果才为 0。
            3，位异或运算符为^，其运算规则是：参与运算的数字，低位对齐，高位不足的补零，如果对应的二进制位相同（同时为 0 或同时为 1）时，结果为 0；如果对应的二进制位不相同，结果则为 1。
            4，位取反运算符为~，其运算规则是：只对一个操作数进行运算，将操作数二进制中的 1 改为 0，0 改为 1。
    9，位移运算符(>>,<<)
![位运算符](img/leftMove.png)<br>
    
    10,复合位赋值运算符
![复合位运算符](img/pic.png)
![运算符优先级](img/levle.png "运算符优先级")

    instanceof(测试左边的对象是否是右边类或者该类的子类创建的实例对象，是，则返回true，否则返回false。)

## 字符串
    1，定义方式
        1，直接定义。2，构造函数
    2，去除字符串中的空格。
        trim()方法
    3,提取子字符串
        subString(int from);
        subString(int from,int end)
    4,分割
        split();
    5,替换
        replace();
        replaceAll();
    6,比较
        equal():
            比较的是字符串中的字符。
        ==:
            比较的是两个对象的引用（地址）
        equalsIgnoreCase() 比较时不区分大小写
        compareTo();
    7，查找
        indexof()
        charAt()
### StringBuffer类
    1，可变的字符串类.
    2，拼接
        append();
    3,替换
        setCharAt();
    4,反转
        reverse();
    5,删除
        deleteCharAt();
        delete();
## String,StringBuffer,StringBuilder的区别
    1,String类是不可变类，一旦一个String对象被创建后在这个对象中的字符序列是不可变的。
    2,StringBuffer和StringBuilder的功能基本相同。但是，StringBuffer是线程安全的，StringBuilder是非线程安全的。
## 正则表达式
    1,在代码中常简写为 regex、regexp 或 RE，它是计算机科学的一个概念。
    2，String 类里也提供了如下几个特殊的方法。
        boolean matches(String regex)：判断该字符串是否匹配指定的正则表达式。
        String replaceAll(String regex, String replacement)：将该字符串中所有匹配 regex 的子串替换成 replacement。
        String replaceFirst(String regex, String replacement)：将该字符串中第一个匹配 regex 的子串替换成 replacement。
        String[] split(String regex)：以 regex 作为分隔符，把该字符串分割成多个子串。
![正则表达式](img/reg1.png)
![正则表达式](img/reg2.png)
![正则表达式](img/reg3.png)

    d 是 digit 的意思，代表数字。
    s 是 space 的意思，代表空白。
    w 是 word 的意思，代表单词。
    d、s、w 的大写形式恰好匹配与之相反的字符。
![正则表达式](img/reg4.png)
![正则表达式](img/reg5.png)

    Greedy（贪婪模式）：数量表示符默认采用贪婪模式，除非另有表示。贪婪模式的表达式会一直匹配下去，直到无法匹配为止。如果你发现表达式匹配的结果与预期的不符，很有可能是因为你以为表达式只会匹配前面几个字符，而实际上它是贪婪模式，所以会一直匹配下去。
    Reluctant（勉强模式）：用问号后缀（?）表示，它只会匹配最少的字符。也称为最小匹配模式。
    Possessive（占有模式）：用加号后缀（+）表示，目前只有 Java 支持占有模式，通常比较少用。
![正则表达式](img/reg6.png)

    3,正则匹配手机号
        String str=""1[3-9][0-9]\\d{8};
##  数字与日期
    1，math类
        提供了常见的数学方法，圆周率pi，常量E
    2，随机数
        Random 类提供了丰富的随机数生成方法，可以产生 boolean、int、long、float、byte 数组以及 double 类型的随机数，这是它与 random() 方法最大的不同之处。random() 方法只能产生 double 类型的 0~1 的随机数。
    3,数字格式化
![正则表达式](img/num1.png)

    4,大数运算
        BigInteger 类是针对整型大数字的处理类，而 BigDecimal 类是针对大小数的处理类。
    5,日期与时间
![正则表达式](img/date.png)

        1,Calendar 类是一个抽象类，它为特定瞬间与 YEAR、MONTH、DAY_OF—MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（如获得下星期的日期） 提供了一些方法。
![正则表达式](img/date1.png)
    
        2,DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。日期/时间格式化子类（如 SimpleDateFormat）允许进行格式化（也就是日期→文本）、解析（文本→日期）和标准化日期。
![正则表达式](img/date2.png)

            SHORT：完全为数字，如 12.5.10 或 5:30pm。
            MEDIUM：较长，如 May 10，2016。
            LONG：更长，如 May 12，2016 或 11:15:32am。
            FULL：是完全指定，如 Tuesday、May 10、2012 AD 或 11:l5:42am CST。
        3,如果使用 DateFormat 类格式化日期/时间并不能满足要求，那么就需要使用 DateFormat 类的子类——SimpleDateFormat。
![正则表达式](img/date3.png)

##  Java包装类、装箱和拆箱
![正则表达式](img/base.png)
