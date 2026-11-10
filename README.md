# Patron Factory Method

Devoir n°1 – Patrons de construction (INF461)
TIENTCHEU TCHOKOUATOU Emmanuel – 20Q2998

## Principe

La classe abstraite `ProduitFactory` déclare une méthode de création
`createProduit()` que chaque sous-classe redéfinit.
Chaque fabrique concrète (`ProduitFactoryA`, `ProduitFactoryB`, …) crée un seul
type de produit. Le client obtient le produit avec `getProduit()`, sans
connaître la classe concrète créée.

## Contenu du dépôt

| Dossier | Description |
|---|---|
| `exemple-cours/` | Exemple vu en cours : `ProduitA/B/C` et `ProduitFactoryA/B/C` |
| `exemple-modifie/` | Exemple modifié : ajout de `ProduitD` et `ProduitFactoryD` |

## Modification apportée

- Ajout de la classe `ProduitD` (hérite de `Produit`)
- Ajout de la fabrique `ProduitFactoryD` (hérite de `ProduitFactory`)
- `App` utilise aussi la nouvelle fabrique

Aucune classe existante n'a été modifiée : on ajoute seulement de nouvelles classes
(principe ouvert/fermé).
