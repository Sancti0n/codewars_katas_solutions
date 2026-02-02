https://www.codewars.com/kata/5b6375f707a2664ada00002a

## Python
```py
def who_is_online(friends):
    d = {}
    for i in range(len(friends)):
        if friends[i]["status"] == "away":
            if "away" not in d:
                d["away"] = [friends[i]["username"]]
            else:
                d["away"].append(friends[i]["username"])
        elif friends[i]["status"] == "offline":
            if "offline" not in d:
                d["offline"] = [friends[i]["username"]]
            else:
                d["offline"].append(friends[i]["username"])
        elif friends[i]["status"] == "online" and friends[i]["last_activity"]<11:
            if "online" not in d:
                d["online"] = [friends[i]["username"]]
            else:
                d["online"].append(friends[i]["username"])
        else:
            if "away" not in d:
                d["away"] = [friends[i]["username"]]
            else:
                d["away"].append(friends[i]["username"])
    return d
```