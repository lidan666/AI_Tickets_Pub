<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>

    <link rel="shortcut icon" href="../img/favicon.ico">
    <link href="../css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="../css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">

    <!-- jqgrid-->
    <link href="../css/ui.jqgridffe4.css?0820" rel="stylesheet">

    <link href="../css/animate.min.css" rel="stylesheet">
    <link href="../css/style.min862f.css?v=4.1.0" rel="stylesheet">

    <%--    <link rel="shortcut icon" href="favicon.ico">--%>
    <%--    <link href="../hplus/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">--%>
    <%--    <link href="../hplus/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">--%>

    <%--    <!-- jqgrid-->--%>
    <%--    <link href="../hplus/css/plugins/jqgrid/ui.jqgridffe4.css?0820" rel="stylesheet">--%>

    <%--    <link href="../hplus/css/animate.min.css" rel="stylesheet">--%>
    <%--    <link href="../hplus/css/style.min862f.css?v=4.1.0" rel="stylesheet">--%>

    <link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">

</head>
<body class="gray-bg">
<div class="wrapper wrapper-content">

    <div class="row">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>电子行程单属性集合</h5>
            </div>
            <div class="ibox-content">
                <div class="row" id="toolbar">

                    <form class="form-inline" id="search">
                        <div class="col-md-10">
                            <%--                            <div class="input-group col-md-3">--%>
                            <%--                                <span class="input-group-addon">_id</span>--%>
                            <%--                                <input type="text" name="_id" id="_id" class="form-control"/>--%>
                            <%--                            </div>--%>
                            <div class="input-group col-md-3">
                                <span class="input-group-addon">图片原名</span>
                                <input type="text" name="filename" id="filename" class="form-control"/>
                            </div>
                            <div class="input-group col-md-3">
                                <span class="input-group-addon">图片别名</span>
                                <input type="text" name="ETicket_Alias" id="ETicket_Alias" class="form-control"/>
                            </div>
                            <div class="input-group col-md-3">
                                <span class="input-group-addon">旅客姓名</span>
                                <input type="text" name="nameOfPassenger" id="nameOfPassenger" class="form-control"/>
                            </div>
                            <%--                            <div class="input-group col-md-3">--%>
                            <%--                                <span class="input-group-addon">旅客证号</span>--%>
                            <%--                                <input type="text" name="idNo" id="idNo" class="form-control"/>--%>
                            <%--                            </div>--%>
                            <%--                            <div class="input-group col-md-3">--%>
                            <%--                                <span class="input-group-addon">机票号码</span>--%>
                            <%--                                <input type="text" name="eTicketNo" id="eTicketNo" class="form-control"/>--%>
                            <%--                            </div>--%>
                        </div>
                        <div class="col-md-2">
                            <div class="input-group" style="float: right;">
                                <div class="col-md-6">
                                    <span class="input-group-btn"> <button  class="btn btn-primary btn-sm btn-block queryButton" type="button">查询</button></span>
                                </div>
                                <div class="col-md-6">
                                    <span class="input-group-btn"><button id="reset" class="btn btn-primary btn-sm btn-block" type="button" onclick="resetForm()">重置</button></span>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
                <hr/>
                <div class="row">
                    <table id="table"></table>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="../js/jquery.min.js?v=2.1.4"></script>
<script src="../js/bootstrap.min.js?v=3.3.6"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="../js/grid.locale-cnffe4.js?0820"></script>
<script src="../js/jquery.jqGrid.minffe4.js?0820"></script>
<script src="../js/content.min.js"></script>
<%--    <script src="../assets2/js/jquery.json-2.3.js"></script>--%>
<script src="../js/jquery.json-2.4.min.js"></script>
<script src="../js/bootstrap-table-export.js"></script>
<script src="../js/jquery.base64.js"></script>
<script src="../js/tableExport.js"></script>

<%--<script src="../hplus/js/jquery.min.js?v=2.1.4"></script>--%>
<%--<script src="../hplus/js/bootstrap.min.js?v=3.3.6"></script>--%>
<%--<script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>--%>
<%--<script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>--%>
<%--<script src="../hplus/js/plugins/jqgrid/i18n/grid.locale-cnffe4.js?0820"></script>--%>
<%--<script src="../hplus/js/plugins/jqgrid/jquery.jqGrid.minffe4.js?0820"></script>--%>
<%--<script src="../hplus/js/content.min.js?v=1.0.0"></script>--%>
<%--<script src="../js/jquery.json-2.4.min.js"></script>--%>
<%--<script src="../plugins/tableExport.jquery.plugin/bootstrap-table-export.js"></script>--%>
<%--<script src="../plugins/tableExport.jquery.plugin/jquery.base64.js"></script>--%>
<%--<script src="../plugins/tableExport.jquery.plugin/tableExport.js"></script>--%>

<script type="text/javascript">

    function resetForm(){
        // document.getElementById("_id").value="";
        document.getElementById("filename").value="";
        document.getElementById("ETicket_Alias").value="";
        document.getElementById("nameOfPassenger").value="";
        // document.getElementById("idNo").value="";
        // document.getElementById("eTicketNo").value="";
    }
    $(document).on('click', ".queryButton",function(){
        $('#table').bootstrapTable('refresh');
    });
    //请求服务器数据

    function serializeForm(form,params) {
        var obj = {
            offset: params.offset/params.limit,
            pageSize: params.limit
        };
        $.each(form.serializeArray(), function(index) {
            if (obj[this['name']]) {
                obj[this['name']] = obj[this['name']] + ',' + this['value'];
            } else {
                obj[this['name']] = this['value'];
            }
        });
        return obj;
    };

    $("#table").bootstrapTable({ // 对应table标签的id
        url: "../AI/mongoDBOriginList", // 获取表格数据的url
        cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
        striped: true,  //表格显示条纹，默认为false
        pagination: true, // 在表格底部显示分页组件，默认false
        pageList: [10, 20], // 设置页面可以显示的数据条数
        pageSize: 10, // 页面数据条数
        pageNumber: 1, // 首页页码
        sidePagination: 'server', // 设置为服务器端分页
        queryParams: function (params) { // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求
            return serializeForm($("#search"),params);
        },
        //导出Excel表格
        // exportDataType:'all',//'basic':当前页的数据, 'all':全部的数据, 'selected':选中的数据
        // showExport: true,  //是否显示导出按钮
        // buttonsAlign:"right",  //按钮位置
        // exportTypes:['excel'],
        // sortName: 'cxrCode', // 要排序的字段
        // sortOrder: 'desc', // 排序规则
        columns: [
            {
                title : "操作",
                align : 'center',
                valign : 'middle',
                width : 150, // 定义列的宽度，单位为像素px
                formatter : function(value, row, index) {
                    return '<a href="../AI/MongoDBPicRotateInfo?id='+row._id.$oid+'">查看</a>';
                }
            },{
                field: '_id.$oid', // 返回json数据中的name
                title: '_id', // 表格表头显示文字
                align: 'center', // 左右居中
                valign: 'middle' // 上下居中
            }, {
                field: 'filename',
                title: 'filename',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'nameOfPassenger',
                title: 'nameOfPassenger',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'idNo',
                title: 'idNo',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'eTicketNo',
                title: 'eTicketNo',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'PsgName_CN_Label',
                title: 'PsgName_CN_Label',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'PsgName_EN_Label',
                title: 'PsgName_EN_Label',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'PsgID_CN_Label',
                title: 'PsgID_CN_Label',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'PsgID_EN_Label',
                title: 'PsgID_EN_Label',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'ETicketNo_CN_Label',
                title: 'ETicketNo_CN_Label',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'ETicketNo_EN_Label',
                title: 'ETicketNo_EN_Label',
                align: 'center',
                valign: 'middle'
            }, {
                field: 'ETicket_Alias',
                title: 'ETicket_Alias',
                align: 'center',
                valign: 'middle'
            }
        ],
        onLoadSuccess: function(){  //加载成功时执行
            console.info("加载成功");
        },
        onLoadError: function(){  //加载失败时执行
            console.info("加载数据失败");
        }
    })
</script>
</body>

</html>