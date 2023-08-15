nick = {}

def conv(s):
    user, act = s.split()
    return nick[user]+['님이 들어왔습니다.', '님이 나갔습니다.'][act == 'Leave']
    

def solution(record):
    answer = []
    for s in record:
        if s.startswith('Leave'):
            o, user = s.split()
        else:
            o, user, usernick = s.split()
        if o in ['Change', 'Enter']:
            nick[user] = usernick
        if o != 'Change':
            answer.append(user+" "+o)
    answer = list(map(conv, answer))
    return answer