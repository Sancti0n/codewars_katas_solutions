https://www.codewars.com/kata/524c6a2e55025e3fba00020f

## JavaScript
```js
MyNamespace = MyNamespace || {}

MyNamespace.MyClass = class {
   constructor(s) {
      this.s = s;
   }
   sayHello() {
      return this.s;
   }
}
```