# Gestion des Ventes - README

## Description du programme
Ce programme illustre l'utilisation des **classes anonymes** en Java pour implémenter des services de vente. Il met en avant l'**utilisation des interfaces**, l'**instanciation d'objets anonymes**, et la différence entre une implémentation anonyme et une classe concrète.

## Objectifs et notions enseignées
Ce TP vise à enseigner les concepts suivants en Java :
- **Interfaces et abstraction** : `IVenteService` définit les méthodes à implémenter.
- **Classes anonymes** : Déclaration et instanciation anonyme d'un service dans `Main` et `GestionVentePartielle`.
- **Polymorphisme** : Une interface peut être implémentée de différentes manières.
- **Implémentation concrète vs anonyme** : Comparaison entre `VenteServiceImpl` et une instance anonyme de `IVenteService`.

## Explication du code

### Interface `IVenteService`
Cette interface définit deux méthodes obligatoires pour les classes qui l'implémentent :
- **`calculerMoyenneDesVentes()`** : Calcule la moyenne des ventes.
- **`calculerTopVentes()`** : Calcule les meilleures ventes.

```java
public interface IVenteService {
    void calculerMoyenneDesVentes();
    void calculerTopVentes();
}
```

### Implémentation concrète `VenteServiceImpl`
Cette classe implémente `IVenteService` et fournit une implémentation pour `calculerMoyenneDesVentes()`.

```java
public class VenteServiceImpl implements IVenteService {
    @Override
    public void calculerMoyenneDesVentes() {
        System.out.println("je calcule la moyenne des ventes génériques");
    }
    @Override
    public void calculerTopVentes() {}
}
```

### Utilisation des classes anonymes
Une classe anonyme est déclarée directement lors de l'instanciation de `IVenteService`.

#### Dans `GestionVentePartielle`
```java
IVenteService service = new IVenteService() {
    @Override
    public void calculerMoyenneDesVentes() {
        System.out.println("calcul de la moyenne des ventes partielles");
    }
    @Override
    public void calculerTopVentes() {}
};
```

#### Dans `Main`
```java
IVenteService service = new IVenteService() {
    @Override
    public void calculerMoyenneDesVentes() {
        System.out.println("je calcule la moyenne des ventes classiques");
    }
    @Override
    public void calculerTopVentes() {}
};
service.calculerTopVentes();
```

### Différence entre classe anonyme et classe concrète
- Une **classe anonyme** permet de créer une instance personnalisée sans créer une classe dédiée.
- Une **classe concrète (`VenteServiceImpl`)** est réutilisable dans plusieurs parties du code.

### Exécution du programme
Le `main` crée une instance anonyme de `IVenteService` et appelle ses méthodes :
```java
service.calculerTopVentes();
```

### Affichage attendu
```
je calcule la moyenne des ventes classiques
```


