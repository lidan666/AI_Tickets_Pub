<%@page contentType="text/html;charset=UTF-8"%>
<script language="JavaScript">
    function check() {
        //得到用户输入的信息

        var username = document.form.username.value;
        var userpass = document.form.userpass.value;
        var  sex = document.form.sex.value;
        var  name = document.form.name.value;
        var  xueid= document.form.xueid.value;
        var  xueyuan =document. form.xueyuan.value;
        var xi = document.form.xi.value;
        var  email =document. form.email.value;
        var  banji = document.form.banji.value;
        var  nian =document. form.nian.value;
        var  place = document.form.place.value;
        var  comment = document.form.comment.value;

        //判断用户名长度
        if (!minLength(username, 6)) {
            alert("用户名长度小于6位！");
            form.username.focus();
            return false;
        }
        if (!maxLength(username, 12)) {
            alert("用户名长度大于12位！");
            form.username.focus();
            return false;
        }
        if(!isDigital(username)){
            alert("用户名只有字母可以开头");
            form.username.focus();
            return false;
        }

        //判断口令长度
        if (!minLength(userpass, 8)) {
            alert("密码长度小于8位！");
            form.userpass.focus();
            return false;
        }
        if (!minLength(xueid, 4)) {
            alert("学号长度小于8位！");
            form.xueid.focus();
            return false;
        }
        if (!isNumber(xueid)) {
            alert("学号必须是数字");
            form.xueid.focus();
            return false;
        }


        //验证E-mail的格式是否正确
        if (!isEmail(email)) {
            alert("E-mail格式不正确！");
            form.email.focus();
            return false;
        }

        document.form.submit();
    }

    //验证是否满足最小长度
    function minLength(str, length) {
        if (str.length >= length)
            return true;
        else
            return false;
    }
    //判断是否满足最大长度
    function maxLength(str, length) {
        if (str.length <= length)
            return true;
        else
            return false;
    }
    //判断首字母
    function isDigital(str) {
        if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z'||(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'))
            return true;
        else
            return false;
    }

    //判断是否是整数
    function isNumber(str)
    {
        for(i=0;i<str.length;i++)
        {
            //每一位都是0～9的数字，如果是第1位，则可以是“-”号
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'
                ||str.charAt(i)=='-'&&i==0)
                continue;
            else
                return false;
        }
        return true;
    }

    //判断是否是E-mail
    function isEmail(email) {
        if (email.length == 0)
            return false;
        index1 = email.indexOf('@');
        index2 = email.indexOf('.');
        if (index1 < 1//@符号不存在，或者在第一个位置
            || index2 < 1//.符号不存在，或者在第一个位置
            || index2 - index1 < 2//.在@的左边或者相邻
            || index2 + 1 == email.length)//.符号后面没有东西
            return false
        else
            return true;
    }
</script>
<html>
<head>
    <title>添加用户信息</title>
</head>
<body>
<%
    Object message = request.getAttribute("message");
    if(message!=null && !"".equals(message)){
%>
<script type="text/javascript">
    alert("<%=request.getAttribute("message")%>");
</script>
<%} %>
<form name="form" action="Servlet" method="post" >

<%--
    align：表示左右居中，left，center，right
    valign：控制上下居中，top, middle, bottom
--%>
    <table valign = "middle" align="center">

        <tr>
            <td>登录账号：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>登陆密码：</td>
            <td><input type="password" name="userpass"></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><select name="sex">

                <option value="男" selected>男</option>
                <option value="女 " >女</option>

            </select></td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>工号：</td>
            <td>2019<input type="text"  name="xueid" maxlength="4"></td>
        </tr>
        <tr>
            <td>电子邮件：</td>
            <td><input type="text" name="email">
            </td>
        </tr>
<%--        <tr>--%>
<%--            <td>所在学院：</td>--%>
<%--            <td><input type="text" name="xueyuan"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>所在系：</td>--%>
<%--            <td><input type="text" name="xi"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>所在班级：</td>--%>
<%--            <td><input type="text" name="banji"></td>--%>
<%--        </tr>--%>
        <tr>
            <td>入职年份：</td>
            <td><select name="nian">

                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019"selected>2019</option>

            </select></td>
        </tr>
<%--        <tr>--%>
<%--            <td>生源地：</td>--%>
<%--            <td><input type="text" name="place"></td>--%>
<%--        </tr>--%>
        <tr>
            <td>备注：</td>
            <td><textarea rows="8" name="comment" cols="40"></textarea></td>
        </tr>
        <tr>
            <td><input type="button" value="提交" onclick="check()"></td>
            <td><input type="button" value="返回" onclick="back()"></td>
        </tr>
    </table>
</form>
<script type="text/javascript">
    function back() {
        window.location.href="../";
    }
</script>
</body>
</html>
