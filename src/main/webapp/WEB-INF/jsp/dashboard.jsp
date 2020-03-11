
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
            <td id="magasin1">0</td>
        </tr>
         <tr>
            <td>Magasin 2</td>
            <td id="magasin2">0</td>
        </tr>
         <tr>
            <td>Magasin 3</td>
            <td id="magasin3">0</td>
        </tr>
         <tr>
            <td>Magasin 4</td>
            <td id="magasin4">0</td>
        </tr>
         <tr>
            <td>Magasin 5</td>
            <td id="magasin5">0</td>
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

function getCA2(magasin){
	    var xhttp = new XMLHttpRequest();
	    xhttp.onreadystatechange = function() {
	        if (this.readyState == 4 && this.status == 200) {
	            document.getElementById(magasin).innerHTML =
	            this.responseText;
	       }
	    };
	    xhttp.open("GET", "http://localhost:8080/api/commandes/"+magasin, true);
	    xhttp.send();
}

getCA2("magasin1");
getCA2("magasin2");
getCA2("magasin3");
getCA2("magasin4");
getCA2("magasin5");
</script>

</body>
</html>