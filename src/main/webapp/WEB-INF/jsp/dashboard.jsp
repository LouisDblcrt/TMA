
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Commandes</title>
<meta charset="UTF-8">
<link href="/css/main.css" rel="stylesheet">
<body>
<h1>Shopping</h1>
<h2>Team Patrick BALKANY</h2>
<br> <br> <br>
<table>
    <thead>
        <tr>
            <th>Magasin</th>
        	<th>Chiffre d'affaire</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Magasin 1</td>
            <td><button onclick=getCA("magasin1")>getCa</button></td>
        </tr>
    </tbody>
</table>

<script type="text/javascript">

function getCA(magasin){
	const Http = new XMLHttpRequest();
	const url='http://localhost:8080/api/commandes/'+magasin;
	var x =0;
	Http.open("GET", url);
	Http.onreadystatechange = function() {
	    if (Http.readyState == XMLHttpRequest.DONE) {
	       alert(Http.responseText);
	    }
	}
	Http.send();
	console.log(Http.onreadystatechange);
}

</script>

</body>
</html>