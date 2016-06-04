<#import "../layout/commonLayout.ftl" as u>
<#assign name = "${software.name}">
<@u.page title="${name}" keywords="${software.keywords!}" description="${software.meta_desc!}">
<link rel="stylesheet" href="/static/dist/css/software/index.css">
    <div class="software-main">
        <div class="soft-banner">
            <div class="soft-title">
                <span class="main-title">${name}</span>
                <#if (software.meta_desc)?? >
                    <span class="sub-title">${software.meta_desc}</span>
                </#if>
            </div>
            <div class="menu">
                <a class="home" href="http://${software.url}" target="_blank"><span><i class="fa fa-home"></i>官网</span></a>
                <a class="download" href="http://z.cn" target="_blank" download><span><i class="fa fa-download"></i>下载</span></a>
                <a class="github" href="#" target="_blank"><span><i class="fa fa-github"></i>GitHub</span></a>
            </div>
            <div class="link-info">
                <div>最新版本: V50.006.145</div>
                <div>最近更新: 1个月前</div>
            </div>
        </div>
        <div class="container soft-intro">
            <div>
                ${software.description!}
                dafl
            </div>
        </div>
    </div>
</@u.page>