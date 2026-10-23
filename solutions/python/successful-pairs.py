import bisect

def successful_pairs(spells, potions, success):
    ordered = sorted(potions)
    out = []
    for s in spells:
        need = -(-success // s)
        out.append(len(ordered) - bisect.bisect_left(ordered, need))
    return out
