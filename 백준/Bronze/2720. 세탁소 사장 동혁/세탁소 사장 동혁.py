for _ in range(int(input())):
    ans = [0 for _ in range(3)] # 쿼터, 다임, 니켈의 개수
    cent = int(input())
    ans[0], cent = cent//25, cent%25
    ans[1], cent = cent//10, cent%10
    ans[2], cent = cent//5, cent%5
    print(*ans, cent)