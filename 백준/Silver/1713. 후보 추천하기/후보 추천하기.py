def delete():
    tmp = [[v[0], v[1], k] for k, v in like.items()]
    like.pop(sorted(tmp)[0][2])

n = int(input())
photo = 0
m = int(input())
like = {}
for i, p in enumerate(list(map(int, input().split()))):
    if p not in like:
        if photo == n:
            delete()
            photo -= 1
        photo += 1
        like[p] = [1, i]
    else:
        like[p][0] += 1
print(*sorted(like.keys()))