import sys

work = {'Re':0,'Pt':0,'Cc':0,'Ea':0,'Tb':0,'Cm':0,'Ex':0}
total = 0
for line in sys.stdin.readlines():
    for w in line.split():
        if w in work:
            work[w] += 1
        total += 1
if total != 0:
    for i in ['Re','Pt','Cc','Ea','Tb','Cm','Ex']:
        print(i, work[i], '%0.2f' %float(work[i]/total))
    print("Total", total, "1.00")
else:
    for i in ['Re','Pt','Cc','Ea','Tb','Cm','Ex']:
        print(i, '0 0.00')
    print("Total 0 1.00")
