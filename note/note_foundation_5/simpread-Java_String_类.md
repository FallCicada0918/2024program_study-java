<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-25 14:51:16
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-25 14:51:20
-->

字符串广泛应用 在 Java 编程中，在 Java 中字符串属于对象，Java 提供了 String 类来创建和操作字符串。

创建字符串
----------

创建字符串最简单的方式如下:

```
String str = "Runoob";


```

在代码中遇到字符串常量时，这里的值是 "**Runoob**"，编译器会使用该值创建一个 String 对象。

和其它对象一样，可以使用关键字和构造方法来创建 String 对象。

用构造函数创建字符串：

```
String str2=new String("Runoob");


```

String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上：

```
String s1 = "Runoob";              // String 直接创建
String s2 = "Runoob";              // String 直接创建
String s3 = s1;                    // 相同引用
String s4 = new String("Runoob");   // String 对象创建
String s5 = new String("Runoob");   // String 对象创建


```

![](https://www.runoob.com/wp-content/uploads/2013/12/java-string-1-2020-12-01.png)

String 类有 11 种构造方法，这些方法提供不同的参数来初始化字符串，比如提供一个字符数组参数:

```
public class StringDemo{
   public static void main(String args[]){
      char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
      String helloString = new String(helloArray);  
      System.out.println( helloString );
   }
}


```

以上实例编译运行结果如下：

```
runoob

```

**注意:** String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了（详看笔记部分解析）。

如果需要对字符串做很多修改，那么应该选择使用 [StringBuffer &amp; StringBuilder 类](/java/java-stringbuffer.html "StringBuffer &amp; StringBuilder 类")。

字符串长度
----------

用于获取有关对象的信息的方法称为访问器方法。

String 类的一个访问器方法是 length() 方法，它返回字符串对象包含的字符数。

下面的代码执行后，len 变量等于 14:

```
public class StringDemo {
    public static void main(String args[]) {
        String site = "www.runoob.com";
        int len = site.length();
        System.out.println( "菜鸟教程网址长度 : " + len );
   }
}


```

以上实例编译运行结果如下：

```
菜鸟教程网址长度 : 14

```

连接字符串
----------

String 类提供了连接两个字符串的方法：

```
string1.concat(string2);


```

返回 string2 连接 string1 的新字符串。也可以对字符串常量使用 concat() 方法，如：

```
"我的名字是 ".concat("Runoob");

```

更常用的是使用'+'操作符来连接字符串，如：

```
"Hello," + " runoob" + "!"

```

结果如下:

```
"Hello, runoob!"

```

下面是一个例子:

```
public class StringDemo {
    public static void main(String args[]) {   
        String string1 = "菜鸟教程网址：";   
        System.out.println("1、" + string1 + "www.runoob.com");  
    }
}


```

以上实例编译运行结果如下：

```


```

创建格式化字符串
----------------

我们知道输出格式化数字可以使用 printf() 和 format() 方法。

String 类使用静态方法 format() 返回一个 String 对象而不是 PrintStream 对象。

String 类的静态方法 format() 能用来创建可复用的格式化字符串，而不仅仅是用于一次打印输出。

如下所示：

```
System.out.printf("浮点型变量的值为 " +
                  "%f, 整型变量的值为 " +
                  " %d, 字符串变量的值为 " +
                  "is %s", floatVar, intVar, stringVar);


```

你也可以这样写

```
String fs;
fs = String.format("浮点型变量的值为 " +
                   "%f, 整型变量的值为 " +
                   " %d, 字符串变量的值为 " +
                   " %s", floatVar, intVar, stringVar);


```

String 方法
-----------

下面是 String 类支持的方法，更多详细，参看 [Java String API](https://www.runoob.com/manual/jdk11api/java.base/java/lang/String.html) 文档:

<table><tbody><tr><th>SN(序号)</th><th>方法描述</th></tr><tr><td>1</td><td><a href="java-string-charat.html" target="_blank" rel="noopener noreferrer">char charAt(int index)</a><br>返回指定索引处的 char 值。</td></tr><tr><td>2</td><td><a href="java-string-compareto.html" target="_blank" rel="noopener noreferrer">int compareTo(Object o)</a><br>把这个字符串和另一个对象比较。</td></tr><tr><td>3</td><td><a href="java-string-compareto.html" target="_blank" rel="noopener noreferrer">int compareTo(String anotherString)</a><br>按字典顺序比较两个字符串。</td></tr><tr><td>4</td><td><a href="java-string-comparetoignorecase.html" target="_blank" rel="noopener noreferrer">int compareToIgnoreCase(String str)</a><br>按字典顺序比较两个字符串，不考虑大小写。</td></tr><tr><td>5</td><td><a href="java-string-concat.html" target="_blank" rel="noopener noreferrer">String concat(String str)</a><br>将指定字符串连接到此字符串的结尾。</td></tr><tr><td>6</td><td><a href="java-string-contentequals.html" target="_blank" rel="noopener noreferrer">boolean contentEquals(StringBuffer sb)</a><br>当且仅当字符串与指定的 StringBuffer 有相同顺序的字符时候返回真。</td></tr><tr><td>7</td><td><a href="java-string-copyvalueof.html" target="_blank" rel="noopener noreferrer">static String copyValueOf(char[] data)</a><br>返回指定数组中表示该字符序列的 String。</td></tr><tr><td>8</td><td><a href="java-string-copyvalueof.html" target="_blank" rel="noopener noreferrer">static String copyValueOf(char[] data, int offset, int count)</a><br>返回指定数组中表示该字符序列的 String。</td></tr><tr><td>9</td><td><a href="java-string-endswith.html" target="_blank" rel="noopener noreferrer">boolean endsWith(String suffix)</a><br>测试此字符串是否以指定的后缀结束。</td></tr><tr><td>10</td><td><a href="java-string-equals.html" target="_blank" rel="noopener noreferrer">boolean equals(Object anObject)</a><br>将此字符串与指定的对象比较。</td></tr><tr><td>11</td><td><a href="java-string-equalsignorecase.html" target="_blank" rel="noopener noreferrer">boolean equalsIgnoreCase(String anotherString)</a><br>将此 String 与另一个 String 比较，不考虑大小写。</td></tr><tr><td>12</td><td><a href="java-string-getbytes.html" target="_blank" rel="noopener noreferrer">byte[] getBytes()</a><br> 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。</td></tr><tr><td>13</td><td><a href="java-string-getbytes.html" target="_blank" rel="noopener noreferrer">byte[] getBytes(String charsetName)</a><br>使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。</td></tr><tr><td>14</td><td><a href="java-string-getchars.html" target="_blank" rel="noopener noreferrer">void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)</a><br>将字符从此字符串复制到目标字符数组。</td></tr><tr><td>15</td><td><a href="java-string-hashcode.html" target="_blank" rel="noopener noreferrer">int hashCode()</a><br>返回此字符串的哈希码。</td></tr><tr><td>16</td><td><a href="java-string-indexof.html" target="_blank" rel="noopener noreferrer">int indexOf(int ch)</a><br>返回指定字符在此字符串中第一次出现处的索引。</td></tr><tr><td>17</td><td><a href="java-string-indexof.html" target="_blank" rel="noopener noreferrer">int indexOf(int ch, int fromIndex)</a><br>返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。</td></tr><tr><td>18</td><td><a href="java-string-indexof.html" target="_blank" rel="noopener noreferrer">int indexOf(String str)</a><br> 返回指定子字符串在此字符串中第一次出现处的索引。</td></tr><tr><td>19</td><td><a href="java-string-indexof.html" target="_blank" rel="noopener noreferrer">int indexOf(String str, int fromIndex)</a><br>返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。</td></tr><tr><td>20</td><td><a href="java-string-intern.html" target="_blank" rel="noopener noreferrer">String intern()</a><br> 返回字符串对象的规范化表示形式。</td></tr><tr><td>21</td><td><a href="java-string-lastindexof.html" target="_blank" rel="noopener noreferrer">int lastIndexOf(int ch)</a><br> 返回指定字符在此字符串中最后一次出现处的索引。</td></tr><tr><td>22</td><td><a href="java-string-lastindexof.html" target="_blank" rel="noopener noreferrer">int lastIndexOf(int ch, int fromIndex)</a><br>返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。</td></tr><tr><td>23</td><td><a href="java-string-lastindexof.html" target="_blank" rel="noopener noreferrer">int lastIndexOf(String str)</a><br>返回指定子字符串在此字符串中最右边出现处的索引。</td></tr><tr><td>24</td><td><a href="java-string-lastindexof.html" target="_blank" rel="noopener noreferrer">int lastIndexOf(String str, int fromIndex)</a><br> 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。</td></tr><tr><td>25</td><td><a href="java-string-length.html" target="_blank" rel="noopener noreferrer">int length()</a><br>返回此字符串的长度。</td></tr><tr><td>26</td><td><a href="java-string-matches.html" target="_blank" rel="noopener noreferrer">boolean matches(String regex)</a><br>告知此字符串是否匹配给定的正则表达式。</td></tr><tr><td>27</td><td><a href="java-string-regionmatches.html" target="_blank" rel="noopener noreferrer">boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)</a><br>测试两个字符串区域是否相等。</td></tr><tr><td>28</td><td><a href="java-string-regionmatches.html" target="_blank" rel="noopener noreferrer">boolean regionMatches(int toffset, String other, int ooffset, int len)</a><br>测试两个字符串区域是否相等。</td></tr><tr><td>29</td><td><a href="java-string-replace.html" target="_blank" rel="noopener noreferrer">String replace(char oldChar, char newChar)</a><br>返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。</td></tr><tr><td>30</td><td><a href="java-string-replaceall.html" target="_blank" rel="noopener noreferrer">String replaceAll(String regex, String replacement)</a><br>使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。</td></tr><tr><td>31</td><td><a href="java-string-replacefirst.html" target="_blank" rel="noopener noreferrer">String replaceFirst(String regex, String replacement)</a><br> 使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。</td></tr><tr><td>32</td><td><a href="java-string-split.html" target="_blank" rel="noopener noreferrer">String[] split(String regex)</a><br>根据给定正则表达式的匹配拆分此字符串。</td></tr><tr><td>33</td><td><a href="java-string-split.html" target="_blank" rel="noopener noreferrer">String[] split(String regex, int limit)</a><br>根据匹配给定的正则表达式来拆分此字符串。</td></tr><tr><td>34</td><td><a href="java-string-startswith.html" target="_blank" rel="noopener noreferrer">boolean startsWith(String prefix)</a><br>测试此字符串是否以指定的前缀开始。</td></tr><tr><td>35</td><td><a href="java-string-startswith.html" target="_blank" rel="noopener noreferrer">boolean startsWith(String prefix, int toffset)</a><br>测试此字符串从指定索引开始的子字符串是否以指定前缀开始。</td></tr><tr><td>36</td><td><a href="java-string-subsequence.html" target="_blank" rel="noopener noreferrer">CharSequence subSequence(int beginIndex, int endIndex)</a><br> 返回一个新的字符序列，它是此序列的一个子序列。</td></tr><tr><td>37</td><td><a href="java-string-substring.html" target="_blank" rel="noopener noreferrer">String substring(int beginIndex)</a><br>返回一个新的字符串，它是此字符串的一个子字符串。</td></tr><tr><td>38</td><td><a href="java-string-substring.html" target="_blank" rel="noopener noreferrer">String substring(int beginIndex, int endIndex)</a><br>返回一个新字符串，它是此字符串的一个子字符串。</td></tr><tr><td>39</td><td><a href="java-string-tochararray.html" target="_blank" rel="noopener noreferrer">char[] toCharArray()</a><br>将此字符串转换为一个新的字符数组。</td></tr><tr><td>40</td><td><a href="java-string-tolowercase.html" target="_blank" rel="noopener noreferrer">String toLowerCase()</a><br>使用默认语言环境的规则将此 String 中的所有字符都转换为小写。</td></tr><tr><td>41</td><td><a href="java-string-tolowercase.html" target="_blank" rel="noopener noreferrer">String toLowerCase(Locale locale)</a><br> 使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。</td></tr><tr><td>42</td><td><a href="java-string-tostring.html" target="_blank" rel="noopener noreferrer">String toString()</a><br> 返回此对象本身（它已经是一个字符串！）。</td></tr><tr><td>43</td><td><a href="java-string-touppercase.html" target="_blank" rel="noopener noreferrer">String toUpperCase()</a><br>使用默认语言环境的规则将此 String 中的所有字符都转换为大写。</td></tr><tr><td>44</td><td><a href="java-string-touppercase.html" target="_blank" rel="noopener noreferrer">String toUpperCase(Locale locale)</a><br>使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。</td></tr><tr><td>45</td><td><a href="java-string-trim.html" target="_blank" rel="noopener noreferrer">String trim()</a><br>返回字符串的副本，忽略前导空白和尾部空白。</td></tr><tr><td>46</td><td><a href="java-string-valueof.html" target="_blank" rel="noopener noreferrer">static String valueOf(primitive data type x)</a><br>返回给定 data type 类型 x 参数的字符串表示形式。</td></tr><tr><td>47</td><td><a href="java-string-contains.html" target="_blank" rel="noopener noreferrer">contains(CharSequence chars)</a><br>判断是否包含指定的字符系列。</td></tr><tr><td>48</td><td><a href="java-string-isempty.html" target="_blank" rel="noopener noreferrer">isEmpty()</a><br>判断字符串是否为空。</td></tr></tbody></table>
