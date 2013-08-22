<%@include file="common/header.jsp"%>

<h2>Edit Player</h2>

  <form method="POST" action="/kalturaupload/player/edit" >
 
    <p>
    Name:  <c:out value="${player.name}"/>
    Description:  <c:out value="${player.description}"/>
     <br/><br/><br/>
     
      <input type="hidden" name="id" value="${player.id}"><br/>
     <input type="text" name="width" value="${player.width}"><br/>
     <input type="text" name="height" value="${player.height}"><br/>
     <input type="text" name="watermarkPath" size="500" value="${player.watermarkPath}"><br/>
    <br/><br/><br/>

            <input type="submit"/>
        </form>

<%@include file="common/footer.jsp"%>
