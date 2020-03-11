
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
<FORM name="myForm" onsubmit="return afficherPhrase()" action="/commandes" method="post">
<label>Choix du magasin</label>
<SELECT name="magasin" size="1">
<OPTION>magasin 1</OPTION>
<OPTION>magasin 2</OPTION>
<OPTION>magasin 3</OPTION>
<OPTION>magasin 4</OPTION>
<OPTION>magasin 5</OPTION>
</SELECT>
<label>Choix du produit</label>
<SELECT name="produit" size="1">
<OPTION>produit 1</OPTION>
<OPTION>produit 2</OPTION>
<OPTION>produit 3</OPTION>
<OPTION>produit 4</OPTION>
<OPTION>produit 5</OPTION>
<OPTION>produit 6</OPTION>
<OPTION>produit 7</OPTION>
<OPTION>produit 8</OPTION>
<OPTION>produit 9</OPTION>
<OPTION>produit 10</OPTION>
</SELECT>
<label>Acheteur</label>
<SELECT name="acheteur" size="1">
<OPTION>acheteur 1</OPTION>
<OPTION>acheteur 2</OPTION>
<OPTION>acheteur 3</OPTION>
<OPTION>acheteur 4</OPTION>
<OPTION>acheteur 5</OPTION>
</SELECT>
<input type="submit" value="Envoyer">
</FORM>

<script>function afficherPhrase() {
	  var x = "Bonjour monsieur " +  document.forms["myForm"]["acheteur"].value + " vous avez acheter sur le " + document.forms["myForm"]["magasin"].value + " ";
	  x += "le produit : " + document.forms["myForm"]["produit"].value;
	    alert(x);
	  }</script>


</body>
</html>