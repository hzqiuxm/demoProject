<%--
  Created by IntelliJ IDEA.
  User: hzqiuxm
  Date: 2017/2/27 0027
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
    <div class="upload">
        <form action="upload" enctype="multipart/form-data" method="post">
            <input type="file" name="file"/><br/>
            <input type="submit" value="上传"/>
        </form>
    </div>
</body>
</html>
