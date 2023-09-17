<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class = "container">
	<h1>Your Todos</h1>
	<hr>
	<table class="table">
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done?</th>
			</tr>
		</thead>
		<tbody>		
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.description}</td>
					<td>${todo.targetdate}</td>
					<td>${todo.done}</td> 
					<td><a href="update-todo?id=${todo.id}" class="btn btn-info">Update</a></td>
					<td><a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href ="add-todo" class = "btn btn-primary">Add Todo</a>
</div>
<%@ include file="common/footer.jspf" %>
</body>
</html>