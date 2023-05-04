<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
     <div class="alert alert-success" role="alert">
     ${msg }
   </div>
 

    <div class="container mt-5 text-center">
    
    <h2 class="text-center">UserInput Form</h2>
    
    <form action="output" method="post">
    
   <!--  Color Field -->
      <div class="form-group">
    <label for="exampleInputUsername" class="form-label">Enter the color</label>
    <input name="COLOUR" type="text" class="form-control" id="color">
    <div class="form-text">(black,white,blue,grey,purple,pink,maroon,yellow)</div>
  </div>
 </br>
  
   <!-- Gender Field -->
   <div class="form-group">
    <label for="exampleInputPassword" class="form-label">Enter the Gender</label>
    <input name="GENDER_RECOMMENDATION" type="text" class="form-control" id="gender">
    <div class="form-text">(F,M,U)</div>
  </div>
  
   </br>
   <!--  Size Field -->
      <div class="form-group">
    <label for="exampleInputUsername" class="form-label">Enter the size</label>
    <input name="SIZE" type="text" class="form-control" id="size">
     <div class="form-text">(S,M,L,XL,XLL)</div>
  </div>
  </br>
  
   <!-- Output Field -->
   <div class="form-group">
    <label for="exampleInputPassword" class="form-label">Enter the output</label>
    <input name="OUTPUT" type="text" class="form-control" id="output">
    <div class="form-text">(price,rating,both)</div>
  </div>
  
  <div class="container mt-3 text-center">
  
   <!-- Button -->
  <button type="submit" class="btn btn-primary">Search</button></div>
       
    </form>
    
    </div>
   
    
    
    
    
    
    
    
    
    
    
    
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  </body>
</html>