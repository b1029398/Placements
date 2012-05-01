<!doctype html>

 <head>
  <meta name="layout" content="main">
   <title>Placement Application</title>
 </head>
<body>
 <h1>Apply for Placement</h1>
<g:form action="processApplication" method="get"
      name="Process">

Name: <input type="text" name="txtName" />
Placement: <input type="text" name="txtPlacement" />

<g:submitButton name="Submit" value="Update" />

<br><br><a href ='../Placements/'>Home </a>

</g:form>
</body>
</html>
