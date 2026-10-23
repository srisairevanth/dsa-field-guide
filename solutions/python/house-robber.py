def rob(houses):
    take, skip = 0, 0
    for h in houses:
        take, skip = skip + h, max(skip, take)
    return max(take, skip)
