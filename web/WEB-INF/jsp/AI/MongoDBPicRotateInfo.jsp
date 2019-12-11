<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>AI查询工具</title>

    <link rel="shortcut icon" href="../img/favicon.ico">
    <link href="../css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="../css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">

    <!-- Morris -->
    <link href="../css/morris-0.4.3.min.css" rel="stylesheet">
    <link href="../css/animate.min.css" rel="stylesheet">
    <link href="../css/style.min862f.css?v=4.1.0" rel="stylesheet">

    <style type="text/css">
        table
        {
            border-collapse: collapse;
            margin: 0 auto;
            text-align: center;
            width: 100%;
        }
        table td, table th
        {
            border: 1px solid #cad9ea;
            color: #666;
            height: 40px;
            text-align: center;
        }
        table thead th
        {
            background-color: #CCE8EB;
            width: 100px;
        }
        table tr:nth-child(odd)
        {
            background: #F5FAFA;
        }
        table tr:nth-child(even)
        {
            background: #fff;
        }
        textarea{
            height:295px;
        }
        dl{
            width: 150px;
            height: auto ;
            /*元素水平居中*/
            margin: 1.5px 0px 0px 2px;
            border: 1px solid #666;
            /*设置边框圆角*/
            border-radius: 5px;
            background: #fafafa;
            padding: 10px 5px;
        }
        dt{
            /*下边框*/
            border-bottom: 1px solid black;
            /*距离底部内边距*/
            padding-bottom: 2px;
        }
        /*标示字体加粗*/
        dt label{
            font-weight: 900;
        }
        .btn_xf{
            width: 88px;
            height: 30px;
            border: 1px solid gray;
            line-height:28px;
            text-align: center;
            border-radius: 5px;
            background: yellowgreen;
            margin: 60px 20px 20px 20px;
        }
        .btn_back{
            width: 66px;
            height: 30px;
            line-height: 28px;
            text-align: center;
            border-radius: 5px;
            border: 1px solid gray;
            font-weight: bold;
            background-image: linear-gradient(#f5c153, #ea920d);
            margin: 10px 20px 20px 20px;
        }
        img[src=''] {
            visibility: hidden;
        }
        /*#demo1{width:280px;height:124px;overflow: hidden}*/
    </style>
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-8">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>电子行程单信息查询</h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <%--                    <img id="Imgbox9" src="${pageContext.request.contextPath}/AI/MongoDBPicInfo"  height="60px" width="300px" style="margin:8px auto;">--%>

                        <select id="options" name="options">
                            <option value="Rotate45_id">rotate45°</option>
                            <option value="Rotate60_id">rotate60°</option>
                            <option value="Rotate90_id">rotate90°</option>
                        </select>

                        <input type="submit" value="查看电子客票旋转增广信息" class="pull-right"
                           onclick="btnLogs3('${pageContext.request.contextPath}/AI/MongoDBPicInfo_rotate')">
                    <img id="Imgbox"  src="" height="640px" width="700px" style="margin:8px auto;" class="pull-center" >
                    <hr/>
                    <div>
                        <div style="font-weight: bold;font-size: larger">属性列表:</div>
                        </br>
                        <div id="nameOfPic">图片原名: </div>
                        <div id="PsgName">旅客姓名: </div>
                        <div id="PsgID">身份证号: </div>
                        <div id="ETicketNo">机票号码: </div>
                        <div id="loacl1">姓名坐标: </div>
                        <div id="loacl2">证号坐标: </div>
                        <div id="loacl3">票号坐标: </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="col-sm-8">
                <button class="btn_xf pull-left" onclick="btnLogs1('${pageContext.request.contextPath}/AI/rotatescreenshot')">查看截图</button>
            </div>
            <div class="col-sm-4">
                <button class="btn_back pull-left" onclick="back()">返回</button>
            </div>
            </br></br></br></br></br></br>
            <div class="col-sm-10 pull-left"><img id="Imgbox1" src=""  height="118px" width="240px" style="margin:8px auto;" ></div>
            </br>
            <div class="col-sm-10 pull-left"><img id="Imgbox2" src=""  height="118px" width="240px" style="margin:8px auto;" ></div>
            </br>
            <div class="col-sm-10 pull-left"><img id="Imgbox3" src=""  height="118px" width="240px" style="margin:8px auto;" ></div>
        </div>
    </div>
</div>
<script src="../js/jquery.min.js?v=2.1.4"></script>
<script src="../js/bootstrap.min.js?v=3.3.6"></script>
<script src="../js/content.min.js?v=1.0.0"></script>
<script src="../js/jquery.easypiechart.js"></script>
<script src="../js/echarts.js"></script>
<script src="../js/jquery.json-2.4.min.js"></script>

<script>
<%--    图片比例--%>
    // function knowImgSize(id) {
    //     var idWidth = $(id).width(),  // 容器的宽度和高度
    //         idHeight = $(id).height();
    //     console.log(idWidth)
    //     console.log(idHeight)
    //     $(id +'img').each(function(index,img){
    //         var img_w = $(this).width(),
    //             img_h = $(this).height();
    //         console.log(img_w)
    //         console.log(img_h)
    //         // 如果图片自身宽度大于容器的宽度的话 那么高度等比例缩放
    //         if(img_w > idWidth||img_h>idHeight) {
    //             var height = img_h * idWidth / img_w;
    //             var width = img_w * idHeight / img_h;
    //             $(this).css({"width":width, "height":height});
    //         }
    //     });
    // }
    // // 初始化
    // $(function(){
    //     knowImgSize("#demo1");
    // });

    <%--'?'后面加多个参数，参数之间用'&_='或者其他表示变量的字符串连接--%>
    <%--src不直接给img，给button做参数，然后在button的方法里面将实际的src赋值给方法的参数，这样图片的加载就放到了button的响应下--%>
    function btnLogs2(pic_path) {
        document.getElementById('Imgbox3').src = pic_path + '?' + Date.now();
    }

    function btnLogs1(rotatepic_path) {
        var p = new Array();
        p[0]=document.getElementById("Imgbox1");
        p[1]=document.getElementById("Imgbox2");
        p[2]=document.getElementById("Imgbox3");
        p[0].src = rotatepic_path +'_01'+ '?' + Date.now();
        p[1].src = rotatepic_path +'_02'+ '?' + Date.now();
        p[2].src = rotatepic_path +'_03'+ '?' + Date.now();
    }

    function btnLogs3(path){
        var myselect=document.getElementById("options");
        var index=myselect.selectedIndex;
        var value = myselect.options[index].value;
        var text = myselect.options[index].text;

        var ib = document.getElementById("Imgbox");
        //将value拼接在响应的后台路径下，后台该响应下便能拿到value值
        ib.src = path  + '?value='+value ;

        // $.ajax({
        //     async : false,
        //     type : 'POST',
        //     url : '../AI/rotateImg_Information',
        //     dataType : "json",
        //     data : {
        //         //此处data为前台传到后台的参数
        //         value:value,
        //         text:text
        //     },
        //     success : function(data) {
        //         // 此处data为后台返回的结果值，需要在后台转为json格式传进来
        //         console.log(data.json[0])
        //
        //
        //     },
        //     error : function() {
        //         console.log("加载失败！")
        //     }
        // });

        var smemulist1="";
        var smemulist2="";
        var smemulist3="";
        var smemulist4="";
        var smemulist5="";
        var smemulist6="";
        var smemulist7="";

        $.ajax({
            async : false,
            type : 'POST',
            url : '../AI/rotateImg_Information',
            dataType : "json",
            data : {
                value:value,
                text:text
            },
            success : function(data) {

                console.log(data.json);
                nameOfPic(data.json[0]);
                PsgName(data.json[1]);
                PsgID(data.json[2]);
                ETicketNo(data.json[3]);
                loacl1(data.json[4]);
                loacl2(data.json[5]);
                loacl3(data.json[6]);
                $("#nameOfPic").html(smemulist1);
                $("#PsgName").html(smemulist2);
                $("#PsgID").html(smemulist3);
                $("#ETicketNo").html(smemulist4);
                $("#loacl1").html(smemulist5);
                $("#loacl2").html(smemulist6);
                $("#loacl3").html(smemulist7);
            },
            error : function() {
                console.log('error');
                alert('查询异常');
            }
        });

        function nameOfPic(menu){
            smemulist1 = '<div>图片原名: '+menu+' </div>';
        };
        function PsgName(menu){
            smemulist2 = '<div>旅客姓名: '+menu+' </div>';
        };
        function PsgID(menu){
            smemulist3 = '<div>身份证号: '+menu+' </div>';
        };
        function ETicketNo(menu){
            smemulist4 = '<div>机票号码: '+menu+' </div>';
        };
        function loacl1(menu){
            smemulist5 = '<div>姓名坐标: '+menu+' </div>';
        };
        function loacl2(menu){
            smemulist6 = '<div>证号坐标: '+menu+' </div>';
        };
        function loacl3(menu){
            smemulist7 = '<div>票号坐标: '+menu+' </div>';
        };

    }

</script>
<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
<script type="text/javascript">
    function back(){
        window.location.href="../AI/mongoDBRotateCollection";
    }
</script>
</body>

</html>

