In this Kata, you will be given an array of side lengths for a triangle.Your job is to figure out whether the triangle should be classified as Right, Acute, or Obtuse. To learn more about Right, Acute, or Obtuse triangles see here - [Acute and Obtuse Triangles](https://en.wikipedia.org/wiki/Acute_and_obtuse_triangles)

Recall that a in a right triangle, one of the three angles has a value of 90°, in an obtuse angle one of the three angles has a value greater than 90°, and in an acute triangle all three of the angles have measures less than 90°.

The array given will always contain 3 positive integers, and the order of the integers may be random. The side lengths may not produce a valid triangle.

## JavaScript
```js
function obtRhtAct(sideLen) {
  sideLen.sort((a,b)=>a-b);
  if (2*sideLen[2] >= sideLen[0] + sideLen[1] + sideLen[2]) return -1
  if ((sideLen[0]**2 + sideLen[1]**2) < sideLen[2]**2) return 0
  if ((sideLen[0]**2 + sideLen[1]**2) == sideLen[2]**2) return 1
  if ((sideLen[0]**2 + sideLen[1]**2) > sideLen[2]**2) return 2
}
```