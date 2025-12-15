https://www.codewars.com/kata/54ce9497975ca65e1a0008c6

## Python
```py
def convert_temp(temp, from_scale, to_scale):
    if from_scale == to_scale: return temp
    if from_scale == "C":
        d = {"F": temp*9/5 + 32 , "K": temp + 273.15, "R": (temp + 273.15)*9/5, "De": (100 - temp)*3/2, "N": temp*33/100, "Re": temp*4/5, "Ro": temp*21/40 + 7.5}
        return int(d[to_scale])
    if from_scale == "F":
        d = {"C": (temp - 32)*5/9, "K": (temp + 459.67)*5/9, "R": (temp + 459.67), "De": (212 - temp)*5/6, "N": (temp - 32)*11/60, "Re": (temp - 32)*4/9, "Ro": (temp - 32)*7/24 + 7.5}
        return int(d[to_scale])
    if from_scale == "K":
        d = {"F": (temp*9/5 - 459.67) , "C": temp - 273.15, "R": temp*9/5, "De": (373.15 - temp)*3/2, "N": (temp - 273.15)*33/100, "Re": (temp - 273.15)*4/5, "Ro": (temp - 273.15)*21/40 + 7.5}
        return int(d[to_scale])
    if from_scale == "R":
        d = {"F": temp - 459.67, "K": temp*5/9, "C": (temp - 491.67)*5/9, "De": (671.67 - temp)*5/6, "N": (temp - 491.67)*11/60, "Re": (temp - 491.67)*4/9, "Ro": (temp - 491.67)*7/24 + 7.5}
        return int(d[to_scale])
    if from_scale == "De":
        d = {"F": 212 - temp*6/5, "K": 373.15 - temp*2/3, "R": 671.67 - temp*6/5, "C": 100 - temp*2/3, "N": 33 - temp*11/50, "Re": 80 - temp*8/15, "Ro": 60 - temp*7/20}
        return int(d[to_scale])
    if from_scale == "N":
        d = {"F": temp*60/11 + 32, "K": temp*100/33 + 273.15, "R": temp*60/11 + 491.67, "De": (33 - temp)*50/11, "C": temp*100/33, "Re": temp*80/33, "Ro": temp*35/22 + 7.5}
        return int(d[to_scale])
    if from_scale == "Re":
        d = {"F": temp*9/4 + 32, "K": temp*5/4 + 273.15, "R": temp*9/4 + 491.67, "De": (80 - temp)*15/8, "N": temp*33/80, "C": temp*5/4, "Ro": temp*21/32 + 7.5}
        return int(d[to_scale])
    if from_scale == "Ro":
        d = {"F": (temp - 7.5)*24/7 + 32, "K": (temp - 7.5)*40/21 + 273.15, "R": (temp - 7.5)*24/7 + 491.67, "De": (60 - temp)*20/7, "N": (temp - 7.5)*22/35, "Re": (temp - 7.5)*32/21, "C": (temp - 7.5)*40/21}
        return int(d[to_scale])
```

## JavaScript
```js
function convertTemp(temp, from_scale, to_scale) {
    if (from_scale == to_scale) return temp
    let d = {}, value = 0;
    if (from_scale == "C") {
        d = { "F": temp * 9 / 5 + 32, "K": temp + 273.15, "R": (temp + 273.15) * 9 / 5, "De": (100 - temp) * 3 / 2, "N": temp * 33 / 100, "Re": temp * 4 / 5, "Ro": temp * 21 / 40 + 7.5 };
        value = d[to_scale];
    }
    if (from_scale == "F") {
        d = { "C": (temp - 32) * 5 / 9, "K": (temp + 459.67) * 5 / 9, "R": (temp + 459.67), "De": (212 - temp) * 5 / 6, "N": (temp - 32) * 11 / 60, "Re": (temp - 32) * 4 / 9, "Ro": (temp - 32) * 7 / 24 + 7.5 };
        value = d[to_scale];
    }
    if (from_scale == "K") {
        d = { "F": (temp * 9 / 5 - 459.67), "C": temp - 273.15, "R": temp * 9 / 5, "De": (373.15 - temp) * 3 / 2, "N": (temp - 273.15) * 33 / 100, "Re": (temp - 273.15) * 4 / 5, "Ro": (temp - 273.15) * 21 / 40 + 7.5 };
        value = d[to_scale];
    }
    if (from_scale == "R") {
        d = { "F": temp - 459.67, "K": temp * 5 / 9, "C": (temp - 491.67) * 5 / 9, "De": (671.67 - temp) * 5 / 6, "N": (temp - 491.67) * 11 / 60, "Re": (temp - 491.67) * 4 / 9, "Ro": (temp - 491.67) * 7 / 24 + 7.5 };
        value = d[to_scale];
    }
    if (from_scale == "De") {
        d = { "F": 212 - temp * 6 / 5, "K": 373.15 - temp * 2 / 3, "R": 671.67 - temp * 6 / 5, "C": 100 - temp * 2 / 3, "N": 33 - temp * 11 / 50, "Re": 80 - temp * 8 / 15, "Ro": 60 - temp * 7 / 20 };
        value = d[to_scale];
    }
    if (from_scale == "N") {
        d = { "F": temp * 60 / 11 + 32, "K": temp * 100 / 33 + 273.15, "R": temp * 60 / 11 + 491.67, "De": (33 - temp) * 50 / 11, "C": temp * 100 / 33, "Re": temp * 80 / 33, "Ro": temp * 35 / 22 + 7.5 };
        value = d[to_scale];
    }
    if (from_scale == "Re") {
        d = { "F": temp * 9 / 4 + 32, "K": temp * 5 / 4 + 273.15, "R": temp * 9 / 4 + 491.67, "De": (80 - temp) * 15 / 8, "N": temp * 33 / 80, "C": temp * 5 / 4, "Ro": temp * 21 / 32 + 7.5 };
        value = d[to_scale];
    }
    if (from_scale == "Ro") {
        d = { "F": (temp - 7.5) * 24 / 7 + 32, "K": (temp - 7.5) * 40 / 21 + 273.15, "R": (temp - 7.5) * 24 / 7 + 491.67, "De": (60 - temp) * 20 / 7, "N": (temp - 7.5) * 22 / 35, "Re": (temp - 7.5) * 32 / 21, "C": (temp - 7.5) * 40 / 21 };
        value = d[to_scale];
    }
    if (value < 0) return Math.round(value)
    if (value % 1 > .5) return Math.ceil(value)
    else return parseInt(value)
}
```