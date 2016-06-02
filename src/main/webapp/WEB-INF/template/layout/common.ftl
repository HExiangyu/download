<#macro page title keywords description>
<html>
    <head>
        <title>${title}</title>
        <meta name="keywords" content="${keywords}"/>
        <meta name="description" content="${description}" />
        <#include "import.ftl">
    </head>
    <body>
        <#include "header.ftl">
        <#-- This processes the enclosed content:  -->
        <div>
            <#nested>
        </div>
        <#include "footer.ftl">
    </body>
</html>
</#macro>