def max_value_at(n, index, max_sum):
    def needed(peak):
        def side(length):
            if length <= peak - 1:
                return (peak - 1 + peak - length) * length // 2
            return ((peak - 1) * peak // 2) + (length - (peak - 1)) * 1
        left = index
        right = n - index - 1
        return peak + side(left) + side(right)
    lo, hi = 1, max_sum
    while lo < hi:
        mid = (lo + hi + 1) // 2
        if needed(mid) <= max_sum:
            lo = mid
        else:
            hi = mid - 1
    return lo
