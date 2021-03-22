<%--
  Created by IntelliJ IDEA.
  User: bhosahu
  Date: 21/12/2020
  Time: 05:37 PM
  To change this template use File | Settings | File Templates.
--%>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:c="http://java.sun.com/jsp/jstl/core">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Banner Image update at Home Screen</title>
</head>
<script type="text/javascript">
    function validateForm()
    {
        var imageName = document.getElementById("image").value;
        if(imageName==""){
            alert('All Fields are Mandatory.');
            return false;
        }
    }
    function addUrl()
    {
        document.getElementById("selectedImage").href=document.getElementById("image").value;
        var url = document.getElementById("selectedImage").href;
        popupWindow = window.open(url,'popUpWindow','height=500,width=500,left=100,top=100,' +
            'resizable=yes,scrollbars=yes,toolbar=yes,menubar=no,location=no,directories=no, status=yes');
    }
</script>
<body>

<form action="uploadHomeImage" method="post" onSubmit="return validateForm()">
    <table width="75%" border="0" cellspacing="0" cellpadding="0" align="center">

        <tr>
            <td>Select the Image to upload:</td>
            <td>
                <select name="image" id="image">
                    <c:forEach var="homeImage" items="${imagesMap}">
                        <option value="${homeImage.value}">${homeImage.lable}</option>
                    </c:forEach>
                </select>
            </td>
        <br>
            <td><a class="image-link" id="selectedImage" name="selectedImage" href="#"
                   onclick="addUrl();return false;">Preview image</a></td>
        </tr>
        <br>
        <br>
        <tr>
            <td align="right"><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>
