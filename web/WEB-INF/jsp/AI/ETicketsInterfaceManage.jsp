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
            行程单程序级接口管理 <small>Program-level Interface Management for Travel Itinerary</small>
        </h1>
    </div>
    <div id="page-inner">
        <div class="panel panel-default">
            <div class="panel-heading">
                <br/>
                选择接口
                <div class="btn-group">
                    <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">interface1<span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">interface1</a></li>
                        <li><a href="#">interface2</a></li>
                        <li><a href="#">interface3</a></li>
                    </ul>
                </div>

                &nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="btn btn-default">确定</a><br/>
                <br/>


                <div class="row">
                    <div class="col-md-12">
                        <!--    Context Classes  -->
                        <div class="panel panel-default">

                            <div class="panel-heading">
                                接口信息
                            </div>

                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>地址</th>
                                            <th>参数</th>
                                            <th>运行状态</th>
                                            <th>访问次数</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr class="success">
                                            <td>1ocal</td>
                                            <td>param1</td>
                                            <td>运行中</td>
                                            <td>2</td>
                                        </tr>
                                        <tr class="info">
                                            <td>local</td>
                                            <td>param2</td>
                                            <td>运行中</td>
                                            <td>3</td>
                                        </tr>
                                        <tr class="warning">
                                            <td>local</td>
                                            <td>param3</td>
                                            <td>等待中</td>
                                            <td>1</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!--  end  Context Classes  -->
                    </div>
                </div>


            </div>
        </div>


        <!-- /. PAGE INNER  -->
    </div>
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
