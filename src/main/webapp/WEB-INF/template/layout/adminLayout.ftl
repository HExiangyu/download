<#macro adminPage title contentTitle>
<head>
    <title>${title}</title>
    <#include "import.ftl">
    <link rel="stylesheet" href="/static/dist/css/admin/index.css">
</head>
<body class="admin-area container">
    <div class="admin-nav">
        <#include "adminNav.ftl">
    </div>
    <div class="admin-content">
        <div class="content-title"><i class="fa fa-align-justify"></i>${contentTitle}</div>
        <div class="admin-content-area">
            <#nested>
        </div>
    </div>
</body>
</#macro>