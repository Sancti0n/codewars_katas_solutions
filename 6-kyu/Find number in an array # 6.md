https://www.codewars.com/kata/5845921ca87f76501a000101

## JavaScript
```js
/**
 * Trouver l'index d'un nombre dans un tableau trié et décalé.
 * Complexité : O(log n) -> Environ 24 étapes pour 10 millions d'éléments.
 * Car Math.log2(10 000 000) = 23.3 étapes
 */
function findIndexOf(arr, n) {
  let left = 0;
  let right = arr.length - 1;
  
  while (left <= right) {
    // On calcule le milieu avec une astuce de performance (bit shift)
    // C'est l'équivalent ultra-rapide de Math.floor((left + right) / 2)
    let mid = (left + right) >> 1;
    
    if (arr[mid] === n) {
      return mid;
    }
    
    // Dans un tableau décalé, une des deux moitiés est FORCÉMENT triée.
    // Est-ce que la partie GAUCHE (de 'left' à 'mid') est bien triée ?
    if (arr[left] <= arr[mid]) {
      // Est-ce que notre nombre 'n' est coincé entre ces deux bornes ?
      if (n >= arr[left] && n < arr[mid]) {
        // Oui ! Donc on ignore tout le reste, on cherche à gauche
        right = mid - 1;
      } else {
        // Non, donc il est forcément dans l'autre moitié (à droite)
        left = mid + 1;
      }
    } 
    
    // Sinon, c'est que la partie DROITE (de 'mid' à 'right') est bien triée !
    else {
      // Est-ce que notre nombre 'n' est entre ces deux bornes ?
      if (n > arr[mid] && n <= arr[right]) {
        // Oui ! On cherche uniquement dans cette zone à droite
        left = mid + 1;
      } else {
        // Non, on retourne chercher dans la zone de gauche
        right = mid - 1;
      }
    }
  }
  return -1;
}
```