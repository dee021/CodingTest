from collections import Counter

words = []
flag = 1; cnt = 0

for _ in range(int(input())):
    word = input()
    for i in words: # list 내 모든 단어와 비교
        if flag == 0:
            break
        if Counter(i) != Counter(word): # 단어 구성 비교
            continue
        for j in range(len(i)): # 사이클 비교
            i = i[1:len(i)] + i[0]
            if i == word:
                flag = 0
                break
    if flag:
        cnt += 1
        words.append(word)
    else:flag=1
print(cnt)