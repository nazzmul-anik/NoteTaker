<%--
  Created by IntelliJ IDEA.
  User: DCL
  Date: 12/25/2024
  Time: 6:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Notes</title>
    <link rel="stylesheet" href="CSS/bootstrap.css">
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
    <div class="container"><%@include file="navbar.jsp"%></div>
    <div class="container">
        <h2 class="text-center">Please, Add Note</h2>
        <br>
        <form action="saveNote" method="post">
            <div class="mb-3">
                <label for="title" class="form-label">Note Title</label>
                <input required name="title" type="text" class="form-control" id="title" placeholder="Enter title">
            </div>
            <div class="mb-3">
                <label for="content" class="form-label">Note Content</label>
                <textarea required name="content" id="content" class="form-control text-content" placeholder="Enter your content here"></textarea>
            </div>

            <div class="container text-center"><button type="submit" class="btn btn-primary">Add Note</button></div>

        </form>
    </div>
</body>
</html>
