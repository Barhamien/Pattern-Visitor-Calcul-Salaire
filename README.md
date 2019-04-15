# Pattern-Visitor-Calcul-Salaire
Le Pattern Visiteur permet de séparer les données et les traitements associés pour ces données.
On défini une interface qui spécifie, pour chacune des classes, une méthode visit(param : type) qui
prend en paramètre une référence sur un objet du type de la classe.
les classes Directeur, Manager, Ouvrier et Commerciaux implémentent l'interface IEntreprise. Et chaque opération correspondra à une visite (visitor)
