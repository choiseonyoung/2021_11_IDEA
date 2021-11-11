<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- * form 만들 때 사용하는 라이브러리 --%>

<%-- * 위에 taglib 로 선언한 form --%>
<form:form action="${rootPath}/login">
    <fieldset>
        <legend>로그인</legend>
        <c:if test="${param.error}">
            <h3>로그인을 해야 합니다</h3>
        </c:if>
        <input placeholder="사용자 ID">
        <input placeholder="비밀번호" type="password">
        <button>로그인</button>
        <button type="button">회원가입</button>
    </fieldset>
</form:form>