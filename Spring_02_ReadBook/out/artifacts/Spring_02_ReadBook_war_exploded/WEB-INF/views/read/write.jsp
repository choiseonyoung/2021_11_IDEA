<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>

<form>
    <div class="write_box1">
        <input class="isbn" placeholder="ISBN"/>
        <input class="bookname" placeholder="도서명"/>
    </div>
    <div class="write_box2">
        <input class="date" placeholder="날짜"/>
        <input class="time1" placeholder="시간"/>
        <input class="time2" placeholder="시간2"/>
    </div>
    <div class="write_box3">
        <input placeholder="제목"/>
    </div>
    <div class="write_box4">
        <input placeholder="내용"/>
    </div>
    <div class="btn_box">
        <button>저장</button>
        <button>새로작성</button>
        <button>리스트보기</button>
    </div>
</form>