<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>

        <!-- Bootstrap Styles-->

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
            原始数据预处理 <small>Original Data Preprocessing</small>
        </h1>

    </div>

    <div id="page-inner">
        <div class="panel panel-default">
            <div class="panel-heading">
                处理类型<br/>
                1.缺失值处理<br/>&nbsp;&nbsp;&nbsp;&nbsp;选择缺失值
                <div class="btn-group">
                    <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">默认值0<span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">默认值0</a></li>
                        <li><a href="#">默认值1</a></li>
                        <li><a href="#">均值</a></li>
                    </ul>
                </div><br/>
                &nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="btn btn-default">确定</a><br/><br/>

                2.数据截取生成<br/>&nbsp;&nbsp;&nbsp;&nbsp;选择生成列数
                <div class="btn-group">
                    <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">生成1-7列<span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">生成1-7列</a></li>
                        <li><a href="#">生成8-15列</a></li>
                        <li><a href="#">均值16-23列</a></li>
                    </ul>
                </div><br/>
                &nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="btn btn-default">确定</a><br/><br/>

                3.数据修改<br/>&nbsp;&nbsp;&nbsp;&nbsp;
                选择数据源<div class="btn-group">
                <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">数据源<span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li><a href="#">database1</a></li>
                    <li><a href="#">database2</a></li>
                    <li><a href="#">database3</a></li>
                </ul>
            </div>&nbsp;&nbsp;&nbsp;&nbsp;
                选择用户
                <div class="btn-group">
                    <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">用户名<span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">user1</a></li>
                        <li><a href="#">user2</a></li>
                        <li><a href="#">user3</a></li>
                    </ul>
                </div>&nbsp;&nbsp;&nbsp;&nbsp;
                选择表
                <div class="btn-group">
                    <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">表名<span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">table1</a></li>
                        <li><a href="#">table2</a></li>
                        <li><a href="#">table3</a></li>
                    </ul>
                </div><br/>
                &nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="btn btn-default">确定</a><br/>
                <br/>




            </div>
        </div>


        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>
<!-- /. WRAPPER  -->
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
