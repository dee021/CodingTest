def findNum(name):
    for i in range(1, 10):
        print("? {} {}".format(name, i))
        answer = int(input())
        if answer:
            return i

a = findNum('A')
b = findNum('B')
print("! %d" %(a+b))