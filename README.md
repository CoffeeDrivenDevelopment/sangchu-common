# CDD Common

![GitHub last commit (branch)](https://img.shields.io/github/last-commit/CoffeeDrivenDevelopment/sangchu-common/main)
![GitHub License](https://img.shields.io/badge/license-MIT-blue)


## Dependency

[Jitpack - Dependency]()

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.sixprincesses:Wondoo-Exception:0.0.1'
}
```

## Dependencies

- [Jackson Databind 2.15.3](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.15.3)

> `2.15.3`을 사용하는 이유는 현재(2024.03.13) Spring Boot에서 사용하는 버전이 2.15.3이기 때문입니다.