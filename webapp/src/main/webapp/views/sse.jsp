<%--
  Created by IntelliJ IDEA.
  User: hzqiuxm
  Date: 2017/2/27 0027
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSE Demo</title>
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
</head>
<body>
    <div id="msgFromPush"></div>
    <script>
        if(!!window.EventSource){
            var source = new EventSource('push');
            s='';
            source.addEventListener('message',function (e) {
                s+=e.data+"<br/>";
                $("#msgFromPush").html(s);
            });

            source.addEventListener('open',function (e) {
                console.log("连接打开.");
            },false);

            source.addEventListener('error',function (e) {
                if(e.readyState == EventSource.CLOSED){
                    console.log("连接关闭");
                }else {
                    console.log(e.readyState);
                }
            },false);

        }else {
            console.log("你的浏览器不支持SSE");
        }

    </script>
</body>
</html>
