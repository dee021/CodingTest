def solution(wallpaper):
    file = []
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[0])):
            if wallpaper[i][j] == '#':
                file.append([i, j])
    file = [sorted(x) for x in zip(*file)]
    return [file[0][0], file[1][0], file[0][-1]+1, file[1][-1]+1]