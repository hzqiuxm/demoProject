<%--
  Created by IntelliJ IDEA.
  User: hzqiuxm
  Date: 2017/2/27 0027
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HttpMesssageConverter Demo</title>
    <%--<script src="http://cdn.bootcss.com/jquery/3.1.1/jquery.js" type="type/javascript"></script>--%>
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
</head>

<body>
    <div id="resp"></div>
    <input type="button" onclick="req();" value="请求"/>

    <script>
        function req() {
            $.ajax({
                url:"convert",
                data:"1-hzqiuxm",
                type:"POST",
                contentType:"application/x-wisely",
                success:function (data) {
                    console.log(data);
                    $("#resp").html(data);
                }
            });
        }

    </script>
</body>
</html>
