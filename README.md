# 🎮 Jeu de devinettes en Java

Ce projet est une implémentation simple d'un jeu de devinettes où l'utilisateur doit deviner un nombre entre 1 et 100 en 10 essais.

## 🧠 Règles du jeu
- Un nombre aléatoire entre 1 et 100 est généré au début.
- L'utilisateur dispose de 10 tentatives pour deviner ce nombre.
- Après chaque essai, un indice est affiché :
  - 🔼 si le nombre est trop petit.
  - 🔽 si le nombre est trop grand.
- Le jeu se termine lorsque :
  - ✅ L'utilisateur devine le bon nombre (victoire).
  - ❌ L'utilisateur dépasse les 10 essais sans succès (défaite).

## ▶️ Compilation et exécution

```bash
javac GuessingGame.java
java GuessingGame
```
