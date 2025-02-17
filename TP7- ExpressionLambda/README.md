# Expressions Lambda et Classes Anonymes - README

## Description du programme
Ce programme illustre l'utilisation des **expressions lambda** et des **classes anonymes** en Java. Il met en avant l'implémentation d'une interface `IWelcome` via différentes approches : une **classe concrète**, une **classe anonyme**, et une **expression lambda**.

## Objectifs et notions enseignées
Ce TP vise à enseigner les concepts suivants en Java :
- **Interfaces fonctionnelles** : Définition et utilisation d'une interface `IWelcome` avec une seule méthode.
- **Expressions lambda** : Écriture concise d'une implémentation anonyme d'une interface.
- **Classes anonymes** : Alternative aux classes concrètes pour implémenter des interfaces.
- **Polymorphisme et instanciation dynamique** : Capacité d'utiliser différentes implémentations interchangeables.

## Explication du code

### Interface `IWelcome`
Cette interface définit une seule méthode :
- **`sayHello(String nom)`** : Affiche un message de salutation.

```java
public interface IWelcome {
    void sayHello(String nom);
}
```

### Implémentation concrète `WelcomeImpl`
Cette classe implémente `IWelcome` de manière classique.

```java
public class WelcomeImpl implements IWelcome {
    @Override
    public void sayHello(String nom) {
        System.out.println("bonjour " + nom);
    }
}
```

### Utilisation des classes anonymes
Une classe anonyme est créée directement lors de l'instanciation de `IWelcome`.

```java
IWelcome welcome3 = new IWelcome() {
    @Override
    public void sayHello(String nom) {
        System.out.println("Hola " + nom);
    }
};
```

### Utilisation des expressions lambda
Une expression lambda remplace l'implémentation anonyme en offrant une syntaxe plus concise.

```java
IWelcome welcome = (nom) -> System.out.println("hello " + nom);
```

### Exécution du programme
Le `main` crée plusieurs implémentations de `IWelcome` et les utilise :

1. **Expression lambda** :
   ```java
   welcome.sayHello("peter");
   ```
2. **Classe concrète (`WelcomeImpl`)** :
   ```java
   welcome2.sayHello("Marie");
   ```
3. **Classe anonyme** :
   ```java
   welcome3.sayHello("Paul");
   ```

### Affichage attendu
```
hello peter
bonjour Marie
Hola Paul
```


