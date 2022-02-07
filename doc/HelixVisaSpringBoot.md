#Spring Boot
## 如果构建一个Spring Boot Maven 基础项目
* 添加 Spring Boot Parameter
    ```xml
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.6.3</version>
        <relativePath/>
    </parent>
    ```
* 指定 JDK 版本
这是指定 JDK 1.8
    ```xml
    <properties>
        <java.version>1.8</java.version>
    </properties>
    ```
* 添加 Spring Boot Starter 
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
</dependencies>
```

* 添加 Spring Boot Plugin
    ```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
    ```
 
* 添加 SpringBoot 入口类
SpringBoot 入口类，一共三点：    
第一，需要使用 @SpringBootApplication 注解；   
第二， 入口类需要有一个 标准的 Java main 方法；  
第三，在 main 方法中必须，调用 ```SpringApplication.run(${SpringBootEnterClassName}.class) ``` ,例如： ``` javaSpringApplication.run(HelixVisaSpringBootApplication.class)```;    
可以参考如下：
    ```java
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    
    @SpringBootApplication
    public class HelixVisaSpringBootApplication {
        public static void main(String[] args) {
            SpringApplication.run(HelixVisaSpringBootApplication.class);
        }
    }
    ``` 
* 添加 SpringBoot 基础配置文件
在 resources 文件下，创建 `application.yml` ，它作为 SpringBoot 的配置文件。



## Spring Boot 配置文件
## Spring Boot 注解


## Resources
* Spring Boot Initializer
    ```xml
    https://start.spring.io
    ```