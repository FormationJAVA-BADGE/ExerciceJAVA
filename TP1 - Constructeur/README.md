# Gestion de Budget - README

## Description du programme
Ce programme illustre les concepts fondamentaux de la programmation orientée objet (POO) en Java à travers la gestion de voitures. Il met en avant l'utilisation des **constructeurs**, des **attributs**, des **méthodes** et du **passage de paramètres**.

## Objectifs et notions enseignées
Ce TP vise à enseigner les concepts suivants en Java :
- **Déclaration et instanciation d'objets** : Création d'objets `Voiture` dans `Main`.
- **Constructeurs** : Gestion de plusieurs constructeurs avec ou sans paramètres.
- **Attributs d'instance** : Stockage des informations comme la couleur et le nombre de roues.
- **Méthodes** : Calcul d'un prix en fonction des caractéristiques de l'objet.
- **Encapsulation et manipulation d'attributs**.

## Explication du code

### Classe `Voiture`
Cette classe représente un véhicule avec deux attributs principaux :
- **`couleur`** : Définit la couleur de la voiture.
- **`nbreRoue`** : Indique le nombre de roues du véhicule.

Elle dispose de plusieurs constructeurs :
1. **Constructeur par défaut `Voiture()`** :
   - Initialise une voiture blanche avec 4 roues.
   ```java
   public Voiture(){
       this.couleur="blanc";
       this.nbreRoue=4;
   }
   ```

2. **Constructeur avec paramètres `Voiture(String couleur, boolean isRoueSupplementaire)`** :
   - Permet de définir la couleur et d’ajouter une roue supplémentaire si nécessaire.
   ```java
   public Voiture(String couleur, boolean isRoueSupplementaire){
       this.couleur=couleur;
       this.nbreRoue = isRoueSupplementaire ? 5 : 4;
   }
   ```

### Méthode `computePrice()`
Cette méthode calcule le prix du véhicule en fonction de ses attributs :
- Une voiture **non blanche** coûte 400 unités supplémentaires.
- Une voiture avec **plus de 4 roues** ajoute 200 unités au prix.

```java
public double computePrice(){
    double prix = 0;
    if(!this.couleur.equals("blanc")){
        prix += 400;
    } else if(this.nbreRoue > 4){
        prix += 200;
    }
    return prix;
}
```

### Exécution du programme
Le `main` crée et manipule deux objets `Voiture` :
1. **Une voiture par défaut** (blanche, 4 roues) :
   ```java
   Voiture voiture = new Voiture();
   ```
2. **Une voiture rouge avec une roue supplémentaire** :
   ```java
   Voiture voiture2 = new Voiture("rouge", true);
   ```

Le programme affiche la couleur de la première voiture et le prix calculé de la seconde :
```java
System.out.println("voiture " + voiture.couleur);
System.out.println("voiture2 " + voiture2.computePrice());
```


