def solution(id_pw, db):
    id = list(map(lambda x: x[0],db))
    if id_pw[0] in id:
        return ["wrong pw", "login"][db[id.index(id_pw[0])][1] == id_pw[1]]
    else:
        return "fail"