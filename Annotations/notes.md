# Springboot and other Annotations

    @SpringBootApplication
    @EnableConfigurationProperties
    @EnableMBeanExport
    @ImportRespurce({"classpath:${tbs.secure.client.config.file}"})

    @Configuration
    @Bean // defining a bean
    @Profile("<profileName>")
    @Value
    @Qualifier
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
## @Qualifier
            There may be a situation when you create more than one bean of the same type and want to wire only one of them with a property. In such cases, you can use the @Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired. Following is an example to show the use of @Qualifier annotation

@Autowired
@GetMapping("/path")


## Difference between @Component, @Service, @Controller, and @Repository in Spring
Read more: https://javarevisited.blogspot.com/2017/11/difference-between-component-service.html#ixzz6ITud0awb
@Service

## Differences between @SpringBootApplication vs @EnableConfigurationProperties
https://www.java67.com/2018/05/difference-between-springbootapplication-vs-EnableAutoConfiguration-annotations-Spring-Boot.html

#        @SpringBootApplication is equivalent to 
         @Configuration
         @EnableConfigurationProperties
         @ComponentScan
 # @SpringBootApplication(scanBasePackages={"com.websystique.springboot"})
         
 # @ComponentScan will scan all components and child packages in it,we can exclude packages with
         
        @ComponentScan(excludeFilters = 
          @ComponentScan.Filter(type=FilterType.REGEX,
            pattern="com\\.baeldung\\.componentscan\\.springapp\\.flowers\\..*"))
###             or
            @ComponentScan(excludeFilters = 
              @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Rose.class))
              
### @Import and @ImportResource example
https://www.boraji.com/spring-4-import-and-importresource-example
