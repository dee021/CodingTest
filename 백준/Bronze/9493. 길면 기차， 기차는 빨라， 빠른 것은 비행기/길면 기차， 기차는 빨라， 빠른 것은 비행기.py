while True:
    d, vt, va = map(int, input().split())
    if d == vt == va == 0:
        break
    t = round(abs(d/vt - d/va)*3600)
    print('{:0>1}:{:0>2}:{:0>2}'.format((t//3600), (t//60%60), (t%60)))