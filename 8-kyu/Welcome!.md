https://www.codewars.com/kata/577ff15ad648a14b780000e7

## Python
```python
def greet(language):
    d = {'english': 'Welcome',
         'czech': 'Vitejte',
         'danish': 'Velkomst',
         'dutch': 'Welkom',
         'estonian': 'Tere tulemast',
         'finnish': 'Tervetuloa',
         'flemish': 'Welgekomen',
         'french': 'Bienvenue',
         'german': 'Willkommen',
         'irish': 'Failte',
         'italian': 'Benvenuto',
         'latvian': 'Gaidits',
         'lithuanian': 'Laukiamas',
         'polish': 'Witamy',
         'spanish': 'Bienvenido',
         'swedish': 'Valkommen',
         'welsh': 'Croeso'
    }
    if language in d: return d[language]
    return 'Welcome'
```

## JavaScript
```js
function greet(language) {
  let d = {'english': 'Welcome',
         'czech': 'Vitejte',
         'danish': 'Velkomst',
         'dutch': 'Welkom',
         'estonian': 'Tere tulemast',
         'finnish': 'Tervetuloa',
         'flemish': 'Welgekomen',
         'french': 'Bienvenue',
         'german': 'Willkommen',
         'irish': 'Failte',
         'italian': 'Benvenuto',
         'latvian': 'Gaidits',
         'lithuanian': 'Laukiamas',
         'polish': 'Witamy',
         'spanish': 'Bienvenido',
         'swedish': 'Valkommen',
         'welsh': 'Croeso'
    };
    if (d.hasOwnProperty(language)) return d[language]
    return 'Welcome'
}
```

## PHP
```php
function greet(string $l): string {
  $d = ['english'=> 'Welcome',
         'czech'=> 'Vitejte',
         'danish'=> 'Velkomst',
         'dutch'=> 'Welkom',
         'estonian'=> 'Tere tulemast',
         'finnish'=> 'Tervetuloa',
         'flemish'=> 'Welgekomen',
         'french'=> 'Bienvenue',
         'german'=> 'Willkommen',
         'irish'=> 'Failte',
         'italian'=> 'Benvenuto',
         'latvian'=> 'Gaidits',
         'lithuanian'=> 'Laukiamas',
         'polish'=> 'Witamy',
         'spanish'=> 'Bienvenido',
         'swedish'=> 'Valkommen',
         'welsh'=> 'Croeso'
        ];
  if (array_key_exists($l, $d)) return $d[$l];
  else return "Welcome";
}
```

## Java
```java
import java.util.*;

public class Welcome {
  public static String greet(String language) {
    Map<String, String> d = Map.ofEntries(
      Map.entry("english", "Welcome"),
      Map.entry("czech", "Vitejte"),
      Map.entry("danish", "Velkomst"),
      Map.entry("dutch", "Welkom"),
      Map.entry("estonian", "Tere tulemast"),
      Map.entry("finnish", "Tervetuloa"),
      Map.entry("flemish", "Welgekomen"),
      Map.entry("french", "Bienvenue"),
      Map.entry("german", "Willkommen"),
      Map.entry("irish", "Failte"),
      Map.entry("italian", "Benvenuto"),
      Map.entry("latvian", "Gaidits"),
      Map.entry("lithuanian", "Laukiamas"),
      Map.entry("polish", "Witamy"),
      Map.entry("spanish", "Bienvenido"),
      Map.entry("swedish", "Valkommen"),
      Map.entry("welsh", "Croeso")
    );
    if (d.containsKey(language)) {
      return d.get(language);
    }
    return "Welcome";
  }
}
```

## TypeScript
```ts
export function greet(language: string): string {
  let d: Record<string, string> = {
    'english': 'Welcome',
    'czech': 'Vitejte',
    'danish': 'Velkomst',
    'dutch': 'Welkom',
    'estonian': 'Tere tulemast',
    'finnish': 'Tervetuloa',
    'flemish': 'Welgekomen',
    'french': 'Bienvenue',
    'german': 'Willkommen',
    'irish': 'Failte',
    'italian': 'Benvenuto',
    'latvian': 'Gaidits',
    'lithuanian': 'Laukiamas',
    'polish': 'Witamy',
    'spanish': 'Bienvenido',
    'swedish': 'Valkommen',
    'welsh': 'Croeso'
  };
  if (d.hasOwnProperty(language)) {
    return d[language];
  }
  return 'Welcome';
}
```