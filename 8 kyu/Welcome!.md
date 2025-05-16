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