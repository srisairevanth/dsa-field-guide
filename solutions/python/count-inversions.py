def count_inversions(nums):
    def sort_count(a):
        if len(a) <= 1:
            return a, 0
        mid = len(a) // 2
        left, cl = sort_count(a[:mid])
        right, cr = sort_count(a[mid:])
        merged, count, i, j = [], cl + cr, 0, 0
        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
                merged.append(left[i]); i += 1
            else:
                merged.append(right[j]); j += 1
                count += len(left) - i
        merged.extend(left[i:]); merged.extend(right[j:])
        return merged, count
    return sort_count(list(nums))[1]
