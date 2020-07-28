# Theone第一次的JAVA
MySQL数据库连接JAVA
问题1 数据库初次配置，环境变量错误；
问题2 数据库连接出问题；
解决1 从新配置数据库
解决2 通过查询发现是时区不匹配，增加?serverTimezone=CTT&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true
