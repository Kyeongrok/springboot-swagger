# springboot-swagger

스프링부트에 swagger를 탑재한트프로젝트

https://krksap.tistory.com/2003



## 설정 해줄 내용들

build.gradle

```.gradle
dependencies {
    implementation 'io.springfox:springfox-swagger2:2.9.2'
    implementation group: 'io.springfox', name: 'springfox-swagger-ui', version: '2.9.2'
}
```


application.yml

```.yaml
spring:
  mvc:
    pathmatch:
      matching-strategy: ant_path_matcher
```


config/Swagger2Configuration.java

```java
@Configuration
@EnableSwagger2
public class Swagger2Configuration{

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kafka.kafkapubsubjava"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Practice Swagger")
                .description("practice swagger config")
                .version("1.0")
                .build();
    }

}
```
