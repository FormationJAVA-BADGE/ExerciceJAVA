# Gestion de Commandes - README

## Description du programme
Ce programme illustre les concepts fondamentaux de la programmation orientée objet (POO) en Java à travers la gestion d'un système de commandes pour des clients. Il met en avant l'utilisation des **classes**, des **constructeurs**, de l'**agrégation d'objets**, et des **collections** pour stocker des informations.

## Objectifs et notions enseignées
Ce TP vise à enseigner les concepts suivants en Java :
- **Encapsulation et classes** : Création et utilisation des classes `Client`, `Produit`, et `Commande`.
- **Constructeurs et initialisation d'objets** : Gestion des objets avec des attributs privés.
- **Agrégation d'objets** : Une `Commande` contient un `Client` et une liste de `Produit`.
- **Manipulation des collections** : Utilisation d'un `ArrayList` pour stocker les produits d'une commande.
- **Accès aux attributs et méthodes** : Interaction entre objets à travers des méthodes getter et setter.

## Explication du code

### Classe `Client`
Cette classe représente un client avec deux attributs :
- **`nom`** : Stocke le nom du client.
- **`prenom`** : Stocke le prénom du client.

Elle dispose de méthodes permettant d'accéder et de modifier ces attributs :
```java
public String getNom() {
    return this.nom;
}
public void setNom(String nom) {
    this.nom = nom;
}
```

### Classe `Produit`
Cette classe représente un produit avec :
- **`libelle`** : Nom du produit.
- **`description`** : Courte description du produit.

Elle possède un constructeur pour initialiser ces valeurs et des getters pour les récupérer.
```java
public Produit(String libelle, String description) {
    this.libelle = libelle;
    this.description = description;
}
```

### Classe `Commande`
Cette classe permet de gérer une commande associée à un client et contenant une liste de produits :
- **`client`** : Référence à un objet `Client`.
- **`produits`** : Une liste (`ArrayList<Produit>`) pour stocker les produits commandés.

Elle contient :
- **Un constructeur `Commande(Client client)`** qui initialise la commande avec un client et une liste vide de produits.
- **Une méthode `ajouterProduit(Produit produit)`** qui ajoute un produit à la liste.
- **Des getters pour accéder au client et à la liste de produits.**

```java
public void ajouterProduit(Produit produit){
    produits.add(produit);
}
```

### Exécution du programme
Le `main` crée et manipule les objets pour simuler une commande :
1. **Création d'un client** :
   ```java
   Client client = new Client("Dupont", "Jean");
   ```
2. **Création de produits** :
   ```java
   Produit p1 = new Produit("Vélo", "lorem ipsum");
   Produit p2 = new Produit("Micro", "lorem ipsum");
   ```
3. **Création d'une commande associée au client et ajout de produits** :
   ```java
   Commande commande = new Commande(client);
   commande.ajouterProduit(p1);
   commande.ajouterProduit(p2);
   ```
4. **Affichage des informations de la commande** :
   ```java
   System.out.println("COMMANDE : nom client :" + commande.getClient().getNom());
   for(int i = 0; i < commande.getProduits().size(); i++){
       System.out.println(commande.getProduits().get(i).getLibelle());
   }
   ```

### Affichage attendu
```
COMMANDE : nom client : Dupont
Vélo
Micro
```

## Améliorations possibles
- Ajouter un identifiant unique pour chaque client et chaque commande.
- Permettre la suppression d'un produit dans une commande.
- Ajouter un prix aux produits et calculer le total de la commande.
- Implémenter une gestion des stocks pour limiter les commandes.

---
Ce TP constitue une excellente introduction aux **relations entre classes en POO**, notamment l'agrégation et la manipulation de collections en Java.

