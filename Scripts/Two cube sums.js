function hasTwoCubeSums(n) {
    let count = 0, x = 1, y = Math.ceil(n ** (1 / 3));
    while (x < y) {
        const sum = x ** 3 + y ** 3;
        if (sum === n) {
            count++;
            x++;
            y--;
        } else if (sum < n) {
            x++;
        } else {
            y--;
        }
        if (count === 2) return true
    }
    return false
}