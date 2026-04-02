export function easyLine(n: number): number {
    let s = 1;
    for (let i = 1; i <= n; i++) {
        s *= (n + i) / i;
    }
    return Math.round(Math.log(s));
}