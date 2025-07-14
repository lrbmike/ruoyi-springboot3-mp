# ruoyi-springboot3-mp

[English](README.md) | [中文简体](README_CN.md)

> This project is built upon the `springboot3` branch of the latest RuoYi version `3.9.0`, with additional modifications and improvements.

The architecture uses `jdk17` + `springboot3` + `mybatis-plus`

## Project  **Structure**

The original `ruoyi` project has been split into two parts:

- `ruoyi-backend`: backend API
- `ruoyi-ui`: frontend pages

This makes it easier to import into different development tools.

## Key Modifications

- Removed the original `mybatis` dependency and related configurations
- Replaced with the latest MyBatis-Plus starter for Spring Boot 3: `mybatis-plus-spring-boot3-starter` (currently version `3.5.12`)

