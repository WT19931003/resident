layui.use(['table','jquery','layer','form'], function(){
    var table = layui.table;
    var $ = layui.jquery;
    var layer = layui.layer;
    var form = layui.form;

    table.render({
         elem: '#realEstateDatagrid'
        ,url:'/re/list'
        , toolbar: '#toolbarDemo'
        ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
        ,cols: [[
            {type: 'checkbox'},
            {field:'id', title: '序号', sort: true, width:50, align: 'center'}
            ,{field:'projectname', title: '项目名称', align: 'center'}


            ,{field:'user', title: '产权人', align: 'center',templet: function(u){
                    //在js中认为false的值： 0  ""  undefined  false  null  NaN
                    return u.user ? u.user.name:" ";
                }}
            ,{field:'cardId', title: '身份证号', align: 'center',templet: function(u){
                    //在js中认为false的值： 0  ""  undefined  false  null  NaN
                    return u.user ? u.user.cardId:" ";
                }}
            ,{field:'housetype', title: '房屋类型', align: 'center'}
            ,{field:'area', title: '使用面积 m²', align: 'center'} //单元格内容水平居中
            //width 支持：数字、百分比和不填写。你还可以通过 minWidth 参数局部定义当前单元格的最小宽度，layui 2.2.1 新增
            ,{field:'onBuidTime', title: '建造时间', align: 'center', sort: true}
        ]]
        , page: true
        , id: 'realEstateList',
        done: function (res, curr, count) {
            $(".layui-btn").on("click", function () {
                var type = $(this).data("type");
                if (type) {
                    re[type]();
                }

            });
           /* $(".select").on("click", function () {
                var type = $(this).data("type");
                if (type) {
                    re[type]();
                }

            });*/
        },


    });

    var re = {
        //加载界面
        "reload":function(){
            table.reload('realEstateList', {
                where: $("#realEstateForm").serializeObject()
                ,page: {
                    curr: 1 //重新从第 1 页开始
                }
            });
        },

        "outrealEstate":function () {
            alert(1)
        },

    }
});