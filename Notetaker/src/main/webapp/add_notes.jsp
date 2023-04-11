<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add notes</title>

  <%@include file ="all_css.jsp" %>
  
</head>
<body>

<div class="container-fluid">
 
  <%@include file ="nabbar.jsp" %>
<br>

<h1> Please fill your notes  </h1>

<!--  this is add form  -->

<form action="SavenoteServlet " method="post">
  <div class="form-group">
    <label for="title"> Note Title</label>
    <input name ="title"
     required  type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter Here">
    
  </div>
  	<div class="form-group">
    <label for="content">Note content</label>
    <textarea 
    name = "content"
    id =" content " 
    placeholder=" Enter your content here " 
    class=" form-control " 
    style="height:300px " 
    >
    
   </textarea>
    
  </div>
  <div class= "container text-center ">
  <button type="submit" class="btn btn-primary">ADD</button>
</div>  
</form>

</div> 
</body>
</html>