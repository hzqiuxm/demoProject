<%--
  Created by IntelliJ IDEA.
  User: hzqiuxm
  Date: 2017/2/27 0027
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>servlet async support</title>
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
</head>
<body>

    <script>

        deferred();

        function deferred() {
            $.get('defer',function (data) {
                console.log(data);
                deferred();
            })
        }
    </script>
</body>
</html>
