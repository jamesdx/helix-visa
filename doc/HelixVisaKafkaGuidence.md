#Kafka
## 如何使用 Spring Boot 构建 Kafka 项目 - Maven
### 背景知识
* MAVEN
* Spring Boot
### 构建具体步骤
* 构建 Spring Boot Maven 骨架项目
请参考 [SpringBoot 基础手册](HelixVisaSpringBoot.md)
* 添加 Kafka 配置
第一，添加 Spring Test
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```

添加 Spring Kakfa 
```xml
<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka</artifactId>
</dependency>
```
第二，添加 Spring Kafka Test,
这一步骤是可以省略的，Spring-kafka-test 为开发人员集成了一个 嵌入式 Kafka Server。
```xml
<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka-test</artifactId>
    <scope>test</scope>
</dependency>
```
* 创建 Kafka Producer



## Kafka 本地开发或者测试搭建
