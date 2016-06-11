<#import "../layout/adminLayout.ftl" as u>
<@u.adminPage title="wtf" contentTitle="软件列表">
<div class="software-list">
    <div class="index">
        <div class="ui clearing">
            <div class="ui input">
                <input class="search" type="text" placeholder="搜索...">
            </div>
            <a href="/admin/newSoftware"><div class="ui right floated button teal">新增软件</div></a>
        </div>
        <hr/>
        <table class="ui celled striped table">
            <thead>
                <th>ID</th>
                <th>软件名</th>
                <th>软件厂商</th>
                <th>编辑</th>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Google Chrome</td>
                    <td>Google</td>
                    <td>
                        <#--<a href="">审核</a>&nbsp;&nbsp;-->
                        <a href="/admin/software_edit/google">编辑</a>&nbsp;&nbsp;
                        <a href="">删除</a>&nbsp;&nbsp;
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</div>

</@u.adminPage>
