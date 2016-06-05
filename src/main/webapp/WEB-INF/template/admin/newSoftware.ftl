<#import "../layout/adminLayout.ftl" as u>
<@u.adminPage title="wtf" contentTitle="新增软件">
<div class="new-software">
    <form class="ui form">
        <div class="field form-field">
            <input type="text" placeholder="软件名称">
        </div>
        <div class="field form-field">
            <input type="text" placeholder="软件别名">
        </div>
        <div class="field form-field">
            <input type="text" placeholder="软件唯一ident">
        </div>
        <div class="field form-field">
            <input type="text" placeholder="官网URL">
        </div>
        <div class="field form-field">
            <input type="text" placeholder="公司名称">
        </div>
        <div class="field form-field">
            <input type="text" placeholder="备注">
        </div>
        <div class="field form-field">
            <input type="text" placeholder="key words">
        </div>
        <div class="field">
            <textarea cols="30" rows="1" placeholder="meta description"></textarea>
        </div>
        <div class="field">
            <textarea name="" id="" cols="30" rows="10" placeholder="软件描述"></textarea>
        </div>
        <div class="ui button">添加</div>
    </form>
</div>
</@u.adminPage>