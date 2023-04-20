def solution(arr1, arr2):
    arr1, arr2 = [[sum(arr1), sum(arr2)], [len(arr1), len(arr2)]][len(arr1) != len(arr2)]
    return (arr1 != arr2)*(-1 if arr2 > arr1 else 1)