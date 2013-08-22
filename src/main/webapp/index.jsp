<%@include file="WEB-INF/pages/common/header.jsp"%>

<h2>Upload Video</h2>

<form method="post" action="upload" enctype="multipart/form-data">
	<label for="name">Name:</label>
    <input type="text" name="name"/>

    <label for="file">File:</label>
    <input type="file" name="file"/>

    <input type="submit" value="Submit" />
</form>

<%@include file="WEB-INF/pages/common/footer.jsp"%>