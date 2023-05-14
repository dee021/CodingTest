def solution(arr, query):
    for i, q in enumerate(query):
        if i%2:
            del arr[:q]
        else:
            del arr[q+1:]
    return arr