# Programmation Fonctionnelle avec les Streams en Java - README

## Description du programme
Ce programme illustre l'utilisation des **expressions lambda** et des **Streams** en Java pour filtrer et traiter une liste de produits. Il met en avant les **opérations fonctionnelles** comme le filtrage, la transformation et l'agrégation de données.

## Objectifs et notions enseignées
Ce TP vise à enseigner les concepts suivants en Java :
- **Programmation fonctionnelle** : Utilisation des Streams et expressions lambda.
- **Manipulation de collections** : Traitement de listes avec des opérations fonctionnelles.
- **Filtrage de données** : Sélectionner des éléments répondant à un critère avec `filter()`.
- **Transformation et réduction** : Mapper les objets et calculer des valeurs agrégées avec `mapToDouble()` et `sum()`.
- **Utilisation de `forEach()`** : Affichage des résultats de manière concise.

## Explication du code

### Classe `Produit`
Cette classe représente un produit avec trois attributs :
- **`nom`** : Nom du produit.
- **`prix`** : Prix du produit.
- **`categorie`** : Catégorie du produit.

Elle fournit un constructeur et des getters pour accéder aux valeurs :
```java
public class Produit {
    private String nom;
    private double prix;
    private String categorie;

    public Produit(String nom, double prix, String categorie) {
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }
    public String getNom() { return nom; }
    public double getPrix() { return prix; }
    public String getCategorie() { return categorie; }
}
```

### Utilisation des Streams dans `Main`
Le programme crée une liste de `Produit`, puis :
1. **Filtre les produits appartenant à la catégorie "Fruits"** :
   ```java
   List<Produit> produitsFruits = produits.stream()
           .filter((p) -> p.getCategorie().equals("Fruits"))
           .collect(Collectors.toList());
   ```
2. **Affiche les noms des produits filtrés** :
   ```java
   produitsFruits.forEach((fruit) -> System.out.println(fruit.getNom()));
   ```
3. **Calcule le montant total des produits filtrés** :
   ```java
   double montantTotal = produitsFruits
           .stream()
           .mapToDouble((p) -> p.getPrix()).sum();
   System.out.println(montantTotal);
   ```

### Exécution du programme
Le `main` filtre et affiche les produits appartenant à la catégorie "Fruits" et calcule leur prix total.

#### Affichage attendu
```
Pomme
Banane
Poire
5.7
```

## Améliorations possibles
- Trier les produits par prix avant affichage.
- Afficher le prix moyen des produits filtrés.
- Appliquer d'autres critères de filtrage (prix minimal/maximal).
- Regrouper les produits par catégorie et calculer le total par catégorie.

---
Ce TP constitue une excellente introduction à la **programmation fonctionnelle avec les Streams en Java**, permettant de manipuler et filtrer des données de manière fluide et efficace.

