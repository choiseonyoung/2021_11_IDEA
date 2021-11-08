<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <title>학사관리</title>
</head>
<body>
<%-- * 각각의 항목들을 여기 insert 해서 레이아웃처럼 만들겠다 --%>
<tiles:insertAttribute name="header"/>
<tiles:insertAttribute name="nav"/>
<tiles:insertAttribute name="content"/>
<tiles:insertAttribute name="footer"/>
<%-- * 누군가 home을 렌더링해서 ~하면 header,nav,footer를 같이 어쩌구저쩌구 해서 하나의 view를 만들겠다 ! --%>
</body>
</html>
