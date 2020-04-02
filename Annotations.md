# Springboot and other Annotations

    @SpringBootApplication
    @EnableConfigurationProperties
    @EnableMBeanExport
    @ImportRespurce({"classpath:${tbs.secure.client.config.file}"})

    @Configuration
    @Bean
    @Profile("<profileName>")
    @Value
    @Qualifier
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

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
         
 # @ComponentScan will scan all components and child packages in it,we can exclude packages with
         
        @ComponentScan(excludeFilters = 
          @ComponentScan.Filter(type=FilterType.REGEX,
            pattern="com\\.baeldung\\.componentscan\\.springapp\\.flowers\\..*"))
###             or
            @ComponentScan(excludeFilters = 
              @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Rose.class))
