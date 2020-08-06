def legoBlocks(wall_height, wall_width):
    mod = 10 ** 9 + 7
    wall_height = wall_height % mod
    wall_width = wall_width % mod
    f = []
    f.append(0)
    f.append(1)
    if wall_width > 1:
        f.append(2)
    if wall_width > 2:
        f.append(4)
    if wall_width > 3:
        f.append(8)

    if wall_width > 4:
        for i in range(5, wall_width + 1): # no of different ways to fill a widths
            f.append((f[i - 1] + f[i - 2] + f[i - 3] + f[i - 4]) % mod)


    g = []
    for i in range(len(f)): #no of ways fill given height with 1 to n widths
        g.append(f[i] ** wall_height % mod)

    h = [0] * (wall_width + 1)
    h[1] = 1

    for i in range(2, wall_width + 1):
        h[i] = g[i]
        for j in range(1, i):# removing the combinations which doesn't follow the condition
            h[i] = (h[i] - h[j] * g[i-j]) % mod
            a=1

    return h[-1] % mod
