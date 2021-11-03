<%--
  Created by IntelliJ IDEA.
  User: 403
  Date: 2021-11-03
  Time: 오전 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="${rootPath}/static/css/main.css" rel="stylesheet"/>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            list-style: none;
        }

        header {
            width: 99%;
            height: 20vh;
            background-color: skyblue;
            text-align: center;
        }

        header h1 {
            line-height: 20vh;
        }

        nav {
            width: 99%;
            height: 5vh;
            background-color: gray;
            text-align: center;
        }

        nav ul {
            display: flex;
            width: 80%;
            margin: auto;
        }

        nav ul li {
            margin: auto 40px;
            line-height: 5vh;
            color: white;
            font-weight: bold;
        }

        nav ul li:last-child {
            margin-left: auto;
        }
    </style>
</head>
<body>
    <header>
        <h1> 고려 고교 학사관리 2021 v1 </h1>
    </header>
    <nav>
        <ul>
            <li>Home</li>
            <li>학생정보</li>
            <li>성적일람표</li>
            <li>로그인</li>
        </ul>
    </nav>
</body>
</html>
