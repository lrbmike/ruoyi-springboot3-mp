# ruoyi-springboot3-mp

[English](README.md) | [中文简体](README_CN.md)

> 使用 `ruoyi` 最新版本 `3.9.0` 的 `springboot3` 分支上进行调整

若依后台管理系统升级版，架构使用 `jdk17` + `springboot3` + `mybatis-plus`

## 项目拆分
将原来的 `ruoyi` 项目拆分为了 `ruoyi-backend` 后端接口和 `ruoyi-ui` 前端页面，方便导入到不同的开发工具中

## 主要修改
屏蔽原本项目中 `mybatis` 的依赖包，还有相关的配置，并重新引入 `mybatis-plus-spring-boot3-starter` 依赖包(当前最新为 `3.5.12`)

---
具体修改说明，可以查看我的 [博客文章](https://su.liurb.org/sjabw4)

