<%@include file="common/header.jsp"%>

<h2>Players List</h2>

<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${players}"  var="entry">
			<tr>
			    <td class="name"><c:out value="${entry.name}"/></td>
			    <td class="description">
			    	<c:if test="${not empty entry.description}">
						<c:out value="${entry.description}"/><br><br>
					</c:if>
	
				    Width: <c:out value="${entry.width}"/><br>
				    Height: <c:out value="${entry.height}"/>
			  	</td>
			  	<td class="actions">
			    	<a href="player/view/?id=${entry.id}" target="_blank">View Details</a>
			    </td>
			</tr>
		</c:forEach>
	</tbody>

</table>
<%@include file="common/footer.jsp"%>
