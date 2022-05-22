x=int(input())>0
y=int(input())>0
if x and y:
    print(1)
elif x or y:
    if x:
        print(4)
    else:
        print(2)
else:
    print(3)