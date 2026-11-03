https://www.codewars.com/kata/62b76a4f211432636c05d0a9

## Python
```py
DECK = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]

def guess_the_card(audience):
    cards = list(DECK)
    
    for _ in range(3):
        c0 = cards[0::3]
        c1 = cards[1::3]
        c2 = cards[2::3]
        columns = [c0, c1, c2]
        idx = audience.get_input(columns)
        cols = [i for i in range(3) if i != idx]
        cards = columns[cols[0]] + columns[idx] + columns[cols[1]]
    return cards[10]
```

## JavaScript
```js
function guessTheCard(audience) {
    let DECK = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21];
    for (let i=0;i<3;i++) {
        const c0 = DECK.filter((_, j) => j % 3 === 0);
        const c1 = DECK.filter((_, j) => j % 3 === 1);
        const c2 = DECK.filter((_, j) => j % 3 === 2);
        const columns = [c0, c1, c2];
        const idx = audience.getInput(columns);
        const cols = [0, 1, 2].filter(i => i !== idx);
        DECK = [...columns[cols[0]], ...columns[idx], ...columns[cols[1]]];
    }
    return DECK[10];
}
```