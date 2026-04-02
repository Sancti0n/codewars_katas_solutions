<?php
function F(int $n): int {
  $f = [1, 1];
  $m = [0, 0];
  if ($n<2) return $f[$n];
  $i = 2;
  while ($i-1<$n) {
    $f[] = $i - $m[$f[$i-1]];
    $m[] = $i - $f[$m[$i-1]];
    $i++;
  }
  return $f[count($f)-1];
}

function M(int $n): int {
  $f = [1, 1];
  $m = [0, 0];
  if ($n<2) return $m[$n];
  $i = 2;
  while ($i-1<$n) {
    $f[] = $i - $m[$f[$i-1]];
    $m[] = $i - $f[$m[$i-1]];
    $i++;
  }
  return $m[count($m)-1];
}
?>