import re

def conv(s):
    return list(map(int, s[1:len(s)-1].split(',')))

def solution(s):
    p = re.compile('{[\d,]*}')
    lst = p.findall(s)
    temp = sorted(map(conv, p.findall(s)), key=lambda x:len(x))
    st = set()
    answer = []
    
    for lst in temp:
        for k in lst:
            if k not in st:
                st.add(k)
                answer.append(k)
                break
    return answer