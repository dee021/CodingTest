def numChr(string):
    time=0
    for i in string:
        temp = ord(i)
        if temp <68: #2
            time+=3
        elif temp < 71:#3
            time+=4
        elif temp < 74:#4
            time+=5
        elif temp < 77:#5
            time+=6
        elif temp < 80:#6
            time+=7
        elif temp < 84:#7
            time+=8
        elif temp < 87:#8
            time+=9
        else:
            time+=10
    print(time)

numChr(input())