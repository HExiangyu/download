<#import "layout/commonLayout.ftl" as u>
<@u.page title="首页" keywords="软件下载" description="软件下载站">
<#--<#assign title="首页">-->
<#--<#include "layout/import.ftl">-->
<#--<#include "layout/header.ftl">-->
<link rel="stylesheet" href="static/css/index.css">
<link href="//cdn.bootcss.com/unslider/2.0.3/css/unslider.css" rel="stylesheet">
<link href="//cdn.bootcss.com/unslider/2.0.3/css/unslider-dots.css" rel="stylesheet">

<div class="banner">
    <ul>
        <li style="width: 25%; background-image: url('http://www.bootcss.com/p/unslider/img/sunset.jpg'); background-size: 100% 100%;">
            <div class="inner">
                <h1>The jQuery slider that just slides.</h1>
                <p>就是这个不到3kb的插件！没有奇特的特效或无用的标签。</p>

                <a class="btn" href="#download">下载</a>
            </div>
        </li>
        <li style="width: 25%; background-image: url('http://www.bootcss.com/p/unslider/img/wood.jpg'); background-size: 100% 100%;">
            <div class="inner">
                <h1>Fluid, flexible, fantastically minimal.</h1>
                <p>Use any HTML in your slides, extend with CSS. You have full control.</p>

                <a class="btn" href="#download">下载</a>
            </div>
        </li>
        <li style="width: 25%; background-image: url('http://www.bootcss.com/p/unslider/img/subway.jpg'); background-size: 100% 100%;">
            <div class="inner">
                <h1>开源</h1>
                <p>Unslider的所有源码都托管在GitHub上。</p>

                <a class="btn" href="//github.com/idiot/unslider">参与1</a>
            </div>
        </li>
    </ul>
</div>
<script src="//cdn.bootcss.com/unslider/2.0.3/js/unslider-min.js"></script>
<script src="static/js/index.js"></script>
</@u.page>