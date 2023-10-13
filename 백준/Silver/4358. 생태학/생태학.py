import sys

cnt = 0
tree = {}
for s in sys.stdin:
    tree[s.strip()] = tree.setdefault(s.strip(), 0) + 1
    cnt += 1
for k in sorted(tree.keys()):
    print(k, '%0.4f' %round((tree[k]*100)/cnt + 0.000001, 4))