<%@include file="common/header.jsp"%>

<h2>Media List Page</h2>

<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${mediaEntries}" var="entry">
			<tr>
			    <td class="name"><c:out value="${entry.name}"/></td>
			    <td class="description"><c:out value="${entry.description}"/></td>
			    <td class="actions"><a href="play?id=${entry.id}" target="_blank">Play Video</a></td>
		    </tr>
		</c:forEach>
	</tbody>
</table>

<%@include file="common/footer.jsp"%>