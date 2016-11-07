<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h2>Create New Category</h2>
<form:form method="POST" action="../../java/com.demo.controller/ProductController">
    <table>
        <tr>
            <td><form:label path="categoryId">Category ID:</form:label></td>
            <td><form:input path="categoryId" readonly="true"/></td>
        </tr>
        <tr>
            <td><form:label path="categoryName">Category Name:</form:label></td>
            <td><form:input path="categoryName" value="${category.categoryName}"/></td>
        </tr>

        <tr>
        <tr>
            <td>&nbsp;</td>
            <td><input type="submit" value="SAVE"/></td>
        </tr>
    </table>
</form:form>
<br/>
<c:if test="${!empty categories}">
    <table align="center" border="1">
        <tr>
            <th>Category ID</th>
            <th>Category Name</th>
            <th>Options</th>
        </tr>

        <c:forEach items="${categories}" var="category">
            <tr>
                <td><c:out value="${category.categoryId}"/></td>
                <td><c:out value="${category.categoryName}"/></td>
                <td align="center"><a href="editCategory.html?categoryId=${category.categoryId}">Edit</a> | <a
                        href="deleteCategory.html?categoryId=${category.categoryId}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<h2><a href="addPublication.html">Adding Publication</a></h2>


</body>
</html>