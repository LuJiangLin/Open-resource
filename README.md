# TestDemo1-github


�����Ѽ���д�������ĿС�����Լ�һЩ�����࣬������ʱ����30�����ù�����

���ߣ�³��ʦ

---------

> ��������ȥ���������̼֡�
> ��ţ����ʱ���ϴ�һ�οࡣ
> ˮ�ǲ������������������
> һ�������裬�Ĵ������ꡣ
> ��������ʯ�����ɴｭ䰡�
> ����ʯâ�����ᱯǧ�š�
> ......

��ܽ���

 1. SpringMVC��������web�㣬�൱��controller���ȼ��ڴ�ͳ��servlet��struts��action�������������û����󡣾ٸ����ӣ��û��ڵ�ַ������http://��վ����/login����ôspringmvc�ͻ����ص�������󣬲��ҵ���controller������Ӧ�ķ��������м���ܰ�����֤�û����������ҵ���߼����Լ���ѯ���ݿ����������Щ������springmvc��ְ�𣩣����հѽ�����ظ��û������ҷ�����Ӧ��ҳ�棨��ȻҲ����ֻ����json/xml�ȸ�ʽ���ݣ���springmvc������ǰ��ͺ�����̵Ļ���û��򽻵�����
 
 2. Spring��̫ǿ���ˣ����������޷���һ���ʻ�һ�仰������������������ƽʱ�����Ӵ����Ĺ��ƾ���IOC������������װ��bean��Ҳ��������java�е��࣬��ȻҲ����service dao����ģ�������������ƣ����ǾͲ�����ÿ��ʹ��������ʱ��Ϊ����ʼ�������ٿ����ؼ���new������spring��aop���������ȵȶ������Ǿ����õ��ġ�

 3. MyBatis�������������������������Hibernate��ʲô������ֻ��˵�����������ҵ����󡣵�һ���������ɿ���sql������������ݿ⾭����ˣ���Ȼ����˵����~����~����д�Ĵ����ܸ��������ݿ���ʵ�Ч�ʡ��ڶ���������ʹ��xml�ķ�ʽ����֯�������ǵ�sql����Ϊһ��������ܶ��������sql�������˽��ִ�����ܿ����ҵ�����ط������������Ż�ԭ��д��sql��

--------------

## SSM�����������


�������Ǵ�IED���������õ���eclipse������һ����̬web��Ŀ����������Ӧ��**Ŀ¼�ṹ**���ص㣡��

![��Ŀ�ṹͼ]


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

���½��ü�����Ҫ��**��**

![���ṹͼ]

| ���� | ���� | ���� |
| --- | --- | --- |
| dao | ���ݷ��ʲ㣨�ӿڣ� | �����ݴ򽻵������������ݿ������Ҳ�������ļ���д������������redis�����������֮�����ݲ����йصĶ��������Ҳ���˽���dal�������ݳ־ò㶼�����˼��Ϊʲôû��daoImpl����Ϊ�����õ���mybatis�����Կ���ֱ���������ļ���ʵ�ֽӿڵ�ÿ�������� |
| entity | ʵ���� | һ�������ݿ�ı����Ӧ����װdao��ȡ����������Ϊһ������Ҳ�������ǳ�˵��pojo��һ��ֻ��dao����service��֮�䴫�䡣 |
| dto | ���ݴ���� | ��ѧ��ܵ��˿��ܲ����������ʲô�ã���ʵ��������service����web��֮�䴫�䣬Ϊʲô��ֱ����entity��pojo������ʵ��ʵ�ʿ����з��֣��ܶ�ʱ��һ��entity�������������ǵ�ҵ�����󣬿��ܳ��ָ��û�����Ϣʮ��֮�࣬��ʱ�������dto��Ҳ�൱��vo����סһ����Ҫ�����������entity���棬��Ӧ�Һ��� |
| service | ҵ���߼����ӿڣ� | д���ǵ�ҵ���߼���Ҳ���˽�bll�������ҵ��ӿ�ʱ��Ӧ��վ�ڡ�ʹ���ߡ��ĽǶȡ����Ҫ����Ϊʲô����û��ʾ��IDE��Ƥ��Ҳ����û�취~ |
| serviceImpl | ҵ���߼���ʵ�֣� | ʵ������ҵ��ӿڣ�һ�����������д�����ûʲô��˵�ġ� |
| web | ������ | springmvc���������﷢�����õģ�һ���˽���controller���������൱��struts�е�action�� |


-----------

�������һ����������������������Ӧ��jar����ʹ�õ���maven���������ǵ�jar
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

�����Ͳ�������ǧ��

----------

2017-05-20 �����ϴ�  ���ߣ�³��ʦ


