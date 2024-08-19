def sol():
    order = 'wolf'
    cur, cnt, idx = 0, 0, 0
    while idx < len(wolf):
        if wolf[idx] == 'w' == order[cur]:
            cnt += 1
            idx += 1
        elif wolf[idx] == 'o' and cnt > 0:
            for i in range(0, cnt*3, cnt):
                cur = (cur + 1)%4
                if len(wolf) >=  idx + i:
                    if set(wolf[idx+i:idx + i+ cnt]) != set([order[cur]]):
                        return 0
                else:
                    return 0
            idx += cnt * 3
            cnt, cur = 0, 0
        else:
            return 0
    if idx == len(wolf) and wolf[idx -1] =='f':
        return 1     
    return 0

wolf = input().strip()
if wolf[0] == 'w':
    print(sol())
else:
    print(0)