import re

def solution(new_id):
    new_id = re.sub('([^\w\-.])', '', new_id.lower())
    new_id = re.sub('\.+', '.', new_id)
    if new_id.startswith('.'):
        new_id = new_id.replace('.', '', 1)
    if new_id.endswith('.'):
        new_id = new_id[:-1]
    if not new_id:
        new_id = 'a'
    if len(new_id) > 15:
        new_id = new_id[:15]
        if new_id[-1] == '.':
            new_id = new_id[:14]
    elif len(new_id) < 3:
        new_id += new_id[-1] * (3-len(new_id))
    return new_id