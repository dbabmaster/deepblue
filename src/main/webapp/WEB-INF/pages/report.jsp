<%@include file="common/header.jsp"%>

<h2>Report List Page</h2>

<h3>Report Header:</h3>

<table border="1">
	<thead>
		<tr>
			<c:forEach items="${headerData}"  var="entry">
				<th>${entry}</th>
			</c:forEach>
		</tr>
	</thead>
	<tbody>
		<tr>
			<c:forEach items="${reportData}"  var="data">
			    <td>${data}</td>
			</c:forEach>
		</tr>
	</tbody>
</table>

<%@include file="common/footer.jsp"%>


