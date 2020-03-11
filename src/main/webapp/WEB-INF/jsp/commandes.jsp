
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
<OPTION>magasin1</OPTION>
<OPTION>magasin2</OPTION>
<OPTION>magasin3</OPTION>
<OPTION>magasin4</OPTION>
<OPTION>magasin5</OPTION>
</SELECT>
<label>Choix du produit</label>
<SELECT name="produit" size="1">
<OPTION>produit1</OPTION>
<OPTION>produit2</OPTION>
<OPTION>produit3</OPTION>
<OPTION>produit4</OPTION>
<OPTION>produit5</OPTION>
<OPTION>produit6</OPTION>
<OPTION>produit 7</OPTION>
<OPTION>produit 8</OPTION>
<OPTION>produit 9</OPTION>
<OPTION>produit 10</OPTION>
</SELECT>
<label>Acheteur</label>
<SELECT name="acheteur" size="1">
<OPTION>acheteur1</OPTION>
<OPTION>acheteur2</OPTION>
<OPTION>acheteur3</OPTION>
<OPTION>acheteur4</OPTION>
<OPTION>acheteur5</OPTION>
</SELECT>
<input type="submit" value="Envoyer">
<p>Prix: 10 euros TTC, TVA 20%, PRIX HT : 8 euros.</p>
</FORM>


<script>function afficherPhrase() {
	  var x = "Bonjour monsieur " +  document.forms["myForm"]["acheteur"].value + " vous avez acheter sur le " + document.forms["myForm"]["magasin"].value + " ";
	  x += "le produit : " + document.forms["myForm"]["produit"].value;
	    alert(x);
	  }</script>


</body>
</html>