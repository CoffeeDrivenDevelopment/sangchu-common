# CDD Common

![GitHub last commit (branch)](https://img.shields.io/github/last-commit/CoffeeDrivenDevelopment/sangchu-common/main)
![GitHub License](https://img.shields.io/badge/license-MIT-blue)
[![](https://jitpack.io/v/CoffeeDrivenDevelopment/sangchu-common.svg)](https://jitpack.io/#CoffeeDrivenDevelopment/sangchu-common)

해당 라이브러리는 `Sangchu` 프로젝트에서 사용하는 기본적인 기능들을 제공합니다.

## Quick Starter

### 1. Add Dependency

---

**build.gradle**

```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.CoffeeDrivenDevelopment:sangchu-common:0.0.2'
}
```

**build.gradle.kts**

```kts
repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.CoffeeDrivenDevelopment:sangchu-common:Tag")
}
```

### 2. RestControllerAdvice

---

공통으로 사용하는 에러 처리용 `RestControllerAdvice`입니다.

**SangchuConfig.java**

```java

@Configuration
public class SangchuConfig {
    @Bean
    public SangchuAdvice sangchuAdvice() {
        return new SangchuAdvice();
    }
}
```

**SangchuConfig.kt**

```kotlin
@Configuration
class SangchuConfig {
    @Bean
    fun sangchuAdvice(): SangchuAdvice {
        return SangchuAdvice()
    }
}
```

### 3. ResponseEntityFactory

---

반복되는 `ResponseEntity<MessageBody<Void>>` 와 같은 클래스를 생성해주는 유틸입니다.

예시는 아래와 같습니다.

**ResponseEntityFactory.java**

```java

@GetMapping("/v1")
public ResponseEntity<MessageBody<String>> get() {
    ResponseEntity<MessageBody<Passport>> response = ResponseEntityFactory.ok("Hello", "world!");
    return response;
}
```

**ResponseEntityFactory.kt**

```kotlin
@GetMapping("/v1")
fun get(): ResponseEntity<MessageBody<String>> {
    val response: ResponseEntity<MessageBody<Passport>> = ResponseEntityFactory.ok(
        message = "Hello",
        body = "world!"
    )
    return response
}
```

이 외에도 헤더를 추가하여 전송할 수 있는 `ResponseEntityFactoryWithHeaders`와 예외 처리를 담당하는 `ResponseEntityExceptionFactory`가 있습니다.

## Dependencies

해당 프로젝트에서 사용하는 라이브러리의 모음입니다.

- [Jackson Databind 2.15.3](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.15.3)

> `2.15.3`을 사용하는 이유는 현재(2024.03.13) Spring Boot에서 사용하는 버전이 2.15.3이기 때문입니다.

- [Lombok 1.18.30](https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.30)
- [Spring WebMvc 6.1.5](https://mvnrepository.com/artifact/org.springframework/spring-webmvc/6.1.5)
- [Spring Web 6.1.5](https://mvnrepository.com/artifact/org.springframework/spring-web/6.1.5)
- [Slf4j Api 2.0.7](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.7)

