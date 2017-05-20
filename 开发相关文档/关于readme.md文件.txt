README.md�ļ����Ա�дgithubչʾҳ�棬����Ŀҳ��������ʾ����ظ�ʽ�ɲο��������ӣ�

# SSM
�ְ��ֽ�������������SSM��ܣ�SpringMVC + Spring + MyBatis

���͵�ַ��[http://blog.csdn.net/qq598535550/article/details/51703190](http://blog.csdn.net/qq598535550/article/details/51703190)

---------

> ���ǿ���Ƹ��Ϣ��ʱ�򣬾����ῴ����һ�㣬��Ҫ�߱�SSH��ܵļ��ܣ������ڴ󲿷ֽ�ѧ�����У�Ҳ���SSH��Ϊ����ĵĽ�ѧ���ݡ�
> ���ǣ�������ʵ��Ӧ���з��֣�SpringMVC������ȫ���Struts�����ע��ķ�ʽ����̷ǳ���ݣ�����ͨ��restful�����url���õ�ַ�������ǳ����š�
> ���⣬MyBatisҲ�����滻Hibernate������ΪMyBatis�İ��Զ��ص㣬���ǳ���Գ������ȫ�ƿ�SQL������������ݿ⾭��ĳ���Գ�ܿ�������Ч�ʵ�SQL��䣬����XML���ù�������Ҳ�ǳ����㡣
> ���ˣ������Ҳ��ͬ�ҵĿ�������ô��������һ���������ϰɣ�

��д����֮ǰ�������˽�һ����������ֱܷ��Ǹ�ʲô�ģ�
���Ŵ���ǰҲ����������Щ���������ô�׻����������֮ǰ���˽������������һ��Σ�ֱ�ӿ����룡

 1. SpringMVC��������web�㣬�൱��controller���ȼ��ڴ�ͳ��servlet��struts��action�������������û����󡣾ٸ����ӣ��û��ڵ�ַ������http://��վ����/login����ôspringmvc�ͻ����ص�������󣬲��ҵ���controller������Ӧ�ķ��������м���ܰ�����֤�û����������ҵ���߼����Լ���ѯ���ݿ����������Щ������springmvc��ְ�𣩣����հѽ�����ظ��û������ҷ�����Ӧ��ҳ�棨��ȻҲ����ֻ����json/xml�ȸ�ʽ���ݣ���springmvc������ǰ��ͺ�����̵Ļ���û��򽻵�����
 
 2. Spring��̫ǿ���ˣ����������޷���һ���ʻ�һ�仰������������������ƽʱ�����Ӵ����Ĺ��ƾ���IOC������������װ��bean��Ҳ��������java�е��࣬��ȻҲ����service dao����ģ�������������ƣ����ǾͲ�����ÿ��ʹ��������ʱ��Ϊ����ʼ�������ٿ����ؼ���new������spring��aop���������ȵȶ������Ǿ����õ��ġ�

 3. MyBatis�������������������������Hibernate��ʲô������ֻ��˵�����������ҵ����󡣵�һ���������ɿ���sql������������ݿ⾭����ˣ���Ȼ����˵����~����~����д�Ĵ����ܸ��������ݿ���ʵ�Ч�ʡ��ڶ���������ʹ��xml�ķ�ʽ����֯�������ǵ�sql����Ϊһ��������ܶ��������sql�������˽��ִ�����ܿ����ҵ�����ط������������Ż�ԭ��д��sql��

--------------

## SSM�����������

���ˣ�ǰ��bb��ô�࣬��������������ʼ�ô�����~

�������Ǵ�IED���������õ���eclipse������Ӧ��Ҳ���õ���������𣿣�������һ����̬web��Ŀ����������Ӧ��**Ŀ¼�ṹ**���ص㣡��

![��Ŀ�ṹͼ](http://img.blog.csdn.net/20160618002041099)

����������������Ϊ���ﻹ�ò��������ǲ�Ҫ��ô�ۺò��ã���

��˵һ��ÿ��Ŀ¼����ʲô�ðɣ���һ�λ�����ҷ���markdown�ı���﷨�ܲ��Ѻ�ѽ~��
���Ŀ¼�ṹͬʱҲ��ѭmaven��Ŀ¼�淶~

| �ļ��� | ���� |
| --- | --- |
| src | ��Ŀ¼��ûʲô��˵�ģ�������main��test�� |
| main | ��ҪĿ¼�����Է�java�����һЩ��Դ�ļ��� |
| java | ������ǵ�java���룬����ļ���Ҫʹ��Build Path -> Use as Source Folder�����������ṹ�᷽��ܶ࣬�½��İ����൱���������½��ļ��п��� |
| resources | �����Դ�ļ���Ʃ����ֵ�spring��mybatis��log�����ļ��� |
| mapper | ���dao��ÿ��������Ӧ��sql�����������ã�����дdaoImpl��
| spring | ���ﵱȻ�Ǵ��spring��ص������ļ�����dao service web���㡣 |
| sql | ��ʵ�������û�У�����Ϊ����Ŀ�����Ի��Ǽ��ϰɡ� |
| webapp | ���ò��������Ϥ��Ŀ¼�ˣ������������ǰ�˵ľ�̬��Դ����jsp js css�� |
| resources | �������Դ��ָ��Ŀ�ľ�̬��Դ����js css images�ȡ� |
| WEB-INF | ����Ҫ��һ��Ŀ¼���ⲿ������޷����ʣ�ֻ����Ľ�ڲ����ܷ��ʣ����԰�jsp��������������web.xml�ˡ�������������ˣ�Ϊʲô����java�е�resources����������ļ������������ô�ǲ��ǻᱻ�ⲿ��ȡ��������̫���ˣ�����ʱ�������ֻ��webapp��Ļ�ֱ���������Ŀ¼�������������WEB-INF���棬��Ŀ�ڲ���Ȼ����ʹ��classpath:XXX�����ʣ�����IDE��������ò������Ŀ¼�����ﳶԶ��~ |
| test | �����ǲ��Է�֧�� |
| java | ����java���룬Ӧ��ѭ������ͬ��ԭ������ļ���ͬ��Ҫʹ��Build Path -> Use as Source Folder�����������ṹ�᷽��ܶࡣ |
| resources | ûʲô��˵�ģ�����Ҳ�����õ����������maven�Ĺ淶�� |


---------------

�����½��ü�����Ҫ��**��**����Ϊ��ҽ���һ��ÿ���������ã�˳������һ�º�̨��˼·~

![���ṹͼ](http://img.blog.csdn.net/20160618004306660)

| ���� | ���� | ���� |
| --- | --- | --- |
| dao | ���ݷ��ʲ㣨�ӿڣ� | �����ݴ򽻵������������ݿ������Ҳ�������ļ���д������������redis�����������֮�����ݲ����йصĶ��������Ҳ���˽���dal�������ݳ־ò㶼�����˼��Ϊʲôû��daoImpl����Ϊ�����õ���mybatis�����Կ���ֱ���������ļ���ʵ�ֽӿڵ�ÿ�������� |
| entity | ʵ���� | һ�������ݿ�ı����Ӧ����װdao��ȡ����������Ϊһ������Ҳ�������ǳ�˵��pojo��һ��ֻ��dao����service��֮�䴫�䡣 |
| dto | ���ݴ���� | ��ѧ��ܵ��˿��ܲ����������ʲô�ã���ʵ��������service����web��֮�䴫�䣬Ϊʲô��ֱ����entity��pojo������ʵ��ʵ�ʿ����з��֣��ܶ�ʱ��һ��entity�������������ǵ�ҵ�����󣬿��ܳ��ָ��û�����Ϣʮ��֮�࣬��ʱ�������dto��Ҳ�൱��vo����סһ����Ҫ�����������entity���棬��Ӧ�Һ��� |
| service | ҵ���߼����ӿڣ� | д���ǵ�ҵ���߼���Ҳ���˽�bll�������ҵ��ӿ�ʱ��Ӧ��վ�ڡ�ʹ���ߡ��ĽǶȡ����Ҫ����Ϊʲô����û��ʾ��IDE��Ƥ��Ҳ����û�취~ |
| serviceImpl | ҵ���߼���ʵ�֣� | ʵ������ҵ��ӿڣ�һ�����������д�����ûʲô��˵�ġ� |
| web | ������ | springmvc���������﷢�����õģ�һ���˽���controller���������൱��struts�е�action�� |


-----------

�������һ����������������������Ӧ��jar������ʹ�õ���maven���������ǵ�jar������ֻ��Ҫ��`pom.xml`�м�����Ӧ�������ͺ��ˣ������ʹ��maven�Ŀ����Լ�ȥ����������Ӧ��jar���ŵ���ĿWEB-INF/libĿ¼�¡�����maven��ѧϰ��ҿ��Կ�[Ľ��������Ƶ�̳�](http://www.imooc.com/learn/443)������Ͳ�չ���ˡ��Ұ���Ŀ�õ���jar��д�����棬�汾���������µģ�����о���Ļ������Լ������汾�š����⣬����jar��������Ŀһ�����ŵ��ҵ�[github](https://github.com/liyifeng1994/ssm)�ϣ�ϲ���ĸ���star��~

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
		<!-- ��Ԫ���� -->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
		</dependency>

		<!-- 1.��־ -->
		<!-- ʵ��slf4j�ӿڲ����� -->
		<dependency>
			<groupId>ch.qos.logback</groupId>
			<artifactId>logback-classic</artifactId>
			<version>1.1.1</version>
		</dependency>

		<!-- 2.���ݿ� -->
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
		<!-- 1)Spring���� -->
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
		<!-- 2)Spring DAO�� -->
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

		<!-- redis�ͻ���:Jedis -->
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

		<!-- Map������ -->
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

-----------

�������Ҫ��ʼ���б��빤���ˣ���ֵ�������������~

��һ������������`spring`�ļ������½�`spring-dao.xml`�ļ�����Ϊspring������̫�࣬������������㣬�ֱ���dao service web��

 1. �������ݿ�������ز�������ѡ��
 2. �����������ӳ�
  1. �����������ԣ����Բ����������ļ�ֱ��������д��
  2. ����c3p0��ֻ���˼������õ�
 3. ����SqlSessionFactory����mybatis��
 4. ɨ��dao��ӿڣ���̬ʵ��dao�ӿڣ�Ҳ����˵����ҪdaoImpl��sql�Ͳ�����д��xml�ļ���

**spring-dao.xml**
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans.xsd
	http://www.springframework.org/schema/context
	http://www.springframework.org/schema/context/spring-context.xsd">
	<!-- ��������mybatis���� -->
	<!-- 1.�������ݿ���ز���properties�����ԣ�${url} -->
	<context:property-placeholder location="classpath:jdbc.properties" />

	<!-- 2.���ݿ����ӳ� -->
	<bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
		<!-- �������ӳ����� -->
		<property name="driverClass" value="${jdbc.driver}" />
		<property name="jdbcUrl" value="${jdbc.url}" />
		<property name="user" value="${jdbc.username}" />
		<property name="password" value="${jdbc.password}" />

		<!-- c3p0���ӳص�˽������ -->
		<property name="maxPoolSize" value="30" />
		<property name="minPoolSize" value="10" />
		<!-- �ر����Ӻ��Զ�commit -->
		<property name="autoCommitOnClose" value="false" />
		<!-- ��ȡ���ӳ�ʱʱ�� -->
		<property name="checkoutTimeout" value="10000" />
		<!-- ����ȡ����ʧ�����Դ��� -->
		<property name="acquireRetryAttempts" value="2" />
	</bean>

	<!-- 3.����SqlSessionFactory���� -->
	<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<!-- ע�����ݿ����ӳ� -->
		<property name="dataSource" ref="dataSource" />
		<!-- ����MyBatiesȫ�������ļ�:mybatis-config.xml -->
		<property name="configLocation" value="classpath:mybatis-config.xml" />
		<!-- ɨ��entity�� ʹ�ñ��� -->
		<property name="typeAliasesPackage" value="com.soecode.lyf.entity" />
		<!-- ɨ��sql�����ļ�:mapper��Ҫ��xml�ļ� -->
		<property name="mapperLocations" value="classpath:mapper/*.xml" />
	</bean>

	<!-- 4.����ɨ��Dao�ӿڰ�����̬ʵ��Dao�ӿڣ�ע�뵽spring������ -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<!-- ע��sqlSessionFactory -->
		<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
		<!-- ������Ҫɨ��Dao�ӿڰ� -->
		<property name="basePackage" value="com.soecode.lyf.dao" />
	</bean>
</beans>
```
��Ϊ���ݿ�������ز����Ƕ�ȡ�����ļ���������`resources`�ļ������½�һ��`jdbc.properties`�ļ����������4����������ݿ��������ԣ������ұ��صģ���Ҽǵ��޸�ѽ~����ϲ������github�ϡ���ͷϺ�ǡ��ǵ�ɾ�����룬��Ȼ���˾ͺ����׵õ�������������ݿ�������Ϣ��Ȼ���һЩ���ߵ����飬�㶮�ģ���

**jdbc.properties**
``` properties
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3307/ssm?useUnicode=true&characterEncoding=utf8
jdbc.username=root
jdbc.password=
```
**������ʾ**�������ļ��е�jdbc.username�����д��username�����ܻ���ϵͳ�����е�username������ͻ�����Ե�ʱ�������������ݿ��ʱ���û����ͱ��滻��ϵͳ�е��û������еÿ�����administrator�����ǿ϶������Ӳ��ɹ��ģ������и�С�ӣ��ұ�����һ���ϣ���

��Ϊ�����õ���mybatis��������Ҫ����mybatis�����ļ�����`recources`�ļ������½�`mybatis-config.xml`�ļ���

 1. ʹ����������
 2. ʹ���б���
 3. �����շ�����ת�� create_time -> createTime

**mybatis-config.xml**
``` xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
	<!-- ����ȫ������ -->
	<settings>
		<!-- ʹ��jdbc��getGeneratedKeys��ȡ���ݿ���������ֵ -->
		<setting name="useGeneratedKeys" value="true" />

		<!-- ʹ���б����滻���� Ĭ��:true -->
		<setting name="useColumnLabel" value="true" />

		<!-- �����շ�����ת��:Table{create_time} -> Entity{createTime} -->
		<setting name="mapUnderscoreToCamelCase" value="true" />
	</settings>
</configuration>
```

�ڶ�������Ū��dao�㣬��������service���ˡ���`spring`�ļ������½�`spring-service.xml`�ļ���

 1. ɨ��service������ע�� @Service
 2. ��������������������������spring�����
 3. ���û���ע�������ʽ���񣬿���ֱ���ڷ�����@Transaction

**spring-service.xml**
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:tx="http://www.springframework.org/schema/tx"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans.xsd
	http://www.springframework.org/schema/context
	http://www.springframework.org/schema/context/spring-context.xsd
	http://www.springframework.org/schema/tx
	http://www.springframework.org/schema/tx/spring-tx.xsd">
	<!-- ɨ��service��������ʹ��ע������� -->
	<context:component-scan base-package="com.soecode.lyf.service" />

	<!-- ������������� -->
	<bean id="transactionManager"
		class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
		<!-- ע�����ݿ����ӳ� -->
		<property name="dataSource" ref="dataSource" />
	</bean>

	<!-- ���û���ע�������ʽ���� -->
	<tx:annotation-driven transaction-manager="transactionManager" />
</beans>
```

-------------

������������web�㣬��`spring`�ļ������½�`spring-web.xml`�ļ���

 1. ����SpringMVCע��ģʽ������ʹ��@RequestMapping��@PathVariable��@ResponseBody��
 2. �Ծ�̬��Դ������js��css��jpg��
 3. ����jsp ��ʾViewResolver��������controller��ĳ����������һ��string���͵�"login"��ʵ���ϻ᷵��"/WEB-INF/login.jsp"
 4. ɨ��web�� @Controller

**spring-web.xml**
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:mvc="http://www.springframework.org/schema/mvc" 
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans.xsd
	http://www.springframework.org/schema/context
	http://www.springframework.org/schema/context/spring-context.xsd
	http://www.springframework.org/schema/mvc
	http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd">
	<!-- ����SpringMVC -->
	<!-- 1.����SpringMVCע��ģʽ -->
	<!-- �����ã� 
		(1)�Զ�ע��DefaultAnootationHandlerMapping,AnotationMethodHandlerAdapter 
		(2)�ṩһЩ�У����ݰ󶨣����ֺ����ڵ�format @NumberFormat, @DateTimeFormat, xml,jsonĬ�϶�д֧�� 
	-->
	<mvc:annotation-driven />
	
	<!-- 2.��̬��ԴĬ��servlet����
		(1)����Ծ�̬��Դ�Ĵ���js,gif,png
		(2)����ʹ��"/"������ӳ��
	 -->
	 <mvc:default-servlet-handler/>
	 
	 <!-- 3.����jsp ��ʾViewResolver -->
	 <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	 	<property name="viewClass" value="org.springframework.web.servlet.view.JstlView" />
	 	<property name="prefix" value="/WEB-INF/jsp/" />
	 	<property name="suffix" value=".jsp" />
	 </bean>
	 
	 <!-- 4.ɨ��web��ص�bean -->
	 <context:component-scan base-package="com.soecode.lyf.web" />
</beans>
```

------------

���Ĳ����������޸�`web.xml`�ļ��ˣ�����`webapp`��`WEB-INF`�¡�

**web.xml**
``` xml
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                      http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
	version="3.1" metadata-complete="true">
	<!-- �������mvn�������ɵ�xml����Ҫ�޸�servlet�汾Ϊ3.1 -->
	<!-- ����DispatcherServlet -->
	<servlet>
		<servlet-name>seckill-dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<!-- ����springMVC��Ҫ���ص������ļ�
			spring-dao.xml,spring-service.xml,spring-web.xml
			Mybatis - > spring -> springmvc
		 -->
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>classpath:spring/spring-*.xml</param-value>
		</init-param>
	</servlet>
	<servlet-mapping>
		<servlet-name>seckill-dispatcher</servlet-name>
		<!-- Ĭ��ƥ�����е����� -->
		<url-pattern>/</url-pattern>
	</servlet-mapping>
</web-app>

```

-----------

��������Ŀ�о�����ʹ�õ���־���������ﻹ��������־xml����`resources`�ļ������½�`logback.xml`�ļ�������������־�����ʽҲ��������Ŀ���̨s�������������Ȥ�鿴[logback�ٷ��ĵ�](http://logback.qos.ch/manual/)��

**logback.xml**
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration debug="true">
	<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
		<!-- encoders are by default assigned the type ch.qos.logback.classic.encoder.PatternLayoutEncoder -->
		<encoder>
			<pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
		</encoder>
	</appender>

	<root level="debug">
		<appender-ref ref="STDOUT" />
	</root>
</configuration>
```

-----------

��ĿǰΪֹ������һ��д��7�������ļ�������һ�����������յ�**�����ļ��ṹͼ**��

![�����ļ��ṹͼ](http://img.blog.csdn.net/20160618142208354)

----------

## SSM���Ӧ��ʵ����ͼ�����ϵͳ��

> һ��ʼ������������̳̣����Ƿ�����ʵ�ܶ��˶�����������SSM������������ر���mybatis���֡��������ھ�������ġ�ͼ�����ϵͳ���С���ѯͼ�顿�͡�ԤԼͼ�顿ҵ������һ��demo�ɣ�

�����½����ݿ���Ϊ`ssm`���ٴ������ű�ͼ���`book`��ԤԼͼ���`appointment`������Ϊ`book`���ʼ��һЩ���ݣ�sql���¡�

**schema.sql**
``` sql
-- ����ͼ���
CREATE TABLE `book` (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ͼ��ID',
  `name` varchar(100) NOT NULL COMMENT 'ͼ������',
  `number` int(11) NOT NULL COMMENT '�ݲ�����',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='ͼ���'

-- ��ʼ��ͼ������
INSERT INTO `book` (`book_id`, `name`, `number`)
VALUES
	(1000, 'Java�������', 10),
	(1001, '���ݽṹ', 10),
	(1002, '���ģʽ', 10),
	(1003, '����ԭ��', 10)

-- ����ԤԼͼ���
CREATE TABLE `appointment` (
  `book_id` bigint(20) NOT NULL COMMENT 'ͼ��ID',
  `student_id` bigint(20) NOT NULL COMMENT 'ѧ��',
  `appoint_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'ԤԼʱ��' ,
  PRIMARY KEY (`book_id`, `student_id`),
  INDEX `idx_appoint_time` (`appoint_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='ԤԼͼ���'
```

------------

��`entity`�������������Ӧ��ʵ�壬ͼ��ʵ��`Book.java`��ԤԼͼ��ʵ��`Appointment.java`��

**Book.java**
```java
package com.soecode.lyf.entity;

public class Book {

	private long bookId;// ͼ��ID

	private String name;// ͼ������

	private int number;// �ݲ�����

	// ʡ�Թ��췽����getter��setter������toString����

}
```

**Appointment.java**
``` java
package com.soecode.lyf.entity;

import java.util.Date;

/**
 * ԤԼͼ��ʵ��
 */
public class Appointment {

	private long bookId;// ͼ��ID

	private long studentId;// ѧ��

	private Date appointTime;// ԤԼʱ��

	// ���һ�ĸ�������
	private Book book;// ͼ��ʵ��
	
	// ʡ�Թ��췽����getter��setter������toString����

}
```

------------

��`dao`���½��ӿ�`BookDao.java`��`Appointment.java`

**BookDao.java**
``` java
package com.soecode.lyf.dao;

import java.util.List;

import com.soecode.lyf.entity.Book;

public interface BookDao {

	/**
	 * ͨ��ID��ѯ����ͼ��
	 * 
	 * @param id
	 * @return
	 */
	Book queryById(long id);

	/**
	 * ��ѯ����ͼ��
	 * 
	 * @param offset ��ѯ��ʼλ��
	 * @param limit ��ѯ����
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * ���ٹݲ�����
	 * 
	 * @param bookId
	 * @return ���Ӱ����������>1����ʾ���µļ�¼����
	 */
	int reduceNumber(long bookId);
}

```

**AppointmentDao.java**
```java
package com.soecode.lyf.dao;

import org.apache.ibatis.annotations.Param;

import com.soecode.lyf.entity.Appointment;

public interface AppointmentDao {

	/**
	 * ����ԤԼͼ���¼
	 * 
	 * @param bookId
	 * @param studentId
	 * @return ���������
	 */
	int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);

	/**
	 * ͨ��������ѯԤԼͼ���¼������Я��ͼ��ʵ��
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);

}
```
**��ʾ**������ΪʲôҪ�������Ĳ������`@Param`ע���أ�����Ϊ�÷��������������ϵĲ�����һ��Ҫ�ӣ���Ȼmybatisʶ���ˡ������`BookDao`�ӿڵ�`queryById`������`reduceNumber`����ֻ��һ������`book_id`�����Կ��Բ��ü� `@Param`ע�⣬��Ȼ����Ҳ����ν~

---------------

ע�⣬���ﲻ��Ҫʵ��dao�ӿڲ��ñ�дdaoImpl�� mybatis������Ƕ�̬ʵ�֣�����������Ҫ��д��Ӧ��mapper��
��`mapper`Ŀ¼���½������ļ�`BookDao.xml`��`AppointmentDao.xml`���ֱ��Ӧ��������dao�ӿڣ��������¡�

**BookDao.xml**
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
    PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.soecode.lyf.dao.BookDao">
	<!-- Ŀ�ģ�Ϊdao�ӿڷ����ṩsql������� -->
	<select id="queryById" resultType="Book" parameterType="long">
		<!-- �����sql -->
		SELECT
			book_id,
			name,
			number
		FROM
			book
		WHERE
			book_id = #{bookId}
	</select>
	
	<select id="queryAll" resultType="Book">
		SELECT
			book_id,
			name,
			number
		FROM
			book
		ORDER BY
			book_id
		LIMIT #{offset}, #{limit}
	</select>
	
	<update id="reduceNumber">
		UPDATE book
		SET number = number - 1
		WHERE
			book_id = #{bookId}
		AND number > 0
	</update>
</mapper>
```

**AppointmentDao.xml**
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
    PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.soecode.lyf.dao.AppointmentDao">
	<insert id="insertAppointment">
		<!-- ignore ������ͻ������ -->
		INSERT ignore INTO appointment (book_id, student_id)
		VALUES (#{bookId}, #{studentId})
	</insert>
	
	<select id="queryByKeyWithBook" resultType="Appointment">
		<!-- ��θ���MyBatis�ѽ��ӳ�䵽Appointmentͬʱӳ��book���� -->
		<!-- �������ɿ���SQL -->
		SELECT
			a.book_id,
			a.student_id,
			a.appoint_time,
			b.book_id "book.book_id",
			b.`name` "book.name",
			b.number "book.number"
		FROM
			appointment a
		INNER JOIN book b ON a.book_id = b.book_id
		WHERE
			a.book_id = #{bookId}
		AND a.student_id = #{studentId}
	</select>
</mapper>
```

**mapper�ܽ�**��`namespace`�Ǹ�xml��Ӧ�Ľӿ�ȫ����`select`��`update`�е�`id`��Ӧ��������`resultType`�Ƿ���ֵ���ͣ�`parameterType`�ǲ������ͣ������ʵ��ѡ�������`#{...}`����д���Ƿ����Ĳ������������ǲ��Ǻܼ򵥣�����Ҳ��ô����~ ����һ��С����Ҫ������ң������ڷ���`Appointment`���������һ��������Ϊ`book`��Book������ô����ʹ��`"book.������"`�ķ�ʽ��ȡֵ��������`queryByKeyWithBook`������sql��

------------

`dao`��д���ˣ�������`test`��Ӧ��`package`д���ǲ��Է����ɡ�
��Ϊ����֮���д�ܶ���Է������ڲ���ǰ��Ҫ�ó������spring-dao��mybatis�������ļ�������������ͳ������һ��`BaseTest`�ֻ࣬Ҫ�ǲ��Է����ͼ̳�����������Щ�������ظ��Ĵ���Ͳ���д��ô����~

**BaseTest.java**
``` java
package com.soecode.lyf;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ����spring��junit���ϣ�junit����ʱ����springIOC���� spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// ����junit spring�����ļ�
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class BaseTest {

}

```
��Ϊ`spring-service`��`service`��Ĳ����л�ʱ�򵽣�����Ҳһ���������ˣ�

�½�`BookDaoTest.java`��`AppointmentDaoTest.java`����dao�����ļ���

**BookDaoTest.java**
``` java
package com.soecode.lyf.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Book;

public class BookDaoTest extends BaseTest {

	@Autowired
	private BookDao bookDao;

	@Test
	public void testQueryById() throws Exception {
		long bookId = 1000;
		Book book = bookDao.queryById(bookId);
		System.out.println(book);
	}

	@Test
	public void testQueryAll() throws Exception {
		List<Book> books = bookDao.queryAll(0, 4);
		for (Book book : books) {
			System.out.println(book);
		}
	}

	@Test
	public void testReduceNumber() throws Exception {
		long bookId = 1000;
		int update = bookDao.reduceNumber(bookId);
		System.out.println("update=" + update);
	}

}
```
#### BookDaoTest���Խ��

***testQueryById***
![testQueryById](http://img.bbs.csdn.net/upload/201606/18/1466255160_717902.png)

***testQueryAll***
![testQueryAll](http://img.bbs.csdn.net/upload/201606/18/1466255452_743822.png)

***testReduceNumber***
![testReduceNumber](http://img.bbs.csdn.net/upload/201606/18/1466255505_256048.png)


**AppointmentDaoTest.java**
``` java
package com.soecode.lyf.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Appointment;

public class AppointmentDaoTest extends BaseTest {

	@Autowired
	private AppointmentDao appointmentDao;

	@Test
	public void testInsertAppointment() throws Exception {
		long bookId = 1000;
		long studentId = 12345678910L;
		int insert = appointmentDao.insertAppointment(bookId, studentId);
		System.out.println("insert=" + insert);
	}

	@Test
	public void testQueryByKeyWithBook() throws Exception {
		long bookId = 1000;
		long studentId = 12345678910L;
		Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
		System.out.println(appointment);
		System.out.println(appointment.getBook());
	}

}
```
####AppointmentDaoTest���Խ��

***testInsertAppointment***
![testInsertAppointment](http://img.bbs.csdn.net/upload/201606/18/1466255520_227298.png)

***testQueryByKeyWithBook***
![testQueryByKeyWithBook](http://img.bbs.csdn.net/upload/201606/18/1466255537_831651.png)

-------------

�ţ�������һ�е���˳��~��ô���Ǽ���service��ı����~�������濪ʼ��Ϣ��Ƚϴ󣬴��Ҫ��������׼��~

���ȣ���д���ǵ�ҵ��֮ǰ�������ȶ��弸��ԤԼͼ�����������������ֵ䣬Ҳ��������Ҫ���ظ��ͻ��˵���Ϣ����������ʹ��ö���࣬û������С���Ҫ�úö�һ���ˣ���Ҳ�������ѧ����= =��

**ԤԼҵ�����������˵��**

| ������ | ˵�� |
| --- | --- |
| 1 | ԤԼ�ɹ� |
| 0 | ��治�� |
| -1 | �ظ�ԤԼ |
| -2 | ϵͳ�쳣 |

�½�һ������`enums`���������½�һ��ö����`AppointStateEnum.java`����������ԤԼҵ��������ֵ䣬û����û��ϵ������ֱ�ӿ������~�ǲ��Ǹо���ģ�����ˣ�

**AppointStateEnum.java**
```java
package com.soecode.lyf.enums;

/**
 * ʹ��ö�ٱ������������ֵ�
 */
public enum AppointStateEnum {

	SUCCESS(1, "ԤԼ�ɹ�"), NO_NUMBER(0, "��治��"), REPEAT_APPOINT(-1, "�ظ�ԤԼ"), INNER_ERROR(-2, "ϵͳ�쳣");

	private int state;

	private String stateInfo;

	private AppointStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static AppointStateEnum stateOf(int index) {
		for (AppointStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
```
-------------

����������`dto`�����½�`AppointExecution.java`�����洢����ִ��ԤԼ�����ķ��ؽ����

**AppointExecution.java**
```java
package com.soecode.lyf.dto;

import com.soecode.lyf.entity.Appointment;
import com.soecode.lyf.enums.AppointStateEnum;

/**
 * ��װԤԼִ�к���
 */
public class AppointExecution {

	// ͼ��ID
	private long bookId;

	// ��ɱԤԼ���״̬
	private int state;

	// ״̬��ʶ
	private String stateInfo;

	// ԤԼ�ɹ�����
	private Appointment appointment;

	public AppointExecution() {
	}

	// ԤԼʧ�ܵĹ�����
	public AppointExecution(long bookId, AppointStateEnum stateEnum) {
		this.bookId = bookId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	// ԤԼ�ɹ��Ĺ�����
	public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
		this.bookId = bookId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.appointment = appointment;
	}
	
	// ʡ��getter��setter������toString����

}

```

-------------

���ţ���`exception`�����½������ļ�
`NoNumberException.java`
`RepeatAppointException.java`
`AppointException.java`
ԤԼҵ���쳣�ࣨ����Ҫ�̳�RuntimeException�����ֱ����޿���쳣���ظ�ԤԼ�쳣��ԤԼδ֪�����쳣������ҵ���ǳɹ�����µķ��أ����ɹ����ؽ����ʧ���׳��쳣����

**NoNumberException.java**
``` java
package com.soecode.lyf.exception;

/**
 * ��治���쳣
 */
public class NoNumberException extends RuntimeException {

	public NoNumberException(String message) {
		super(message);
	}

	public NoNumberException(String message, Throwable cause) {
		super(message, cause);
	}

}

```

**RepeatAppointException.java**
``` java
package com.soecode.lyf.exception;

/**
 * �ظ�ԤԼ�쳣
 */
public class RepeatAppointException extends RuntimeException {

	public RepeatAppointException(String message) {
		super(message);
	}

	public RepeatAppointException(String message, Throwable cause) {
		super(message, cause);
	}

}

```

**AppointException.java**
``` java
package com.soecode.lyf.exception;

/**
 * ԤԼҵ���쳣
 */
public class AppointException extends RuntimeException {

	public AppointException(String message) {
		super(message);
	}

	public AppointException(String message, Throwable cause) {
		super(message, cause);
	}

}

```

-------------

�������ڿ��Ա�дҵ������ˣ���`service`�����½�`BookService.java`ͼ��ҵ��ӿڡ�

**BookService.java**
``` java
package com.soecode.lyf.service;

import java.util.List;

import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.entity.Book;

/**
 * ҵ��ӿڣ�վ��"ʹ����"�Ƕ���ƽӿ� �������棺�����������ȣ��������������ͣ�return ����/�쳣��
 */
public interface BookService {

	/**
	 * ��ѯһ��ͼ��
	 * 
	 * @param bookId
	 * @return
	 */
	Book getById(long bookId);

	/**
	 * ��ѯ����ͼ��
	 * 
	 * @return
	 */
	List<Book> getList();

	/**
	 * ԤԼͼ��
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appoint(long bookId, long studentId);

}
```

��`service.impl`�����½�`BookServiceImpl.java`ʹ��`BookService`�ӿڣ���ʵ������ķ�����

**BookServiceImpl**
``` java
package com.soecode.lyf.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soecode.lyf.dao.AppointmentDao;
import com.soecode.lyf.dao.BookDao;
import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.entity.Appointment;
import com.soecode.lyf.entity.Book;
import com.soecode.lyf.enums.AppointStateEnum;
import com.soecode.lyf.exception.AppointException;
import com.soecode.lyf.exception.NoNumberException;
import com.soecode.lyf.exception.RepeatAppointException;
import com.soecode.lyf.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// ע��Service����
	@Autowired
	private BookDao bookDao;

	@Autowired
	private AppointmentDao appointmentDao;


	@Override
	public Book getById(long bookId) {
		return bookDao.queryById(bookId);
	}

	@Override
	public List<Book> getList() {
		return bookDao.queryAll(0, 1000);
	}

	@Override
	@Transactional
	/**
	 * ʹ��ע��������񷽷����ŵ㣺 1.�����ŶӴ��һ��Լ������ȷ��ע���񷽷��ı�̷��
	 * 2.��֤���񷽷���ִ��ʱ�価���̣ܶ���Ҫ�����������������RPC/HTTP������߰��뵽���񷽷��ⲿ
	 * 3.�������еķ�������Ҫ������ֻ��һ���޸Ĳ�����ֻ����������Ҫ�������
	 */
	public AppointExecution appoint(long bookId, long studentId) {
		try {
			// �����
			int update = bookDao.reduceNumber(bookId);
			if (update <= 0) {// ��治��
				//return new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);//����д��				
				throw new NoNumberException("no number");
			} else {
				// ִ��ԤԼ����
				int insert = appointmentDao.insertAppointment(bookId, studentId);
				if (insert <= 0) {// �ظ�ԤԼ
					//return new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);//����д��
					throw new RepeatAppointException("repeat appoint");
				} else {// ԤԼ�ɹ�
					Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
					return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
				}
			}
		// Ҫ����catch Exception�쳣ǰ��catchס���׳�����Ȼ�Զ�����쳣Ҳ�ᱻת��ΪAppointException�����¿��Ʋ��޷�����ʶ�����ĸ��쳣
		} catch (NoNumberException e1) {
			throw e1;
		} catch (RepeatAppointException e2) {
			throw e2;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			// ���б������쳣ת��Ϊ�������쳣
			//return new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);//����д��
			throw new AppointException("appoint inner error:" + e.getMessage());
		}
	}

}

```

--------------

��������������һ�����ǵ�ҵ������~��Ϊ��ѯͼ���ҵ�񲻸��ӣ���������ֻ��ʾ��������Ҫ��ԤԼͼ��ҵ�񣡣�

**BookServiceImplTest.java**
``` java
package com.soecode.lyf.service.impl;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.service.BookService;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}

}

```

#### BookServiceImplTest���Խ��

***testAppoint***
![testAppoint](http://img.bbs.csdn.net/upload/201606/19/1466270053_292015.png)

�״�ִ���ǡ�ԤԼ�ɹ���������ٴ�ִ�еĻ���Ӧ�û���֡��ظ�ԤԼ�����������������еĺ�̨���붼ͨ����Ԫ������~~�ǲ��Ǻܿ���~

-------------

���ǻ���Ҫ��`dto`�����½�һ����װjson���ؽ������`Result.java`����Ƴɷ��͡�

**Result.java**
``` java
package com.soecode.lyf.dto;

/**
 * ��װjson�������з��ؽ����ʹ����
 */
public class Result<T> {

	private boolean success;// �Ƿ�ɹ���־

	private T data;// �ɹ�ʱ���ص�����

	private String error;// ������Ϣ

	public Result() {
	}

	// �ɹ�ʱ�Ĺ�����
	public Result(boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	// ����ʱ�Ĺ�����
	public Result(boolean success, String error) {
		this.success = success;
		this.error = error;
	}

	// ʡ��getter��setter����
}

```

------------

�������дweb�㣬Ҳ����controller��������`web`�����½�`BookController.java`�ļ���

**BookController.java**
``` java
package com.soecode.lyf.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.dto.Result;
import com.soecode.lyf.entity.Book;
import com.soecode.lyf.enums.AppointStateEnum;
import com.soecode.lyf.exception.NoNumberException;
import com.soecode.lyf.exception.RepeatAppointException;
import com.soecode.lyf.service.BookService;

@Controller
@RequestMapping("/book") // url:/ģ��/��Դ/{id}/ϸ�� /seckill/list
public class BookController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private String list(Model model) {
		List<Book> list = bookService.getList();
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndView
		return "list";// WEB-INF/jsp/"list".jsp
	}

	@RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
	private String detail(@PathVariable("bookId") Long bookId, Model model) {
		if (bookId == null) {
			return "redirect:/book/list";
		}
		Book book = bookService.getById(bookId);
		if (book == null) {
			return "forward:/book/list";
		}
		model.addAttribute("book", book);
		return "detail";
	}

	//ajax json
	@RequestMapping(value = "/{bookId}/appoint", method = RequestMethod.POST, produces = {
			"application/json; charset=utf-8" })
	@ResponseBody
	private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId, @RequestParam("studentId") Long studentId) {
		if (studentId == null || studentId.equals("")) {
			return new Result<>(false, "ѧ�Ų���Ϊ��");
		}
		//AppointExecution execution = bookService.appoint(bookId, studentId);//����д��������ͳһ���أ�Ҫ�����쳣��ʧ�ܣ����
		AppointExecution execution = null;
		try {
			execution = bookService.appoint(bookId, studentId);
		} catch (NoNumberException e1) {
			execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
		} catch (RepeatAppointException e2) {
			execution = new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
		} catch (Exception e) {
			execution = new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
		}
		return new Result<AppointExecution>(true, execution);
	}

}

```

��Ϊ�ұȽ������������ǾͲ�����controller��,������дǰ�ˣ�������~

���ˣ����ǵ�SSM����������ã���Ӧ��ʵ�������Ѿ������ˣ��Ұ�����Դ���jar��һ�����������ҵ�GitHub�ϣ���Ҫ�Ŀ���ȥ���أ�ϲ���͸���star�ɣ���ƪ����д����������Ҳ�����װ���

----------

2017-02-28���£���л����EchoXml���֣���
�޸�ԤԼҵ����룬ʧ��ʱ���쳣���ɹ�ʱ�ŷ��ؽ�������Ʋ���ݲ�����쳣������Ӧ��Ϣ���ͻ��ˣ�������ҵ���ֱ�ӷ��ش�����������Ĵ����Ѿ������޸ģ����Ҵ���ʾ��Ҳע�ͱ����ţ�֮ǰ�����ӵ��ˣ�������λ����ǰ����������ɣ���Ҳ��ʱ�����޸ġ�

2017-03-30���£���л����ergeerge1���飩��
�޸�BookController��������
1.detail�������Ƿ���json�ģ��ʲ��ü�@ResponseBodyע��
2.appoint����Ӧ�ü���@ResponseBodyע��
3.����studentId����ע��Ӧ����@RequestParam
4.����controller���ԣ�����appoint�����ɲ���дjsp����curl���У�����
curl -H "Accept: application/json; charset=utf-8" -d "studentId=1234567890" localhost:8080/book/1003/appoint

