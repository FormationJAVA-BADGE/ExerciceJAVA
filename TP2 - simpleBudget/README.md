# Gestion de Budget - README

## Description du programme
Ce programme implémente deux approches différentes pour la gestion d'un budget en Java. Chaque approche permet d'ajouter des dépenses et d'observer leur impact sur le solde initial. La différence réside dans la manière dont les dépenses sont passées et gérées dans les classes.

## Objectifs et notions enseignées
Ce TP vise à enseigner les concepts suivants en Java :
- **Passage de paramètres par valeur et par objet** : Comparaison entre `GestionBudget` et `GestionBudget2`.
- **Encapsulation et classes** : Utilisation des classes pour structurer le code.
- **Méthodes et attributs** : Utilisation des setters et getters.
- **Modification de variables d'instance** : Gestion et mise à jour du solde.
- **Différence entre calcul immédiat et différé** : `GestionBudget` met à jour le solde directement, tandis que `GestionBudget2` attend l'appel de `getSolde()`.

## Explication du code

### Classe `GestionBudget`
Cette classe gère un budget avec :
- **Un attribut `solde`** : montant disponible initialement fixé à 1000.
- **Un constructeur `GestionBudget()`** : initialisation du solde.
- **Une méthode `ajouterDepense(double montant)`** : soustrait directement la dépense du solde.
- **Une méthode `getSolde()`** : retourne le solde actuel.

### Classe `GestionBudget2`
Cette classe propose une autre gestion des dépenses :
- **Un attribut `solde`** : montant initial de 1000.
- **Un attribut `montantDepense`** : montant de la dernière dépense enregistrée.
- **Une méthode `setMontantDepense(double montantDepense)`** : enregistre une dépense sans modifier immédiatement le solde.
- **Une méthode `getSolde()`** : applique la soustraction lors de son appel.

### Différence entre les deux approches
Dans `GestionBudget`, les dépenses sont directement appliquées sur le solde au moment où `ajouterDepense()` est appelée. 
Dans `GestionBudget2`, la dépense est stockée temporairement et n'affecte le solde qu'au moment de l'appel de `getSolde()`.

### Exécution du programme
Le `main` instancie deux objets :
1. **`GestionBudget`** : Ajoute plusieurs dépenses immédiatement.
   ```java
   budget.ajouterDepense(500);
   budget.ajouterDepense(12);
   budget.ajouterDepense(250);
   budget.ajouterDepense(100);
   ```
   - Chaque dépense est immédiatement déduite du solde.

2. **`GestionBudget2`** : Enregistre une dépense puis met à jour le solde seulement à l'appel de `getSolde()`.
   ```java
   budget2.setMontantDepense(500);
   double result = budget2.getSolde();
   ```

### Affichage des résultats
Le programme affiche le solde final des deux gestions de budget :
```java
System.out.println("budget1 " + budget.getSolde());
System.out.println("budget 2 " + result);
```



