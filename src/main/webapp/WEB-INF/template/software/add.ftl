<#import "../layout/commonLayout.ftl" as u>
<@u.page title="提交新软件" keywords="" description="">
<link rel="stylesheet" href="/static/dist/css/software/new_software.css">
    <div id="add-new-software" class="container add-new-software">
        <h3>提交新的软件</h3>
        <div class="ui input">
            <input class="input-for-url" type="text" placeholder="输入需要提交的手机官网" v-model="softwareUrl">
        </div>
        <div id="more-info" class="more-info">
            <span v-on:click="toggleIt">更多详细内容</span>
            <div class="more-info-content" v-bind:class="{'display-none': isActive}">
                <div class="ui input"><input type="text" placeholder="软件名称"></div>
                <div class="ui input"><input type="text" placeholder="GitHub 地址"></div>
            </div>
        </div>
        <div>
            <span class="ui primary button" v-on:click="submit">立即提交</span>
        </div>
    </div>
</@u.page>
<script src="/static/dist/js/software/new_software.js"></script>