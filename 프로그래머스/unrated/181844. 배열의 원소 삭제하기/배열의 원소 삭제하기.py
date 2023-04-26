def solution(arr, delete_list):
    return [x for x in arr if x in set(arr)-set(delete_list)]