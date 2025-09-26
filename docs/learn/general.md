# General Learnings

## Overview

## Configurable Application Context

To use ConfigurableApplicationContext in a Java Spring Boot application, you 
need to ensure (i) the Spring Context dependency is included in your project. 
This is typically handled automatically if you are using Spring Boot's 
Starter dependencies, but you can explicitly add the spring-context dependency 
to your `pom.xml` file if needed.

Once the dependency is available, you can import the class using the following 
import statement:

```java
import org.springframework.context.ConfigurableApplicationContext;
```

You can then use `ConfigurableApplicationContext` to gain programmatic control 
over the application context's lifecycle and configuration. 
For example, you can create and run the context, retrieve beans, and close it 
programmatically:

```java
public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    MyService myService = context.getBean(MyService.class);
    myService.performAction();
    context.close(); // This triggers bean destruction, resource release, and publishes a ContextClosedEvent 
}
```

The `ConfigurableApplicationContext` interface extends `ApplicationContext` and
provides additional methods for managing the context, such as `refresh()` and 
`close()` for lifecycle control, methods to set and get the Environment, and 
the ability to register `BeanFactoryPostProcessor` and `BeanPostProcessor` 
instances for post-processing.
 
It also allows adding and removing `ApplicationListener` instances to listen 
for application events like context refresh or shutdown.
