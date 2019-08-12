<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/14 0014
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>房产信息查询</title>
    <link rel="stylesheet" href="/static/layui/css/layui.css">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
    <script type="text/javascript" src="/static/layui/layui.js"></script>
    <!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
    <script type="text/javascript" src="/static/js/jquery/jquery.min.js"></script>
    <%--这是jquery的扩展js   它是依赖于jquery的--%>
    <script type="text/javascript" src="/static/js/jquery/jquery.jdirk.js"></script>
    <script type="text/javascript" src="/static/js/jquery/jquery.form.min.js"></script>
    <script type="text/javascript" src="/static/js/model/realEstate.js"></script>
</head>
<body>

<script type="text/html" id="toolbarDemo">
    <div>
        <span style="color: red">房产信息查询</span>
    </div>
    <hr>
    <div class=".layui-from" align="center">
        <form id="realEstateForm">
            查询类型：
            <div class="layui-inline">
                <select  id="user" name="user" lay-verify=" ">
                    <option value="0" >--请选择--</option>
                    <option value="1" >产权人</option>
                    <option value="2" >身份证号</option>
                </select>
            </div>
            <div class="layui-inline">
                <input class="layui-input" name="q"  autocomplete="off">
            </div>
            <%--button如果在form表单内部，它默认点击是submit提交--%>
            <button class="layui-btn" type="button" data-type="reload">搜索</button>
        </form>
    </div>
</script>


<%--展示数据--%>
<table class="layui-hide" id="realEstateDatagrid"></table>

</body>
</html>
