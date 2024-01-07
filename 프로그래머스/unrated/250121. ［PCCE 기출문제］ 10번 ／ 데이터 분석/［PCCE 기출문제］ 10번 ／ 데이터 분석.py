def solution(data, ext, val_ext, sort_by):
    key = ['code', 'date', 'maximum', 'remain']
    answer = sorted([x for x in data if x[key.index(ext)] <= val_ext], key = lambda x:x[key.index(sort_by)])
    return answer