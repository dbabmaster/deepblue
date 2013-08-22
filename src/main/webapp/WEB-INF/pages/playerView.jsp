<%@include file="common/header.jsp"%>
<h2>Player Detail Page</h2>

    <p>
    Name:  <c:out value="${player.name}"/>
    <br>
    Description:  <c:out value="${player.description}"/>
    <br>
    Watermark Path:  <c:out value="${player.watermarkPath}"/>
     
    <br/><br/><br/>
    Width:  <c:out value="${player.width}"/>
    Height:  <c:out value="${player.height}"/>
    <br/><br/><br/>

<%@include file="common/footer.jsp"%>