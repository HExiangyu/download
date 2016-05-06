<#import "layout/common.ftl" as u>
<@u.page title="首页">
hello world . ${test!"no"}
<ul id="example-1">
    <button @click="order = order * -1">Reverse Sort Order</button>
    <li v-for="item in items | orderBy 'message' order">
        {{ item.message }}
    </li>
</ul>
<script>
    var example1 = new Vue({
        el: '#example-1',
        data: {
            order: 1,
            items: [
                {message: 'Foo'},
                {message: 'Bar'}
            ]
        }
    })
</script>
</@u.page>