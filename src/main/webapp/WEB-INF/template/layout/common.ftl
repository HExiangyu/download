<#macro page title>
<html>
    <head>
        <#include "import.ftl">
    </head>
    <body class="container">
        <#include "header.ftl">
        <#-- This processes the enclosed content:  -->
        <#nested>
        <#include "footer.ftl">
    </body>
</html>
</#macro>