# Gestion de Budget - README

## Description du programme
Ce programme implémente une gestion simple de budget en Java. Il permet de suivre un solde initial et d'ajouter des dépenses qui viennent le diminuer. Chaque dépense est représentée par une classe dédiée et transmise à la gestion de budget via une méthode spécifique.

## Objectifs et notions enseignées
Ce TP vise à enseigner les concepts suivants en Java :
- **Encapsulation et classes** : Utilisation des classes `GestionBudget` et `Depense`.
- **Méthodes et passage d'objets** : Transmission d'un objet `Depense` à la méthode `ajouterDepense()`.
- **Manipulation de variables d'instance** : Modification du solde en fonction des dépenses.
- **Utilisation des constructeurs** : Initialisation des objets avec des valeurs spécifiques.
- **Appels de méthodes et interaction entre classes**.

## Explication du code

### Classe `GestionBudget`
Cette classe représente la gestion du budget avec un solde initial de 1000 unités monétaires. Elle contient :
- **Un attribut `solde`** : qui stocke le montant actuel du budget.
- **Un constructeur `GestionBudget()`** : qui initialise le solde à 1000.
- **Une méthode `ajouterDepense(Depense depense)`** : qui soustrait le montant de la dépense au solde.
- **Une méthode `getSolde()`** : qui retourne le solde actuel.

### Classe `Depense`
Cette classe modélise une dépense avec :
- **Un attribut `montant`** : qui stocke le coût de la dépense.
- **Un attribut `libelle`** : qui stocke la description de la dépense.
- **Un constructeur `Depense(double montant, String libelle)`** : qui initialise ces attributs.
- **Une méthode `getMontant()`** : qui retourne le montant de la dépense.

### Passage d'une dépense dans `ajouterDepense()`
Dans la classe `Main`, des objets `Depense` sont créés et passés à la méthode `ajouterDepense()`. Exemple :
```java
Depense courses = new Depense(100, "courses");
budget.ajouterDepense(courses);
```
Le programme :
1. **Crée une dépense** de 100 unités avec l'intitulé "courses".
2. **Appelle `ajouterDepense(courses)`** :
   - L'objet `courses` est transmis à la méthode.
   - `getMontant()` est appelé pour récupérer la valeur de la dépense.
   - La valeur est soustraite au solde.

### Exécution du programme
Le `main` crée un objet `GestionBudget`, ajoute plusieurs dépenses et affiche le solde restant après soustraction.
```java
System.out.println(budget.getSolde());
```
Ce qui permet de visualiser l'impact des dépenses sur le budget initial.

## Améliorations possibles
- Ajouter une liste de dépenses pour mieux suivre l'historique.
- Permettre la suppression ou la modification des dépenses.
- Ajouter une gestion des catégories de dépenses.

---
Ce TP introduit des concepts fondamentaux de la programmation orientée objet en Java et constitue une bonne base pour des améliorations futures.

