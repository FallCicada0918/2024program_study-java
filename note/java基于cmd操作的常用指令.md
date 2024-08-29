# java基于cmd操作的常用指令


| 指令       | 描述                                                         |
|------------|--------------------------------------------------------------|
| `javac`    | 编译Java源代码文件，如：`javac HelloWorld.java`             |
| `java`     | 运行编译后的Java类文件，如：`java HelloWorld`                |
| `cd`       | 改变当前工作目录，如：`cd path\to\your\directory`            |
| `dir`      | 列出当前目录下的文件和子目录                                 |
| `md`       | 创建新目录，等同于`mkdir`，如：`md new_directory`            |
| `del`      | 删除文件，如：`del HelloWorld.java`                          |
| `rd`       | 删除空目录，等同于`rmdir`，如：`rd directory_to_remove`      |
| `move`     | 移动文件或目录，如：`move old_file new_file`                 |
| `copy`     | 复制文件，如：`copy source_file destination_file`           |
| `rename`   | 重命名文件或目录，如：`rename old_name new_name`             |
| `type`     | 显示文件内容，如：`type file.txt`                            |
| `more`     | 分页显示文件内容，如：`more file.txt`                        |
| `path`     | 设置或查看环境路径变量                                       |
| `set`      | 设置环境变量                                                 |
| `echo %JAVA_HOME%` | 显示`JAVA_HOME`环境变量的值                     |
| `set JAVA_HOME=path\to\jdk` | 设置`JAVA_HOME`环境变量                |
| `set PATH=%JAVA_HOME%\bin;%PATH%` | 将JDK的`bin`目录添加到系统路径中       |
| `cls`      | 清除屏幕内容                                                 |
| `exit`     | 退出命令提示符                                               |
| `javac -d  ../../odj  [所编译的java文件名].java` |  编译java文件，并生成class文件到上两级路径中obj文件夹中             |
|` java -cp ../../obj/ [类名包括完整包名]`     |运行指定文件夹中字节码                    |
|` javac -encoding [编译前java文件编码格式] [所编译的java文件名].java`  |以UTF_8编码格式编译java文件                   |

**说明：**
- `javac HelloWorld.java`：将`HelloWorld.java`编译成`HelloWorld.class`。
- `java HelloWorld`：运行`HelloWorld.class`文件，注意不要加`.class`扩展名。
- `cd path\to\your\directory`：切换到指定目录。
- `del HelloWorld.java`：删除`HelloWorld.java`文件。
- `rd directory_to_remove`：删除名为`directory_to_remove`的空目录。
- `move old_file new_file`：将文件`old_file`移动或重命名为`new_file`。
- `copy source_file destination_file`：将`source_file`复制为`destination_file`。
- `rename old_name new_name`：将文件或目录`old_name`重命名为`new_name`。
- `type file.txt`：显示`file.txt`的内容。
- `more file.txt`：分页显示`file.txt`的内容。
- `set JAVA_HOME=path\to\jdk`：设置`JAVA_HOME`环境变量为JDK的安装路径。
- `set PATH=%JAVA_HOME%\bin;%PATH%`：将JDK的`bin`目录添加到系统路径中，以便在任何位置使用`javac`和`java`命令。
- `cls`：清除命令提示符窗口中的内容。
- `exit`：退出命令提示符窗口。

**注意事项：**
- 在Windows环境下，路径中的反斜杠`\`需要转义为`\\`，但在命令行中直接使用`\`通常是可行的。
- 在使用`javac`或`java`之前，请确保JDK已经正确安装，并且`JAVA_HOME`环境变量已经设置好。