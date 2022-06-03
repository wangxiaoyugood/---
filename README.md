# --- 网课后台管理系统

技术栈：SpringBoot、Spring、SpringMVC、MyBatis、MySQL、Elasticsearch

项目描述：面向业务人员的网课后台管理系统，可以对课程信息、广告信息、用户信息、权限信息等数据进行维护

课程管理模块：具有课程查询、内容展示、课程图片上传、章节修改及增删等功能

课程图片上传，在mvc配置文件里配置一个文件解析器class="org.springframework.web.multipart.commons.CommonsMultipartResolver"

广告管理模块：具有广告分页查询、位置修改、广告增删及内容修改等功能

权限管理模块：通过“用户-角色-权限”逻辑开发权限管理功能，不同用户的系统操作权限不同
