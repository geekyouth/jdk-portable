package cn.java666.jdkportable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class JdkPortableApp {
	
	public static void main(String[] args) {
		SpringApplication.run(JdkPortableApp.class, args);
		
		System.out.println("============ 主程序启动成功，以下是jdk信息 ============");
		Properties properties = System.getProperties();
		String version = properties.getProperty("java.version");
		String path = properties.getProperty("java.home");
		
		System.out.printf("当前jdk版本号 = %s，jre 主目录 = %s, 完整信息:\n\n", version, path);
		
		properties.forEach((o, o2) -> System.out.println(o.toString() + ":\t" + o2.toString()));
		
		System.out.println("\n============ END ============");
	}
}

/*
============ 主程序启动成功，以下是jdk信息 ============
当前jdk版本号 = 1.8.0_181，jre 主目录 = D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre, 完整信息:

sun.cpu.isalist:	amd64
sun.desktop:	windows
sun.io.unicode.encoding:	UnicodeLittle
sun.cpu.endian:	little
java.vendor.url.bug:	http://bugreport.sun.com/bugreport/
file.separator:	\
spring.application.admin.enabled:	true
catalina.base:	C:\Users\Geek\AppData\Local\Temp\tomcat.1785530396227263050.58080
java.awt.headless:	true
java.vendor:	Oracle Corporation
sun.boot.class.path:	D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\resources.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\rt.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\sunrsasign.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\jsse.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\jce.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\charsets.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\jfr.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\classes
java.ext.dirs:	D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext;C:\WINDOWS\Sun\Java\lib\ext
java.version:	1.8.0_181
java.vm.info:	mixed mode
awt.toolkit:	sun.awt.windows.WToolkit
user.language:	zh
java.specification.vendor:	Oracle Corporation
sun.java.command:	cn.java666.jdkportable.JdkPortableApplication
java.home:	D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre
sun.arch.data.model:	64
java.vm.specification.version:	1.8
com.sun.management.jmxremote:	
java.class.path:	D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\charsets.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\deploy.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\access-bridge-64.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\cldrdata.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\dnsns.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\jaccess.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\jfxrt.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\localedata.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\nashorn.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\sunec.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\sunjce_provider.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\sunmscapi.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\sunpkcs11.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\ext\zipfs.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\javaws.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\jce.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\jfr.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\jfxswt.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\jsse.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\management-agent.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\plugin.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\resources.jar;D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\rt.jar;D:\0-code\kl-open\jdk-portable\target\classes;C:\Users\Geek\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.1.13.RELEASE\spring-boot-starter-web-2.1.13.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\boot\spring-boot-starter\2.1.13.RELEASE\spring-boot-starter-2.1.13.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.1.13.RELEASE\spring-boot-starter-logging-2.1.13.RELEASE.jar;C:\Users\Geek\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;C:\Users\Geek\.m2\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;C:\Users\Geek\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar;C:\Users\Geek\.m2\repository\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar;C:\Users\Geek\.m2\repository\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;C:\Users\Geek\.m2\repository\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;C:\Users\Geek\.m2\repository\org\yaml\snakeyaml\1.23\snakeyaml-1.23.jar;C:\Users\Geek\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.1.13.RELEASE\spring-boot-starter-json-2.1.13.RELEASE.jar;C:\Users\Geek\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.9.10.3\jackson-databind-2.9.10.3.jar;C:\Users\Geek\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.9.10\jackson-annotations-2.9.10.jar;C:\Users\Geek\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.9.10\jackson-core-2.9.10.jar;C:\Users\Geek\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.9.10\jackson-datatype-jdk8-2.9.10.jar;C:\Users\Geek\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.9.10\jackson-datatype-jsr310-2.9.10.jar;C:\Users\Geek\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.9.10\jackson-module-parameter-names-2.9.10.jar;C:\Users\Geek\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.1.13.RELEASE\spring-boot-starter-tomcat-2.1.13.RELEASE.jar;C:\Users\Geek\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.31\tomcat-embed-core-9.0.31.jar;C:\Users\Geek\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\9.0.31\tomcat-embed-el-9.0.31.jar;C:\Users\Geek\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.31\tomcat-embed-websocket-9.0.31.jar;C:\Users\Geek\.m2\repository\org\hibernate\validator\hibernate-validator\6.0.18.Final\hibernate-validator-6.0.18.Final.jar;C:\Users\Geek\.m2\repository\javax\validation\validation-api\2.0.1.Final\validation-api-2.0.1.Final.jar;C:\Users\Geek\.m2\repository\org\jboss\logging\jboss-logging\3.3.3.Final\jboss-logging-3.3.3.Final.jar;C:\Users\Geek\.m2\repository\com\fasterxml\classmate\1.4.0\classmate-1.4.0.jar;C:\Users\Geek\.m2\repository\org\springframework\spring-web\5.1.14.RELEASE\spring-web-5.1.14.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\spring-beans\5.1.14.RELEASE\spring-beans-5.1.14.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\spring-webmvc\5.1.14.RELEASE\spring-webmvc-5.1.14.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\spring-aop\5.1.14.RELEASE\spring-aop-5.1.14.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\spring-context\5.1.14.RELEASE\spring-context-5.1.14.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\spring-expression\5.1.14.RELEASE\spring-expression-5.1.14.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\boot\spring-boot-devtools\2.1.13.RELEASE\spring-boot-devtools-2.1.13.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\boot\spring-boot\2.1.13.RELEASE\spring-boot-2.1.13.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.1.13.RELEASE\spring-boot-autoconfigure-2.1.13.RELEASE.jar;C:\Users\Geek\.m2\repository\org\projectlombok\lombok\1.18.12\lombok-1.18.12.jar;C:\Users\Geek\.m2\repository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;C:\Users\Geek\.m2\repository\org\springframework\spring-core\5.1.14.RELEASE\spring-core-5.1.14.RELEASE.jar;C:\Users\Geek\.m2\repository\org\springframework\spring-jcl\5.1.14.RELEASE\spring-jcl-5.1.14.RELEASE.jar;D:\0-IT-soft\ideaIU-2019.3-jbr8.win\lib\idea_rt.jar
user.name:	Geek
catalina.home:	C:\Users\Geek\AppData\Local\Temp\tomcat.1785530396227263050.58080
file.encoding:	UTF-8
java.specification.version:	1.8
java.awt.printerjob:	sun.awt.windows.WPrinterJob
catalina.useNaming:	false
user.timezone:	Asia/Shanghai
user.home:	C:\Users\Geek
os.version:	10.0
spring.liveBeansView.mbeanDomain:	
sun.management.compiler:	HotSpot 64-Bit Tiered Compilers
spring.jmx.enabled:	true
java.specification.name:	Java Platform API Specification
java.class.version:	52.0
spring.beaninfo.ignore:	true
java.library.path:	D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\bin;.....
sun.jnu.encoding:	GBK
os.name:	Windows 10
user.variant:	
java.vm.specification.vendor:	Oracle Corporation
java.io.tmpdir:	C:\Users\Geek\AppData\Local\Temp\
line.separator:	

java.endorsed.dirs:	D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\lib\endorsed
os.arch:	amd64
java.awt.graphicsenv:	sun.awt.Win32GraphicsEnvironment
java.runtime.version:	1.8.0_181-b13
PID:	13740
java.vm.specification.name:	Java Virtual Machine Specification
user.dir:	D:\0-code\kl-open\jdk-portable
user.country:	CN
user.script:	
sun.java.launcher:	SUN_STANDARD
sun.os.patch.level:	
java.vm.name:	Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg:	sun.io
java.rmi.server.randomIDs:	true
path.separator:	;
java.vm.vendor:	Oracle Corporation
java.vendor.url:	http://java.oracle.com/
sun.boot.library.path:	D:\0-IT-soft\0-jdk\jdk-8u181-windows-x64\jdk-8u181-windows-x64-portable\jre\bin
java.vm.version:	25.181-b13
java.runtime.name:	Java(TM) SE Runtime Environment
spring.output.ansi.enabled:	always

============ END ============

 */