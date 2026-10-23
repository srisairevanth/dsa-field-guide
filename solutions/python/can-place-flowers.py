def can_place_flowers(flowerbed, n):
    plots = [0] + list(flowerbed) + [0]
    placed = 0
    for i in range(1, len(plots) - 1):
        if plots[i - 1] == 0 and plots[i] == 0 and plots[i + 1] == 0:
            plots[i] = 1
            placed += 1
    return placed >= n
