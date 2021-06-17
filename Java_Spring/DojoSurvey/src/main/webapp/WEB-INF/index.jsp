<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form page</title>
</head>
<body>
 <form action='/resultprocess' method='POST'>
        <p>Your Name: <input type='text' name='name' required></p>
        <p>Dojo location:<select id="location" name="location" required>
            <option value="Ramallah">Ramallah</option>
            <option value="nablus">nablus</option>
          </select></p>
          <p>favorite language:<select id="language" name="language" required>
            <option value="python">python</option>
            <option value="java">java</option>
          </select></p>
          <p>Comment(optional):</p>
          <textarea name="comment"></textarea>
          <p><input type="submit" value="button"></p>
      </form>
</body>
</html>