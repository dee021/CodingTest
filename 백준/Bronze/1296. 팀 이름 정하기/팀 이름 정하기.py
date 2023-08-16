love = list(map(input().count,['L', 'O', 'V', 'E']))
team = []

def sol(s):
    tmp = list(map(s.count,['L', 'O', 'V', 'E']))
    l,o,v,e = [love[i]+tmp[i] for i in range(4)]
    return [s, ((l+o)*(l+v)*(l+e)*(o+v)*(o+e)*(v+e))%100]

for _ in range(int(input())):
    name = input()
    team.append(sol(name))
print(sorted(team, key=lambda x: (-x[1], x[0]))[0][0])