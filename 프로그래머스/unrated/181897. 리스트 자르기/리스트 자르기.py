def solution(n, slicer, num_list):
    
    return num_list[0 if n==1 else slicer[0]:len(num_list) if n==2 else slicer[1]+1:slicer[2] if n==4 else 1]