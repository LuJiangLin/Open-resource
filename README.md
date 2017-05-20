# TestDemo1-github


个人搜集编写整理的项目小例子以及一些工具类，包括定时器，30个常用工具类

作者：鲁大师

---------

> 云阳上征去，两岸饶商贾。
> 吴牛喘月时，拖船一何苦。
> 水浊不可饮，壶浆半成土。
> 一唱都护歌，心摧泪如雨。
> 万人凿盘石，无由达江浒。
> 君看石芒砀，掩泪悲千古。
> ......

框架介绍

 1. SpringMVC：它用于web层，相当于controller（等价于传统的servlet和struts的action），用来处理用户请求。举个例子，用户在地址栏输入http://网站域名/login，那么springmvc就会拦截到这个请求，并且调用controller层中相应的方法，（中间可能包含验证用户名和密码的业务逻辑，以及查询数据库操作，但这些都不是springmvc的职责），最终把结果返回给用户，并且返回相应的页面（当然也可以只返回json/xml等格式数据）。springmvc就是做前面和后面过程的活，与用户打交道！！
 
 2. Spring：太强大了，以至于我无法用一个词或一句话来概括它。但与我们平时开发接触最多的估计就是IOC容器，它可以装载bean（也就是我们java中的类，当然也包括service dao里面的），有了这个机制，我们就不用在每次使用这个类的时候为它初始化，很少看到关键字new。另外spring的aop，事务管理等等都是我们经常用到的。

 3. MyBatis：如果你问我它跟鼎鼎大名的Hibernate有什么区别？我只想说，他更符合我的需求。第一，它能自由控制sql，这会让有数据库经验的人（当然不是说我啦~捂脸~）编写的代码能搞提升数据库访问的效率。第二，它可以使用xml的方式来组织管理我们的sql，因为一般程序出错很多情况下是sql出错，别人接手代码后能快速找到出错地方，甚至可以优化原来写的sql。

--------------

## SSM框架整合配置


首先我们打开IED，我这里用的是eclipse，创建一个动态web项目，建立好相应的**目录结构**（重点！）

![项目结构图]


| 文件名 | 作用 |
| --- | --- |
| src | 根目录，没什么好说的，下面有main和test。 |
| main | 主要目录，可以放java代码和一些资源文件。 |
| java | 存放我们的java代码，这个文件夹要使用Build Path -> Use as Source Folder，这样看包结构会方便很多，新建的包就相当于在这里新建文件夹咯。 |
| resources | 存放资源文件，譬如各种的spring，mybatis，log配置文件。 |
| mapper | 存放dao中每个方法对应的sql，在这里配置，无需写daoImpl。
| spring | 这里当然是存放spring相关的配置文件，有dao service web三层。 |
| sql | 其实这个可以没有，但是为了项目完整性还是加上吧。 |
| webapp | 这个貌似是最熟悉的目录了，用来存放我们前端的静态资源，如jsp js css。 |
| resources | 这里的资源是指项目的静态资源，如js css images等。 |
| WEB-INF | 很重要的一个目录，外部浏览器无法访问，只有羡慕内部才能访问，可以把jsp放在这里，另外就是web.xml了。你可能有疑问了，为什么上面java中的resources里面的配置文件不妨在这里，那么是不是会被外部窃取到？你想太多了，部署时候基本上只有webapp里的会直接输出到根目录，其他都会放入WEB-INF里面，项目内部依然可以使用classpath:XXX来访问，好像IDE里可以设置部署输出目录，这里扯远了~ |
| test | 这里是测试分支。 |
| java | 测试java代码，应遵循包名相同的原则，这个文件夹同样要使用Build Path -> Use as Source Folder，这样看包结构会方便很多。 |
| resources | 没什么好说的，好像也很少用到，但这个是maven的规范。 |


---------------

先新建好几个必要的**包**

![包结构图]

| 包名 | 名称 | 作用 |
| --- | --- | --- |
| dao | 数据访问层（接口） | 与数据打交道，可以是数据库操作，也可以是文件读写操作，甚至是redis缓存操作，总之与数据操作有关的都放在这里，也有人叫做dal或者数据持久层都差不多意思。为什么没有daoImpl，因为我们用的是mybatis，所以可以直接在配置文件中实现接口的每个方法。 |
| entity | 实体类 | 一般与数据库的表相对应，封装dao层取出来的数据为一个对象，也就是我们常说的pojo，一般只在dao层与service层之间传输。 |
| dto | 数据传输层 | 刚学框架的人可能不明白这个有什么用，其实就是用于service层与web层之间传输，为什么不直接用entity（pojo）？其实在实际开发中发现，很多时间一个entity并不能满足我们的业务需求，可能呈现给用户的信息十分之多，这时候就有了dto，也相当于vo，记住一定不要把这个混杂在entity里面，答应我好吗？ |
| service | 业务逻辑（接口） | 写我们的业务逻辑，也有人叫bll，在设计业务接口时候应该站在“使用者”的角度。额，不要问我为什么这里没显示！IDE调皮我也拿它没办法~ |
| serviceImpl | 业务逻辑（实现） | 实现我们业务接口，一般事务控制是写在这里，没什么好说的。 |
| web | 控制器 | springmvc就是在这里发挥作用的，一般人叫做controller控制器，相当于struts中的action。 |


-----------

还有最后一步基础工作，导入我们相应的jar包，使用的是maven来管理我们的jar
**pom.xml**
``` xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.soecode.ssm</groupId>
	<artifactId>ssm</artifactId>
	<packaging>war</packaging>
	<version>0.0.1-SNAPSHOT</version>
	<name>ssm Maven Webapp</name>
	<url>http://github.com/liyifeng1994/ssm</url>
	<dependencies>
		<!-- 单元测试 -->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
		</dependency>

		<!-- 1.日志 -->
		<!-- 实现slf4j接口并整合 -->
		<dependency>
			<groupId>ch.qos.logback</groupId>
			<artifactId>logback-classic</artifactId>
			<version>1.1.1</version>
		</dependency>

		<!-- 2.数据库 -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.37</version>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>c3p0</groupId>
			<artifactId>c3p0</artifactId>
			<version>0.9.1.2</version>
		</dependency>

		<!-- DAO: MyBatis -->
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis</artifactId>
			<version>3.3.0</version>
		</dependency>
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis-spring</artifactId>
			<version>1.2.3</version>
		</dependency>

		<!-- 3.Servlet web -->
		<dependency>
			<groupId>taglibs</groupId>
			<artifactId>standard</artifactId>
			<version>1.1.2</version>
		</dependency>
		<dependency>
			<groupId>jstl</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.5.4</version>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
		</dependency>

		<!-- 4.Spring -->
		<!-- 1)Spring核心 -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-beans</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<!-- 2)Spring DAO层 -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-tx</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<!-- 3)Spring web -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-web</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<!-- 4)Spring test -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-test</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>

		<!-- redis客户端:Jedis -->
		<dependency>
			<groupId>redis.clients</groupId>
			<artifactId>jedis</artifactId>
			<version>2.7.3</version>
		</dependency>
		<dependency>
			<groupId>com.dyuproject.protostuff</groupId>
			<artifactId>protostuff-core</artifactId>
			<version>1.0.8</version>
		</dependency>
		<dependency>
			<groupId>com.dyuproject.protostuff</groupId>
			<artifactId>protostuff-runtime</artifactId>
			<version>1.0.8</version>
		</dependency>

		<!-- Map工具类 -->
		<dependency>
			<groupId>commons-collections</groupId>
			<artifactId>commons-collections</artifactId>
			<version>3.2</version>
		</dependency>
	</dependencies>
	<build>
		<finalName>ssm</finalName>
	</build>
</project>

```

不积跬步无以至千里

----------

2017-05-20 最新上传  作者：鲁大师


