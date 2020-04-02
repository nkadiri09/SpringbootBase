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

