# freshman-digital-human

# 开发规范
## 环境配置
1. backend: 复制`application-dev.example.yaml`重命名`application-dev.yaml`，填写本地数据库信息，application-dev.yaml禁止提交git
2. frontend: cd admin-vue3 → npm install → npm run dev

## Git规范
- main：稳定版本，禁止直接推送
- dev：开发分支；新功能新建 feature/xxx 分支
- commit示例：feat:xxx / fix:xxx

## 后端
- 环境参数从yaml读取，禁止硬编码地址密码
- 包结构保持不变；接口遵循REST风格
- SQL脚本统一放docs/sql

## 前端
- 接口地址使用环境变量，禁止硬编码后端地址
- 代码提交前自检，保证项目可正常启动

## 红线
禁止提交本地私有配置、密钥；禁止直接提交代码到main分支；修改数据库表结构需要同步组员。
