<#import "../layout/adminLayout.ftl" as u>
<@u.adminPage title="wtf" contentTitle="新增软件">
<div class="new-software">
    <form class="ui form" id="create">
        <div class="field form-field">
            <input type="text" id="name" placeholder="软件名称" value="$software.name">
        </div>
        <div class="field form-field">
            <input type="text" id="common-name" placeholder="软件别名">
        </div>
        <div class="field form-field">
            <input type="text" id="ident" placeholder="软件唯一ident">
        </div>
        <div class="field form-field">
            <input type="text" id="url" placeholder="官网URL">
        </div>
        <div class="field form-field">
            <input type="text" id="company-name" placeholder="公司名称">
        </div>
        <div class="field form-field">
            <input type="text" id="remark" placeholder="备注">
        </div>
        <div class="field form-field">
            <input type="text" id="keywords" placeholder="key words">
        </div>
        <div class="field">
            <textarea cols="30" id="meta_desc" rows="1" placeholder="meta description"></textarea>
        </div>
        <div class="field">
            <textarea name="desc" id="desc" cols="30" rows="10" placeholder="软件描述"></textarea>
        </div>
        <div class="ui button" onclick="Create.submit()">添加</div>
    </form>
</div>
    <#include "../layout/simditor-import.ftl">
<script>
    var editor = new Simditor({
        textarea: $('#desc')
        //optional options
    });

    var Create = {
        submit: function(){
            $.post("/admin/doAddSoftware",{
                name: $("#name").val(),
                common_name: $("#common-name").val(),
                ident: $("#ident").val(),
                url: $("#url").val(),
                company_name: $("#company-name").val(),
                remark: $("#remark").val(),
                keywords: $("#keywords").val(),
                meta_desc: $("#meta_desc").val(),
                description: editor.getValue()
            },function(data){

            })
        }
    }
</script>
</@u.adminPage>