def solution(chicken):
    def order(n):
        return n//10, n//10 + n%10
    chicken, coupon = order(chicken)
    answer = chicken
    while coupon >= 10:
        chicken, coupon = order(coupon)
        answer += chicken
    return answer