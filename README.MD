# jdk-portable 绿色版 jdk 混搭随意切换版本，开发环境快速切换  
  
## 为什么会有这个项目：  
- 之前在开发公司的项目时，需要使用代理ip，但是这个代理ip比较矫情，严重依赖低于jdk8u91(JDK-1.8-91)，一般我在给一台工作电脑初始化JAVA开发环境时，都会默认安装Oracle 官网 JDK1.8的最新版本，于是，就导致了代理ip频繁的报错，然后找到故障原因需要切换低版本jdk，于是就安装了几个版本jdk备用；  
- 后来的问题有点奇葩，我的电脑安装不上jdk1.8-202以上的版本，点击下一步就闪退，~~也查不到原因，如果有大佬找到了原因麻烦在此库发表 issue 告知，万分感谢~~；  
![](.file/fuckbaidu.png)  
  
- jdk 安装失败的原因找到了，是百度输入法惹的祸，切换到其他输入法搞定，反馈给百度开发团队的邮件也没回复，！@#！@#￥……！#￥……#￥！@#；  
![](.file/fuck2.png)  
  
![](.file/spark-bug.png)  
- 2020-03-25 新的发现，spark 2.1.1 版本在使用 scala 2.11 + jdk-1.8-221 版本，调用 ssc.socketTextStream 会报错 `Class not found at org.apache.xbean.asm5.ClassReader.a(Unknown Source)`，于是我根据网上的搜索结果调整了 jdk 版本为1.8-181，再次运行spark-2.1.1 同一个项目，该错误不在复现，欧耶！！！  
![](.file/tomcat.png)  
  
- 为了使用方便，干脆直接绿化一劳永逸，不依赖于图形化安装界面，这样我就可以快速切换不同版本了，于是jdk目录的画风就是这样了：  
![图](.file/jdk-list1.png)  
  
> 参考链接：[JDK绿色化安装，随意切换多版本 https://blog.csdn.net/u011977189/article/details/78765374](https://blog.csdn.net/u011977189/article/details/78765374)    `有 bug`  
  
- 按照上边链接提供的方法，我的确安装了很多版本 JDK，但是用的时候发现阅读源码显示的是反编译的不带注释的代码（var ****），而不是默认的java源码，这就比较蛋疼了，于是我反复研究了安装版和绿色版的文件区别，对比了文件个数和大小，没找到破绽。一个无意的机会，被我发现了，最关键的源代码文件 src.zip 才是我们需要的带注释java源码的zip压缩包，jdk 绿色版完整文件结构如下：  
![](.file/files.png)  
  
- 绿色版 jdk 必备的两组文件来源（反复解压，别问，问就是套娃）：  
    - 主目录：jdk-8u181-windows-x64\.rsrc\1033\JAVA_CAB10\111~\tools\  
    - 文档注释（复制到主目录下）：jdk-8u181-windows-x64\.rsrc\1033\JAVA_CAB9\110~\src.zip  
  
- [完整的文件清单](.file/list.txt)   
  
- jdk 其他版本依此类推，推荐使用基数后缀版本，原因：  
[https://www.xncoding.com/2018/05/28/java/jdk.html](https://www.xncoding.com/2018/05/28/java/jdk.html)  
> 每次去Oracle官网去下载JDK，就会发现有两个版本，一个基数版本，一个偶数版本。比如最新的jdk-8u191和jdk-8u192。这是咋回事？  
  这是官方对于奇数版本与偶数版本区别的解释：  
  从JDK版本7u71以后，JAVA将会在同一时间发布两个版本的JDK，其中：  
  奇数版本为BUG修正并全部通过检验的版本，官方强烈推荐使用这个版本。  
  偶数版本包含了奇数版本所有的内容，以及未被验证的BUG修复，Oracle官方表示：除非你深受BUG困扰，否则不推荐您使用这个奇数版本。  
  
- 如何制作绿色版 jdk：  
    1、下载：[https://www.oracle.com/technetwork/java/jdk8-downloads-2133151.html](https://www.oracle.com/technetwork/java/jdk8-downloads-2133151.html)，然后手动执行cmd脚本赋权 》 [命令](src/main/resources/复制出来管理员执行.cmd)，配置环境变量即可食用。  
  
    2、idea 下载这个项目，改配置 `项目结构-sdks, project 配置新的 jdk 路径`， 跑一下本项目，看看结果如何。  
![](.file/jdk-run.png)  
  
### 特别鸣谢  
JB 全家桶（idea + JetBrains Mono Nl font）  
