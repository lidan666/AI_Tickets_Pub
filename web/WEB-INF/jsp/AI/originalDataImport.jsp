<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
        <!-- Morris Chart Styles-->
        <link href="../assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- Custom Styles-->
        <link href="../assets/css/inner-custom-styles.css" rel="stylesheet" />

        <link rel="stylesheet" href="../assets/js/Lightweight-Chart/cssCharts.css">
    <link rel="shortcut icon" href="../img/favicon.ico">
    <link href="../css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="../css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">

    <!-- jqgrid-->
    <link href="../css/ui.jqgridffe4.css?0820" rel="stylesheet">

    <link href="../css/animate.min.css" rel="stylesheet">
    <link href="../css/style.min862f.css?v=4.1.0" rel="stylesheet">

    <link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">
    </head>

<body class="gray-bg">
<div id="page-inner">
<div class="header">
    <h1 class="page-header">
        原始数据导入 <small>Original Data Import</small>
    </h1>
</div>
<div id="page-inner">


    <div class="row">

        <div class="col-md-12">

            <div class="panel panel-default">
                <div class="panel-heading">
                    文件类型
                    <div class="btn-group">
                        <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">txt<span class="caret"></span></button>
                        <ul class="dropdown-menu">
                            <li><a href="#">txt</a></li>
                            <li><a href="#">csv</a></li>
                            <li><a href="#">dmp</a></li>
                        </ul>
                    </div><br/><br/>
                    文件上传
                    <a href="#" class="btn btn-default">选择上传路径</a> &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="#" class="btn btn-default">确定</a>
                </div>

                <div class="panel-body">
                    <div class="alert alert-success">
                        <strong>Success！</strong> 文件已上传至.........
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="panel panel-default">
        <div class="panel-heading">
            解析 <a href="#" class="btn btn-default">选择上传文件</a><br/><br/>
            选择数据库
            <div class="btn-group">
                <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">名称<span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li><a href="#">database1</a></li>
                    <li><a href="#">database2</a></li>
                    <li><a href="#">database3</a></li>
                </ul>
            </div>
            选择用户
            <div class="btn-group">
                <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">用户名<span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li><a href="#">user1</a></li>
                    <li><a href="#">user2</a></li>
                    <li><a href="#">user3</a></li>
                </ul>
            </div>
            选择表
            <div class="btn-group">
                <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">表名<span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li><a href="#">table1</a></li>
                    <li><a href="#">table2</a></li>
                    <li><a href="#">table3</a></li>
                </ul>
            </div>
            &nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="btn btn-default">确定</a><br/>
            <br/>
            文件上传
        </div>

        <div class="panel-body">
            <div class="alert alert-success">
                <strong>Success！</strong> 文件已解析入库.........
            </div>
        </div>
    </div>
</div>
</div>
<!-- JS Scripts-->

<!-- Metis Menu Js -->
<script src="../assets/js/jquery.metisMenu.js"></script>
<!-- Custom Js -->
<script src="../assets/js/custom-scripts.js"></script>
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
</body>
</html>
