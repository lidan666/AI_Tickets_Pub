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
            测试过程管理 <small>Testing Process Management</small>
        </h1>
    </div>
    <div id="page-inner">
        <div class="panel panel-default">
            <div class="panel-heading">
                测试数据选择
                <div class="btn-group">
                    <button data-toggle="dropdown" class="btn btn-default dropdown-toggle">数据名称<span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">数据1</a></li>
                        <li><a href="#">数据2</a></li>
                        <li><a href="#">数据3</a></li>
                        <li><a href="#">……</a></li>
                    </ul>
                </div><br/><br/>
                <div class="form-group">
                    <form class="form-inline">
                        <label for="exampleInputName2">测试参数超参配置</label>
                        <input type="text" class="form-control" id="exampleInputName1" placeholder="参数超参配置">
                    </form>
                </div><br/>
                <div class="form-group">
                    <form class="form-inline">
                        <label for="exampleInputName2">数据测试损失配置</label>
                        <input type="text" class="form-control" id="exampleInputName2" placeholder="测试损失配置">
                    </form>
                </div><br/>
                ……<br/>
                &nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="btn btn-default pull-right">确定</a><br/>
                <br/>
                <div class="row">
                    <div class="col-md-12">
                        <!--    Context Classes  -->
                        <div class="panel panel-default">

                            <div class="panel-heading">
                                测试过程监控
                            </div>

                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>Num</th>
                                            <th>Name</th>
                                            <th>Result</th>
                                            <th>Percent</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr class="success">
                                            <td>1</td>
                                            <td>P1</td>
                                            <td>Loss</td>
                                            <td>12.31%</td>
                                        </tr>
                                        <tr class="info">
                                            <td>2</td>
                                            <td>P2</td>
                                            <td>Loss</td>
                                            <td>03.23%</td>
                                        </tr>
                                        <tr class="warning">
                                            <td>3</td>
                                            <td>P3</td>
                                            <td>Success</td>
                                            <td>00.00%</td>
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

            <div class="panel-body">
                <div class="alert alert-success">
                    <strong>Success！</strong> 数据测试完毕.........
                </div>
            </div>
        </div>

        <!-- /. ROW  -->
    </div>
</div>
<!-- JS Scripts-->

<!-- Metis Menu Js -->
<script src="../assets/js/jquery.metisMenu.js"></script>
<!-- Morris Chart Js -->
<script src="../assets/js/morris/raphael-2.1.0.min.js"></script>
<script src="../assets/js/morris/morris.js"></script>


<script src="../assets/js/easypiechart.js"></script>
<script src="../assets/js/easypiechart-data.js"></script>

<script src="../assets/js/Lightweight-Chart/jquery.chart.js"></script>

<!-- Custom Js -->
<script src="../assets/js/custom-scripts.js"></script>


<!-- Chart Js -->
<script type="text/javascript" src="../assets/js/Chart.min.js"></script>
<script type="text/javascript" src="../assets/js/chartjs.js"></script>

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










