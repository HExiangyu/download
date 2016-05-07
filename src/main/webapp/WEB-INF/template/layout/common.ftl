<#macro page title>
<html>
    <head>
        <#include "import.ftl">
    </head>
    <body>
        <#include "header.ftl">
        <#-- This processes the enclosed content:  -->
        <div class="container">
            <#nested>
        </div>
        <#include "footer.ftl">
    </body>
</html>
</#macro>