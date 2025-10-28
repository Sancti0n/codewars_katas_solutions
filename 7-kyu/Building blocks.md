https://www.codewars.com/kata/55b75fcf67e558d3750000a3

## JavaScript
```js
class Block {
  constructor(...data) {
    this.data = data;
  }
  
  get Width() {
    return this.getWidth()
  }
  getWidth() {
    console.log(this.data[0])
    return this.data[0][0]
  }
  
  get Length() {
    return this.getLength()
  }
  getLength() {
    return this.data[0][1]
  }
  
  get Height() {
    return this.getHeight()
  }
  getHeight() {
    return this.data[0][2]
  }
  
  get Volume() {
    return this.getVolume()
  }
  getVolume() {
    return this.data[0][0]*this.data[0][1]*this.data[0][2]
  }
  
  get SurfaceArea() {
    return this.getVolume()
  }
  getSurfaceArea() {
    return 2*(this.data[0][0]*this.data[0][1] + this.data[0][0]*this.data[0][2] + this.data[0][1]*this.data[0][2])
  }
}
```

## Python
```py
class Block:
    def __init__(self, d):
        self.d = d
    
    def get_width(self):
        return self.d[0]
    
    def get_length(self):
        return self.d[1]
    
    def get_height(self):
        return self.d[2]
    
    def get_volume(self):
        return self.d[0]*self.d[1]*self.d[2]
    
    def get_surface_area(self):
        return 2*(self.d[0]*self.d[1] + self.d[0]*self.d[2] + self.d[1]*self.d[2])
```