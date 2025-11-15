# ☕ Design Pattern — Decorator

Réalisé dans le cadre du module Design Patterns — ENSET  
Encadré par **M. Youssi Mohammed**

## 🎯 Objectif

Cette activité pratique m'a permis de comprendre et d'implémenter le **Design Pattern Decorator**, un pattern structurel qui permet d'ajouter dynamiquement des fonctionnalités à un objet sans modifier sa classe.

Ce pattern est très utilisé dans la vraie vie (streams Java, UI components, frameworks…), et c'était essentiel de l'apprendre pour structurer des programmes flexibles, extensibles et conformes aux principes **SOLID** (en particulier **Open/Closed Principle**).

## 🧠 Ce que j'ai appris

### ✔ Le rôle du pattern Decorator
- Ajouter des comportements au moment de l'exécution, sans toucher au code source des classes existantes
- Découpler les fonctionnalités optionnelles du cœur des objets
- Empiler plusieurs décorateurs pour enrichir un objet de base

### ✔ La structure du pattern
- **Boisson** : composant de base (abstract)
- **Espresso, Deca** : composants concrets
- **DecorateurBoisson** : décorateur abstrait — contient une référence Boisson
- **Chocolat, Lait** : décorateurs concrets

### ✔ L'intérêt pratique
- Chaque nouvelle option (ex : caramel, chantilly, soja…) = une nouvelle classe décorateur
- Pas besoin de modifier Espresso, Deca ou les autres classes existantes → **OCP respecté**

## 📘 Diagramme UML de mon implémentation

Le diagramme suivant a été généré depuis mon code Java avec **IntelliJ IDEA**.

Il montre clairement l'héritage et la composition entre les boissons et les décorateurs.
<img width="1353" height="826" alt="Capture d&#39;écran 2025-11-15 115003" src="https://github.com/user-attachments/assets/33b6db0f-661b-4340-9f10-fec10b5cb2ed" />


## 🧩 Structure du projet
```
src
└── boissons
├── Boisson.java
├── Espresso.java
├── Deca.java
└── decorateur
  ├── DecorateurBoisson.java
  ├── Chocolat.java
  └── Lait.java

```


## 🧪 Exemple d'exécution

**Main.java**
```java
import boissons.Boisson;
import boissons.decorateur.Chocolat;
import boissons.Espresso;
import boissons.decorateur.Lait;

public class Main {
    public static void main(String[] args) {
        Boisson b = new Espresso();
        System.out.println("prix: "+b.cout() + " desc: " + b.getDescription());

        b = new Chocolat(b);
        System.out.println("prix: "+b.cout() + " desc: " + b.getDescription());

        b = new Lait(b);
        System.out.println("prix: "+b.cout() + " desc: " + b.getDescription());

        b = new Chocolat(b);
        System.out.println("prix: "+b.cout() + " desc: " + b.getDescription());
    }
}
```
📤 Résultat obtenu
```
prix: 12.0 desc: Espresso
prix: 15.0 desc: Espresso Au Chocolat
prix: 20.0 desc: Espresso Au Chocolat Au lait
prix: 23.0 desc: Espresso Au Chocolat Au lait Au Chocolat
```
- 👉 Chaque décorateur ajoute son prix + modifie la description

- 👉 L'objet final est la combinaison de toutes les décorations appliquées

### 🧠 Ce que j'ai mieux compris grâce à cet exercice
- Le Decorator permet d'éviter des classes avec 50 combinaisons (ex : EspressoAvecLaitEtChocolat…)

- Les décorateurs peuvent être empilés à l'infini, comme des couches

- C'est un pattern puissant dans les I/O de Java, les composants graphiques, les middlewares HTTP…

### ✨ Conclusion
Cette activité m'a permis de comprendre profondément :

- La philosophie du Decorator

- Son utilité en architecture logicielle

- Comment écrire un code extensible, propre et maintenable

- Comment utiliser IntelliJ pour générer des diagrammes UML basés sur le code réel
