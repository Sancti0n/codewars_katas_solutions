https://www.codewars.com/kata/591305520c6f9f5c93000052

## TypeScript
```ts
interface IGeometricFigure {
  area: () => number;
  perimeter: () => number;
}

export class Square implements IGeometricFigure {
  constructor(private side: number) {}
  area = (): number => {
    return this.side * this.side;
  };
  perimeter = (): number => {
    return this.side * 4;
  };
}

export class Circle implements IGeometricFigure {
  constructor(private radius: number) {}
  area = (): number => {
    return Math.PI * Math.pow(this.radius, 2);
  };
  perimeter = (): number => {
    return 2 * Math.PI * this.radius;
  };
}
```