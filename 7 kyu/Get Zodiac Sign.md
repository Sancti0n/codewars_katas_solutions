Your task is to get Zodiac Sign using input day and month.


## JavaScript
```js
const getZodiacSign = (day, month) => {
  switch(month) {
      case 1:
        if (day<20) return "Capricorn"
        else return "Aquarius"
      case 2:
        if (day<19) return "Aquarius"
        else return "Pisces"
      case 3:
        if (day<21) return "Pisces"
        else return "Aries"
      case 4:
        if (day<20) return "Aries"
        else return "Taurus"
      case 5:
        if (day<21) return "Taurus"
        else return "Gemini"
      case 6:
        if (day<21) return "Gemini"
        else return "Cancer"
      case 7:
        if (day<23) return "Cancer"
        else return "Leo"
      case 8:
        if (day<23) return "Leo"
        else return "Virgo"
      case 9:
        if (day<23) return "Virgo"
        else return "Libra"
      case 10:
        if (day<23) return "Libra"
        else return "Scorpio"
      case 11:
        if (day<22) return "Scorpio"
        else return "Sagittarius"
      case 12:
        if (day<22) return "Sagittarius"
        else return "Capricorn"
  }
}
```

## Python
```python
def get_zodiac_sign(day, month):
    match month:
        case 1: return "Capricorn" if day<20 else "Aquarius"
        case 2: return "Aquarius" if day<19 else "Pisces"
        case 3: return "Pisces" if day<21 else "Aries"
        case 4: return "Aries" if day<20 else "Taurus"
        case 5: return "Taurus" if day<21 else "Gemini"
        case 6: return "Gemini" if day<21 else "Cancer"
        case 7: return "Cancer" if day<23 else "Leo"
        case 8: return "Leo" if day<23 else "Virgo"
        case 9: return "Virgo" if day<23 else "Libra"
        case 10: return "Libra" if day<23 else "Scorpio"
        case 11: return "Scorpio" if day<22 else "Sagittarius"
        case 12: return "Sagittarius" if day<22 else "Capricorn"
```