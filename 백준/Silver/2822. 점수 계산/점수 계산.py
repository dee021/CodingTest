q = [[i] for i in range(1,9)]
for i in range(8):
    q[i].append(int(input()))

q = sorted(q, key=lambda x:x[1], reverse=True)[0:5]
q = [list(x) for x in zip(*q)]
print(sum(q[1]))
print(*sorted(q[0]))