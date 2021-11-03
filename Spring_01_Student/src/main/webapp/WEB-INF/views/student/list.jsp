<%--
  Created by IntelliJ IDEA.
  User: 403
  Date: 2021-11-03
  Time: 오전 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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

        table {
            width: 1200px;
            margin: 50px auto;
            border: 1px solid lightgray;
            text-align: center;
            border-collapse: collapse;
        }

        table tr {
            height: 30px;
        }

        table th {
            background-color: #eee;
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
<table>
    <thead>
    <tr>
        <th>학번</th>
        <th>이름</th>
        <th>전공</th>
        <th>학년</th>
        <th>주소</th>
        <th>전화번호</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>20170271</td>
        <td>최서녕</td>
        <td>컴퓨터공학과</td>
        <td>5</td>
        <td>광주광역시</td>
        <td>010-1004-1004</td>
    </tr>
    </tbody>
</table>
</body>
<script>

</script>
</html>
