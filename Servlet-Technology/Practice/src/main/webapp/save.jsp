<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
    <form action="saveopen">
    <fieldset>
      <legend>Personal Details</legend>
       <p>
        <label>
          Salutation
          <br />
          <select name="salutation">
            <option>--None--</option>
            <option>Mr.</option>
            <option>Ms.</option>
            <option>Mrs.</option>
            <option>Dr.</option>
            <option>Prof.</option>
          </select>
        </label>
      </p>
      
      <p>
        <label>First name: <input name="firstName" /></label>
      </p>

      <p>
        <label>Last name: <input name="lastName" /></label>
      </p>

      <p>
        Gender :
        <label><input type="radio" name="gender" value="male" /> Male</label>
        <label><input type="radio" name="gender" value="female" /> Female</label>
      </p>
      
      <p>
        <label>Email:<input type="email" name="email" /></label>
      </p>
      
      <p>
        <label>Date of Birth:<input type="date" name="birthDate"></label>
      </p>
      
       <p>
        <label>
          Address :
          <br />
          <textarea name="address" cols="30" rows="3"></textarea>
        </label>
      </p>
<p><button type="submit">Submit</button></p>
     </fieldset>
  </form>

</body>
</html>