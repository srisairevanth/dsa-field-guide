def spiral_order(m):
    out = []
    top, bottom = 0, len(m) - 1
    left, right = 0, len(m[0]) - 1 if m else -1
    while top <= bottom and left <= right:
        for c in range(left, right + 1):
            out.append(m[top][c])
        top += 1
        for r in range(top, bottom + 1):
            out.append(m[r][right])
        right -= 1
        if top <= bottom:
            for c in range(right, left - 1, -1):
                out.append(m[bottom][c])
            bottom -= 1
        if left <= right and top <= bottom:
            for r in range(bottom, top - 1, -1):
                out.append(m[r][left])
            left += 1
    return out
